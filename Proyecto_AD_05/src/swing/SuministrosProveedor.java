/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
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
       cargarDatosPiezas();
       
       
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
       cargarDatosProyectos();
    }
    
    public void fixtable(JScrollPane scroll) {
        scroll.getViewport().setBackground(Color.WHITE);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel p = new JPanel();
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        scroll.setBorder(new EmptyBorder(5, 10, 5, 10));
    }
    
    public void cargarDatosPiezas() {
        
    }
    
    public void cargarDatosProyectos() {
        
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
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPiezasProveedor = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProyectosProveedor = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Proveedor: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        codProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(codProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 100, -1));

        infoProveedor.setEditable(false);
        infoProveedor.setBackground(new java.awt.Color(255, 255, 255));
        infoProveedor.setBorder(null);
        jPanel1.add(infoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 240, 60));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 370, 20));

        jLabel1.setText("Piezas suministradas:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel3.setText("Proyectos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 315, -1, -1));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setBorder(null);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 315, 50, -1));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField3.setBorder(null);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 50, -1));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


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
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tablaPiezasProveedor;
    private javax.swing.JTable tablaProyectosProveedor;
    // End of variables declaration//GEN-END:variables
}
