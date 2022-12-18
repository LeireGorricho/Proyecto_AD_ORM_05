/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import consultas.ConsultasGestion;
import consultas.ConsultasPiezas;
import consultas.ConsultasProveedores;
import consultas.ConsultasProyectos;
import hibernate_bd.GestionEntity;
import hibernate_bd.PiezasEntity;
import hibernate_bd.ProveedoresEntity;
import hibernate_bd.ProyectosEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import scrollbar.ScrollBarCustom;
import table.TableHeader;

/**
 *
 * @author leiii
 */
public class GestionPedidos extends javax.swing.JPanel {
    
    String[] nombreColumnas = {"Código", "Proveedor", "Pieza", "Proyecto", "Estado"};
    JPanel panel;
    Session session = null;
    List<GestionEntity> gestion = new ArrayList<GestionEntity>();
    
    /**
     * Creates new form GestionPedidos
     */
    public GestionPedidos(JPanel panel) {
        initComponents();
        
        this.panel = panel;
        
        tablaGestion.setShowHorizontalLines(true);
        tablaGestion.setGridColor(new Color(230,230,230));
        tablaGestion.setRowHeight(27);
        tablaGestion.getTableHeader().setReorderingAllowed(true);
        tablaGestion.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(value + "");
                if(column==nombreColumnas.length){
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
       });
       jScrollPane1.getViewport().setBackground(Color.WHITE);
       jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());
       fixtable(jScrollPane1);
       cargarDatos();
    }
    
    public void fixtable(JScrollPane scroll) {
        scroll.getViewport().setBackground(Color.WHITE);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel p = new JPanel();
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        scroll.setBorder(new EmptyBorder(5, 10, 5, 10));
    }
    
    public void cargarDatos() {
        ConsultasGestion consultasGestion = new ConsultasGestion();
        List<GestionEntity> gestion = new ArrayList<GestionEntity>();
        gestion = consultasGestion.recuperarDatosGestiones();
        int cantidad = gestion.size();
        String[][] d = new String[cantidad][5];
        for (int i = 0; i < gestion.size(); i++) {
            d[i][0] = String.valueOf(gestion.get(i).getCodigo());
            d[i][1] = String.valueOf(gestion.get(i).getProveedoresByCodproveedor().getCodigo());
            d[i][2] = String.valueOf(gestion.get(i).getPiezasByCodpieza().getCodigo());
            d[i][3] = String.valueOf(gestion.get(i).getProyectosByCodproyecto().getCodigo());
            d[i][4] = String.valueOf(gestion.get(i).getEstado());
        }
        tablaGestion.setModel(new DefaultTableModel(d, nombreColumnas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        consultasGestion.cerrarConexion();
    }

    public boolean puedeEditar(String codigo) {
        ConsultasGestion consultasGestion = new ConsultasGestion();
        GestionEntity relacion = consultasGestion.recuperarGestion(codigo);
        ConsultasProyectos consultasProyectos = new ConsultasProyectos();
        List<ProyectosEntity> proyectos = consultasProyectos.cargarAltas();
        consultasProyectos.cerrarConexion();
        ConsultasProveedores consultasProveedores = new ConsultasProveedores();
        List<ProveedoresEntity> proveedores = consultasProveedores.cargarAltas();
        consultasProveedores.cerrarConexion();
        ConsultasPiezas consultasPiezas = new ConsultasPiezas();
        List<PiezasEntity> piezas = consultasPiezas.cargarAltas();
        consultasPiezas.cerrarConexion();
        if (proyectos.size() == 0 || proveedores.size() == 0 || piezas.size() == 0) {
            JOptionPane.showMessageDialog(null, "Para poder editar una gestión debe haber por lo menos una pieza, un proyecto y un proveedor");
            return false;
        }
        int proyectoSele = -1;
        int proveSele = -1;
        int piezaSele = -1;
        for (int i = 0; i < proyectos.size(); i++) {
            if (proyectos.get(i).getCodigo().equals(relacion.getProyectosByCodproyecto().getCodigo())) {
                proyectoSele = i;
            }
        }
        for (int i = 0; i < proveedores.size(); i++) {
            if (proveedores.get(i).getCodigo().equals(relacion.getProveedoresByCodproveedor().getCodigo())) {
                proveSele = i;
            }
        }
        for (int i = 0; i < piezas.size(); i++) {
            if (piezas.get(i).getCodigo().equals(relacion.getPiezasByCodpieza().getCodigo())) {
                piezaSele = i;
            }
        }
        if (proyectoSele == -1 || proveSele == -1 || piezaSele == -1) {
            JOptionPane.showMessageDialog(null, "Uno de los campos tiene el estado de baja, para poder editar una gestión deben estar todos de alta");
            return false;
        }
        return true;
    }

    public void eliminarGestion(int codigo) {
        GestionEntity gestion = new GestionEntity();
        Transaction tx = session.beginTransaction();
        gestion = session.load(GestionEntity.class, codigo);
        gestion.setEstado("BAJA");
        tx.commit();
        session.update(gestion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonEliminar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        BotonModificar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaGestion = new javax.swing.JTable();
        botonVer = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        botonAnadir = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonEliminar.setBackground(new java.awt.Color(0, 204, 204));
        botonEliminar.setPreferredSize(new java.awt.Dimension(100, 31));
        botonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonEliminarMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minus.png"))); // NOI18N

        javax.swing.GroupLayout botonEliminarLayout = new javax.swing.GroupLayout(botonEliminar);
        botonEliminar.setLayout(botonEliminarLayout);
        botonEliminarLayout.setHorizontalGroup(
            botonEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );
        botonEliminarLayout.setVerticalGroup(
            botonEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        jPanel1.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 50, -1));

        BotonModificar.setBackground(new java.awt.Color(0, 204, 204));
        BotonModificar.setPreferredSize(new java.awt.Dimension(100, 31));
        BotonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonModificarMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit.png"))); // NOI18N

        javax.swing.GroupLayout BotonModificarLayout = new javax.swing.GroupLayout(BotonModificar);
        BotonModificar.setLayout(BotonModificarLayout);
        BotonModificarLayout.setHorizontalGroup(
            BotonModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );
        BotonModificarLayout.setVerticalGroup(
            BotonModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        jPanel1.add(BotonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 50, -1));

        tablaGestion.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        tablaGestion.setForeground(new java.awt.Color(102, 102, 102));
        tablaGestion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaGestion.setSelectionBackground(new java.awt.Color(224, 255, 255));
        tablaGestion.setSelectionForeground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(tablaGestion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, 580, 440));

        botonVer.setBackground(new java.awt.Color(0, 204, 204));
        botonVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonVerMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa25x25.png"))); // NOI18N

        javax.swing.GroupLayout botonVerLayout = new javax.swing.GroupLayout(botonVer);
        botonVer.setLayout(botonVerLayout);
        botonVerLayout.setHorizontalGroup(
            botonVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonVerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        botonVerLayout.setVerticalGroup(
            botonVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonVerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(botonVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 50, -1));

        botonAnadir.setBackground(new java.awt.Color(0, 204, 204));
        botonAnadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonAnadirMousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus.png"))); // NOI18N

        javax.swing.GroupLayout botonAnadirLayout = new javax.swing.GroupLayout(botonAnadir);
        botonAnadir.setLayout(botonAnadirLayout);
        botonAnadirLayout.setHorizontalGroup(
            botonAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonAnadirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );
        botonAnadirLayout.setVerticalGroup(
            botonAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonAnadirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(botonAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 25, 50, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMousePressed
        if (tablaGestion.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Para dar de baja debes seleccionar un elemento en la tabla");
        } else {
            int op = JOptionPane.showConfirmDialog(this, "¿Estas seguro de que quieres dar de baja este proyecto?");
                if (op == 0) {
                    //Obtencion del id del objeto seleccionaod en la tabla
                    ConsultasGestion con = new ConsultasGestion();
                    String codigo = tablaGestion.getValueAt(tablaGestion.getSelectedRow(), 0).toString();
                    con.eliminarGestion(codigo);
                    con.cerrarConexion();
                }
            }
        cargarDatos();
    }//GEN-LAST:event_botonEliminarMousePressed

    private void BotonModificarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonModificarMousePressed
        if (tablaGestion.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Para editar debes seleccionar un elemento en la tabla");
        } else {
            String cod = tablaGestion.getValueAt(tablaGestion.getSelectedRow(), 0).toString();
            if (puedeEditar(cod)) {
                EditarGestion frame = new EditarGestion(panel, cod);
                frame.setSize(700, 490);
                frame.setLocation(0, 0);
                panel.removeAll();
                panel.add(frame, BorderLayout.CENTER);
                panel.revalidate();
                panel.repaint();
            }
        }
    }//GEN-LAST:event_BotonModificarMousePressed

    private void botonVerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerMousePressed
        if (tablaGestion.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Para ver más información debes seleccionar un elemento en la tabla");
        } else {
            String cod = tablaGestion.getValueAt(tablaGestion.getSelectedRow(), 0).toString();
            VerGestion frame = new VerGestion(panel, cod);
            frame.setSize(700,490);
            frame.setLocation(0,0);
            panel.removeAll();
            panel.add(frame, BorderLayout.CENTER);
            panel.revalidate();
            panel.repaint();
        }
    }//GEN-LAST:event_botonVerMousePressed

    private void botonAnadirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAnadirMousePressed
        NuevaGestion frame = new NuevaGestion(panel);
        frame.setSize(700,490);
        frame.setLocation(0,0);
        panel.removeAll();
        panel.add(frame, BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }//GEN-LAST:event_botonAnadirMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonModificar;
    private javax.swing.JPanel botonAnadir;
    private javax.swing.JPanel botonEliminar;
    private javax.swing.JPanel botonVer;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaGestion;
    // End of variables declaration//GEN-END:variables
}
