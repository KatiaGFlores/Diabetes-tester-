/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectito;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author katy
 */
public class tabla2 extends javax.swing.JFrame {

    DefaultTableModel tabla;
    String datos[][] = {};
    String encabezado[] = {"Dia ", "Nivel al desayunar ", "Medicamento", "Nivel  al almorzar  ", "Medicamento", "Nivel al cenar", "Medicamento"};

    /**
     * Creates new form tabla2
     */
    public tabla2() {
        initComponents();
        tabla = new DefaultTableModel(datos, encabezado);
        this.tablis.setModel(tabla);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        cb1 = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablis = new javax.swing.JTable();
        gd = new javax.swing.JButton();
        eli = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(1300, 900));
        getContentPane().setLayout(null);

        jLabel3.setText("Nivel al desayunar");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 70, 110, 34);

        jLabel5.setText("Medicamento");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 130, 169, 34);

        jLabel6.setText("Nivel al almorzar");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 200, 169, 34);

        jLabel7.setText("Medicamento");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 390, 169, 40);

        jLabel2.setText("Nivel al cenar");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 330, 169, 34);

        jLabel8.setText("Medicamento");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 260, 169, 50);

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1KeyTyped(evt);
            }
        });
        getContentPane().add(txt1);
        txt1.setBounds(120, 70, 170, 40);

        txt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2KeyTyped(evt);
            }
        });
        getContentPane().add(txt2);
        txt2.setBounds(120, 130, 170, 40);

        txt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3KeyTyped(evt);
            }
        });
        getContentPane().add(txt3);
        txt3.setBounds(120, 200, 170, 40);

        txt4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4KeyTyped(evt);
            }
        });
        getContentPane().add(txt4);
        txt4.setBounds(120, 270, 170, 40);

        txt5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5KeyTyped(evt);
            }
        });
        getContentPane().add(txt5);
        txt5.setBounds(120, 330, 170, 40);

        txt6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6KeyTyped(evt);
            }
        });
        getContentPane().add(txt6);
        txt6.setBounds(120, 390, 170, 40);

        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingoo" }));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        getContentPane().add(cb1);
        cb1.setBounds(310, 20, 220, 40);

        tablis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablis.setAlignmentY(1.0F);
        jScrollPane2.setViewportView(tablis);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(300, 120, 880, 90);

        gd.setText("Guardar");
        gd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gdActionPerformed(evt);
            }
        });
        getContentPane().add(gd);
        gd.setBounds(60, 460, 190, 40);

        eli.setText("Eliminar");
        eli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliActionPerformed(evt);
            }
        });
        getContentPane().add(eli);
        eli.setBounds(440, 450, 190, 40);

        jButton1.setText("Regresar a Consejos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(670, 450, 210, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

    private void gdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gdActionPerformed
       
        if (txt1.getText().isEmpty() || txt2.getText().isEmpty() || txt3.getText().isEmpty() || txt4.getText().isEmpty() || txt5.getText().isEmpty() || txt6.getText().isEmpty() )

        {
             JOptionPane.showMessageDialog(null,"No has ingresado valores o te flata algun campo que llenar","error",JOptionPane.ERROR_MESSAGE);
        }
                
        else
        {
            
        
        String t1 = txt1.getText();
        String t2 = txt2.getText();
        String t3 = txt3.getText();
        String t4 = txt4.getText();
        String t5 = txt5.getText();
        String t6 = txt6.getText();
          
       
        String dia = cb1.getSelectedItem().toString();
      
        
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
        txt6.setText("");
         
                
                
       String registro[]={dia,t1,t2,t3,t4,t5,t6};
       tabla.addRow(registro);
        }
    
   
        

    }//GEN-LAST:event_gdActionPerformed

    private void eliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliActionPerformed

        try {
            DefaultTableModel temp = (DefaultTableModel) tablis.getModel();

            temp.removeRow(temp.getRowCount() - 1);
        } catch (ArrayIndexOutOfBoundsException e) {;
        }

        try {
            tablis.removeRowSelectionInterval(0, 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUEDE ELIMINAR , NO HAY REGISTROS");

        }

    }//GEN-LAST:event_eliActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        ConGe co = new ConGe();
        co.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void txt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDEN INGRESAR NUMEROS");
        }
    }//GEN-LAST:event_txt1KeyTyped

    private void txt3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDEN INGRESAR NUMEROS");
        }
    }//GEN-LAST:event_txt3KeyTyped

    private void txt5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDEN INGRESAR NUMEROS");
        }
    }//GEN-LAST:event_txt5KeyTyped

    private void txt2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyReleased
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDEN INGRESAR LETRAS");
        }
    }//GEN-LAST:event_txt2KeyReleased

    private void txt2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyTyped

    }//GEN-LAST:event_txt2KeyTyped

    private void txt4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4KeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDEN INGRESAR LETRAS");
        }
    }//GEN-LAST:event_txt4KeyTyped

    private void txt6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6KeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDEN INGRESAR LETRAS");
        }
    }//GEN-LAST:event_txt6KeyTyped

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
            java.util.logging.Logger.getLogger(tabla2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabla2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabla2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabla2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new tabla2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb1;
    private javax.swing.JButton eli;
    private javax.swing.JButton gd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablis;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    // End of variables declaration//GEN-END:variables
}
