/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectofitness.*;

/**
 *
 * @author scsaenz
 */
public class VentanaEjercicio extends javax.swing.JFrame implements ModosVentana  {

    private String llave = "";
    private String dia = VentanaDia.getNumeroDia();
    /**
     * Creates new form VentanaEjercicio
     */
    public VentanaEjercicio() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtSeries = new javax.swing.JTextField();
        txtRepeticiones = new javax.swing.JTextField();
        txtDescanso = new javax.swing.JTextField();
        txtPeso1 = new javax.swing.JTextField();
        txtPeso2 = new javax.swing.JTextField();
        txtPeso3 = new javax.swing.JTextField();
        btnBorrarVE = new javax.swing.JButton();
        btnCancelarVE = new javax.swing.JButton();
        btnGuardarVE = new javax.swing.JButton();
        btnModificarVE = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        comboEjercicio = new javax.swing.JComboBox();
        txtNumeroEjercicio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ejercicio");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ejercicio"));

        jLabel1.setText("Número:");

        jLabel2.setText("Descripción:");

        jLabel3.setText("Número de series:");

        jLabel4.setText("Número de repeticiones:");

        jLabel5.setText("Tiempo de descanso:");

        jLabel6.setText("Peso 1:");

        jLabel7.setText("Peso 2:");

        jLabel8.setText("Peso 3:");

        txtDescripcion.setBackground(new java.awt.Color(204, 204, 204));
        txtDescripcion.setColumns(20);
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        txtSeries.setBackground(new java.awt.Color(204, 204, 204));

        txtRepeticiones.setBackground(new java.awt.Color(204, 204, 204));

        txtDescanso.setBackground(new java.awt.Color(204, 204, 204));

        txtPeso1.setBackground(new java.awt.Color(204, 204, 204));

        txtPeso2.setBackground(new java.awt.Color(204, 204, 204));

        txtPeso3.setBackground(new java.awt.Color(204, 204, 204));

        btnBorrarVE.setText("Borrar");
        btnBorrarVE.setEnabled(false);
        btnBorrarVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarVEActionPerformed(evt);
            }
        });

        btnCancelarVE.setText("Cancelar");
        btnCancelarVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVEActionPerformed(evt);
            }
        });

        btnGuardarVE.setText("Guardar");
        btnGuardarVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarVEActionPerformed(evt);
            }
        });

        btnModificarVE.setText("Modificar");
        btnModificarVE.setEnabled(false);
        btnModificarVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarVEActionPerformed(evt);
            }
        });

        jLabel9.setText("Tipo de ejercicio:");

        comboEjercicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtNumeroEjercicio.setBackground(new java.awt.Color(204, 204, 204));
        txtNumeroEjercicio.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnModificarVE)
                .addGap(2, 2, 2)
                .addComponent(btnBorrarVE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarVE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarVE)
                .addGap(47, 47, 47))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescanso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRepeticiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSeries, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPeso3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPeso2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPeso1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDescanso, txtPeso1, txtPeso2, txtPeso3, txtRepeticiones, txtSeries});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBorrarVE, btnCancelarVE, btnGuardarVE, btnModificarVE});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumeroEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSeries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRepeticiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeso2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDescanso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeso3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comboEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrarVE)
                    .addComponent(btnCancelarVE)
                    .addComponent(btnGuardarVE)
                    .addComponent(btnModificarVE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVEActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarVEActionPerformed

    private void btnGuardarVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarVEActionPerformed
    
        try {
            ProyectoFitness.agregarEjercicio(llave, dia, txtNumeroEjercicio.getText(),
                    comboEjercicio.getSelectedItem().toString(), txtSeries.getText(), txtRepeticiones.getText(), txtPeso1.getText(),
                    txtPeso2.getText(), txtPeso3.getText(), txtDescanso.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Los datos son inválidos");
        }
    }//GEN-LAST:event_btnGuardarVEActionPerformed

    private void btnBorrarVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarVEActionPerformed
        try {    
            int opcion = JOptionPane.showConfirmDialog(null, 
                                 "Desea borrar el ejercicio?", 
                                  "", 
                                  JOptionPane.YES_NO_OPTION); 
            if (opcion == JOptionPane.YES_OPTION) {
                
                    ProyectoFitness.borrarEjercicio(llave, dia, txtNumeroEjercicio.getText());
                    VentanaDia.llenarTabla();
                    clear();
                    dispose();}
            } catch (Exception ex) {
                    Logger.getLogger(VentanaDatosPaciente.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btnBorrarVEActionPerformed

    private void btnModificarVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarVEActionPerformed
        modoModificar();
    }//GEN-LAST:event_btnModificarVEActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaEjercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEjercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEjercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEjercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEjercicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarVE;
    private javax.swing.JButton btnCancelarVE;
    private javax.swing.JButton btnGuardarVE;
    private javax.swing.JButton btnModificarVE;
    private javax.swing.JComboBox comboEjercicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDescanso;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNumeroEjercicio;
    private javax.swing.JTextField txtPeso1;
    private javax.swing.JTextField txtPeso2;
    private javax.swing.JTextField txtPeso3;
    private javax.swing.JTextField txtRepeticiones;
    private javax.swing.JTextField txtSeries;
    // End of variables declaration//GEN-END:variables

    
    
    void cargarLlave(String llave) {
        this.llave = llave;
    }
    
    @Override
    public void modoAgregar() {
        javax.swing.JTextField [] elementos = new javax.swing.JTextField [] {
            txtPeso1,
            txtPeso2,
            txtPeso3,
            txtRepeticiones,
            txtSeries,
            txtDescanso,
            };
        txtDescripcion.setEnabled(true);
        comboEjercicio.setEnabled(true);
        btnBorrarVE.setEnabled(false);
        btnModificarVE.setEnabled(false);
        btnGuardarVE.setEnabled(true);
        for(int i = 0; i < elementos.length; i++)
            elementos[i].setEnabled(true);
    
    }

    @Override
    public void modoVer() {
        javax.swing.JTextField [] elementos = new javax.swing.JTextField [] {
            txtPeso1,
            txtPeso2,
            txtPeso3,
            txtRepeticiones,
            txtSeries,
            txtDescanso,
            };
        txtDescripcion.setEnabled(false);
        comboEjercicio.setEnabled(false);
        btnBorrarVE.setEnabled(true);
        btnModificarVE.setEnabled(true);
        btnGuardarVE.setEnabled(false);
        for(int i = 0; i < elementos.length; i++)
            elementos[i].setEnabled(false);
    }

    @Override
    public void modoModificar() {
        javax.swing.JTextField [] elementos = new javax.swing.JTextField [] {
            txtPeso1,
            txtPeso2,
            txtPeso3,
            txtRepeticiones,
            txtSeries,
            txtDescanso,
            };
        txtDescripcion.setEnabled(true);
        comboEjercicio.setEnabled(true);
        btnBorrarVE.setEnabled(true);
        btnModificarVE.setEnabled(true);
        btnGuardarVE.setEnabled(true);
        for(int i = 0; i < elementos.length; i++)
            elementos[i].setEnabled(true);
    }

    public void cargarLlave(String llave, String numeroDia, String numeroEjercicio) throws Exception {
        Ejercicio ejercicio = ProyectoFitness.getEjercicio(llave, numeroDia, numeroEjercicio);
        String s = "";
        this.llave = llave;
        txtDescanso.setText(s + ejercicio.getTiempoDescanso());
        txtPeso1.setText(s + ejercicio.getPeso1());
        txtPeso2.setText(s + ejercicio.getPeso2());
        txtPeso3.setText(s + ejercicio.getPeso3());
        txtRepeticiones.setText(s + ejercicio.getRepeticiones());
        txtSeries.setText(s + ejercicio.getSeries());

    }

    private void clear() {
        txtDescripcion.setText("");
        txtPeso1.setText("");
        txtPeso2.setText("");
        txtPeso3.setText("");
        txtRepeticiones.setText("");
        txtSeries.setText("");
        txtDescanso.setText("");
    }
}
