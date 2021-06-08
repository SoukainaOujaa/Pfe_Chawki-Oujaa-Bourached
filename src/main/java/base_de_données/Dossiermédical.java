package base_de_données;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import Application.BDD;
import Application.Parameter;
import Application.ResultSetTableModel;
import com.toedter.calendar.JDateChooser;
import java.awt.Image;
import java.sql.Date;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author Soukaina
 */
public class Dossiermédical extends javax.swing.JFrame {
    
    ResultSet rs ;
    BDD db;
    byte[] image;
    String imagepath="";
    ImageIcon myimage;
    
    public Dossiermédical() {
        db = new BDD(new Parameter().HOST_DB, new Parameter().USERNAME_DB,new Parameter()
             .PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);    
        initComponents();
        table();
    }
     public void table() {
        String a[] = {"num_d", "nom", "prenom", "date","description","traitement", "image","image1","image2",
        "image3","image4","image5"};
        rs = db.querySelect(a, "dossier");
        table_dossier.setModel(new ResultSetTableModel(rs));
    }
     void actualiser() {
      Calendar c = Calendar.getInstance();
      java.util.Date date = c.getTime();
        txt_nomd.setText("");
        txt_prenomd.setText("");
        txt_dated.setDate(date);
        txt_description.setText("");
        txt_traitement.setText("");
        Jimage.setText("");
        Jimage1.setText("");
        Jimage2.setText("");
        Jimage3.setText("");
        Jimage4.setText("");
        Jimage5.setText("");

     }
     
