/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import consultas.ConsultasGestion;
import consultas.ConsultasProveedores;
import consultas.ConsultasProyectos;
import hibernate_bd.GestionEntity;
import hibernate_bd.ProveedoresEntity;
import hibernate_bd.ProyectosEntity;
import scrollbar.ScrollBarCustom;
import table.TableHeader;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leiii
 */
public class Estadisticas extends javax.swing.JPanel {

    String[] nombreColumnasProyectos = {"Cod Proyecto", "Piezas suministradas", "NºProveedores", };
    String[] nombreColumnasProveedores = {"Cod Proveedor", "Nombre", "Apellidos", "NºPiezas", "Cant Suministrada", "NºProyectos"};

    /**
     * Creates new form Estadisticas
     */
    public Estadisticas() {
        initComponents();

        //cargar datos
        ConsultasGestion con = new ConsultasGestion();
        List<GestionEntity> gestiones = con.recuperarDatosGestiones();
        con.cerrarConexion();

        //Modelo de la tabla
        tabla.setShowHorizontalLines(true);
        tabla.setGridColor(new Color(230, 230, 230));
        tabla.setRowHeight(30);
        tabla.getTableHeader().setReorderingAllowed(true);
        tabla.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(value + "");
                if (column == nombreColumnasProyectos.length) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());
        fixtable(jScrollPane1);
        cargarDatosProyectos();

        //Recuperar pieza mas suministrada
        int cantidad = 0;
        int cantidadpro = 0;
        String cod = null;
        for (int i = 0; i < gestiones.size(); i++) {
            for (GestionEntity gestion : gestiones) {
                if (gestiones.get(i).getPiezasByCodpieza().getCodigo().equals(gestion.getPiezasByCodpieza().getCodigo())) {
                    cantidadpro = cantidadpro + gestion.getCantidad();
                }
            }
            if (cantidad < cantidadpro) {
                cantidad = cantidadpro;
                cod = gestiones.get(i).getPiezasByCodpieza().getCodigo();
            }
            cantidadpro = 0;
        }
        cod1.setText(cod);
        cantidad1.setText(String.valueOf(cantidad));

        cantidad = 0;
        cod = null;
        //pieza que se ha suministrado a mas proyectos
        for (int i = 0; i < gestiones.size(); i++) {
            for (GestionEntity gestion : gestiones) {
                if (gestiones.get(i).getPiezasByCodpieza().getCodigo().equals(gestion.getPiezasByCodpieza().getCodigo())) {
                    cantidadpro = cantidadpro + 1;
                }
            }
            if (cantidad < cantidadpro) {
                cantidad = cantidadpro;
                cod = gestiones.get(i).getPiezasByCodpieza().getCodigo();
            }
            cantidadpro = 0;
        }
        cod2.setText(cod);
        cantidad2.setText(String.valueOf(cantidad));

        cantidad = 0;
        cod = null;
        //proveedor que ha suministrado mas cantidad de piezas
        for (int i = 0; i < gestiones.size(); i++) {
            for (GestionEntity gestion : gestiones) {
                if (gestiones.get(i).getProveedoresByCodproveedor().getCodigo().equals(gestion.getProveedoresByCodproveedor().getCodigo())) {
                    cantidadpro = cantidadpro + gestion.getCantidad();
                }
            }
            if (cantidad < cantidadpro) {
                cantidad = cantidadpro;
                cod = gestiones.get(i).getProveedoresByCodproveedor().getCodigo();
            }
            cantidadpro = 0;
        }
        cod3.setText(cod);
        cantidad3.setText(String.valueOf(cantidad));

