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
public class P1 extends javax.swing.JFrame {

    /**
     * Creates new form P1
     */
    public P1() {
        initComponents();
        grupo1.add(rb1);
        grupo1.add(rb2);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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

        jLabel1.setText("Pregunta 1 de 8");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 119, 41);

        jLabel2.setText("Reviso mis niveles de glucosa con la frecuencia que mi medico recomienda.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(18, 58, 460, 30);

        rb1.setText("Nunca");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });
        getContentPane().add(rb1);
        rb1.setBounds(20, 140, 100, 20);

        rb2.setText("A veces");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });
        getContentPane().add(rb2);
        rb2.setBounds(20, 170, 90, 23);

        rb3.setText("Siempre");
        rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3ActionPerformed(evt);
            }
        });
        getContentPane().add(rb3);
        rb3.setBounds(20, 200, 110, 23);

        txt1.setColumns(20);
        txt1.setRows(5);
        jScrollPane1.setViewportView(txt1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 90, 370, 250);

        b1.setText("Siguiente");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(300, 360, 110, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
this.txt1.setText("\n" + "  NUNCA"+ "\n" + "\n Es una buena idea revisar su glucosa periodicamente,"+"\n" 
        +" Pregunte a su medico con que frecuencia " +"\n" +" y a que hora del dia debe medirla." +  
        "\n" + " Probablemente al principio debera  hacerlo mas a menudo.");
   
    txt1.setEnabled(false);
    txt1.setBackground(Color.pink);
    txt1.setForeground(Color.red);
    txt1.setDisabledTextColor(Color.BLACK);
    txt1.setBorder(new LineBorder(Color.BLUE));
    }//GEN-LAST:event_rb1ActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
this.txt1.setText("\n" + "  AVECES" + "\n"+
        "\n Revise su glucosa con la frecuencia que su medico sugiera." +
        "\n"+ " Y recuerde mantener un registro de sus resultados." + 
        "\n"+ " Es posible que su medico, tambien desee revisarlo mas "
        + "\n"+ " a menudo si usted esta enfermo o estresado.");
     txt1.setEnabled(false);
    txt1.setBackground(Color.pink);
    txt1.setForeground(Color.red);
    txt1.setDisabledTextColor(Color.BLACK);
    txt1.setBorder(new LineBorder(Color.BLUE));      // TODO add your handling code here:
    }//GEN-LAST:event_rb2ActionPerformed

    private void rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3ActionPerformed
this.txt1.setText("\n"+"  SIEMPRE" + "\n" + "\n Buen trabajo!" +"\n"+
        
        " Si aun no lo ha hecho, lleve un registro de sus niveles de "
        +"\n" +" glucosa junto con lo que ha comido y sus niveles" + "\n de actividad."  
      );
      txt1.setEnabled(false);
    txt1.setBackground(Color.pink);
    txt1.setForeground(Color.red);
    txt1.setDisabledTextColor(Color.BLACK);
    txt1.setBorder(new LineBorder(Color.BLUE));     // TODO add your handling code here:
    }//GEN-LAST:event_rb3ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
       this.dispose();
        P2 p2=new P2 ();
        p2.setVisible(true);
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
            java.util.logging.Logger.getLogger(P1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new P1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.ButtonGroup grupo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JTextArea txt1;
    // End of variables declaration//GEN-END:variables
}
