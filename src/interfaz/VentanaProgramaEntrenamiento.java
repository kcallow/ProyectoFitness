/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectofitness.*;

/**
 *
 * @author scsaenz
 */
public class VentanaProgramaEntrenamiento extends javax.swing.JFrame implements ModosVentana {

    /**
     * Creates new form VentanaProgramaEjercicios
     */
    VentanaDia vDia = new VentanaDia();
    
    private String llave = "";
    private ProgramaEntrenamiento programaEntrenamiento ;
    
    public VentanaProgramaEntrenamiento() {
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
        jLabel1 = new javax.swing.JLabel();
        txtFechaCreacion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFechaInicio = new javax.swing.JTextField();
        txtFechaFinalizacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAsistencia = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnAddDia = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnCancelarVPE = new javax.swing.JButton();
        btnGuardarVPE = new javax.swing.JButton();
        btnBorrarVPE = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcionVPE = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtObjetivosVPE = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Programa de entrenamiento");
        setBounds(new java.awt.Rectangle(0, 0, 550, 550));
        setMinimumSize(new java.awt.Dimension(550, 550));
        setPreferredSize(new java.awt.Dimension(550, 550));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Programa de Entrenamiento"));
        jPanel1.setPreferredSize(new java.awt.Dimension(539, 490));

        jLabel1.setText("Fecha de creación:");

        jLabel3.setText("Descripción:");

        jLabel4.setText("Fecha de inicio:");

        jLabel5.setText("Fecha de finalización:");

        jLabel2.setText("Objetivos:");

        txtFechaInicio.setBackground(new java.awt.Color(204, 204, 204));

        txtFechaFinalizacion.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setText("Asistencia:");

        txtAsistencia.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAddDia.setText("Agregar día");
        btnAddDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDiaActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Número de día", "Ejercicios"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabla);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAddDia)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddDia)
                .addContainerGap())
        );

        btnCancelarVPE.setText("Cancelar");
        btnCancelarVPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVPEActionPerformed(evt);
            }
        });

        btnGuardarVPE.setText("Guardar");
        btnGuardarVPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarVPEActionPerformed(evt);
            }
        });

        btnBorrarVPE.setText("Borrar");
        btnBorrarVPE.setEnabled(false);
        btnBorrarVPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarVPEActionPerformed(evt);
            }
        });

        txtDescripcionVPE.setBackground(new java.awt.Color(204, 204, 204));
        txtDescripcionVPE.setColumns(20);
        txtDescripcionVPE.setLineWrap(true);
        txtDescripcionVPE.setRows(5);
        jScrollPane2.setViewportView(txtDescripcionVPE);

        txtObjetivosVPE.setBackground(new java.awt.Color(204, 204, 204));
        txtObjetivosVPE.setColumns(20);
        txtObjetivosVPE.setLineWrap(true);
        txtObjetivosVPE.setRows(5);
        jScrollPane3.setViewportView(txtObjetivosVPE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFechaFinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(142, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBorrarVPE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardarVPE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarVPE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAsistencia, txtFechaFinalizacion, txtFechaInicio});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBorrarVPE, btnCancelarVPE, btnGuardarVPE});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFechaCreacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaFinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarVPE)
                    .addComponent(btnGuardarVPE)
                    .addComponent(btnBorrarVPE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
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

    private void btnAddDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDiaActionPerformed
        try {
            vDia.setVisible(true);
            vDia.cargarLlave(llave);
        } catch (Exception ex) {
            Logger.getLogger(VentanaProgramaEntrenamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddDiaActionPerformed

    
    public void setCedula(String llave){
        this.llave = llave;
    }
    
    private void btnBorrarVPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarVPEActionPerformed
        try {
            int opcion = JOptionPane.showConfirmDialog(null, 
                                 "El programa de entrenamiento " + txtDescripcionVPE.getText() + " creado en <fecha de creación> "
                                         + "\ncuenta con <cantidad de días> días de entrenamiento y <cantidad de ejercicios> ejercicios. "
                                         + "\n¿Confirma la eliminación del programa?", 
                                  "", 
                                  JOptionPane.YES_NO_OPTION); 
            if (opcion == JOptionPane.YES_OPTION) {
                ProyectoFitness.borrarPrograma(llave);
                //VentanaPrincipal.llenarTabla();
                clear();
                dispose();
            }
            
            
        } catch (Exception ex) {
            Logger.getLogger(VentanaProgramaEntrenamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBorrarVPEActionPerformed

    private void btnGuardarVPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarVPEActionPerformed
        
        try {
            
            ProyectoFitness.agregarPrograma(llave, LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-uuuu")), txtFechaInicio.getText(), 
                    txtFechaFinalizacion.getText(), txtDescripcionVPE.getText(), 
                    txtObjetivosVPE.getText());
            clear();
            dispose();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_btnGuardarVPEActionPerformed

    private void btnCancelarVPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVPEActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarVPEActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        try {
            String numeroDia = tabla.getValueAt(tabla.getSelectedRow(), 0).toString(); 
            vDia.modoVer();
            vDia.cargarLlave(llave);
            vDia.cargarDia(numeroDia);
            vDia.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_tablaMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaProgramaEntrenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaProgramaEntrenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaProgramaEntrenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaProgramaEntrenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaProgramaEntrenamiento().setVisible(true);
            }
        });
    }
    
    private void llenarTabla() {
        Object[][] objetos;
        if(programaEntrenamiento != null) {
            int rows = programaEntrenamiento.size();
            final int columns = 2;
            objetos = new Object[rows][columns];
            int i = 0;
            for(Object key: programaEntrenamiento.keySet()){
                objetos[i][0] = key;
                Object [] campos = programaEntrenamiento.values().toArray()[i].toString().split(",");
                for(int j = 0; j < columns-1; j++) {
                    objetos[i][j+1] = campos[j];
                }
                i++;
            }
            boolean[] canEditTable = new boolean [columns];
            for(i = 0; i < columns; i++){
                canEditTable[i] = false;
            }
            
            tabla.setModel(new javax.swing.table.DefaultTableModel(objetos, new String [] {
                "Número de día", "Ejercicios"
            }){
                boolean [] canEdit = canEditTable;
                
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
            }
        });
        }
    }
    
    private void clear(){
        txtAsistencia.setText("");
        txtFechaFinalizacion.setText("");
        txtFechaInicio.setText("");
        txtObjetivosVPE.setText("");
        txtDescripcionVPE.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDia;
    private javax.swing.JButton btnBorrarVPE;
    private javax.swing.JButton btnCancelarVPE;
    private javax.swing.JButton btnGuardarVPE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtAsistencia;
    private javax.swing.JTextArea txtDescripcionVPE;
    private javax.swing.JLabel txtFechaCreacion;
    private javax.swing.JTextField txtFechaFinalizacion;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextArea txtObjetivosVPE;
    // End of variables declaration//GEN-END:variables

   
    
    @Override
    public void modoAgregar() {
        btnBorrarVPE.setEnabled(false);
        txtAsistencia.setEnabled(true);
        txtFechaFinalizacion.setEnabled(true);
        txtFechaInicio.setEnabled(true);
        txtObjetivosVPE.setEnabled(true);
        txtDescripcionVPE.setEnabled(true);
    }

    @Override
    public void modoVer() {
        try {
            txtFechaCreacion.setText(ProyectoFitness.getPrograma(llave).getFechaCreacion().toString());
            btnBorrarVPE.setEnabled(true);
            txtAsistencia.setEnabled(false);
            txtFechaFinalizacion.setEnabled(false);
            txtFechaInicio.setEnabled(false);
            txtObjetivosVPE.setEnabled(false);
            txtDescripcionVPE.setEnabled(false);
        } catch (Exception ex) {
            Logger.getLogger(VentanaProgramaEntrenamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modoModificar() {
    }
    
    public void cargarLlave(String llave) throws Exception {
            this.llave = llave;
            programaEntrenamiento = ProyectoFitness.getPrograma(llave);
            txtFechaCreacion.setText(programaEntrenamiento.getFechaCreacion().format(ProyectoFitness.formatoFecha));
            txtDescripcionVPE.setText(programaEntrenamiento.getDescripcion());
            txtFechaInicio.setText(programaEntrenamiento.getFechaInicio().format(ProyectoFitness.formatoFecha));
            txtFechaFinalizacion.setText(programaEntrenamiento.getFechaFin().format(ProyectoFitness.formatoFecha));
            txtObjetivosVPE.setText(programaEntrenamiento.getObjetivos());
            txtAsistencia.setText(programaEntrenamiento.getAsistencia() + "");
    }



}