     public ImageIcon seticon ( String m, byte[] image){
     
         if(m!=null){
         myimage = new ImageIcon(m);
         }
         else{
         myimage = new ImageIcon(image);
         }
         Image img1= myimage.getImage();
         Image img2= img1.getScaledInstance(Jimage.getWidth(),Jimage.getHeight(), Image.SCALE_SMOOTH);
         ImageIcon i=new ImageIcon(img2);
         return i;
     }
     
 
 public ImageIcon seticon1 ( String m, byte[] image){
     
         if(m!=null){
         myimage = new ImageIcon(m);
         }
         else{
         myimage = new ImageIcon(image);
         }
         Image img1= myimage.getImage();
         Image img2= img1.getScaledInstance(Jimage1.getWidth(),Jimage1.getHeight(), Image.SCALE_SMOOTH);
         ImageIcon i=new ImageIcon(img2);
         return i;
     }
 public ImageIcon seticon2 ( String m, byte[] image){
     
         if(m!=null){
         myimage = new ImageIcon(m);
         }
         else{
         myimage = new ImageIcon(image);
         }
         Image img1= myimage.getImage();
         Image img2= img1.getScaledInstance(Jimage2.getWidth(),Jimage2.getHeight(), Image.SCALE_SMOOTH);
         ImageIcon i=new ImageIcon(img2);
         return i;
     }
 public ImageIcon seticon3 ( String m, byte[] image){
     
         if(m!=null){
         myimage = new ImageIcon(m);
         }
         else{
         myimage = new ImageIcon(image);
         }
         Image img1= myimage.getImage();
         Image img2= img1.getScaledInstance(Jimage3.getWidth(),Jimage3.getHeight(), Image.SCALE_SMOOTH);
         ImageIcon i=new ImageIcon(img2);
         return i;
     }
 public ImageIcon seticon4 ( String m, byte[] image){
     
         if(m!=null){
         myimage = new ImageIcon(m);
         }
         else{
         myimage = new ImageIcon(image);
         }
         Image img1= myimage.getImage();
         Image img2= img1.getScaledInstance(Jimage4.getWidth(),Jimage4.getHeight(), Image.SCALE_SMOOTH);
         ImageIcon i=new ImageIcon(img2);
         return i;
     }
 public ImageIcon seticon5 ( String m, byte[] image){
     
         if(m!=null){
         myimage = new ImageIcon(m);
         }
         else{
         myimage = new ImageIcon(image);
         }
         Image img1= myimage.getImage();
         Image img2= img1.getScaledInstance(Jimage5.getWidth(),Jimage5.getHeight(), Image.SCALE_SMOOTH);
         ImageIcon i=new ImageIcon(img2);
         return i;
     }
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_traitement = new javax.swing.JTextField();
        txt_description = new javax.swing.JTextField();
        txt_dated = new com.toedter.calendar.JDateChooser();
        txt_nomd = new javax.swing.JTextField();
        txt_rech3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txt_prenomd = new javax.swing.JTextField();
        com_rech3 = new javax.swing.JComboBox<>();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_dossier = new javax.swing.JTable();
        Jimage = new javax.swing.JLabel();
        Jimage4 = new javax.swing.JLabel();
        Jimage5 = new javax.swing.JLabel();
        Jimage3 = new javax.swing.JLabel();
        Jimage2 = new javax.swing.JLabel();
        Jimage1 = new javax.swing.JLabel();
        T = new javax.swing.JTextField();
        J = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        T1 = new javax.swing.JTextField();
        J1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        T2 = new javax.swing.JTextField();
        J2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        T3 = new javax.swing.JTextField();
        J3 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        T4 = new javax.swing.JTextField();
        J4 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        T5 = new javax.swing.JTextField();
        J5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(2000, 1000));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(142, 198, 212));
        jLabel1.setText("Dossier médical :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(590, 10, 177, 28);

        jLabel2.setText("Traitement :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 360, 90, 30);

        jLabel3.setText("Recherche par catégorie :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(890, 240, 130, 20);

        jLabel4.setText("Prénom :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(240, 220, 60, 14);

        jLabel6.setText("Description :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 290, 80, 14);
        getContentPane().add(txt_traitement);
        txt_traitement.setBounds(100, 340, 690, 80);
        getContentPane().add(txt_description);
        txt_description.setBounds(100, 250, 690, 80);
        getContentPane().add(txt_dated);
        txt_dated.setBounds(590, 210, 200, 30);
        getContentPane().add(txt_nomd);
        txt_nomd.setBounds(100, 210, 130, 30);
        getContentPane().add(txt_rech3);
        txt_rech3.setBounds(910, 260, 110, 30);

        jLabel11.setText("Évolution :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 440, 70, 14);

        jLabel7.setText("Image après :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1140, 420, 100, 14);

        jLabel8.setText("Image avant :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(120, 420, 100, 14);

        jLabel9.setText("Image après :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(320, 420, 100, 14);

        jLabel12.setText("Image après :");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(930, 420, 100, 14);

        jLabel14.setText("Image après :");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(550, 420, 100, 14);

        jLabel15.setText("Image après :");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(730, 420, 100, 14);

        jButton2.setText("Charger");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(110, 560, 100, 23);

        jButton3.setText("Charger");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(300, 560, 100, 23);

        jButton4.setText("Actualiser");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(1140, 300, 100, 30);

        jButton5.setText("Charger");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(710, 560, 100, 23);

        jButton6.setText("Charger");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(1130, 560, 100, 23);

        jButton7.setText("Charger");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(910, 560, 100, 23);

        jLabel16.setText("Nom :");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(60, 220, 50, 14);
        getContentPane().add(txt_prenomd);
        txt_prenomd.setBounds(290, 210, 140, 30);

        com_rech3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "num_d", "nom", "prenom", "date", " " }));
        getContentPane().add(com_rech3);
        com_rech3.setBounds(1020, 240, 120, 20);

        jButton9.setText("Charger");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(530, 560, 100, 23);

        jButton10.setText("Rechercher");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(1020, 260, 100, 30);

        jButton11.setText("Ajouter");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(810, 300, 100, 30);

        jLabel17.setText("Date de création du dossier:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(440, 220, 160, 14);

        jButton12.setText("Modifier");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(920, 300, 100, 30);

        jButton13.setText("Supprimer");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(1030, 300, 100, 30);

        table_dossier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "num_d", "nom", "prenom", "date", "description", "traitement", "image", "image1", "image2", "image3", "image4", "image5"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_dossier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_dossierMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_dossier);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(190, 40, 890, 160);
        getContentPane().add(Jimage);
        Jimage.setBounds(90, 440, 140, 120);
        getContentPane().add(Jimage4);
        Jimage4.setBounds(890, 440, 160, 120);
        getContentPane().add(Jimage5);
        Jimage5.setBounds(1110, 440, 140, 110);
        getContentPane().add(Jimage3);
        Jimage3.setBounds(690, 440, 150, 120);
        getContentPane().add(Jimage2);
        Jimage2.setBounds(510, 440, 140, 120);
        getContentPane().add(Jimage1);
        Jimage1.setBounds(280, 440, 140, 120);

        T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TActionPerformed(evt);
            }
        });
        getContentPane().add(T);
        T.setBounds(70, 590, 160, 30);
        getContentPane().add(J);
        J.setBounds(70, 630, 160, 20);

        jLabel10.setText("Nom:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(240, 630, 30, 14);

        jLabel13.setText("Nom:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(40, 630, 30, 14);

        jLabel18.setText("Nom:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(40, 630, 30, 14);

        T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T1ActionPerformed(evt);
            }
        });
        getContentPane().add(T1);
        T1.setBounds(270, 590, 170, 30);
        getContentPane().add(J1);
        J1.setBounds(270, 630, 170, 20);

        jLabel19.setText("Nom:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(460, 630, 30, 14);

        T2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T2ActionPerformed(evt);
            }
        });
        getContentPane().add(T2);
        T2.setBounds(490, 590, 170, 30);
        getContentPane().add(J2);
        J2.setBounds(490, 630, 170, 20);

        jLabel21.setText("Nom:");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(670, 630, 30, 14);

        T3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T3ActionPerformed(evt);
            }
        });
        getContentPane().add(T3);
        T3.setBounds(700, 590, 160, 30);
        getContentPane().add(J3);
        J3.setBounds(700, 630, 160, 20);

        jLabel23.setText("Nom:");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(870, 630, 30, 14);

        T4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T4ActionPerformed(evt);
            }
        });
        getContentPane().add(T4);
        T4.setBounds(900, 590, 170, 30);
        getContentPane().add(J4);
        J4.setBounds(900, 630, 170, 20);

        jLabel25.setText("Nom:");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(1080, 630, 30, 14);

        T5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T5ActionPerformed(evt);
            }
        });
        getContentPane().add(T5);
        T5.setBounds(1110, 590, 170, 30);
        getContentPane().add(J5);
        J5.setBounds(1110, 630, 170, 20);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton1.setText("Retour");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1028, 362, 73, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-20, -20, 1440, 820);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File("user.dir"));
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("All pic","png","jpg","gif");
        file.addChoosableFileFilter(filter);
        
        int a=file.showSaveDialog(null);
        if(a==JFileChooser.APPROVE_OPTION){
            File f = file.getSelectedFile();
            String p = file.getSelectedFile().getAbsolutePath();
            T.setText(f.getName());
            J.setText(file.getSelectedFile().getAbsolutePath());
            Jimage.setIcon(seticon(p,null));
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File("user.dir"));
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("All pic","png","jpg","gif");
        file.addChoosableFileFilter(filter);
        
        int a=file.showSaveDialog(null);
        if(a==JFileChooser.APPROVE_OPTION){
            File f = file.getSelectedFile();
            String p = file.getSelectedFile().getAbsolutePath();
            T1.setText(f.getName());
            J1.setText(file.getSelectedFile().getAbsolutePath());
            Jimage1.setIcon(seticon(p,null));
            
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        actualiser();
        table();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File("user.dir"));
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("All pic","png","jpg","gif");
        file.addChoosableFileFilter(filter);
        
        int a=file.showSaveDialog(null);
        if(a==JFileChooser.APPROVE_OPTION){
            File f = file.getSelectedFile();
            String p = file.getSelectedFile().getAbsolutePath();
            T3.setText(f.getName());
            J3.setText(file.getSelectedFile().getAbsolutePath());
            Jimage3.setIcon(seticon(p,null));
            
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File("user.dir"));
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("All pic","png","jpg","gif");
        file.addChoosableFileFilter(filter);
        
        int a=file.showSaveDialog(null);
        if(a==JFileChooser.APPROVE_OPTION){
            File f = file.getSelectedFile();
            String p = file.getSelectedFile().getAbsolutePath();
            T5.setText(f.getName());
            J5.setText(file.getSelectedFile().getAbsolutePath());
            Jimage5.setIcon(seticon(p,null));
            
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File("user.dir"));
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("All pic","png","jpg","gif");
        file.addChoosableFileFilter(filter);
        
        int a=file.showSaveDialog(null);
        if(a==JFileChooser.APPROVE_OPTION){
            File f = file.getSelectedFile();
            String p = file.getSelectedFile().getAbsolutePath();
            T4.setText(f.getName());
            J4.setText(file.getSelectedFile().getAbsolutePath());
            Jimage4.setIcon(seticon(p,null));
            
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File("user.dir"));
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("All pic","png","jpg","gif");
        file.addChoosableFileFilter(filter);
        
        int a=file.showSaveDialog(null);
        if(a==JFileChooser.APPROVE_OPTION){
            File f = file.getSelectedFile();
            String p = file.getSelectedFile().getAbsolutePath();
            T2.setText(f.getName());
            J2.setText(file.getSelectedFile().getAbsolutePath());
            Jimage2.setIcon(seticon(p,null));
            
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if (txt_rech3.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Remplissez le champ de recherche");
        } else {
            if (com_rech3.getSelectedItem().equals("num_d")) {
                rs = db.querySelectAll("dossier", "num_d LIKE '%" + txt_rech3.getText() + "%' ");
                table_dossier.setModel(new ResultSetTableModel(rs));
            } else if (com_rech3.getSelectedItem().equals("nom")) {
                rs = db.querySelectAll("dossier", "nom LIKE '%" + txt_rech3.getText() + "%' ");
                table_dossier.setModel(new ResultSetTableModel(rs));
            } else if (com_rech3.getSelectedItem().equals("prenom")) {
                rs = db.querySelectAll("dossier", "prenom LIKE '%" + txt_rech3.getText() + "%' ");
                table_dossier.setModel(new ResultSetTableModel(rs));
            } else if (com_rech3.getSelectedItem().equals("date")) {
                rs = db.querySelectAll("dossier", "date LIKE '%" + txt_rech3.getText() + "%' ");
                table_dossier.setModel(new ResultSetTableModel(rs));
            }else if (com_rech3.getSelectedItem().equals("description")) {
                rs = db.querySelectAll("dossier", "description LIKE '%" + txt_rech3.getText() + "%' ");
                table_dossier.setModel(new ResultSetTableModel(rs));
            }else if (com_rech3.getSelectedItem().equals("traitement")) {
                rs = db.querySelectAll("dossier", "traitement LIKE '%" + txt_rech3.getText() + "%' ");
                table_dossier.setModel(new ResultSetTableModel(rs));
            }
        } 
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String theDate = dateFormat.format(txt_dated.getDate());
        if(  txt_nomd.getText().equals("")|| txt_prenomd.getText().equals("")|| theDate.equals("")
                ){
        JOptionPane.showMessageDialog(this, "Veuillez remplir les champs importants");
        }
        else{
        String[] colon = { "nom", "prenom", "date", "description","traitement","image","image1","image2",
        "image3","image4","image5"};
        String[] inf = {txt_nomd.getText(), txt_prenomd.getText(),
                theDate.toString(),txt_description.getText(),
                txt_traitement.getText(),J.getText(),
                J1.getText(),J2.getText(),J3.getText(),J4.getText(),J5.getText()};
                System.out.println(db.queryInsert("dossier", colon, inf));
                table();
                actualiser();
        }  
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
         SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String theDate = dateFormat.format(txt_dated.getDate());
        if(  txt_nomd.getText().equals("")|| txt_prenomd.getText().equals("")|| theDate.equals("")){
        JOptionPane.showMessageDialog(this, "Veuillez remplir les champs importants");
        }
        else{
        String[] colon = { "nom", "prenom", "date", "description","traitement","image","image1","image2",
        "image3","image4","image5"};
        String[] inf = {txt_nomd.getText(), txt_prenomd.getText(),
                theDate.toString(),txt_description.getText(),
                txt_traitement.getText(),J.getText(),
                J1.getText(),J2.getText(),J3.getText(),J4.getText(),J5.getText()};
        String num_d = String.valueOf(table_dossier.getValueAt(table_dossier.getSelectedRow(), 0));
                System.out.println(db.queryUpdate("dossier", colon, inf, "num_d='" + num_d +"'"));
                table();
                actualiser();
        
    } 
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:String id = String.valueOf(table_patient.getValueAt(table_patient.getSelectedRow(), 0));
        String num_d = String.valueOf(table_dossier.getValueAt(table_dossier.getSelectedRow(), 0));
        if (JOptionPane.showConfirmDialog(this, "Êtes-vous sûr de vouloir supprimer ?","Faites attention !", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("dossier", "num_d=" + num_d);
        } else {
            return;
        }
        table();

    }//GEN-LAST:event_jButton13ActionPerformed

    private void TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TActionPerformed

    private void T1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T1ActionPerformed

    private void T2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T2ActionPerformed

    private void T3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T3ActionPerformed

    private void T4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T4ActionPerformed

    private void T5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T5ActionPerformed

    private void table_dossierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_dossierMouseClicked
        // TODO add your handling code here:
         txt_nomd.setText(String.valueOf(table_dossier.getValueAt(table_dossier.getSelectedRow(), 1)));
        txt_prenomd.setText(String.valueOf(table_dossier.getValueAt(table_dossier.getSelectedRow(), 2)));
        txt_dated.setDate(Date.valueOf(table_dossier.getValueAt(table_dossier.getSelectedRow(), 3).toString()));
        txt_description.setText(String.valueOf(table_dossier.getValueAt(table_dossier.getSelectedRow(), 4)));
        txt_traitement.setText(String.valueOf(table_dossier.getValueAt(table_dossier.getSelectedRow(), 5)));
        Jimage.setIcon(seticon((String.valueOf(table_dossier.getValueAt(table_dossier.getSelectedRow(), 6))),null));
        Jimage1.setIcon(seticon((String.valueOf(table_dossier.getValueAt(table_dossier.getSelectedRow(), 7))),null));
        Jimage2.setIcon(seticon((String.valueOf(table_dossier.getValueAt(table_dossier.getSelectedRow(), 8))),null));
        Jimage3.setIcon(seticon((String.valueOf(table_dossier.getValueAt(table_dossier.getSelectedRow(), 9))),null));
        Jimage4.setIcon(seticon((String.valueOf(table_dossier.getValueAt(table_dossier.getSelectedRow(), 10))),null));
        Jimage5.setIcon(seticon((String.valueOf(table_dossier.getValueAt(table_dossier.getSelectedRow(), 11))),null));

        //Jimage1.setText(String.valueOf(table_dossier.getValueAt(table_dossier.getSelectedRow(), 7)));
        //Jimage2.setText(String.valueOf(table_dossier.getValueAt(table_dossier.getSelectedRow(), 8)));
        //Jimage3.setText(String.valueOf(table_dossier.getValueAt(table_dossier.getSelectedRow(), 9)));
        //Jimage4.setText(String.valueOf(table_dossier.getValueAt(table_dossier.getSelectedRow(), 10)));
        //Jimage5.setText(String.valueOf(table_dossier.getValueAt(table_dossier.getSelectedRow(), 11)));

            //Jimage1.setIcon(seticon(p,null));
            //public ImageIcon seticon ( String m, byte[] image)

    }//GEN-LAST:event_table_dossierMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Patient a=new Patient();
         a.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Dossiermédical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dossiermédical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dossiermédical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dossiermédical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dossiermédical().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel J;
    private javax.swing.JLabel J1;
    private javax.swing.JLabel J2;
    private javax.swing.JLabel J3;
    private javax.swing.JLabel J4;
    private javax.swing.JLabel J5;
    private javax.swing.JLabel Jimage;
    private javax.swing.JLabel Jimage1;
    private javax.swing.JLabel Jimage2;
    private javax.swing.JLabel Jimage3;
    private javax.swing.JLabel Jimage4;
    private javax.swing.JLabel Jimage5;
    private javax.swing.JTextField T;
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JTextField T4;
    private javax.swing.JTextField T5;
    private javax.swing.JComboBox<String> com_rech3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_dossier;
    private com.toedter.calendar.JDateChooser txt_dated;
    private javax.swing.JTextField txt_description;
    private javax.swing.JTextField txt_nomd;
    private javax.swing.JTextField txt_prenomd;
    private javax.swing.JTextField txt_rech3;
    private javax.swing.JTextField txt_traitement;
    // End of variables declaration//GEN-END:variables
}
