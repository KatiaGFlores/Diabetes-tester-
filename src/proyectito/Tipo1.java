/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectito;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Tipo1 extends javax.swing.JFrame {

   public Clip clip;
   public String ruta= "/proyectito/";
   
    public Tipo1() {
        initComponents();
        
    }
public void sonido(String archivo) {
try {
clip=AudioSystem.getClip();
clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta + archivo + ".wav")));
clip.start();
}
catch
        (Exception e){}
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setMaximumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(638, 400));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("TIPO 1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(33, 19, 56, 22);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Lo que se recomienda es:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 60, 143, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("* Se recomienda que usted lleve un tratamiento basado en insulina u otra medicina inyectable.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 80, 590, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("* Comer de forma sana.");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 120, 410, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("* Tener una actividad fisica con regularidad.");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 160, 370, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("* Controlar su presion arterial y el colesterol.");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 200, 270, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectito/i2.png"))); // NOI18N
        jButton1.setText("Ir a Consejos Generales");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setDefaultCapable(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectito/i1.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectito/i3.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 240, 260, 70);

        b2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectito/r2.png"))); // NOI18N
        b2.setText("Regresar a 'Tipos'");
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
        b2.setBounds(30, 250, 210, 70);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectito/dt1.jpg"))); // NOI18N
        jLabel8.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel8.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel8.setPreferredSize(new java.awt.Dimension(596, 350));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, -60, 620, 480);

        jLabel7.setPreferredSize(new java.awt.Dimension(650, 800));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 20, 590, 320);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        ConGe cg=new ConGe();
        cg.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
sonido("km");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseEntered

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
       this.dispose();
       SI si=new SI();
        si.setVisible(true);
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
            java.util.logging.Logger.getLogger(Tipo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tipo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tipo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tipo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Tipo1().setVisible(true);
            }
        });
         
            
   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
