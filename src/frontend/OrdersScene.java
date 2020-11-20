/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package frontend;

/**
 *
 * @author 201503625
 */
public class OrdersScene extends javax.swing.JPanel {

    /**
     * Creates new form OrdersScene
     */
    public OrdersScene() {
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
        MachineTab = new javax.swing.JTabbedPane();
        addOrdersTab = new javax.swing.JPanel();
        addOrdersButton = new javax.swing.JToggleButton();
        addOrdersPrNo = new javax.swing.JTextField();
        addOrdersPrNoTitle = new javax.swing.JLabel();
        addOrdersCNo = new javax.swing.JTextField();
        addOrdersCNoTitle = new javax.swing.JLabel();
        updateOrdersTab = new javax.swing.JPanel();
        updateOrdersCNo = new javax.swing.JTextField();
        updateOrdersPrNo = new javax.swing.JTextField();
        updateOrdersNewPrNo = new javax.swing.JTextField();
        updateOrdersCNoTitle = new javax.swing.JLabel();
        updateOrdersPrNoTitle = new javax.swing.JLabel();
        updateOrdersNewPrNoTitle = new javax.swing.JLabel();
        updateOrdersButton = new javax.swing.JToggleButton();
        deleteOrdersTab = new javax.swing.JPanel();
        deleteOrdersCno = new javax.swing.JTextField();
        deleteOrdersCNoTitle = new javax.swing.JLabel();
        deleteOrdersButton = new javax.swing.JButton();
        deleteOrdersPrNo = new javax.swing.JTextField();
        deleteOrdersPrNoTitle = new javax.swing.JLabel();
        refreshMachineListButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ordersDisplayTableScroll = new javax.swing.JScrollPane();
        odersDisplayTable = new javax.swing.JTable();

        addOrdersButton.setText("Add");
        addOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrdersButtonActionPerformed(evt);
            }
        });

        addOrdersPrNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrdersPrNoActionPerformed(evt);
            }
        });

        addOrdersPrNoTitle.setText("PrNo");

        addOrdersCNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrdersCNoActionPerformed(evt);
            }
        });

        addOrdersCNoTitle.setText("CNo");

        javax.swing.GroupLayout addOrdersTabLayout = new javax.swing.GroupLayout(addOrdersTab);
        addOrdersTab.setLayout(addOrdersTabLayout);
        addOrdersTabLayout.setHorizontalGroup(
            addOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addOrdersTabLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(addOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addOrdersPrNoTitle)
                    .addComponent(addOrdersCNoTitle))
                .addGap(18, 18, 18)
                .addGroup(addOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addOrdersPrNo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addOrdersCNo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addOrdersTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addOrdersButton)
                .addGap(90, 90, 90))
        );
        addOrdersTabLayout.setVerticalGroup(
            addOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addOrdersTabLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(addOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addOrdersCNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addOrdersCNoTitle))
                .addGap(18, 18, 18)
                .addGroup(addOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addOrdersPrNoTitle)
                    .addComponent(addOrdersPrNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addOrdersButton)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        MachineTab.addTab("Add", addOrdersTab);

        updateOrdersCNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateOrdersCNoActionPerformed(evt);
            }
        });

        updateOrdersPrNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateOrdersPrNoActionPerformed(evt);
            }
        });

        updateOrdersCNoTitle.setText("CNo");

        updateOrdersPrNoTitle.setText("PrNo");

        updateOrdersNewPrNoTitle.setText("newPrNo");

        updateOrdersButton.setText("Update");
        updateOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateOrdersButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updateOrdersTabLayout = new javax.swing.GroupLayout(updateOrdersTab);
        updateOrdersTab.setLayout(updateOrdersTabLayout);
        updateOrdersTabLayout.setHorizontalGroup(
            updateOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateOrdersTabLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(updateOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(updateOrdersTabLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(updateOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateOrdersPrNoTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(updateOrdersCNoTitle, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, updateOrdersTabLayout.createSequentialGroup()
                        .addComponent(updateOrdersNewPrNoTitle)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateOrdersCNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateOrdersNewPrNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateOrdersPrNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateOrdersTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateOrdersButton)
                .addGap(61, 61, 61))
        );
        updateOrdersTabLayout.setVerticalGroup(
            updateOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateOrdersTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updateOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateOrdersCNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateOrdersCNoTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateOrdersPrNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateOrdersPrNoTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateOrdersNewPrNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateOrdersNewPrNoTitle))
                .addGap(18, 18, 18)
                .addComponent(updateOrdersButton)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        MachineTab.addTab("Update", updateOrdersTab);

        deleteOrdersCno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOrdersCnoActionPerformed(evt);
            }
        });

        deleteOrdersCNoTitle.setText("CNo");

        deleteOrdersButton.setText("Delete");
        deleteOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOrdersButtonActionPerformed(evt);
            }
        });

        deleteOrdersPrNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOrdersPrNoActionPerformed(evt);
            }
        });

        deleteOrdersPrNoTitle.setText("PrNo");

        javax.swing.GroupLayout deleteOrdersTabLayout = new javax.swing.GroupLayout(deleteOrdersTab);
        deleteOrdersTab.setLayout(deleteOrdersTabLayout);
        deleteOrdersTabLayout.setHorizontalGroup(
            deleteOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteOrdersTabLayout.createSequentialGroup()
                .addGroup(deleteOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deleteOrdersTabLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(deleteOrdersCNoTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteOrdersCno, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(deleteOrdersTabLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(deleteOrdersPrNoTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteOrdersPrNo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(deleteOrdersTabLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(deleteOrdersButton)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        deleteOrdersTabLayout.setVerticalGroup(
            deleteOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteOrdersTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deleteOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteOrdersCno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteOrdersCNoTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(deleteOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteOrdersPrNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteOrdersPrNoTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteOrdersButton)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        MachineTab.addTab("Delete", deleteOrdersTab);

        refreshMachineListButton.setText("Refresh");
        refreshMachineListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshMachineListButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Orders");

        odersDisplayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cno", "Cus-Name", "PrNo", "PrName"
            }
        ));
        ordersDisplayTableScroll.setViewportView(odersDisplayTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(ordersDisplayTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(MachineTab, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(refreshMachineListButton)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ordersDisplayTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(MachineTab))
                .addGap(33, 33, 33)
                .addComponent(refreshMachineListButton)
                .addGap(323, 323, 323))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 722, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrdersButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_addOrdersButtonActionPerformed

    private void addOrdersPrNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrdersPrNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addOrdersPrNoActionPerformed

    private void addOrdersCNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrdersCNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addOrdersCNoActionPerformed

    private void updateOrdersCNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateOrdersCNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateOrdersCNoActionPerformed

    private void updateOrdersPrNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateOrdersPrNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateOrdersPrNoActionPerformed

    private void updateOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateOrdersButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_updateOrdersButtonActionPerformed

    private void deleteOrdersCnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOrdersCnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteOrdersCnoActionPerformed

    private void deleteOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOrdersButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_deleteOrdersButtonActionPerformed

    private void refreshMachineListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshMachineListButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_refreshMachineListButtonActionPerformed

    private void deleteOrdersPrNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOrdersPrNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteOrdersPrNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane MachineTab;
    private javax.swing.JToggleButton addOrdersButton;
    private javax.swing.JTextField addOrdersCNo;
    private javax.swing.JLabel addOrdersCNoTitle;
    private javax.swing.JTextField addOrdersPrNo;
    private javax.swing.JLabel addOrdersPrNoTitle;
    private javax.swing.JPanel addOrdersTab;
    private javax.swing.JButton deleteOrdersButton;
    private javax.swing.JLabel deleteOrdersCNoTitle;
    private javax.swing.JTextField deleteOrdersCno;
    private javax.swing.JTextField deleteOrdersPrNo;
    private javax.swing.JLabel deleteOrdersPrNoTitle;
    private javax.swing.JPanel deleteOrdersTab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable odersDisplayTable;
    private javax.swing.JScrollPane ordersDisplayTableScroll;
    private javax.swing.JButton refreshMachineListButton;
    private javax.swing.JToggleButton updateOrdersButton;
    private javax.swing.JTextField updateOrdersCNo;
    private javax.swing.JLabel updateOrdersCNoTitle;
    private javax.swing.JTextField updateOrdersNewPrNo;
    private javax.swing.JLabel updateOrdersNewPrNoTitle;
    private javax.swing.JTextField updateOrdersPrNo;
    private javax.swing.JLabel updateOrdersPrNoTitle;
    private javax.swing.JPanel updateOrdersTab;
    // End of variables declaration//GEN-END:variables
}
