package base_de_données;

import Application.BDD;
import Application.Parameter;
import Application.ResultSetTableModel;
import java.sql.Date;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Consultation extends javax.swing.JFrame {

    ResultSet rs ;
    BDD db;
    
    public Consultation() {
        
        db = new BDD(new Parameter().HOST_DB, new Parameter().USERNAME_DB,new Parameter()
             .PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);    
        initComponents();
        table();
        
    }

     
     public void table() {
        String a[] = {"num_rc", "nomc", "prenomc", "datec","validé"};
        rs = db.querySelect(a, "consultation");
        table_consultation.setModel(new ResultSetTableModel(rs));
    }
     
     void actualiser() {
         
       Calendar c = Calendar.getInstance();
       java.util.Date date = c.getTime();
        txt_nomc.setText("");
        txt_prenomc.setText("");
        txt_datec.setText("");
        txt_heurec.setText("");
        txt_validé.setSelectedItem("");
        
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_consultation = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_datec = new javax.swing.JTextField();
        txt_numrc = new javax.swing.JTextField();
        txt_nomc = new javax.swing.JTextField();
        txt_prenomc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_rech4 = new javax.swing.JTextField();
        com_rech4 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_heurec = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txt_validé = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 700));
        getContentPane().setLayout(null);

        table_consultation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "num_rdv", "nom", "prenom", "date", "heure", "validé"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_consultation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_consultationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_consultation);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 120, 780, 260);

        jLabel1.setText("Rendez-vous validé :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(380, 490, 120, 14);

        jLabel2.setText("Numéro de rendez-vous :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 400, 140, 14);

        jLabel3.setText("Nom :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 440, 50, 14);

        jLabel4.setText("Prénom :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 480, 80, 14);

        jLabel5.setText("Date :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(380, 400, 60, 14);
        getContentPane().add(txt_datec);
        txt_datec.setBounds(530, 400, 120, 30);

        txt_numrc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numrcActionPerformed(evt);
            }
        });
        getContentPane().add(txt_numrc);
        txt_numrc.setBounds(220, 400, 120, 30);
        getContentPane().add(txt_nomc);
        txt_nomc.setBounds(220, 440, 120, 30);
        getContentPane().add(txt_prenomc);
        txt_prenomc.setBounds(220, 480, 120, 30);

        jLabel6.setText("choisir la catégorie de recherche :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 80, 190, 14);
        getContentPane().add(txt_rech4);
        txt_rech4.setBounds(430, 70, 130, 30);

        com_rech4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        com_rech4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "num_rdv", "nom", "prenom", "date ", "validé" }));
        getContentPane().add(com_rech4);
        com_rech4.setBounds(320, 70, 100, 30);

        jLabel7.setText("Rechercher le rendez-vous ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(130, 60, 150, 14);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Rechercher");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(560, 70, 130, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(142, 198, 212));
        jLabel8.setText("Consultation :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(380, 20, 150, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Valider");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(290, 530, 110, 25);

        jLabel9.setText("Heure :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(380, 450, 70, 14);
        getContentPane().add(txt_heurec);
        txt_heurec.setBounds(530, 440, 120, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Actualiser");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(520, 530, 120, 25);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Modifier");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(410, 530, 100, 25);

        txt_validé.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Oui", "Non", " " }));
        getContentPane().add(txt_validé);
        txt_validé.setBounds(530, 480, 120, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(-30, -20, 980, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_numrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numrcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numrcActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         if (txt_rech4.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Remplissez le champ de recherche");
        } else {
            if (com_rech4.getSelectedItem().equals("num_rdv")) {
                rs = db.querySelectAll("rdv", "num_rdv LIKE '%" + txt_rech4.getText() + "%' ");
                table_consultation.setModel(new ResultSetTableModel(rs));
            } else if (com_rech4.getSelectedItem().equals("nom")) {
                rs = db.querySelectAll("rdv", "nom LIKE '%" + txt_rech4.getText() + "%' ");
                table_consultation.setModel(new ResultSetTableModel(rs));
            } else if (com_rech4.getSelectedItem().equals("prenom")) {
                rs = db.querySelectAll("rdv", "prenom LIKE '%" + txt_rech4.getText() + "%' ");
                table_consultation.setModel(new ResultSetTableModel(rs));
            } 
            else if (com_rech4.getSelectedItem().equals("date")) {
                rs = db.querySelectAll("rdv", "date LIKE '%" + txt_rech4.getText() + "%' ");
                table_consultation.setModel(new ResultSetTableModel(rs));
            } 
            else if (com_rech4.getSelectedItem().equals("heure")) {
                rs = db.querySelectAll("rdv", "heure LIKE '%" + txt_rech4.getText() + "%' ");
                table_consultation.setModel(new ResultSetTableModel(rs));
            } 
            
        } 
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void table_consultationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_consultationMouseClicked
        // TODO add your handling code here:
        
        txt_nomc.setText(String.valueOf(table_consultation.getValueAt(table_consultation.getSelectedRow(), 1)));
        txt_prenomc.setText(String.valueOf(table_consultation.getValueAt(table_consultation.getSelectedRow(), 2)));
        txt_datec.setText(String.valueOf(table_consultation.getValueAt(table_consultation.getSelectedRow(), 2)));
        txt_heurec.setText(String.valueOf(table_consultation.getValueAt(table_consultation.getSelectedRow(), 4)));
 
        
    }//GEN-LAST:event_table_consultationMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        if( txt_nomc.getText().equals("")|| txt_prenomc.getText().equals("")
                || txt_datec.getText().equals("") || txt_heurec.getText().equals("")|| txt_validé.getSelectedItem().toString().equals("")){
        JOptionPane.showMessageDialog(this, "Veuillez remplir les champs importants");
        }
        else{
        String[] colon = {"nom", "prenom", "date", "heure","validé"};
        String[] inf = {txt_nomc.getText(), txt_prenomc.getText(),
                txt_datec.getText(),txt_heurec.getText(),txt_validé.getSelectedItem().toString()};
        String num_rdv = String.valueOf(table_consultation.getValueAt(table_consultation.getSelectedRow(), 0));
                System.out.println(db.queryInsert("consultation", colon, inf));
                table();
                actualiser();
        
    }      
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        if( txt_nomc.getText().equals("")|| txt_prenomc.getText().equals("")
                || txt_datec.getText().equals("") || txt_heurec.getText().equals("")|| txt_validé.getSelectedItem().toString().equals("")){
        JOptionPane.showMessageDialog(this, "Veuillez remplir les champs importants");
        }
        else{
        String[] colon = {"nom", "prenom", "date", "heure","validé"};
        String[] inf = {txt_nomc.getText(), txt_prenomc.getText(),
                txt_datec.getText(),txt_heurec.getText(),txt_validé.getSelectedItem().toString()};
        String num_rdv = String.valueOf(table_consultation.getValueAt(table_consultation.getSelectedRow(), 0));
                System.out.println(db.queryUpdate("consultation", colon, inf, "num_rdv='" + num_rdv +"'"));
                table();
                actualiser();
        
    }                                  
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        actualiser();
        table();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Consultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> com_rech4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_consultation;
    private javax.swing.JTextField txt_datec;
    private javax.swing.JTextField txt_heurec;
    private javax.swing.JTextField txt_nomc;
    private javax.swing.JTextField txt_numrc;
    private javax.swing.JTextField txt_prenomc;
    private javax.swing.JTextField txt_rech4;
    private javax.swing.JComboBox<String> txt_validé;
    // End of variables declaration//GEN-END:variables
}
