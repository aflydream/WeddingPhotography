/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewsNonAdmin;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author LopezLaps
 */
public class PhotoCoverage extends javax.swing.JFrame {

    /**
     * Creates new form PhotoCoverage
     */
    public PhotoCoverage() {
        Themes.Theme.renderAluminium(PhotoCoverage.class.getName());
        Themes.Theme.setIcon(this);
        initComponents();
        setJMenuBar(Themes.Theme.setUpMenu(this));
    }

    public void frameClose() {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    private DataObjects.WeddingDetails getPhotoCoverage() {
        DataObjects.WeddingDetails wedDetails = ViewsNonAdmin.WeddingDetails.weddingDetails;

        wedDetails.setGettingReadyTime(this.txt_gettingreadytime.getText());
        wedDetails.setGettingReadyLocation(this.txt_gettingreadylocation.getText());
        wedDetails.setCeremonyTime(this.txt_ceremonytime.getText());
        wedDetails.setCeremonyLocation(this.txt_ceremonylocation.getText());
        wedDetails.setPhotoshootTime(this.txt_photoshoottime.getText());
        wedDetails.setPhotoshootLocation(this.txt_photoshootlocation.getText());
        wedDetails.setReceptionTime(this.txt_receptiontime.getText());
        wedDetails.setReceptionLocation(this.txt_receptionlocation.getText());
        return wedDetails;
    }

    private void setPhotoCoverageFormDetails() {
        if (ViewsNonAdmin.WeddingDetails.weddingDetails != null) {

            DataObjects.WeddingDetails wedDetails = ViewsNonAdmin.WeddingDetails.weddingDetails;

            this.txt_gettingreadytime.setText(wedDetails.getGettingReadyTime());
            this.txt_gettingreadylocation.setText(wedDetails.getGettingReadyLocation());

            this.txt_ceremonytime.setText(wedDetails.getCeremonyTime());
            this.txt_ceremonylocation.setText(wedDetails.getCeremonyLocation());

            this.txt_photoshoottime.setText(wedDetails.getPhotoshootTime());
            this.txt_photoshootlocation.setText(wedDetails.getPhotoshootLocation());

            this.txt_receptiontime.setText(wedDetails.getReceptionTime());
            this.txt_receptionlocation.setText(wedDetails.getReceptionLocation());
        }
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
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txt_gettingreadytime = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_gettingreadylocation = new javax.swing.JTextField();
        btn_pcnext = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txt_ceremonytime = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_ceremonylocation = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txt_photoshoottime = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txt_photoshootlocation = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txt_receptiontime = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txt_receptionlocation = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_weddingdetails = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Wedding Photography Booking");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pc2.png_48x48.png"))); // NOI18N
        jLabel1.setText("PHOTOGRAPHY COVERAGE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 60));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 153));
        jLabel15.setText("Time:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 50, -1));

        txt_gettingreadytime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_gettingreadytime.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_gettingreadytime.setPreferredSize(new java.awt.Dimension(5, 18));
        jPanel1.add(txt_gettingreadytime, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 60, 34));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 153));
        jLabel16.setText("Location:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 70, -1));

        txt_gettingreadylocation.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_gettingreadylocation.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_gettingreadylocation.setPreferredSize(new java.awt.Dimension(5, 18));
        jPanel1.add(txt_gettingreadylocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 330, 34));

        btn_pcnext.setBackground(new java.awt.Color(255, 0, 153));
        btn_pcnext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_pcnext.setForeground(new java.awt.Color(255, 255, 255));
        btn_pcnext.setText("Next");
        btn_pcnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pcnextActionPerformed(evt);
            }
        });
        jPanel1.add(btn_pcnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 160, 41));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 153));
        jLabel21.setText("Time:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 50, -1));

        txt_ceremonytime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ceremonytime.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_ceremonytime.setPreferredSize(new java.awt.Dimension(5, 18));
        jPanel1.add(txt_ceremonytime, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 60, 34));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 153));
        jLabel22.setText("Location:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 70, -1));

        txt_ceremonylocation.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ceremonylocation.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_ceremonylocation.setPreferredSize(new java.awt.Dimension(5, 18));
        jPanel1.add(txt_ceremonylocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 330, 34));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 153));
        jLabel23.setText("Time:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 50, -1));

        txt_photoshoottime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_photoshoottime.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_photoshoottime.setPreferredSize(new java.awt.Dimension(5, 18));
        jPanel1.add(txt_photoshoottime, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 60, 34));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 153));
        jLabel24.setText("Location:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 70, -1));

        txt_photoshootlocation.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_photoshootlocation.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_photoshootlocation.setPreferredSize(new java.awt.Dimension(5, 18));
        jPanel1.add(txt_photoshootlocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 330, 34));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 153));
        jLabel25.setText("Time:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 50, -1));

        txt_receptiontime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_receptiontime.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_receptiontime.setPreferredSize(new java.awt.Dimension(5, 18));
        jPanel1.add(txt_receptiontime, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 60, 34));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 0, 153));
        jLabel26.setText("Location:");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 70, -1));

        txt_receptionlocation.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_receptionlocation.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_receptionlocation.setPreferredSize(new java.awt.Dimension(5, 18));
        jPanel1.add(txt_receptionlocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 330, 34));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 153));
        jLabel2.setText("RECEPTION");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 130, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 153));
        jLabel5.setText("GETTING READY ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 130, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 153));
        jLabel6.setText("CEREMONY");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 130, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 153));
        jLabel7.setText("PHOTOSHOOT");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 130, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 810, 390));

        lbl_weddingdetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wd.png_64x64.png"))); // NOI18N
        lbl_weddingdetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_weddingdetailsMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_weddingdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 90, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pc2.png_64x64.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 70, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/g.png_64x64.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, 70, 70));

        jPanel2.setBackground(new java.awt.Color(255, 0, 153));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 350, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 300, 10));

        setSize(new java.awt.Dimension(885, 626));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private Boolean shouldContinue() {
        this.getPhotoCoverage();
        if ("".equals(txt_gettingreadytime.getText())) {
            JOptionPane.showMessageDialog(this, "Getting ready time is empty", "Message", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if ("".equals(txt_gettingreadylocation.getText())) {
            JOptionPane.showMessageDialog(this, "Getting ready location is empty", "Message", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if ("".equals(txt_ceremonytime.getText())) {
            JOptionPane.showMessageDialog(this, "Ceremony time is empty", "Message", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if ("".equals(txt_ceremonylocation.getText())) {
            JOptionPane.showMessageDialog(this, "Ceremony location is empty", "Message", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if ("".equals(txt_photoshoottime.getText())) {
            JOptionPane.showMessageDialog(this, "Photoshoot is empty", "Message", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if ("".equals(txt_photoshootlocation.getText())) {
            JOptionPane.showMessageDialog(this, "Photoshoot location is empty", "Message", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if ("".equals(txt_receptiontime.getText())) {
            JOptionPane.showMessageDialog(this, "Reception time is empty", "Message", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if ("".equals(txt_receptionlocation.getText())) {
            JOptionPane.showMessageDialog(this, "Reception location is empty", "Message", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }
    private void btn_pcnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pcnextActionPerformed
        if (this.shouldContinue()) {

            this.getPhotoCoverage();
            new ViewsNonAdmin.OtherInfo().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btn_pcnextActionPerformed

    private void lbl_weddingdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_weddingdetailsMouseClicked
        this.getPhotoCoverage();
        new ViewsNonAdmin.WeddingDetails().setVisible(true);
        dispose();
    }//GEN-LAST:event_lbl_weddingdetailsMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (ViewsNonAdmin.WeddingDetails.weddingDetails != null) {
            this.setPhotoCoverageFormDetails();
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(PhotoCoverage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhotoCoverage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhotoCoverage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhotoCoverage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PhotoCoverage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_pcnext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_weddingdetails;
    private javax.swing.JTextField txt_ceremonylocation;
    private javax.swing.JTextField txt_ceremonytime;
    private javax.swing.JTextField txt_gettingreadylocation;
    private javax.swing.JTextField txt_gettingreadytime;
    private javax.swing.JTextField txt_photoshootlocation;
    private javax.swing.JTextField txt_photoshoottime;
    private javax.swing.JTextField txt_receptionlocation;
    private javax.swing.JTextField txt_receptiontime;
    // End of variables declaration//GEN-END:variables
}
