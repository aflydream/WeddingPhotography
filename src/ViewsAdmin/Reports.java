/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewsAdmin;
import javax.swing.JFrame;

/**
 *
 * @author LopezLaps
 */
public class Reports extends javax.swing.JFrame {

    /**
     * Creates new form Reports
     */
    public Reports() {
        initComponents();
        Themes.Theme.setIcon(this);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        btn_go = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_rwdbookername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_rwddateofwedding = new javax.swing.JTextField();
        txt_rwdfullnameofbride = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_rwdfullnameofgroom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_rwdaddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_rwdcity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_rwdcontactnumber = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_rpclocationgettingready = new javax.swing.JTextField();
        txt_rpclocationceremony = new javax.swing.JTextField();
        txt_rpclocationphotoshoot = new javax.swing.JTextField();
        txt_rpclocationreception = new javax.swing.JTextField();
        txt_rpctimegettingready = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_rpctimeceremony = new javax.swing.JTextField();
        txt_rpctimephotoshoot = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txt_rpctimereception = new javax.swing.JTextField();
        chck_rpcgettingready = new javax.swing.JCheckBox();
        chck_rpcceremony = new javax.swing.JCheckBox();
        chck_rpcphotoshoot = new javax.swing.JCheckBox();
        chck_rpcreception = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txt_roinumberofguest = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_roispecialrequestnotes = new javax.swing.JTextArea();
        btn_rpayment = new javax.swing.JButton();
        btn_rupdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(840, 520));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 1310, 120));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Search");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 20));
        getContentPane().add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 210, 30));

        btn_go.setBackground(new java.awt.Color(255, 0, 153));
        btn_go.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_go.setForeground(new java.awt.Color(255, 255, 255));
        btn_go.setText("GO");
        getContentPane().add(btn_go, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 50, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 153));
        jLabel2.setText("                    WEDDING DETAILS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 340, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 153));
        jLabel3.setText("BOOKER NAME:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 90, -1));
        jPanel1.add(txt_rwdbookername, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 130, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 153));
        jLabel4.setText("DATE OF WEDDING:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 150, -1));
        jPanel1.add(txt_rwddateofwedding, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 130, 30));
        jPanel1.add(txt_rwdfullnameofbride, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 130, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 153));
        jLabel5.setText("FULL NAME OF THE BRIDE:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 144, 170, 20));
        jPanel1.add(txt_rwdfullnameofgroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 130, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 153));
        jLabel6.setText("FULL NAME OF THE GROOM:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 190, 170, -1));
        jPanel1.add(txt_rwdaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 130, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 153));
        jLabel7.setText("ADDRESS:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 70, -1));
        jPanel1.add(txt_rwdcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 130, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 153));
        jLabel8.setText("CITY:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 50, -1));
        jPanel1.add(txt_rwdcontactnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 130, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 153));
        jLabel9.setText("CONTACT #:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 360, 360));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 153));
        jLabel10.setText("                       Photography Coverage");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 430, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 153));
        jLabel11.setText("Location:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));
        jPanel2.add(txt_rpclocationgettingready, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 130, 30));
        jPanel2.add(txt_rpclocationceremony, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 130, 30));
        jPanel2.add(txt_rpclocationphotoshoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 130, 30));
        jPanel2.add(txt_rpclocationreception, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 130, 30));

        txt_rpctimegettingready.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rpctimegettingreadyActionPerformed(evt);
            }
        });
        jPanel2.add(txt_rpctimegettingready, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 50, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 153));
        jLabel15.setText("Time:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));
        jPanel2.add(txt_rpctimeceremony, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 50, 30));
        jPanel2.add(txt_rpctimephotoshoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 50, 30));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 0, 153));
        jLabel34.setText("Location:");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 0, 153));
        jLabel35.setText("Location:");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 0, 153));
        jLabel36.setText("Location:");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));
        jPanel2.add(txt_rpctimereception, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 50, 30));

        chck_rpcgettingready.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chck_rpcgettingready.setForeground(new java.awt.Color(255, 0, 153));
        chck_rpcgettingready.setText("Getting Ready");
        jPanel2.add(chck_rpcgettingready, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 63, -1, 30));

        chck_rpcceremony.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chck_rpcceremony.setForeground(new java.awt.Color(255, 0, 153));
        chck_rpcceremony.setText("Ceremony");
        jPanel2.add(chck_rpcceremony, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 40));

        chck_rpcphotoshoot.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chck_rpcphotoshoot.setForeground(new java.awt.Color(255, 0, 153));
        chck_rpcphotoshoot.setText("Photoshoot");
        jPanel2.add(chck_rpcphotoshoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 40));

        chck_rpcreception.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chck_rpcreception.setForeground(new java.awt.Color(255, 0, 153));
        chck_rpcreception.setText("Reception");
        jPanel2.add(chck_rpcreception, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 153));
        jLabel18.setText("Time:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 153));
        jLabel19.setText("Time:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 153));
        jLabel20.setText("Time:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 470, 360));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 0, 153));
        jLabel26.setText("                           Other Information");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 400, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 0, 153));
        jLabel27.setText("Number of Guest:");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 100, -1));
        jPanel4.add(txt_roinumberofguest, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 130, 30));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 0, 153));
        jLabel28.setText("Special/Request/Notes:");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 150, -1));

        ta_roispecialrequestnotes.setColumns(20);
        ta_roispecialrequestnotes.setRows(5);
        jScrollPane2.setViewportView(ta_roispecialrequestnotes);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 320, 180));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 330, 440, 360));

        btn_rpayment.setBackground(new java.awt.Color(255, 0, 153));
        btn_rpayment.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_rpayment.setForeground(new java.awt.Color(255, 255, 255));
        btn_rpayment.setText("GO TO PAYMENT");
        btn_rpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rpaymentActionPerformed(evt);
            }
        });
        getContentPane().add(btn_rpayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, 280, 60));

        btn_rupdate.setBackground(new java.awt.Color(255, 0, 153));
        btn_rupdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_rupdate.setForeground(new java.awt.Color(255, 255, 255));
        btn_rupdate.setText("UPDATE");
        getContentPane().add(btn_rupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 220, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_rpctimegettingreadyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rpctimegettingreadyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rpctimegettingreadyActionPerformed

    private void btn_rpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rpaymentActionPerformed
        new ViewsAdmin.Payment().setVisible(true);
        //dispose();
    }//GEN-LAST:event_btn_rpaymentActionPerformed

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
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_go;
    private javax.swing.JButton btn_rpayment;
    private javax.swing.JButton btn_rupdate;
    private javax.swing.JCheckBox chck_rpcceremony;
    private javax.swing.JCheckBox chck_rpcgettingready;
    private javax.swing.JCheckBox chck_rpcphotoshoot;
    private javax.swing.JCheckBox chck_rpcreception;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea ta_roispecialrequestnotes;
    private javax.swing.JTextField txt_roinumberofguest;
    private javax.swing.JTextField txt_rpclocationceremony;
    private javax.swing.JTextField txt_rpclocationgettingready;
    private javax.swing.JTextField txt_rpclocationphotoshoot;
    private javax.swing.JTextField txt_rpclocationreception;
    private javax.swing.JTextField txt_rpctimeceremony;
    private javax.swing.JTextField txt_rpctimegettingready;
    private javax.swing.JTextField txt_rpctimephotoshoot;
    private javax.swing.JTextField txt_rpctimereception;
    private javax.swing.JTextField txt_rwdaddress;
    private javax.swing.JTextField txt_rwdbookername;
    private javax.swing.JTextField txt_rwdcity;
    private javax.swing.JTextField txt_rwdcontactnumber;
    private javax.swing.JTextField txt_rwddateofwedding;
    private javax.swing.JTextField txt_rwdfullnameofbride;
    private javax.swing.JTextField txt_rwdfullnameofgroom;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
