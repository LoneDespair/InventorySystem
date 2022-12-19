/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package inventorymanagementsystem;

import java.awt.Color;
import java.awt.Dimension;
import java.nio.file.Paths;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LoneDespair
 */
public class ReceiptPage extends javax.swing.JPanel {
    JComponent home;
    ProductList productList;
    
    DefaultTableModel tableModel;
    
    /**
     * Creates new form ReceiptPage
     */
    public ReceiptPage() {
        initComponents();
        table.getTableHeader().setBackground(new Color(255,220,169));
        table.setFillsViewportHeight(true);
        tableModel = (DefaultTableModel) table.getModel();
    }
    
    public ReceiptPage(JComponent newHome) {
        this();
        home = newHome;
        setVisible(false);
    }
    
    public void open(Bill bill) {
        setVisible(true);
        tableModel.setRowCount(0);
        
        for (CartGrocery cartGrocery : bill.table.values()) {
            Product product = cartGrocery.product;
            Grocery grocery = cartGrocery.grocery;
            product.quantity -= grocery.count;
            
            tableModel.addRow(new Object[] {product.name, grocery.count, Money.format(product.price), Money.format(grocery.getTotal())});
        }
        
        double cash = bill.cash;
        
        vatableLabel.setText(Money.format(bill.getVatable()));
        vatLabel.setText(Money.format(bill.getVat()));
        shippingLabel.setText(Money.format(bill.getShippingFee()));
        totalLabel.setText(Money.format(bill.getTotal()));
        
        cashLabel.setText(Money.format(cash));
        changeLabel.setText(Money.format(cash - bill.getTotal()));
        
        if (productList != null) productList.update();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        paper = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tableScroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        vatableLabel = new javax.swing.JLabel();
        vatLabel = new javax.swing.JLabel();
        shippingLabel = new javax.swing.JLabel();
        cashLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        changeLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(250, 171, 121));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeButton.setBackground(new java.awt.Color(250, 171, 121));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/menu.png"))); // NOI18N
        homeButton.setBorderPainted(false);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        header.add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 112, 112));

        jLabel1.setBackground(new java.awt.Color(250, 171, 121));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(232, 243, 214));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("OFFICIAL RECEIPT");
        header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 112));

        add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(232, 243, 214));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paper.setBackground(new java.awt.Color(252, 249, 190));

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Rizal St, Daraga, Albay");

        jLabel3.setBackground(new java.awt.Color(250, 171, 121));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Le Bodega");

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("TEL NO: #87000");

        table.setAutoCreateRowSorter(true);
        table.setBackground(new java.awt.Color(252, 249, 190));
        table.setForeground(new java.awt.Color(102, 102, 102));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "QUANTITY", "UNIT PRICE", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableScroll.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
        }

        vatableLabel.setForeground(new java.awt.Color(102, 102, 102));
        vatableLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        vatableLabel.setText("0");

        vatLabel.setForeground(new java.awt.Color(102, 102, 102));
        vatLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        vatLabel.setText("0");

        shippingLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        shippingLabel.setText("0");

        cashLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        cashLabel.setText("0");

        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("VATable");

        changeLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        changeLabel.setText("0");

        totalLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalLabel.setForeground(new java.awt.Color(102, 102, 102));
        totalLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        totalLabel.setText("0");

        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("VAT 12%");

        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel13.setText("Shipping fee");

        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("Cash");

        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel15.setText("Change");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel16.setText("Total");

        javax.swing.GroupLayout paperLayout = new javax.swing.GroupLayout(paper);
        paper.setLayout(paperLayout);
        paperLayout.setHorizontalGroup(
            paperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paperLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(paperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                    .addGroup(paperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tableScroll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(paperLayout.createSequentialGroup()
                            .addGroup(paperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paperLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(paperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(paperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(totalLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(paperLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(changeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                                .addComponent(shippingLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vatableLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vatLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cashLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        paperLayout.setVerticalGroup(
            paperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paperLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vatableLabel)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vatLabel)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shippingLabel)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashLabel)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeLabel)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(paperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalLabel)
                    .addGroup(paperLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.add(paper, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 590, 450));

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
    private javax.swing.JLabel cashLabel;
    private javax.swing.JLabel changeLabel;
    private javax.swing.JPanel header;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel paper;
    private javax.swing.JLabel shippingLabel;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane tableScroll;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel vatLabel;
    private javax.swing.JLabel vatableLabel;
    // End of variables declaration//GEN-END:variables

}
