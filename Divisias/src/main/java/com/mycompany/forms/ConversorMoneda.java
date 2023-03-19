/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.forms;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import logica.convertirDivisa;

/**
 *
 * @author Carlos Saavedra
 */
public class ConversorMoneda extends javax.swing.JFrame {

    public static boolean reverseBool = false;
    private boolean firstC = false;
    

    /**
     * Creates new form Seleccion
     */
    public ConversorMoneda() {

        initComponents();
        setLocationRelativeTo(null);
        reverse.setVisible(false);

        setImageLabel(reverse, "D:\\2023\\Desktop\\ORACLE-ONE\\BACKEND\\ChallengeDivisas\\Divisias\\src\\main\\java\\img\\reverse.png");
        setImageLabel(info, "D:\\2023\\Desktop\\ORACLE-ONE\\BACKEND\\ChallengeDivisas\\Divisias\\src\\main\\java\\img\\informacion.png");

        JOptionPane.showMessageDialog(null, "Se ha establecido el Peso Colombiano con moneda predeterminada", "AVISO DEL SISTEMA", JOptionPane.INFORMATION_MESSAGE);

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
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jImporte = new javax.swing.JTextField();
        boxDivisa = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDefault = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        reverse = new javax.swing.JLabel();
        jpResultado = new javax.swing.JPanel();
        txtInformacion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        txtResult = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(236, 240, 241));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Conversor de Divisas");

        jImporte.setBackground(new java.awt.Color(255, 255, 255));
        jImporte.setForeground(new java.awt.Color(51, 51, 51));
        jImporte.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jImporteActionPerformed(evt);
            }
        });

        boxDivisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dolar", "Euros", "Libras Esterlinas", "Yen Japonés", "Won Sur Coreano", "COP-Peso" }));
        boxDivisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxDivisaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(183, 149, 11));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Convertir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Importe :");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("De:");

        txtDefault.setBackground(new java.awt.Color(255, 255, 255));
        txtDefault.setForeground(new java.awt.Color(102, 102, 102));
        txtDefault.setText("COP - Peso Colombiano");
        txtDefault.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtDefault.setEnabled(false);
        txtDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDefaultActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("a");

        reverse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reverse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reverseMouseClicked(evt);
            }
        });

        jpResultado.setBackground(new java.awt.Color(236, 240, 241));
        jpResultado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtInformacion.setBackground(new java.awt.Color(236, 240, 241));
        txtInformacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtInformacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Se está haciendo uso de la tasa de mercado del dia 19/03/2023, ");
        txtInformacion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 10, 380, 50));

        jLabel6.setText("Esto solo tiene fines  informativos. ");
        txtInformacion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));
        txtInformacion.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 30, 30));

        jpResultado.add(txtInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 384, 102));
        jpResultado.add(txtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 480, 120));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtDefault, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(reverse, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jpResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(boxDivisa, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(50, 50, 50))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reverse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDefault, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boxDivisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(62, 62, 62))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jpResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE))))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 330));

        jPanel3.setBackground(new java.awt.Color(183, 149, 11));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, -1));

        jPanel4.setBackground(new java.awt.Color(183, 149, 11));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jImporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jImporteActionPerformed

    private void txtDefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDefaultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDefaultActionPerformed

    private void boxDivisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxDivisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxDivisaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(!firstC) {this.firstC=true; reverse.setVisible(true);}
        
        double importe = Double.parseDouble(jImporte.getText());
        String divisa = reverseBool ? txtDefault.getText() : boxDivisa.getSelectedItem().toString().trim();

        try {
            double valor = convertirDivisa.convertir(importe, divisa.toLowerCase(), reverseBool);
            txtInformacion.setVisible(false);
            String resultado = reverseBool ? "Conversion Exitosa: \t " + importe +" "  + divisa + " a COP equivale a " + valor + "$" : "Conversion Exitosa: \t " + importe + " COP a " + divisa + " equivale a " + valor + "$";
            txtResult.setText(resultado);
        } catch (Exception e) {
            System.out.println("Error desconocido...");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void reverseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reverseMouseClicked
        double importe = Double.parseDouble(jImporte.getText());
        String divisa = boxDivisa.getSelectedItem().toString().trim();
        
        if (!reverseBool){
            boxDivisa.setEnabled(false);
            txtDefault.setText(divisa);
            boxDivisa.setSelectedItem("COP-Peso");
            reverseBool = true;
        }else{
            boxDivisa.setEnabled(true);
            boxDivisa.setSelectedItem(txtDefault.getText());
            txtDefault.setText("COP - Peso Colombiano");
            reverseBool = false;
        }


    }//GEN-LAST:event_reverseMouseClicked

    private void setImageLabel(JLabel imgPortada, String root) {
        // lOs parametros hacen referencia al jLabel en donde se quiere posicionar la imagen y el otro la ruta de la imagen

        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(imgPortada.getWidth(), imgPortada.getHeight(), Image.SCALE_DEFAULT) //widht, height , widht EN ESTE ultimo parametro se pone esa constante
        );
        imgPortada.setIcon(icon);
        this.repaint();
    }

    public static boolean isReverseBool() {
        return reverseBool;
    }
    
    

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
            java.util.logging.Logger.getLogger(ConversorMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversorMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversorMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversorMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversorMoneda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxDivisa;
    private javax.swing.JLabel info;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jImporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jpResultado;
    private javax.swing.JLabel reverse;
    private javax.swing.JTextField txtDefault;
    private javax.swing.JPanel txtInformacion;
    private javax.swing.JLabel txtResult;
    // End of variables declaration//GEN-END:variables
}
