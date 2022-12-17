/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import consultas.ConsultasGestion;
import consultas.ConsultasPiezas;
import consultas.ConsultasProveedores;
import hibernate_bd.GestionEntity;
import hibernate_bd.PiezasEntity;
import hibernate_bd.ProveedoresEntity;
import hibernate_bd.ProyectosEntity;
import scrollbar.ScrollBarCustom;
import table.TableHeader;

/**
 *
 * @author leiii
 */
public class SuministrosProveedor extends javax.swing.JPanel {
    String[] columnasPiezas = {"Código", "Nombre", "Precio", "Descripción", "Estado"};
    String[] columnasProyectos = {"Código", "Nombre", "Ciudad", "Estado"};

    /**
     * Creates new form SuministrosProveedor
     */
    public SuministrosProveedor() {
        initComponents();
        
        tablaPiezasProveedor.setShowHorizontalLines(true);
        tablaPiezasProveedor.setGridColor(new Color(230,230,230));
        tablaPiezasProveedor.setRowHeight(20);
        tablaPiezasProveedor.getTableHeader().setReorderingAllowed(true);
        tablaPiezasProveedor.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(value + "");
                if(column==columnasPiezas.length){
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
       });
       jScrollPane1.getViewport().setBackground(Color.WHITE);
       jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());
       fixtable(jScrollPane1);
       
        tablaProyectosProveedor.setShowHorizontalLines(true);
        tablaProyectosProveedor.setGridColor(new Color(230,230,230));
        tablaProyectosProveedor.setRowHeight(20);
        tablaProyectosProveedor.getTableHeader().setReorderingAllowed(true);
        tablaProyectosProveedor.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(value + "");
                if(column==columnasProyectos.length){
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
       });
       jScrollPane2.getViewport().setBackground(Color.WHITE);
       jScrollPane2.setVerticalScrollBar(new ScrollBarCustom());
       fixtable(jScrollPane2);
        ConsultasProveedores consultasProveedores = new ConsultasProveedores();
        List<ProveedoresEntity> proveedores = consultasProveedores.recuperarDatosProveedores();
        for (ProveedoresEntity proveedor : proveedores) {
            codProveedor.addItem(proveedor.getCodigo());
        }
    }
    
    public void fixtable(JScrollPane scroll) {
        scroll.getViewport().setBackground(Color.WHITE);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel p = new JPanel();
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        scroll.setBorder(new EmptyBorder(5, 10, 5, 10));
    }
    
    public void cargarDatosPiezas(List<PiezasEntity> piezas) {
        int cantidad = piezas.size();
        String[][] d = new String[cantidad][4];
        for (int i = 0; i < piezas.size(); i++) {
            d[i][0] = String.valueOf(piezas.get(i).getCodigo());
            d[i][1] = String.valueOf(piezas.get(i).getNombre());
            d[i][2] = String.valueOf(piezas.get(i).getPrecio());
            d[i][3] = String.valueOf(piezas.get(i).getDescripcion());
        }
        //se carga el modelo de la tabla
        tablaPiezasProveedor.setModel(new DefaultTableModel(d, columnasPiezas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
    }
    
    public void cargarDatosProyectos(List<ProyectosEntity> proyectos) {
        int cantidad = proyectos.size();
        String[][] d = new String[cantidad][4];
        for (int i = 0; i < proyectos.size(); i++) {
            d[i][0] = String.valueOf(proyectos.get(i).getCodigo());
            d[i][1] = String.valueOf(proyectos.get(i).getNombre());
            d[i][2] = String.valueOf(proyectos.get(i).getCiudad());
            d[i][3] = String.valueOf(proyectos.get(i).getEstado());
        }
        //se carga el modelo de la tabla
        tablaProyectosProveedor.setModel(new DefaultTableModel(d, columnasProyectos) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        codProveedor = new javax.swing.JComboBox<>();
        infoProveedor = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        numProyectos = new javax.swing.JTextField();
        piezasSuministradas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPiezasProveedor = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProyectosProveedor = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Proveedor: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        codProveedor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                codProveedorItemStateChanged(evt);
            }
        });
        jPanel1.add(codProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 100, -1));

        infoProveedor.setEditable(false);
        infoProveedor.setBackground(new java.awt.Color(255, 255, 255));
        infoProveedor.setText("<html><p></p></html>");
        infoProveedor.setBorder(null);
        jPanel1.add(infoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 240, 60));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 370, 20));

        jLabel1.setText("Piezas suministradas:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel3.setText("Proyectos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 315, -1, -1));

        numProyectos.setEditable(false);
        numProyectos.setBackground(new java.awt.Color(255, 255, 255));
        numProyectos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numProyectos.setBorder(null);
        jPanel1.add(numProyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 50, -1));

        piezasSuministradas.setEditable(false);
        piezasSuministradas.setBackground(new java.awt.Color(255, 255, 255));
        piezasSuministradas.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        piezasSuministradas.setBorder(null);
        jPanel1.add(piezasSuministradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 50, -1));

        tablaPiezasProveedor.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaPiezasProveedor);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 420, 150));

        tablaProyectosProveedor.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaProyectosProveedor);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 420, 160));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 50, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 50, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void codProveedorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_codProveedorItemStateChanged
        //cambiar automaticamente los datos al cambiar el objeto del combobox
        List<PiezasEntity> piezas = new ArrayList<PiezasEntity>();
        List<ProyectosEntity> proyectos = new ArrayList<ProyectosEntity>();
        String cod = codProveedor.getSelectedItem().toString();
        ConsultasGestion consultasGestion = new ConsultasGestion();
        List<GestionEntity> gestiones = consultasGestion.recuperarDatosGestiones();
        for (GestionEntity gestione : gestiones) {
            if (gestione.getProveedoresByCodproveedor().getCodigo().equals(cod)) {
                piezas.add(gestione.getPiezasByCodpieza());
                proyectos.add(gestione.getProyectosByCodproyecto());
            }
        }
        cargarDatosPiezas(piezas);
        cargarDatosProyectos(proyectos);
        consultasGestion.cerrarConexion();

        ConsultasProveedores consultasProveedores = new ConsultasProveedores();
        ProveedoresEntity proveedor = consultasProveedores.recuperarProveedor(codProveedor.getSelectedItem().toString());
        infoProveedor.setText(proveedor.getCodigo() + ", " + proveedor.getNombre() + ", " + proveedor.getApellidos() + ", " + proveedor.getDireccion());
        consultasProveedores.cerrarConexion();
    }//GEN-LAST:event_codProveedorItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> codProveedor;
    private javax.swing.JTextField infoProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField numProyectos;
    private javax.swing.JTextField piezasSuministradas;
    private javax.swing.JTable tablaPiezasProveedor;
    private javax.swing.JTable tablaProyectosProveedor;
    // End of variables declaration//GEN-END:variables
}
