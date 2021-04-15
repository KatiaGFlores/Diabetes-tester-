/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectito;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Tipo2 extends javax.swing.JFrame {

   public Clip clip;
   public String ruta= "/proyectito/";
   
    public Tipo2() {
        initComponents();
   
    }
public void sonido(String archivo) {
try {
clip=AudioSystem.getClip();
clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta + archivo + ".wav")));
clip.start();
}
catch
     
  (Exception e) {}
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(565, 350));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel2.setText("Su Diabetes esta bajo control?");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 80, 400, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("AVERIGUALO!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 150, 170, 50);

        b2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectito/r2.png"))); // NOI18N
        b2.setText("Regresar");
        b2.setBorder(null);
        b2.setBorderPainted(false);
        b2.setContentAreaFilled(false);
        b2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectito/r1.png"))); // NOI18N
        b2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectito/r3.png"))); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(310, 240, 200, 70);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 150, 190, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectito/d2.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel3.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -10, 550, 340);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.dispose();
P1 p1=new P1();
p1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
     sonido("pd");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseEntered

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
       this.dispose();
       Principal p=new Principal();
        p.setVisible(true);
    }//GEN-LAST:event_b2ActionPerformed

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
            java.util.logging.Logger.getLogger(Tipo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tipo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tipo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tipo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Tipo2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
