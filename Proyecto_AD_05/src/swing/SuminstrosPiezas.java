/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import consultas.ConsultasGestion;
import consultas.ConsultasPiezas;
import hibernate_bd.GestionEntity;
import hibernate_bd.PiezasEntity;
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
public class SuminstrosPiezas extends javax.swing.JPanel {

    String[] nombreColumnasProyectos = {"Código", "Nombre", "Ciudad", "Estado"};
    String[] nombreColumnasProveedores = {"Código", "Nombre", "Dirección", "Estado"};

    /**
     * Creates new form SuminstrosPiezas
     */
    public SuminstrosPiezas() {
        initComponents();

        tablaProyectos.setShowHorizontalLines(true);
        tablaProyectos.setGridColor(new Color(230,230,230));
        tablaProyectos.setRowHeight(27);
        tablaProyectos.getTableHeader().setReorderingAllowed(true);
        tablaProyectos.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(value + "");
                if(column== nombreColumnasProyectos.length){
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());
        fixtable(jScrollPane1);

        tablaProveedores.setShowHorizontalLines(true);
        tablaProveedores.setGridColor(new Color(230,230,230));
        tablaProveedores.setRowHeight(27);
        tablaProveedores.getTableHeader().setReorderingAllowed(true);
        tablaProveedores.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(value + "");
                if(column== nombreColumnasProveedores.length){
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
        jScrollPane2.getViewport().setBackground(Color.WHITE);
        jScrollPane2.setVerticalScrollBar(new ScrollBarCustom());
        fixtable(jScrollPane2);

        ConsultasPiezas consultasPiezas = new ConsultasPiezas();
        List<PiezasEntity> piezas = consultasPiezas.recuperarDatosPiezas();
        for (PiezasEntity pieza : piezas) {
            codPieza.addItem(pieza.getCodigo());
        }
        consultasPiezas.cerrarConexion();
    }

    public void fixtable(JScrollPane scroll) {
        scroll.getViewport().setBackground(Color.WHITE);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel p = new JPanel();
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        scroll.setBorder(new EmptyBorder(5, 10, 5, 10));
    }

    public void cargarTablaProyectos(List<ProyectosEntity> proyectos) {
        int cantidad = proyectos.size();
        String[][] d = new String[cantidad][4];
        for (int i = 0; i < proyectos.size(); i++) {
            d[i][0] = String.valueOf(proyectos.get(i).getCodigo());
            d[i][1] = String.valueOf(proyectos.get(i).getNombre());
            d[i][2] = String.valueOf(proyectos.get(i).getCiudad());
            d[i][3] = String.valueOf(proyectos.get(i).getEstado());
        }
        tablaProyectos.setModel(new DefaultTableModel(d, nombreColumnasProyectos) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
    }

    public void cargarTablaProveedores(List<ProveedoresEntity> proveedores) {
        int cantidad = proveedores.size();
        String[][] d = new String[cantidad][4];
        for (int i = 0; i < proveedores.size(); i++) {
            d[i][0] = String.valueOf(proveedores.get(i).getCodigo());
            d[i][1] = String.valueOf(proveedores.get(i).getNombre());
            d[i][2] = String.valueOf(proveedores.get(i).getDireccion());
            d[i][3] = String.valueOf(proveedores.get(i).getEstado());
        }
        tablaProveedores.setModel(new DefaultTableModel(d, nombreColumnasProveedores) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        codPieza = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        numProveedores = new javax.swing.JTextField();
        numProyectos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProyectos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProveedores = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        totalPiezas = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        infoPieza = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Pieza:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 50, -1));

        codPieza.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                codPiezaItemStateChanged(evt);
            }
        });
        add(codPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 100, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 230, 20));

        jLabel1.setText("Nº de proyectos:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel3.setText("Nº de proveedores:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        numProveedores.setEditable(false);
        numProveedores.setBackground(new java.awt.Color(255, 255, 255));
        numProveedores.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numProveedores.setBorder(null);
        add(numProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 50, -1));

        numProyectos.setEditable(false);
        numProyectos.setBackground(new java.awt.Color(255, 255, 255));
        numProyectos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numProyectos.setBorder(null);
        add(numProyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 50, -1));

        tablaProyectos.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaProyectos.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(tablaProyectos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 420, 150));

        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaProveedores.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(tablaProveedores);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 420, 160));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 50, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 50, 10));

        jLabel4.setText("Nº total de piezas suministradas:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        totalPiezas.setEditable(false);
        totalPiezas.setBackground(new java.awt.Color(255, 255, 255));
        totalPiezas.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalPiezas.setBorder(null);
        add(totalPiezas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 70, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 70, 10));
        add(infoPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 230, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void codPiezaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_codPiezaItemStateChanged
        //cambiar automaticamente los datos al cambiar el objeto del combobox
        List<ProyectosEntity> proyectos = new ArrayList<ProyectosEntity>();
        List<ProveedoresEntity> proveedores = new ArrayList<ProveedoresEntity>();
        String cod = codPieza.getSelectedItem().toString();
        ConsultasGestion consultasGestion = new ConsultasGestion();
        List<GestionEntity> gestiones = consultasGestion.recuperarDatosGestiones();
        for (GestionEntity gestione : gestiones) {
            if (gestione.getPiezasByCodpieza().getCodigo().equals(cod)) {
                proveedores.add(gestione.getProveedoresByCodproveedor());
                proyectos.add(gestione.getProyectosByCodproyecto());
            }
        }
        cargarTablaProyectos(proyectos);
        cargarTablaProveedores(proveedores);
        consultasGestion.cerrarConexion();

        ConsultasPiezas consultasPiezas = new ConsultasPiezas();
        PiezasEntity pieza = consultasPiezas.recuperarPieza(codPieza.getSelectedItem().toString());
        infoPieza.setText("<html><p>Nombre: " + pieza.getNombre() + "</p><p>Precio: " + pieza.getPrecio() + "</p><p>Descripción: " + pieza.getDescripcion() + "</p><p>Estado:" + pieza.getEstado() + "</p></html>");
        consultasPiezas.cerrarConexion();

        //numero de proyectos
        numProyectos.setText(String.valueOf(proyectos.size()));
        //numero de proveedores
        numProveedores.setText(String.valueOf(proveedores.size()));

        //numero totas de piezas suministradas
        int total = 0;
        for (int i = 0; i < gestiones.size(); i++) {
            if (gestiones.get(i).getPiezasByCodpieza().getCodigo().equals(cod)) {
                total = total + gestiones.get(i).getCantidad();
            }
        }
        totalPiezas.setText(String.valueOf(total));
    }//GEN-LAST:event_codPiezaItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> codPieza;
    private javax.swing.JLabel infoPieza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField numProveedores;
    private javax.swing.JTextField numProyectos;
    private javax.swing.JTable tablaProveedores;
    private javax.swing.JTable tablaProyectos;
    private javax.swing.JTextField totalPiezas;
    // End of variables declaration//GEN-END:variables
}
