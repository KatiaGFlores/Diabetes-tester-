/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectito;

import java.awt.Color;
import javax.swing.border.LineBorder;

/**
 *
 * @author Lab314
 */
public class P8 extends javax.swing.JFrame {

    /**
     * Creates new form P8
     */
    public P8() {
        initComponents();
          grupo1.add(rb2);
         grupo1.add(rb1);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt1 = new javax.swing.JTextArea();
        b1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(700, 600));
        getContentPane().setLayout(null);

        jLabel5.setText("Pregunta 8 de 8");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 10, 320, 50);

        jLabel3.setText("Estoy presentando uno o m?s de los siguientes s?ntomas: boca seca, sed,");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 40, 680, 40);

        rb1.setText("Si");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });
        getContentPane().add(rb1);
        rb1.setBounds(60, 160, 70, 23);

        rb2.setText("No");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });
        getContentPane().add(rb2);
        rb2.setBounds(60, 190, 80, 23);

        txt1.setColumns(20);
        txt1.setRows(5);
        jScrollPane1.setViewportView(txt1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(150, 130, 430, 240);

        b1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectito/i2.png"))); // NOI18N
        b1.setText("Ir a consejos generales");
        b1.setBorder(null);
        b1.setBorderPainted(false);
        b1.setContentAreaFilled(false);
        b1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectito/i1.png"))); // NOI18N
        b1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectito/i3.png"))); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(330, 390, 300, 71);

        jLabel1.setText(" micciones frecuentes, cansancio, visi?n borrosa.");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 70, 360, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
         this.txt1.setText("\n " + "   SI?" + "\n"
                 + "\n Si usted tiene uno o mas de estos sintomas,"+
                 "\n su glucosa puede no estar bajo control. "
                 + "\n Haga una prueba de su glucosa y llame a su m?dico inmediatamente.");
    txt1.setEnabled(false);
    txt1.setBackground(Color.PINK);
    txt1.setForeground(Color.BLACK);
    txt1.setDisabledTextColor(Color.BLACK);
    txt1.setBorder(new LineBorder(Color.ORANGE)); 
    }//GEN-LAST:event_rb1ActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        this.txt1.setText("\n" + "    NO?"+ "\n"
                + "\n Estos son algunos de los sintomas comunes de hipoglucemia. "
                + "\n Sin embargo, su glucosa puede estar alta sin presentar ningun sintoma."
                + "\n Por eso es importante que usted mismo revise su"
                + "\n glucosa con la frecuencia que le recomiende su m?dico"
                + "\n y que se haga una prueba de HbA1c por lo menos dos veces al a?o.");
    txt1.setEnabled(false);
    txt1.setBackground(Color.PINK);
    txt1.setForeground(Color.BLACK);
    txt1.setDisabledTextColor(Color.BLACK);
    txt1.setBorder(new LineBorder(Color.ORANGE));
    }//GEN-LAST:event_rb2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        this.dispose();
        ConGe cg=new ConGe ();
        cg.setVisible(true);
    }//GEN-LAST:event_b1ActionPerformed

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
            java.util.logging.Logger.getLogger(P8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new P8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.ButtonGroup grupo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JTextArea txt1;
    // End of variables declaration//GEN-END:variables
}
