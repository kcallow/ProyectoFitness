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
public class VentanaTipoEjercicio extends javax.swing.JFrame implements ModosVentana {
    private String llave = "";

    /**
     * Creates new form VentanaTipoEjercicio
     */
    public VentanaTipoEjercicio() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void updateMaquinasDisponibles() {
        comboMaquina.setModel(new javax.swing.DefaultComboBoxModel(ProyectoFitness.maquinas.keySet().toArray()));
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcionVTE = new javax.swing.JTextArea();
        btnCancelarVTE = new javax.swing.JButton();
        btnGuardarVTE = new javax.swing.JButton();
        btnBorrarVTE = new javax.swing.JButton();
        btnModificarVTE = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboMaquina = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tipo de ejercicio");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de ejercicio"));

        jLabel1.setText("Descripción:");

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

        txtDescripcionVTE.setBackground(new java.awt.Color(204, 204, 204));
        txtDescripcionVTE.setColumns(20);
        txtDescripcionVTE.setRows(5);
        jScrollPane1.setViewportView(txtDescripcionVTE);

        btnCancelarVTE.setText("Cancelar");
        btnCancelarVTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVTEActionPerformed(evt);
            }
        });

        btnGuardarVTE.setText("Guardar");
        btnGuardarVTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarVTEActionPerformed(evt);
            }
        });

        btnBorrarVTE.setText("Borrar");
        btnBorrarVTE.setEnabled(false);
        btnBorrarVTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarVTEActionPerformed(evt);
            }
        });

        btnModificarVTE.setText("Modificar");
        btnModificarVTE.setEnabled(false);
        btnModificarVTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarVTEActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        txtNombre.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setText("Tipo de Máquina:");

        comboMaquina.setModel(new javax.swing.DefaultComboBoxModel(ProyectoFitness.maquinas.keySet().toArray()));
        comboMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMaquinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 56, Short.MAX_VALUE)
                        .addComponent(btnModificarVTE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrarVTE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardarVTE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarVTE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBorrarVTE, btnCancelarVTE, btnGuardarVTE, btnModificarVTE});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {comboMaquina, txtNombre});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarVTE)
                    .addComponent(btnGuardarVTE)
                    .addComponent(btnBorrarVTE)
                    .addComponent(btnModificarVTE)))
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

    private void btnModificarVTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarVTEActionPerformed
        modoModificar();
    }//GEN-LAST:event_btnModificarVTEActionPerformed

    private void btnBorrarVTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarVTEActionPerformed
        try {
            int opcion = JOptionPane.showConfirmDialog(null, 
                                 "El tipo de ejercicio " + txtNombre.getText() + " está siendo utilizado en "
                                         + "<número de programas de entrenamiento> \nprogramas de entrenamiento, "
                                         + "se eliminará de estos programas. \n¿Confirma el borrado del ejercicio?", 
                                  "", 
                                  JOptionPane.YES_NO_OPTION); 
            if (opcion == JOptionPane.YES_OPTION) {
                ProyectoFitness.borrarTipoEjercicio(txtNombre.getText());
                VentanaPrincipal.llenarTabla();
                clear();
                dispose();
            }
        } catch (Exception ex) {
            Logger.getLogger(VentanaTipoEjercicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBorrarVTEActionPerformed

    private void btnGuardarVTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarVTEActionPerformed
        try {
            if(btnModificarVTE.isEnabled())
                ProyectoFitness.modificarTipoEjercicio(llave,txtNombre.getText(), txtDescripcionVTE.getText(), comboMaquina.getSelectedItem().toString());
            else 
                ProyectoFitness.agregarTipoEjercicio(txtNombre.getText(), txtDescripcionVTE.getText(), comboMaquina.getSelectedItem().toString());
            VentanaPrincipal.llenarTabla();
            VentanaDia.vEjercicio.updateTiposEjercicioDisponibles();
            clear();
            dispose();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_btnGuardarVTEActionPerformed

    private void btnCancelarVTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVTEActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarVTEActionPerformed

    private void comboMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMaquinaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaTipoEjercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaTipoEjercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaTipoEjercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaTipoEjercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaTipoEjercicio().setVisible(true);
            }
        });
    }
    private void clear(){
        txtDescripcionVTE.setText("");
        txtNombre.setText("");
        comboMaquina.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarVTE;
    private javax.swing.JButton btnCancelarVTE;
    private javax.swing.JButton btnGuardarVTE;
    private javax.swing.JButton btnModificarVTE;
    private javax.swing.JComboBox comboMaquina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDescripcionVTE;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
/*
    javax.swing.JButton [] elementos = new javax.swing.JButton [] {
        btnBorrarVTE,
        btnModificarVTE
            };
    */
    @Override
    public void modoAgregar() {
        clear();
        txtDescripcionVTE.setEnabled(true);
        txtNombre.setEnabled(true);
        btnBorrarVTE.setEnabled(false);
        btnModificarVTE.setEnabled(false);
        btnGuardarVTE.setEnabled(true);
        comboMaquina.setEnabled(true);
    }

    @Override
    public void modoVer() {
        txtDescripcionVTE.setEnabled(false);
        btnBorrarVTE.setEnabled(true);
        btnModificarVTE.setEnabled(true);
        comboMaquina.setEnabled(false);
        txtNombre.setEnabled(false);
        btnGuardarVTE.setEnabled(false);
    }

    @Override
    public void modoModificar() {
        comboMaquina.setEnabled(true);
        txtDescripcionVTE.setEnabled(true);
        btnGuardarVTE.setEnabled(true);
        txtNombre.setEnabled(true);
    }

    public void cargarLlave(String llave) throws Exception {
        this.llave = llave;
        TipoEjercicio tipoEjercicio = ProyectoFitness.getTipoEjercicio(llave);
        txtDescripcionVTE.setText(tipoEjercicio.getDescripcion());
        comboMaquina.setSelectedItem(tipoEjercicio.getTipoMaquina());
        txtNombre.setText(llave);
    }
}
