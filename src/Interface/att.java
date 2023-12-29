/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Database.dbcnx;
import Database.parameter;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author hp
 */
public class att extends javax.swing.JFrame {

    /**
     * Creates new form att
     */
     dbcnx db;
    public att() {
       
           db=new dbcnx(new parameter().HOST_DB,new parameter().USERNAME_DB,new parameter().PASSWORD_DB,new parameter().IPHOST,new parameter().PORT);
        initComponents();
         setExtendedState(JFrame.MAXIMIZED_BOTH);
          setResizable(false);
          date();
         SetIcon();
    }

    
       public void actualiser(){
//        b.setText("");
//        dA.setText("");
//        Da.setText("");
//        g.setText("");
//        h.setText("");
        att.setText("");
//        adil.setSelectedIndex(0);
       
    }
       
        public void date(){
        DateTimeFormatter times =DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now =LocalDateTime.now();
        date.setText(times.format(now));
        }
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        att = new javax.swing.JTextArea();
        b = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        g = new javax.swing.JTextField();
        h = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        adil = new javax.swing.JComboBox<>();
        da = new com.toedter.calendar.JDateChooser();
        DA = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dA = new javax.swing.JTextField();
        Da = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        kl = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        att.setColumns(20);
        att.setFont(new java.awt.Font("Andalus", 1, 12)); // NOI18N
        att.setRows(5);
        att.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        att.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(att);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 164, 567, 320));

        b.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bKeyTyped(evt);
            }
        });
        getContentPane().add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 198, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Monsieur/Madame/Mademoiselle ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("nom et prénom");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("indiquer la fonction dans l’entreprise");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("date de début");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("date de fin");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("intitulé du poste");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        g.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gKeyTyped(evt);
            }
        });
        getContentPane().add(g, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 198, -1));

        h.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hKeyTyped(evt);
            }
        });
        getContentPane().add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 198, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/fotos/award.png"))); // NOI18N
        jButton1.setText("Attestation ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/fotos/copy.png"))); // NOI18N
        jButton2.setText("Imprimmer");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, -1, -1));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/fotos/close.png"))); // NOI18N
        jButton7.setText("Ferme");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 520, 142, -1));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/fotos/refresh.png"))); // NOI18N
        jButton8.setText("Actualiser");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 520, -1, -1));

        adil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monsieur", "Madame", "Mademoiselle" }));
        getContentPane().add(adil, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 198, -1));

        da.setDateFormatString("dd-MM-yyyy");
        da.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daMouseClicked(evt);
            }
        });
        da.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                daKeyTyped(evt);
            }
        });
        getContentPane().add(da, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 198, -1));

        DA.setDateFormatString("dd-MM-yyyy");
        getContentPane().add(DA, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 198, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Algerian", 1, 26)); // NOI18N
        jLabel14.setText("Attestation de stage en entreprise");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/fotos/certificate.png"))); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 100));

        dA.setBackground(new java.awt.Color(51, 0, 51));
        dA.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(dA, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 1056, -1, 4));

        Da.setBackground(new java.awt.Color(0, 51, 51));
        Da.setForeground(new java.awt.Color(51, 0, 51));
        getContentPane().add(Da, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1056, -1, 3));

        date.setBackground(new java.awt.Color(51, 0, 51));
        date.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 1056, -1, 0));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("indiquer l’adresse complète");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        kl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klActionPerformed(evt);
            }
        });
        getContentPane().add(kl, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 198, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/fotos/pexels-share-textures-11285435.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 80, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void attMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_attMouseClicked

    private void bKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if ((car<'a'||car>'z')&& (car<'A'||car>'Z') && (car!=(char)KeyEvent.VK_BACK_SPACE) && (car!=(char)KeyEvent.VK_SPACE)){
            evt.consume();
            //            JOptionPane.showMessageDialog(null,"seul le texte est autorisé","valider le texte",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bKeyTyped

    private void gKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if ((car<'a'||car>'z')&& (car<'A'||car>'Z') && (car!=(char)KeyEvent.VK_BACK_SPACE) && (car!=(char)KeyEvent.VK_SPACE)){
            evt.consume();
            //            JOptionPane.showMessageDialog(null,"seul le texte est autorisé","valider le texte",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_gKeyTyped

    private void hKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if ((car<'a'||car>'z')&& (car<'A'||car>'Z') && (car!=(char)KeyEvent.VK_BACK_SPACE) && (car!=(char)KeyEvent.VK_SPACE)){
            evt.consume();
            //            JOptionPane.showMessageDialog(null,"seul le texte est autorisé","valider le texte",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_hKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String Selectdate  = ((JTextField)da.getDateEditor().getUiComponent()).getText();
        dA.setText(Selectdate);

        String Selectdatee = ((JTextField)DA.getDateEditor().getUiComponent()).getText();
        Da.setText(Selectdatee);

        if (adil.getSelectedItem().equals("") || b.getText().equals("") || g.getText().equals("")  || h.getText().equals("") || dA.getText().equals("") ||Da.getText().equals("") ||kl.getText().equals("") ) {
            JOptionPane.showMessageDialog(this, "Remplir tous les champs");
        }
        else{
            att.append("\n\t                Institu Technique des sciences Nouvelles \n\t                ************************************************"
                
                +"\n----------------------------------------------------------------------------------------------------\n"
                +"\t\tAttestation de stage  \n "
                +"\t\t***********************\n"
                + "  Je soussigné(e) "
                + " "+adil.getSelectedItem()+""
                +" "+b.getText()+""
                +" , agissant en qualité de\n "
                +" "+g.getText()+""
                + " , certifie par la présente que "
               
                + " "+adil.getSelectedItem()+""
                + " "+b.getText()+""
                + " , \n  demeurant au "
                    
                + " "+kl.getText()+" "
                    
                + " a effectué un stage\n  au sein de notre entreprise"
                    
                 + " Institu Technique des sciences Nouvelles"
                    
                + "\n  du"
                + " "+dA.getText()+""
                + " au "
                + ""+Da.getText()+""
                + " en qualité de"
                +" "+h.getText()+"."
                + " \n\n       Cette attestation est délivrée à l’intéressé(e) pour servir et valoir\n   ce que de droit.\n\n"
                + "\tFaite A TETOUAN le "
                +""+date.getText()+""
                + "  \n\n"
                + "\t\tSignature \n"
                + "\t\tCachet "

            );

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
         if (att.getText().equals("") ){
             
         }else{
        try {
            att.print();
        } catch (PrinterException ex) {
            Logger.getLogger(att.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        actualiser();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void daMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_daMouseClicked

    private void daKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_daKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_daKeyTyped

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
         att.setEditable(false);
    }//GEN-LAST:event_formComponentShown

    private void klActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_klActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(att.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(att.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(att.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(att.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new att().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DA;
    private javax.swing.JTextField Da;
    private javax.swing.JComboBox<String> adil;
    private javax.swing.JTextArea att;
    private javax.swing.JTextField b;
    private javax.swing.JTextField dA;
    private com.toedter.calendar.JDateChooser da;
    private javax.swing.JTextField date;
    private javax.swing.JTextField g;
    private javax.swing.JTextField h;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kl;
    // End of variables declaration//GEN-END:variables

 private void SetIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("team.png")));
    }
}
