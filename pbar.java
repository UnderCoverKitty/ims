
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ACLC PC17
 */
public class pbar extends javax.swing.JFrame {

    public pbar() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtpin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        modules = new javax.swing.JLabel();
        pbars = new javax.swing.JProgressBar();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 220));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 220));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtpin.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        txtpin.setText("0%");
        jPanel1.add(txtpin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 30, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/kjhgfd-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 230, 90));

        modules.setText("Loading...");
        jPanel1.add(modules, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 170, -1));

        pbars.setBackground(new java.awt.Color(0, 102, 51));
        pbars.setFont(new java.awt.Font("Javanese Text", 1, 12)); // NOI18N
        pbars.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(pbars, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 440, 40));

        jPanel4.setBackground(new java.awt.Color(41, 88, 82));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));

        jPanel5.setBackground(new java.awt.Color(41, 88, 82));
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 20, 20));

        jPanel6.setBackground(new java.awt.Color(123, 164, 68));
        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 20, 20));

        jPanel7.setBackground(new java.awt.Color(123, 164, 68));
        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 20, 20));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 480, 200);

        jPanel3.setBackground(new java.awt.Color(41, 88, 82));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 500, 70);

        jPanel2.setBackground(new java.awt.Color(123, 164, 68));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 500, 220);

        pack();
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    // Change the Nimbus progress bar color to dark green
                    UIManager.put("nimbusOrange", new Color(0, 100, 0)); // RGB for dark green
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        pbar p = new pbar();
        p.setVisible(true);
        p.pbars.setForeground(java.awt.Color.GREEN);
        new Thread(() -> {
            Login m = new Login();
            for (int i = 0; i <= 100; i++) {
                try {
                    Thread.sleep(100);
                    int progress = i;

                    java.awt.EventQueue.invokeLater(() -> {
                        p.pbars.setValue(progress);
                        p.txtpin.setText(progress + "%");
                        if (progress == 100) {
                            p.setVisible(false);
                            p.dispose();
                            m.setVisible(true);
                        }
                        if (progress == 0) {
                            p.modules.setText("Loading data...");
                            p.pbars.setForeground(java.awt.Color.GRAY);
                        }
                        if (progress == 40) {
                            p.modules.setText("Connecting...");
                            p.pbars.setForeground(java.awt.Color.GRAY);
                        }
                        if (progress == 60) {
                            p.modules.setText("Connected.");
                            p.pbars.setForeground(java.awt.Color.GRAY);
                        }
                        if (progress == 61) {
                            p.modules.setText("Accessing data...");
                            p.pbars.setForeground(java.awt.Color.GRAY);
                        }
                        if (progress == 80) {
                            p.modules.setText("Launching application...");
                        }
                    });
                } catch (InterruptedException ex) {
                    Logger.getLogger(pbar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel modules;
    private javax.swing.JProgressBar pbars;
    private javax.swing.JLabel txtpin;
    // End of variables declaration//GEN-END:variables
}
