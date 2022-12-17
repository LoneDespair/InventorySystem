/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventorymanagementsystem;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author user
 */
public class MainMenu extends javax.swing.JFrame {
    
    /**
     * Creates new form MainMenu
     * @param username
     */
    
    public MainMenu(String username) {
        this();
        userlabel.setText(username);
    }
    
     public MainMenu() {
        initComponents();
        productList.home = homePage;
        purchasePage.setup(homePage);
        
    }
     
    //public PurchasePage getPurchasePage() { return purchasePage; }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homePage = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        productButton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        purchaseButton = new javax.swing.JButton();
        BottomPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        userlabel = new javax.swing.JLabel();
        productList = new inventorymanagementsystem.ProductList();
        purchasePage = new inventorymanagementsystem.PurchasePage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new java.awt.CardLayout());

        homePage.setBackground(new java.awt.Color(232, 243, 214));

        HeaderPanel.setBackground(new java.awt.Color(250, 171, 120));
        HeaderPanel.setMaximumSize(new java.awt.Dimension(32767, 112));
        HeaderPanel.setPreferredSize(new java.awt.Dimension(856, 112));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(232, 243, 214));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INVENTORY MANAGEMENT SYSTEM");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/IMSLogo (1).png"))); // NOI18N

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(62, 62, 62))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(HeaderPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(232, 243, 214));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productButton.setBackground(new java.awt.Color(252, 249, 190));
        productButton.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        productButton.setForeground(new java.awt.Color(250, 171, 120));
        productButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/ProductsIcon.png"))); // NOI18N
        productButton.setText("PRODUCTS");
        productButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 171, 120), 2, true));
        productButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productButton.setFocusable(false);
        productButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productButtonActionPerformed(evt);
            }
        });
        jPanel2.add(productButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 374, 200));

        jButton5.setBackground(new java.awt.Color(252, 249, 190));
        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(250, 171, 120));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/UsersIcon.png"))); // NOI18N
        jButton5.setText("USERS");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 171, 120), 2, true));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusable(false);
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 374, 200));

        jButton3.setBackground(new java.awt.Color(252, 249, 190));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(250, 171, 120));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/LogsIcon.png"))); // NOI18N
        jButton3.setText("LOGS");
        jButton3.setToolTipText("");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 171, 120), 2, true));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 374, 200));

        purchaseButton.setBackground(new java.awt.Color(252, 249, 190));
        purchaseButton.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        purchaseButton.setForeground(new java.awt.Color(250, 171, 120));
        purchaseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/PurchaseIcon.png"))); // NOI18N
        purchaseButton.setText("PURCHASE");
        purchaseButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 171, 120), 2, true));
        purchaseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        purchaseButton.setFocusable(false);
        purchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButtonActionPerformed(evt);
            }
        });
        jPanel2.add(purchaseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 374, 200));

        BottomPanel.setBackground(new java.awt.Color(255, 220, 169));
        BottomPanel.setMaximumSize(new java.awt.Dimension(32767, 100));
        BottomPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(250, 171, 120));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton1.setText("LOG OUT");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setMaximumSize(new java.awt.Dimension(999, 999));
        jButton1.setPreferredSize(new java.awt.Dimension(55, 42));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        BottomPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 11, 110, -1));

        userlabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        userlabel.setForeground(new java.awt.Color(250, 171, 120));
        userlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/UserIcon45px.png"))); // NOI18N
        userlabel.setText("jLabel2");
        userlabel.setMaximumSize(new java.awt.Dimension(9999, 99999));
        userlabel.setPreferredSize(new java.awt.Dimension(112, 48));
        BottomPanel.add(userlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 6, 156, -1));

        javax.swing.GroupLayout homePageLayout = new javax.swing.GroupLayout(homePage);
        homePage.setLayout(homePageLayout);
        homePageLayout.setHorizontalGroup(
            homePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(homePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePageLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(homePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        homePageLayout.setVerticalGroup(
            homePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(homePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePageLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(homePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(homePageLayout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(homePage, "card2");
        getContentPane().add(productList, "card3");
        getContentPane().add(purchasePage, "card4");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void productButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productButtonActionPerformed
        homePage.setVisible(false);
        productList.open();
    }//GEN-LAST:event_productButtonActionPerformed

    private void purchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseButtonActionPerformed
        homePage.setVisible(false);
        purchasePage.open();
    }//GEN-LAST:event_purchaseButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?","Log Out", JOptionPane.YES_NO_OPTION);
        
        if(choice == 0){
            try {
                new LoginScreen().setVisible(true);
            } catch (Exception e) {
                Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, e);
            }
            dispose();
        }
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BottomPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel homePage;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton productButton;
    private inventorymanagementsystem.ProductList productList;
    private javax.swing.JButton purchaseButton;
    private inventorymanagementsystem.PurchasePage purchasePage;
    private javax.swing.JLabel userlabel;
    // End of variables declaration//GEN-END:variables
}
