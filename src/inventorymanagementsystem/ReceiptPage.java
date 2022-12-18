/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package inventorymanagementsystem;

import java.nio.file.Paths;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

/**
 *
 * @author LoneDespair
 */
public class ReceiptPage extends javax.swing.JPanel {
    JComponent home;
    
    /**
     * Creates new form ReceiptPage
     */
    public ReceiptPage() {
        initComponents();
        
        String path = Paths.get(System.getProperty("user.dir"), "src/inventorymanagementsystem/logo.png").toString();
        //ImageIcon imageIcon = new ImageIcon(path);
        //displayIcon.setIcon(ImageResizer.fitImageIcon(imageIcon, displayIcon.getSize()));
    }
    
    public ReceiptPage(JComponent newHome) {
        this();
        home = newHome;
        setVisible(false);
    }
    
    public void open() {
        setVisible(true);
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
        homeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        displayIcon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 171, 121));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeButton.setBackground(new java.awt.Color(250, 171, 121));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/menu.png"))); // NOI18N
        homeButton.setBorderPainted(false);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 112, 112));

        jLabel1.setBackground(new java.awt.Color(250, 171, 121));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(232, 243, 214));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("OFFICIAL RECEIPT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 112));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(232, 243, 214));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        displayIcon.setText("2");
        jPanel2.add(displayIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 20, 80, 80));

        jLabel3.setBackground(new java.awt.Color(250, 171, 121));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Inventory Management System");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 350, 40));

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Rizal St, Daraga, Albay");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 260, 20));

        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, -1, -1));

        jScrollPane1.setViewportView(jPanel2);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 800, 490));
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        if (home == null) System.out.println("Null home on receipt");
        else {
            home.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_homeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel displayIcon;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
