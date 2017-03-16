/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import DataObjects.WeddingDetails;
import Database.MySql;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import static java.lang.Thread.sleep;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LopezLaps
 */
public final class SplashScreen extends javax.swing.JFrame {

    Thread prog;

    public void progressBarInitProperties() {

    }

    public void frameClose() {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    public void splashInit() {
        prog = new Thread() {
            int xa = 0;

            @Override
            public void run() {

                for (;;) {
                    if (xa >= 100) {

                        new Home().setVisible(true);
                        dispose();
                        prog.stop();
                    } else {
                        xa = xa + 1;
                        loadingBar.setValue(xa);
                    }

                    try {
                        sleep(100);

                    } catch (InterruptedException ex) {
                        Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            }

        };

        prog.start();
    }

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
        Themes.Theme.renderAluminium(SplashScreen.class.getName());
        Themes.Theme.setIcon(this);
        initComponents();
        progressBarInitProperties();
        splashInit();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loadingBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setForeground(new java.awt.Color(255, 0, 153));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loadingBar.setForeground(new java.awt.Color(255, 0, 153));
        loadingBar.setAlignmentX(0.0F);
        loadingBar.setAlignmentY(0.0F);
        loadingBar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        loadingBar.setBorderPainted(false);
        loadingBar.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        loadingBar.setString("");
        loadingBar.setStringPainted(true);
        getContentPane().add(loadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 270, 430, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bw.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 430, 320));

        setSize(new java.awt.Dimension(410, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);

            }
        });

        
//        WeddingDetails weddingDetails = new WeddingDetails();
//        weddingDetails.setBookerName("Jameshwart Lopez");
//        weddingDetails.setFullnameOfTheBride("Apriln Capillanes");
//        weddingDetails.setFullnameOfTheGroom("Jameshwart Lopez");
//        weddingDetails.setAddress("Pulpogan Consolacion Cebu");
//        weddingDetails.setCity("Cebu City");
//        weddingDetails.setContactNo("09336888305");
//        weddingDetails.setGettingReadyTime("11:30 AM");
//        weddingDetails.setGettingReadyLocation("Consolacion SM");
//        weddingDetails.setCeremonyTime("12:30");
//        weddingDetails.setCeremonyLocation("San Narciso Parish");
//        weddingDetails.setPhotoshootTime("1:00");
//        weddingDetails.setPhotoshootLocation("at church");
//        weddingDetails.setReceptionTime("1:30");
//        weddingDetails.setReceptionLocation("Orosia");
//        weddingDetails.setNumberOfGuest(100);
//        weddingDetails.setSpecialRequestNotes("Thank You");
//        WeddingDetails.save(weddingDetails);
//        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar loadingBar;
    // End of variables declaration//GEN-END:variables
}