        cantidad = 0;
        cod = null;
        //proveedor que ha suministrado a mas proyectos
        for (int i = 0; i < gestiones.size(); i++) {
            for (GestionEntity gestion : gestiones) {
                if (gestiones.get(i).getProveedoresByCodproveedor().getCodigo().equals(gestion.getProveedoresByCodproveedor().getCodigo())) {
                    cantidadpro = cantidadpro + 1;
                }
            }
            if (cantidad < cantidadpro) {
                cantidad = cantidadpro;
                cod = gestiones.get(i).getProveedoresByCodproveedor().getCodigo();
            }
            cantidadpro = 0;
        }
        cod4.setText(cod);
        cantidad4.setText(String.valueOf(cantidad));
    }

    public void fixtable(JScrollPane scroll) {
        scroll.getViewport().setBackground(Color.WHITE);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel p = new JPanel();
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        scroll.setBorder(new EmptyBorder(5, 10, 5, 10));
    }

    public void cargarDatosProveedores() {
        ConsultasProveedores consultasProveedores = new ConsultasProveedores();
        List<ProveedoresEntity> proveedores = new ArrayList<ProveedoresEntity>();
        proveedores = consultasProveedores.recuperarDatosProveedores();
        ConsultasGestion consultasGestion = new ConsultasGestion();
        List<GestionEntity> relaciones = new ArrayList<GestionEntity>();
        relaciones = consultasGestion.recuperarDatosGestiones();
        List<String> piezas = new ArrayList<String>();
        List<String> proyectos = new ArrayList<String>();
        int suministrado = 0;
        int cantidad = proveedores.size();
        String[][] d = new String[cantidad][6];
        for (int i = 0; i < proveedores.size(); i++) {
            d[i][0] = String.valueOf(proveedores.get(i).getCodigo());
            d[i][1] = String.valueOf(proveedores.get(i).getNombre());
            d[i][2] = String.valueOf(proveedores.get(i).getApellidos());
            for (GestionEntity relacione : relaciones) {
                if (relacione.getProveedoresByCodproveedor().getCodigo().equals(proveedores.get(i).getCodigo())) {
                    if (!piezas.contains(relacione.getPiezasByCodpieza().getCodigo())) {
                        piezas.add(relacione.getPiezasByCodpieza().getCodigo());
                    }
                    if (!proyectos.contains(relacione.getProyectosByCodproyecto().getCodigo())) {
                        proyectos.add(relacione.getProyectosByCodproyecto().getCodigo());
                    }
                    suministrado = suministrado + relacione.getCantidad();
                }
            }
            d[i][3] = String.valueOf(piezas.size());
            d[i][4] = String.valueOf(suministrado);
            d[i][5] = String.valueOf(proyectos.size());
            suministrado = 0;
            piezas.clear();
            proyectos.clear();
        }
        //se carga el modelo de la tabla
        DefaultTableModel modelo = new DefaultTableModel(d, nombreColumnasProveedores) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabla.setModel(modelo);
        consultasProveedores.cerrarConexion();
        consultasGestion.cerrarConexion();
    }

    public void cargarDatosProyectos() {
        ConsultasProyectos consultasProyectos = new ConsultasProyectos();
        List<ProyectosEntity> proyectos = new ArrayList<ProyectosEntity>();
        proyectos = consultasProyectos.recuperarDatosProyectos();
        ConsultasGestion consultasGestion = new ConsultasGestion();
        List<GestionEntity> relaciones = new ArrayList<GestionEntity>();
        relaciones = consultasGestion.recuperarDatosGestiones();
        //cargamos los datos a la tabla
        List<String> proveedores = new ArrayList<String>();
        int suministrado = 0;
        int cantidad = proyectos.size();
        String[][] d = new String[cantidad][3];
        for (int i = 0; i < proyectos.size(); i++) {
            d[i][0] = String.valueOf(proyectos.get(i).getCodigo());
            for (GestionEntity relacione : relaciones) {
                if (relacione.getProyectosByCodproyecto().getCodigo().equals(proyectos.get(i).getCodigo())) {
                    if (!proveedores.contains(relacione.getProveedoresByCodproveedor().getCodigo())) {
                        proveedores.add(relacione.getProveedoresByCodproveedor().getCodigo());
                    }
                    suministrado = suministrado + relacione.getCantidad();
                }
            }
            d[i][1] = String.valueOf(suministrado);
            d[i][2] = String.valueOf(proveedores.size());
            suministrado = 0;
            proveedores.clear();
        }
        //se carga el modelo de la tabla
        DefaultTableModel modelo = new DefaultTableModel(d, nombreColumnasProyectos) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabla.setModel(modelo);
        consultasProyectos.cerrarConexion();
        consultasGestion.cerrarConexion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        botonProveedor = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        botonProyecto = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cod1 = new javax.swing.JLabel();
        cantidad1 = new javax.swing.JLabel();
        cod2 = new javax.swing.JLabel();
        cantidad2 = new javax.swing.JLabel();
        cod3 = new javax.swing.JLabel();
        cantidad3 = new javax.swing.JLabel();
        cod4 = new javax.swing.JLabel();
        cantidad4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Pieza de la que se ha suministrado más cantidad:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel2.setText("Pieza que se ha suministrado a más proyectos:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel3.setText("Proveedor que ha suminstrado más piezas:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel4.setText("Proveedor que ha suminstrado a más proyectos:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 660, 240));

        botonProveedor.setBackground(new java.awt.Color(0, 204, 204));
        botonProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonProveedorMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Proveedor");

        javax.swing.GroupLayout botonProveedorLayout = new javax.swing.GroupLayout(botonProveedor);
        botonProveedor.setLayout(botonProveedorLayout);
        botonProveedorLayout.setHorizontalGroup(
            botonProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        botonProveedorLayout.setVerticalGroup(
            botonProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        add(botonProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 160, 30));

        botonProyecto.setBackground(new java.awt.Color(0, 117, 153));
        botonProyecto.setPreferredSize(new java.awt.Dimension(170, 30));
        botonProyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonProyectoMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Proyecto");

        javax.swing.GroupLayout botonProyectoLayout = new javax.swing.GroupLayout(botonProyecto);
        botonProyecto.setLayout(botonProyectoLayout);
        botonProyectoLayout.setHorizontalGroup(
            botonProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        botonProyectoLayout.setVerticalGroup(
            botonProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonProyectoLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(botonProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 160, 30));

        cod1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 40, 20));

        cantidad1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 40, 20));

        cod2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cod2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 40, 20));

        cantidad2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 40, 20));

        cod3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cod3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 40, 20));

        cantidad3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cantidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 40, 20));

        cod4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cod4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 40, 20));

        cantidad4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cantidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 40, 20));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 40, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 40, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 40, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 40, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 40, 10));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 40, 10));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 40, 10));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 40, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void botonProveedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProveedorMousePressed
        cargarDatosProveedores();
    }//GEN-LAST:event_botonProveedorMousePressed

    private void botonProyectoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProyectoMousePressed
        cargarDatosProyectos();
    }//GEN-LAST:event_botonProyectoMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonProveedor;
    private javax.swing.JPanel botonProyecto;
    private javax.swing.JLabel cantidad1;
    private javax.swing.JLabel cantidad2;
    private javax.swing.JLabel cantidad3;
    private javax.swing.JLabel cantidad4;
    private javax.swing.JLabel cod1;
    private javax.swing.JLabel cod2;
    private javax.swing.JLabel cod3;
    private javax.swing.JLabel cod4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
