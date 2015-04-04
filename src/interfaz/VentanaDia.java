/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectofitness.Dia;

import proyectofitness.ProyectoFitness;

/**
 *
 * @author scsaenz
 */
public class VentanaDia extends javax.swing.JFrame implements ModosVentana {
    VentanaEjercicio vEjercicio = new VentanaEjercicio();
    private String llave = "", numeroDia;
    private Dia dia;

    /**
     * Creates new form VentanaDia
     */
    public VentanaDia() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
        addEjercicioDia = new javax.swing.JButton();
        btnSalirDia = new javax.swing.JButton();
        btnBorrarDia = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNumeroDia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dia");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Día"));

        addEjercicioDia.setText("Agregar Ejercicio");
        addEjercicioDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEjercicioDiaActionPerformed(evt);
            }
        });

        btnSalirDia.setText("Salir");
        btnSalirDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirDiaActionPerformed(evt);
            }
        });

        btnBorrarDia.setText("Borrar");
        btnBorrarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarDiaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel1.setText("Número día:");

        txtNumeroDia.setBackground(new java.awt.Color(204, 204, 204));
        txtNumeroDia.setText("0");
        txtNumeroDia.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(addEjercicioDia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumeroDia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrarDia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalirDia))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addEjercicioDia, btnBorrarDia, btnGuardar, btnSalirDia});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEjercicioDia)
                    .addComponent(jLabel1)
                    .addComponent(txtNumeroDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalirDia)
                    .addComponent(btnBorrarDia)
                    .addComponent(btnGuardar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addEjercicioDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEjercicioDiaActionPerformed
        vEjercicio.setVisible(true);
    }//GEN-LAST:event_addEjercicioDiaActionPerformed

    private void btnSalirDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirDiaActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirDiaActionPerformed

    private void btnBorrarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarDiaActionPerformed

        try {    
            int opcion = JOptionPane.showConfirmDialog(null, 
                                 "El día " + txtNumeroDia.getText() + "del programa <nombre del programa> contiene <cantidad de ejercicios>"
                                         + " ejercicios. "
                    + "\n¿Confirma el borrado del día?", 
                                  "", 
                                  JOptionPane.YES_NO_OPTION); 
            if (opcion == JOptionPane.YES_OPTION) {
                
                    ProyectoFitness.borrarDia(llave, numeroDia);
                    VentanaProgramaEntrenamiento.llenarTabla();
                    clear();
                    dispose();}
            } catch (Exception ex) {
                    Logger.getLogger(VentanaDatosPaciente.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btnBorrarDiaActionPerformed


    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        
        try {
            numeroDia = txtNumeroDia.getText();
            ProyectoFitness.agregarDia(llave,numeroDia);
            VentanaProgramaEntrenamiento.llenarTabla();
            dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Número inválido");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEjercicioDia;
    private javax.swing.JButton btnBorrarDia;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalirDia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtNumeroDia;
    // End of variables declaration//GEN-END:variables

    void clear() {
        txtNumeroDia.setText("");
    }

    void cargarLlave(String llave) {
        this.llave = llave;
    }


    public void modoAgregar() {
        btnBorrarDia.setEnabled(false);
        addEjercicioDia.setEnabled(false);
        txtNumeroDia.setEnabled(true);
        btnGuardar.setEnabled(true);
    }

    @Override
    public void modoVer() throws Exception {
        btnBorrarDia.setEnabled(true);
        addEjercicioDia.setEnabled(true);
        txtNumeroDia.setEnabled(false);
        btnGuardar.setEnabled(false);
    }

    @Override
    public void modoModificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void cargarDia(String numeroDia) throws Exception {
        this.dia = ProyectoFitness.getDia(llave, numeroDia);
        txtNumeroDia.setText(numeroDia);
        this.numeroDia = numeroDia;

    }
}
