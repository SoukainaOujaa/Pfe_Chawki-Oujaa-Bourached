package base_de_données;

import Application.BDD;
import Application.Parameter;
import Application.ResultSetTableModel;
import java.util.Date;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.lang.*;
import java.awt.Graphics;
import java.awt.Color;
import base_de_données.Paiement;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class Facture extends javax.swing.JFrame {

    ResultSet rs ;
    BDD db;
    
    
    public Facture() {
        db = new BDD(new Parameter().HOST_DB, new Parameter().USERNAME_DB,new Parameter().PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);
        initComponents();
        importer();
    }
    
    public void importer(){
    String colon[] = {"num_f","nom","prenom","date","montant","avance","reste"};
        rs = db.fcSelectCommand(colon, "facture", "num_f='" + txt_fac.getText() + "'");
        table_ff.setModel(new ResultSetTableModel(rs));
        
        //lbl_totalx.setText(String.valueOf(table_ff.getValueAt(table_ff.getSelectedRow(), 4)));
        //lbl_cashx.setText(String.valueOf(table_ff.getValueAt(table_ff.getSelectedRow(), 5)));
        //lbl_apax.setText(String.valueOf(table_ff.getValueAt(table_ff.getSelectedRow(), 6)));

        //lbl_totalx.setText(Paiement.lbltot2.getText());
        //lbl_cashx.setText(Paiement.txtcas.getText());
        //payapres();
    
    }
    public void payapres(){
        
        int a = Integer.parseInt(lbl_totalx.getText());
        int b = Integer.parseInt(walo.getText());
        int c = b - a;
        walo1.setText(Integer.toString(c));
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table_ff = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_fac = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lbl_ticket = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_datex = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_nomx = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_prenomx = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        lbl_totalx = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_cash = new javax.swing.JLabel();
        lbl_cashx = new javax.swing.JLabel();
        walo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_apa = new javax.swing.JLabel();
        lbl_apax = new javax.swing.JLabel();
        walo1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(142, 198, 212));
        jLabel1.setText("Facture");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 10, 160, 22);

        table_ff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "num_f", "nom", "prenom", "date", "montant", "avance", "reste"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_ff.setPreferredSize(new java.awt.Dimension(570, 15));
        table_ff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_ffMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_ff);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 110, 570, 50);

        jButton1.setText("Imprimer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(290, 510, 110, 23);

        jButton2.setText("Retour");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(290, 540, 110, 23);

        jLabel2.setText("         Numéro de la facture :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 50, 180, 20);
        getContentPane().add(txt_fac);
        txt_fac.setBounds(320, 50, 50, 30);

        jButton3.setText("Valider");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(430, 50, 73, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Ticket n° :");
        jPanel1.add(jLabel9);

        lbl_ticket.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_ticket.setText("XX");
        lbl_ticket.setPreferredSize(new java.awt.Dimension(350, 17));
        jPanel1.add(lbl_ticket);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Crée le : ");
        jLabel3.setPreferredSize(new java.awt.Dimension(75, 17));
        jPanel1.add(jLabel3);

        lbl_datex.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_datex.setText("XX");
        lbl_datex.setPreferredSize(new java.awt.Dimension(350, 17));
        jPanel1.add(lbl_datex);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Nom : ");
        jLabel5.setPreferredSize(new java.awt.Dimension(65, 17));
        jPanel1.add(jLabel5);

        lbl_nomx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_nomx.setText("XX");
        lbl_nomx.setPreferredSize(new java.awt.Dimension(360, 17));
        jPanel1.add(lbl_nomx);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Prénom :  ");
        jLabel7.setPreferredSize(new java.awt.Dimension(75, 17));
        jPanel1.add(jLabel7);

        lbl_prenomx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_prenomx.setText("XX                                            ");
        lbl_prenomx.setPreferredSize(new java.awt.Dimension(350, 17));
        jPanel1.add(lbl_prenomx);

        lbl_total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_total.setText("             Total :");
        jPanel1.add(lbl_total);

        lbl_totalx.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_totalx.setText("XX");
        jPanel1.add(lbl_totalx);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("DH");
        jLabel6.setPreferredSize(new java.awt.Dimension(300, 14));
        jPanel1.add(jLabel6);

        lbl_cash.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_cash.setText("                       Montant payé :");
        jPanel1.add(lbl_cash);

        lbl_cashx.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_cashx.setText("XX");
        jPanel1.add(lbl_cashx);

        walo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        walo.setText("DH");
        walo.setPreferredSize(new java.awt.Dimension(100, 17));
        jPanel1.add(walo);

        jLabel4.setPreferredSize(new java.awt.Dimension(200, 14));
        jPanel1.add(jLabel4);

        lbl_apa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_apa.setText("Montant restant :");
        jPanel1.add(lbl_apa);

        lbl_apax.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_apax.setText("XX");
        jPanel1.add(lbl_apax);

        walo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        walo1.setText("DH");
        jPanel1.add(walo1);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Email    :");
        jLabel8.setPreferredSize(new java.awt.Dimension(75, 75));
        jPanel1.add(jLabel8);

        jLabel10.setText("sebti.epithese@gmail.com ");
        jPanel1.add(jLabel10);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Téléphone    :");
        jPanel1.add(jLabel11);

        jLabel12.setText("06 63 45 93 22");
        jPanel1.add(jLabel12);

        jLabel13.setFont(new java.awt.Font("Palace Script MT", 0, 30)); // NOI18N
        jLabel13.setText("Laboratoire Sebti d’Appareillages Oculaires et Épithèses Faciales");
        jPanel1.add(jLabel13);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel14.setText("Borj AlYacout,bd Rahal El Meskini Imm. B 6ème étage, Appt 20 20000 Casablanca, Maroc ");
        jPanel1.add(jLabel14);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(120, 170, 460, 330);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(-10, -10, 720, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        importer();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void table_ffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_ffMouseClicked
        // TODO add your handling code here:
        //Calendar c = Calendar.getInstance();
        //java.util.Date date = c.getTime();
        Date s = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        

        lbl_ticket.setText(String.valueOf(table_ff.getValueAt(table_ff.getSelectedRow(), 0)));
        lbl_nomx.setText(String.valueOf(table_ff.getValueAt(table_ff.getSelectedRow(), 1)));
        lbl_prenomx.setText(String.valueOf(table_ff.getValueAt(table_ff.getSelectedRow(), 2)));
        lbl_datex.setText(dateFormat.format(s)); 
        lbl_totalx.setText(String.valueOf(table_ff.getValueAt(table_ff.getSelectedRow(), 4)));
        lbl_cashx.setText(String.valueOf(table_ff.getValueAt(table_ff.getSelectedRow(), 5)));
        lbl_apax.setText(String.valueOf(table_ff.getValueAt(table_ff.getSelectedRow(), 6)));
    }//GEN-LAST:event_table_ffMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //this.printComponents(null);
        PrinterJob job = PrinterJob.getPrinterJob();
            job.setJobName("Print Data");
            
            job.setPrintable(new Printable(){
            public int print(Graphics pg,PageFormat pf, int pageNum){
                    pf.setOrientation(PageFormat.LANDSCAPE);
                 if(pageNum>0){
                    return Printable.NO_SUCH_PAGE;
                }
                
                Graphics2D g2 = (Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.24,0.24);
                
                jPanel1.paint(g2);
//          
               
                return Printable.PAGE_EXISTS;
                         
                
            }
    });
         
        boolean ok = job.printDialog();
        if(ok){
        try{
            
        job.print();
        }
        catch (PrinterException ex){}
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Paiement a=new Paiement();
        a.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(Facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facture().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_apa;
    private javax.swing.JLabel lbl_apax;
    private javax.swing.JLabel lbl_cash;
    private javax.swing.JLabel lbl_cashx;
    private javax.swing.JLabel lbl_datex;
    private javax.swing.JLabel lbl_nomx;
    private javax.swing.JLabel lbl_prenomx;
    private javax.swing.JLabel lbl_ticket;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JLabel lbl_totalx;
    private javax.swing.JTable table_ff;
    private javax.swing.JTextField txt_fac;
    private javax.swing.JLabel walo;
    private javax.swing.JLabel walo1;
    // End of variables declaration//GEN-END:variables
}
