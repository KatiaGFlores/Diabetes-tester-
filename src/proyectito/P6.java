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
public class P6 extends javax.swing.JFrame {

    /**
     * Creates new form P6
     */
    public P6() {
        initComponents();
         grupo1.add(rb2);
         grupo1.add(rb1);
         grupo1.add(rb3);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt1 = new javax.swing.JTextArea();
        b1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(700, 600));
        getContentPane().setLayout(null);

        jLabel3.setText("Hago la actividad fisica por semana recomendada por mi m?dico.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 50, 390, 50);

        jLabel5.setText("Pregunta 6 de 8");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 10, 320, 50);

        rb1.setText("Nunca");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });
        getContentPane().add(rb1);
        rb1.setBounds(40, 140, 79, 23);

        rb2.setText("A veces");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });
        getContentPane().add(rb2);
        rb2.setBounds(40, 170, 90, 23);

        rb3.setText("Siempre");
        rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3ActionPerformed(evt);
            }
        });
        getContentPane().add(rb3);
        rb3.setBounds(40, 200, 90, 23);

        txt1.setColumns(20);
        txt1.setRows(5);
        jScrollPane1.setViewportView(txt1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 100, 400, 220);

        b1.setText("Siguiente");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(280, 340, 140, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
 this.txt1.setText("\n " + "  A VECES" + "\n"
         + "\n Busque formas para incluir mas actividad fisica"
         + "\n a su programa a una hora en la que podria? cumplir."
         + "\n No se prepare para el fracaso fijando metas poco realistas,"
         + "\n como hacer ejercicio todos los dias durante 2 horas."
         + "\n Busque actividades que le gusten y "
         + "\n que sean variadas para que no se aburra.");
    txt1.setEnabled(false);
    txt1.setBackground(Color.cyan);
    txt1.setForeground(Color.BLACK);
    txt1.setDisabledTextColor(Color.BLACK);
    txt1.setBorder(new LineBorder(Color.GREEN));         // TODO add your handling code here:
    }//GEN-LAST:event_rb2ActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
  this.txt1.setText("\n " + "  NUNCA" + "\n"
          + "\n La actividad fisica es una parte importante de equilibrar su  "
          + "\n diabetes tipo 2 y su peso. Trate de no abrumarse con la idea"
          + "\n estar activo, comience lentamente. Caminar es una excelente "
          + "\n forma de comenzar y no necesita equipo especial."
           + "\n Aumente gradualmente la distancia, velocidad y frecuencia de " 
          + "\n de sus caminatas. Pregunte a su medico por una meta y secuencia "
           +"\n realistas.");
    txt1.setEnabled(false);
    txt1.setBackground(Color.cyan);
    txt1.setForeground(Color.BLACK);
    txt1.setDisabledTextColor(Color.BLACK);
    txt1.setBorder(new LineBorder(Color.GREEN));         // TODO add your handling code here:
    }//GEN-LAST:event_rb1ActionPerformed

    private void rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3ActionPerformed
       this.txt1.setText("\n " + "  SIEMPRE"+ "\n"
               + "\n La actividad fisica ayuda a su cuerpo en muchas formas,"
               + "\n no si lo controlando su glucosa. "
               + "\n Evite aburrirse variando sus actividades y "
               + "\n no se sienta mal si deja de hacerlo un dia. ");
              
               
    txt1.setEnabled(false);
    txt1.setBackground(Color.cyan);
    txt1.setForeground(Color.BLACK);
    txt1.setDisabledTextColor(Color.BLACK);
    txt1.setBorder(new LineBorder(Color.GREEN)); 
    }//GEN-LAST:event_rb3ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        this.dispose();
        P7 p7=new P7 ();
        p7.setVisible(true);
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
            java.util.logging.Logger.getLogger(P6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new P6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.ButtonGroup grupo1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JTextArea txt1;
    // End of variables declaration//GEN-END:variables
}
