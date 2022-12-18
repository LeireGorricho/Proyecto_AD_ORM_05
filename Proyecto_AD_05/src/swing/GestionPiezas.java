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
import hibernate_bd.GestionEntity;
import hibernate_bd.PiezasEntity;
import scrollbar.ScrollBarCustom;
import table.TableHeader;

/**
 *
 * @author leiii
 */
public class GestionPiezas extends javax.swing.JPanel {

    JPanel panel;
    String[] nombreColumnas = {"Código", "Nombre", "Precio", "Estado"};

    /**
     * Creates new form GestionPiezas
     */
    public GestionPiezas(JPanel panel) {
        initComponents();
        
        this.panel = panel;
        
        tablaPiezas.setShowHorizontalLines(true);
        tablaPiezas.setGridColor(new Color(230,230,230));
        tablaPiezas.setRowHeight(27);
        tablaPiezas.getTableHeader().setReorderingAllowed(true);
        tablaPiezas.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
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
        ConsultasPiezas consultasPiezas = new ConsultasPiezas();
        List<PiezasEntity> piezas = new ArrayList<PiezasEntity>();
        piezas = consultasPiezas.recuperarDatosPiezas();
        int cantidad = piezas.size();
        String[][] d = new String[cantidad][4];
        for (int i = 0; i < piezas.size(); i++) {
            d[i][0] = String.valueOf(piezas.get(i).getCodigo());
            d[i][1] = String.valueOf(piezas.get(i).getNombre());
            d[i][2] = String.valueOf(piezas.get(i).getPrecio());
            d[i][3] = String.valueOf(piezas.get(i).getEstado());
        }
        //se carga el modelo de la tabla
        tablaPiezas.setModel(new DefaultTableModel(d, nombreColumnas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        consultasPiezas.cerrarConexion();
    }

    public void bajaPieza(String codigo) {
        ConsultasPiezas consultasPiezas = new ConsultasPiezas();
        consultasPiezas.eliminarPieza(codigo);
        consultasPiezas.cerrarConexion();
        cargarDatos();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPiezas = new javax.swing.JTable();
        botonEliminar1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        BotonModificar1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        botonVer1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        botonAnadir = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaPiezas.setForeground(new java.awt.Color(102, 102, 102));
        tablaPiezas.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaPiezas.setSelectionBackground(new java.awt.Color(224, 255, 255));
        tablaPiezas.setSelectionForeground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(tablaPiezas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 23, 580, 440));

        botonEliminar1.setBackground(new java.awt.Color(0, 204, 204));
        botonEliminar1.setPreferredSize(new java.awt.Dimension(100, 31));
        botonEliminar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonEliminar1MousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minus.png"))); // NOI18N

        javax.swing.GroupLayout botonEliminar1Layout = new javax.swing.GroupLayout(botonEliminar1);
        botonEliminar1.setLayout(botonEliminar1Layout);
        botonEliminar1Layout.setHorizontalGroup(
            botonEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonEliminar1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );
        botonEliminar1Layout.setVerticalGroup(
            botonEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        jPanel1.add(botonEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 50, -1));

        BotonModificar1.setBackground(new java.awt.Color(0, 204, 204));
        BotonModificar1.setPreferredSize(new java.awt.Dimension(100, 31));
        BotonModificar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonModificar1MousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit.png"))); // NOI18N

        javax.swing.GroupLayout BotonModificar1Layout = new javax.swing.GroupLayout(BotonModificar1);
        BotonModificar1.setLayout(BotonModificar1Layout);
        BotonModificar1Layout.setHorizontalGroup(
            BotonModificar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonModificar1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );
        BotonModificar1Layout.setVerticalGroup(
            BotonModificar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        jPanel1.add(BotonModificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 50, -1));

        botonVer1.setBackground(new java.awt.Color(0, 204, 204));
        botonVer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonVer1MousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa25x25.png"))); // NOI18N

        javax.swing.GroupLayout botonVer1Layout = new javax.swing.GroupLayout(botonVer1);
        botonVer1.setLayout(botonVer1Layout);
        botonVer1Layout.setHorizontalGroup(
            botonVer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonVer1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        botonVer1Layout.setVerticalGroup(
            botonVer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonVer1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(botonVer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 50, -1));

        botonAnadir.setBackground(new java.awt.Color(0, 204, 204));
        botonAnadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonAnadirMousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus.png"))); // NOI18N

        javax.swing.GroupLayout botonAnadirLayout = new javax.swing.GroupLayout(botonAnadir);
        botonAnadir.setLayout(botonAnadirLayout);
        botonAnadirLayout.setHorizontalGroup(
            botonAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonAnadirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );
        botonAnadirLayout.setVerticalGroup(
            botonAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonAnadirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonEliminar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminar1MousePressed
        if (tablaPiezas.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Para eliminar debes seleccionar una pieza en la tabla");
        } else {
            String cod = tablaPiezas.getValueAt(tablaPiezas.getSelectedRow(), 0).toString();
            boolean relacion = false;
            ConsultasGestion consultasGestion = new ConsultasGestion();
            List<GestionEntity> piezas = consultasGestion.recuperarDatosGestiones();
            consultasGestion.cerrarConexion();
            for (GestionEntity gestion : piezas) {
                if (gestion.getPiezasByCodpieza().getCodigo().equals(cod) && gestion.getEstado().equals("ALTA")) {
                    relacion = true;
                    break;
                }
            }
            if (relacion) {
                int op = JOptionPane.showConfirmDialog(this, "La pieza que quieres dar de baja tiene una gestión activa.\n ¿Estás seguro de que quieres darla de baja?");
                if (op == 0) {
                    bajaPieza(cod);
                }
            } else {
                int op = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que quieres dar de baja esta pieza?");
                if (op == 0) {
                    bajaPieza(cod);
                }
            }

        }
    }//GEN-LAST:event_botonEliminar1MousePressed

    private void BotonModificar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonModificar1MousePressed
        if (tablaPiezas.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Para editar debes seleccionar una pieza en la tabla");
        } else {
            String cod = tablaPiezas.getValueAt(tablaPiezas.getSelectedRow(), 0).toString();
            EditarPieza frame = new EditarPieza(panel, cod);
            frame.setSize(700,490);
            frame.setLocation(0,0);
            panel.removeAll();
            panel.add(frame, BorderLayout.CENTER);
            panel.revalidate();
            panel.repaint();
        }
    }//GEN-LAST:event_BotonModificar1MousePressed

    private void botonVer1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVer1MousePressed
        if (tablaPiezas.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Para ver más información debes seleccionar una pieza en la tabla");
        } else {
            String cod = tablaPiezas.getValueAt(tablaPiezas.getSelectedRow(), 0).toString();
            VerPieza frame = new VerPieza(panel, cod);
            frame.setSize(700,490);
            frame.setLocation(0,0);
            panel.removeAll();
            panel.add(frame, BorderLayout.CENTER);
            panel.revalidate();
            panel.repaint();
        }
    }//GEN-LAST:event_botonVer1MousePressed

    private void botonAnadirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAnadirMousePressed
        NuevaPieza frame = new NuevaPieza(panel);
        frame.setSize(700,490);
        frame.setLocation(0,0);
        panel.removeAll();
        panel.add(frame, BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }//GEN-LAST:event_botonAnadirMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonModificar1;
    private javax.swing.JPanel botonAnadir;
    private javax.swing.JPanel botonEliminar1;
    private javax.swing.JPanel botonVer1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPiezas;
    // End of variables declaration//GEN-END:variables
}
