/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Database.datatable;
import Database.dbcnx;
import Database.parameter;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class app extends javax.swing.JFrame {
    
    ResultSet rs;
    dbcnx db;
    public app() {
         db=new dbcnx(new parameter().HOST_DB,new parameter().USERNAME_DB,new parameter().PASSWORD_DB,new parameter().IPHOST,new parameter().PORT);
        initComponents();
        table();
        mode.setVisible(false);
        supp.setVisible(false);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);
        SetIcon();
    }
      public void table(){
            String t[]=
            {"cin","nom","prenom","email","ecole","service","duree","sexe"};
            rs=db.SelectSome(t,"stagier");
            Table1.setModel(new datatable(rs) {});
        }
    
    public void actualiser(){
        cin.setText("");
        nom.setText("");
        prenom.setText("");
        email.setText("");
        ecole.setText("");
        service.setSelectedIndex(0); 
        duree.setText("");
        sexe.setSelectedIndex(0); 
        colonrech.setText("");
        ci.setSelectedIndex(0);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        cin = new javax.swing.JTextField();
        prenom = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        ecole = new javax.swing.JTextField();
        duree = new javax.swing.JTextField();
        sexe = new javax.swing.JComboBox();
        service = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        mode = new javax.swing.JButton();
        supp = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        ci = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        colonrech = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jButton3.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jButton3.setText("Modifier");

        jButton8.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jButton8.setText("Actualiser");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(121, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Andalus", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cin ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 131, -1, -1));

        jLabel2.setFont(new java.awt.Font("Andalus", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nom");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 172, -1, -1));

        jLabel3.setFont(new java.awt.Font("Andalus", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Prenom");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 213, -1, -1));

        jLabel4.setFont(new java.awt.Font("Andalus", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 254, -1, -1));

        jLabel5.setFont(new java.awt.Font("Andalus", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ecole");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 295, -1, -1));

        jLabel6.setFont(new java.awt.Font("Andalus", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("service");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 336, -1, -1));

        jLabel7.setFont(new java.awt.Font("Andalus", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Duree de stage");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 377, -1, -1));

        jLabel8.setFont(new java.awt.Font("Andalus", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sexe");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 418, -1, -1));

        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });
        nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomKeyTyped(evt);
            }
        });
        getContentPane().add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 176, 183, -1));

        cin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cinKeyTyped(evt);
            }
        });
        getContentPane().add(cin, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 135, 183, -1));

        prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomActionPerformed(evt);
            }
        });
        prenom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prenomKeyTyped(evt);
            }
        });
        getContentPane().add(prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 217, 183, -1));

        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 254, 183, -1));

        ecole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecoleActionPerformed(evt);
            }
        });
        ecole.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ecoleKeyTyped(evt);
            }
        });
        getContentPane().add(ecole, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 299, 183, -1));

        duree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dureeActionPerformed(evt);
            }
        });
        getContentPane().add(duree, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 381, 183, -1));

        sexe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Femme", "Homme" }));
        sexe.setToolTipText("");
        getContentPane().add(sexe, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 422, 183, -1));

        service.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Réseau Informatique", "Logistique", "développement", "comptabilité", "Transport", "Maintenance", "Gestion et Rucutment" }));
        service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceActionPerformed(evt);
            }
        });
        getContentPane().add(service, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 340, 180, -1));

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 131, 709, 252));

        jButton1.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/fotos/diskette.png"))); // NOI18N
        jButton1.setText("Ajouter");
        jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton1FocusLost(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton1KeyTyped(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 529, 121, -1));

        mode.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        mode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/fotos/order.png"))); // NOI18N
        mode.setText("Modifier");
        mode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeActionPerformed(evt);
            }
        });
        getContentPane().add(mode, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 600, 130, -1));

        supp.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        supp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/fotos/trash.png"))); // NOI18N
        supp.setText("Supprimer");
        supp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppActionPerformed(evt);
            }
        });
        getContentPane().add(supp, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 600, -1, -1));

        jButton5.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/fotos/refresh.png"))); // NOI18N
        jButton5.setText("Actualiser");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 529, 136, -1));

        ci.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        ci.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cin", "nom", "prenom", "email", "ecole", "service", "duree", "sexe" }));
        getContentPane().add(ci, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, 160, 32));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Rechercher par :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 190, -1));

        colonrech.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colonrechMouseClicked(evt);
            }
        });
        colonrech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colonrechActionPerformed(evt);
            }
        });
        colonrech.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                colonrechKeyReleased(evt);
            }
        });
        getContentPane().add(colonrech, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 430, 158, 31));

        jButton7.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/fotos/close.png"))); // NOI18N
        jButton7.setText("Ferme");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(876, 552, 130, -1));

        jButton9.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/fotos/award.png"))); // NOI18N
        jButton9.setText("Attestation ");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1034, 552, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Algerian", 1, 26)); // NOI18N
        jLabel11.setText("Gestion des stagiers");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 31, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/fotos/customer.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1350, 80));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/fotos/pexels-share-textures-11285435.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 60, -1, -1));

        setSize(new java.awt.Dimension(1234, 733));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void ecoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ecoleActionPerformed

    private void dureeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dureeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dureeActionPerformed

    private void prenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        table();
        actualiser();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
             if(cin.getText().equals("") || nom.getText().equals("") || prenom.getText().equals("") || email.getText().equals("") || ecole.getText().equals("") ||service.getSelectedItem().equals("") || duree.getText().equals("") || sexe.getSelectedItem().equals("") ){
            JOptionPane.showMessageDialog(this,"champ vide");
        }else{
            String[] colon=
              {"cin","nom","prenom","email","ecole","service","duree","sexe"};
            String[] inf={cin.getText(),nom.getText(),prenom.getText(),email.getText(),ecole.getText(),String.valueOf(service.getSelectedItem()),duree.getText(),String.valueOf(sexe.getSelectedItem())};
              System.out.println(db.Insertdata("stagier",colon,inf));
              JOptionPane.showMessageDialog(this,"le stagier est ajoute");
              table();
              actualiser();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void modeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeActionPerformed
        // TODO add your handling code here:
              if (cin.getText().equals("") || nom.getText().equals("") || prenom.getText().equals("") || email.getText().equals("") || ecole.getText().equals("") || service.getSelectedItem().equals("") || duree.getText().equals("") || sexe.getSelectedItem().equals("") ) {
 JOptionPane.showMessageDialog(this, "Remplir tous les champs");
 } else {
String[] colon = {"cin","nom","prenom","email","ecole","service","duree","sexe"};
 String[] inf = {cin.getText(), nom.getText(), prenom.getText(), email.getText(),ecole.getText(), String.valueOf(service.getSelectedItem ()), duree.getText(), String.valueOf(sexe.getSelectedItem ())};
String idm = String.valueOf(Table1.getValueAt(Table1.getSelectedRow(), 0));
db.Updatedata(" stagier ",colon,inf, "cin='" + idm + "'");
System.out.println(db.Updatedata(" stagier ",colon,inf, " cin= '" + idm + "'"));
 JOptionPane.showMessageDialog(this, "le stagier est modifié");
table();
actualiser();         
        }
        
    }//GEN-LAST:event_modeActionPerformed

    private void Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table1MouseClicked
        // TODO add your handling code here:
        mode.setVisible(true);
        supp.setVisible(true);
        
        cin.setText(String.valueOf(Table1.getValueAt(Table1.getSelectedRow(),0)));
        nom.setText(String.valueOf(Table1.getValueAt(Table1.getSelectedRow(),1)));
        prenom.setText(String.valueOf(Table1.getValueAt(Table1.getSelectedRow(),2)));
        email.setText(String.valueOf(Table1.getValueAt(Table1.getSelectedRow(),3)));
        ecole.setText(String.valueOf(Table1.getValueAt(Table1.getSelectedRow(),4)));
        service.setSelectedItem(String.valueOf(Table1.getValueAt(Table1.getSelectedRow(),5)));
       // System.out.println(String.valueOf(Table1.getValueAt(Table1.getSelectedRow(),6)));
        duree.setText(String.valueOf(Table1.getValueAt(Table1.getSelectedRow(),6)));
         sexe.setSelectedItem(String.valueOf(Table1.getValueAt(Table1.getSelectedRow(),7)));
        
         
    }//GEN-LAST:event_Table1MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        att m=new att();
        m.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       Index m=new Index();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void suppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppActionPerformed
        // TODO add your handling code here:
                      if (cin.getText().equals("") || nom.getText().equals("") || prenom.getText().equals("") || email.getText().equals("") || ecole.getText().equals("") || service.getSelectedItem().equals("") || duree.getText().equals("") || sexe.getSelectedItem().equals("") ) {
 JOptionPane.showMessageDialog(this, "Remplir tous les champs");
 } else {
          String ids=String.valueOf(Table1.getValueAt(Table1.getSelectedRow(),0));
        if(JOptionPane.showConfirmDialog(this,"etes-vous sur de vouloir supprimer","attention!",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
           System.out.println(db.DeleteData(" stagier "," cin = '"+ids+"'"));
        }else{return;}
        
        table();
        actualiser();
              }
    }//GEN-LAST:event_suppActionPerformed

    private void serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serviceActionPerformed

    private void colonrechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colonrechActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colonrechActionPerformed

    private void colonrechMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colonrechMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_colonrechMouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked

    }//GEN-LAST:event_jButton9MouseClicked

    private void nomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomKeyTyped
        // TODO add your handling code here:
              char car = evt.getKeyChar();
        if ((car<'a'||car>'z')&& (car<'A'||car>'Z') && (car!=(char)KeyEvent.VK_BACK_SPACE) && (car!=(char)KeyEvent.VK_SPACE)){
            evt.consume();
//            JOptionPane.showMessageDialog(null,"seul le texte est autorisé","valider le texte",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_nomKeyTyped

    private void prenomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prenomKeyTyped
        // TODO add your handling code here:
              char car = evt.getKeyChar();
        if ((car<'a'||car>'z')&& (car<'A'||car>'Z') && (car!=(char)KeyEvent.VK_BACK_SPACE) && (car!=(char)KeyEvent.VK_SPACE)){
            evt.consume();
//            JOptionPane.showMessageDialog(null,"seul le texte est autorisé","valider le texte",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_prenomKeyTyped

     public boolean adil(String email){
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^[\\w\\-\\_\\+]+(\\.[\\w\\-\\_]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$");
        mat = pat.matcher(email);
        if(mat.find()){
            return true;
        }else{
            return false;
        }
    }
    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        // TODO add your handling code here:
               if(adil(email.getText())){
                
        }else{
                JOptionPane.showMessageDialog(null,"e-mail incorrect","valider le email",JOptionPane.INFORMATION_MESSAGE);
//            email.requestFocus();
        }
    }//GEN-LAST:event_emailFocusLost

    private void ecoleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ecoleKeyTyped
        // TODO add your handling code here:
               char car = evt.getKeyChar();
        if ((car<'a'||car>'z')&& (car<'A'||car>'Z') && (car!=(char)KeyEvent.VK_BACK_SPACE) && (car!=(char)KeyEvent.VK_SPACE)){
            evt.consume();
//            JOptionPane.showMessageDialog(null,"seul le texte est autorisé","valider le texte",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_ecoleKeyTyped

    private void cinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cinKeyTyped
        // TODO add your handling code here:
                 char car = evt.getKeyChar();
        if ((car<'a'||car>'z')&& (car<'A'||car>'Z') && (car!=(char)KeyEvent.VK_BACK_SPACE) && (car!=(char)KeyEvent.VK_SPACE)){
           
               
        if((car<'0' || car >'9') && cin.getText().contains("") &&(car!=(char)KeyEvent.VK_BACK_SPACE)){
        evt.consume();
        
    }else if((car<'0' || car >'9') &&(car!='.') 
            &&(car!=(char)KeyEvent.VK_BACK_SPACE)){
        evt.consume();
    }
        }
    }//GEN-LAST:event_cinKeyTyped

    private void jButton1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1KeyTyped

    private void jButton1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1FocusLost

    private void colonrechKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_colonrechKeyReleased
        // TODO add your handling code here:

         
         if(ci.getSelectedItem().equals("cin")) {
                rs = db.SelectALL("stagier", "cin LIKE '%" + colonrech.getText() + "%' ");
                Table1.setModel(new datatable(rs){});
            }
          if(ci.getSelectedItem().equals("nom")) {
                rs = db.SelectALL("stagier", "nom LIKE '%" + colonrech.getText() + "%' ");
                Table1.setModel(new datatable(rs){});
            }
           if(ci.getSelectedItem().equals("prenom")) {
                rs = db.SelectALL("stagier", "prenom LIKE '%" + colonrech.getText() + "%' ");
                Table1.setModel(new datatable(rs){});
            }
            if(ci.getSelectedItem().equals("email")) {
                rs = db.SelectALL("stagier", "email LIKE '%" + colonrech.getText() + "%' ");
                Table1.setModel(new datatable(rs){});
            }
             if(ci.getSelectedItem().equals("ecole")) {
                rs = db.SelectALL("stagier", "ecole LIKE '%" + colonrech.getText() + "%' ");
                Table1.setModel(new datatable(rs){});
            }
              if(ci.getSelectedItem().equals("service")) {
                rs = db.SelectALL("stagier", "service LIKE '%" + colonrech.getText() + "%' ");
                Table1.setModel(new datatable(rs){});
            }
               if(ci.getSelectedItem().equals("duree")) {
                rs = db.SelectALL("stagier", "duree LIKE '%" + colonrech.getText() + "%' ");
                Table1.setModel(new datatable(rs){});
            }
                if(ci.getSelectedItem().equals("sexe")) {
                rs = db.SelectALL("stagier", "sexe LIKE '%" + colonrech.getText() + "%' ");
                Table1.setModel(new datatable(rs){});
            }
    }//GEN-LAST:event_colonrechKeyReleased

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

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
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new app().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JComboBox<String> ci;
    private javax.swing.JTextField cin;
    private javax.swing.JTextField colonrech;
    private javax.swing.JTextField duree;
    private javax.swing.JTextField ecole;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mode;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField prenom;
    private javax.swing.JComboBox service;
    private javax.swing.JComboBox sexe;
    private javax.swing.JButton supp;
    // End of variables declaration//GEN-END:variables
 private void SetIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("team.png")));
    }
}
