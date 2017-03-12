/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author LopezLaps
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        Themes.Theme.renderAluminium(Home.class.getName());
        Themes.Theme.setIcon(this);
        initComponents();
        //setExtendedState(JFrame.MAXIMIZED_BOTH);   
    }
    
    
    public void frameClose() {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        btnBookNow = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 255));
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBookNow.setBackground(new java.awt.Color(255, 0, 153));
        btnBookNow.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBookNow.setForeground(new java.awt.Color(255, 255, 255));
        btnBookNow.setText("Book Now!");
        btnBookNow.setMargin(new java.awt.Insets(14, 14, 14, 14));
        btnBookNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookNowActionPerformed(evt);
            }
        });
        getContentPane().add(btnBookNow, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 170, 60));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wed_sample2.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 210, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wed_sample3.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 260, 380));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wed_sample5.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 450, 200));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wed_sample1.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 210, 160));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 800, 440));

        jLabel3.setFont(new java.awt.Font("Edwardian Script ITC", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 153));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrow.png_48x48.png"))); // NOI18N
        jLabel3.setText("Sample Picture");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 620, 60));

        jMenuBar2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jMenu3.setBackground(new java.awt.Color(153, 153, 153));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home2.png"))); // NOI18N
        jMenu3.setText("Home");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuBar2.add(jMenu3);

        jMenu5.setBackground(new java.awt.Color(153, 153, 153));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admin_icon2.png"))); // NOI18N
        jMenu5.setText("Admin");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jMenu6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu6.setForeground(new java.awt.Color(255, 0, 153));
        jMenu6.setText("Admin Log-in");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenu5.add(jMenu6);

        jMenuBar2.add(jMenu5);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/terms_and_agreement.png"))); // NOI18N
        jMenu4.setText("Terms and condition");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        setSize(new java.awt.Dimension(885, 629));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookNowActionPerformed
        new ViewsNonAdmin.WeddingDetails().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBookNowActionPerformed

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        new ViewsAdmin.Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu6MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookNow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
