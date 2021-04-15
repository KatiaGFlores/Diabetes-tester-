

package no1;

/**
 *
 * @author katy
 */
public class pruebadeglucosa1 extends javax.swing.JFrame {

    /**
     * Creates new form pruebadeglucosa1
     */
 
    
    public pruebadeglucosa1() {
        initComponents();
       
        
       
    }
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("PRUEBA DE GLUCOSA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(203, 0, 477, 72);

        jLabel2.setText("YA HAS DESAYUNADO?");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 130, 240, 70);

        b1.setText("SI");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(370, 150, 220, 40);

        b2.setText("NO");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(370, 230, 220, 40);

        b22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectito/r2.png"))); // NOI18N
        b22.setText("Regresar");
        b22.setBorder(null);
        b22.setBorderPainted(false);
        b22.setContentAreaFilled(false);
        b22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b22.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectito/r1.png"))); // NOI18N
        b22.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectito/r3.png"))); // NOI18N
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });
        getContentPane().add(b22);
        b22.setBounds(20, 330, 250, 70);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed
       this.dispose();
         no no=new  no();
           no.setVisible(true);
    }//GEN-LAST:event_b22ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        this.dispose();
        pruebaglucosa3 pg=new pruebaglucosa3 ();
        pg.setVisible(true);
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        this.dispose();
        pruebaglucosa2 pg=new pruebaglucosa2 ();
        pg.setVisible(true);
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
            java.util.logging.Logger.getLogger(pruebadeglucosa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pruebadeglucosa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pruebadeglucosa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pruebadeglucosa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new pruebadeglucosa1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b22;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    private Object desayuno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object respuesta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
