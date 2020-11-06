/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

/**
 *
 * @author Zozo
 */
public class CustomerScene extends javax.swing.JPanel {
    

    /**
     * Creates new form CustomerScene
     */
    public CustomerScene() {
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

        customerTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        showCustomerTable = new javax.swing.JTable();
        customerTabbedPane = new javax.swing.JTabbedPane();
        addCustomerTab = new javax.swing.JPanel();
        addCustomerCnoText = new javax.swing.JTextField();
        addCustomerCnoTitle = new javax.swing.JLabel();
        addCustomerButton = new javax.swing.JButton();
        addCustomerNameText = new javax.swing.JTextField();
        addCustomerSurnameText = new javax.swing.JTextField();
        addCustomerNameTitle = new javax.swing.JLabel();
        addCustomerSurnameTitle = new javax.swing.JLabel();
        updateCustomerTab = new javax.swing.JPanel();
        updateCusomerCnoText = new javax.swing.JTextField();
        updateCustomerCnoTiltle = new javax.swing.JLabel();
        updateCustomerButton = new javax.swing.JButton();
        updateCustomernameTitle = new javax.swing.JLabel();
        updateCustomerSurnameTitle = new javax.swing.JLabel();
        updateCustomerNameText = new javax.swing.JTextField();
        updateCustomerSurnameText = new javax.swing.JTextField();
        deleteCustomerTab = new javax.swing.JPanel();
        deleteCustomerCnoText = new javax.swing.JTextField();
        deleteCustomerCnoTitle = new javax.swing.JLabel();
        deleteCustomerButton = new javax.swing.JButton();
        showCustomerButoon = new javax.swing.JButton();

        customerTitle.setText("Customer");

        showCustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CNo", "CName", "CSurname"
            }
        ));
        jScrollPane2.setViewportView(showCustomerTable);

        addCustomerCnoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerCnoTextActionPerformed(evt);
            }
        });

        addCustomerCnoTitle.setText("Cno");

        addCustomerButton.setText("Add");
        addCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerButtonActionPerformed(evt);
            }
        });

        addCustomerNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerNameTextActionPerformed(evt);
            }
        });

        addCustomerSurnameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerSurnameTextActionPerformed(evt);
            }
        });

        addCustomerNameTitle.setText("Name");

        addCustomerSurnameTitle.setText("Surname");

        javax.swing.GroupLayout addCustomerTabLayout = new javax.swing.GroupLayout(addCustomerTab);
        addCustomerTab.setLayout(addCustomerTabLayout);
        addCustomerTabLayout.setHorizontalGroup(
            addCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCustomerTabLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(addCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addCustomerTabLayout.createSequentialGroup()
                        .addComponent(addCustomerCnoTitle)
                        .addGap(18, 18, 18)
                        .addComponent(addCustomerCnoText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addCustomerTabLayout.createSequentialGroup()
                        .addGroup(addCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addCustomerSurnameTitle)
                            .addComponent(addCustomerNameTitle))
                        .addGap(18, 18, 18)
                        .addGroup(addCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addCustomerNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addCustomerSurnameText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(153, 153, 153))
            .addGroup(addCustomerTabLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(addCustomerButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addCustomerTabLayout.setVerticalGroup(
            addCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCustomerTabLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(addCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCustomerCnoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCustomerCnoTitle))
                .addGap(18, 18, 18)
                .addGroup(addCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCustomerNameTitle)
                    .addComponent(addCustomerNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(addCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCustomerSurnameTitle)
                    .addComponent(addCustomerSurnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addCustomerButton)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        customerTabbedPane.addTab("Add", addCustomerTab);

        updateCusomerCnoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCusomerCnoTextActionPerformed(evt);
            }
        });

        updateCustomerCnoTiltle.setText("Cno");

        updateCustomerButton.setText("Update");
        updateCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCustomerButtonActionPerformed(evt);
            }
        });

        updateCustomernameTitle.setText("Name");

        updateCustomerSurnameTitle.setText("Surname");

        updateCustomerNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCustomerNameTextActionPerformed(evt);
            }
        });

        updateCustomerSurnameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCustomerSurnameTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updateCustomerTabLayout = new javax.swing.GroupLayout(updateCustomerTab);
        updateCustomerTab.setLayout(updateCustomerTabLayout);
        updateCustomerTabLayout.setHorizontalGroup(
            updateCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateCustomerTabLayout.createSequentialGroup()
                .addGroup(updateCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateCustomerTabLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(updateCustomerCnoTiltle)
                        .addGap(18, 18, 18)
                        .addComponent(updateCusomerCnoText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(updateCustomerTabLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(updateCustomernameTitle)
                        .addGap(18, 18, 18)
                        .addComponent(updateCustomerNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(updateCustomerTabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(updateCustomerSurnameTitle)
                        .addGap(18, 18, 18)
                        .addComponent(updateCustomerSurnameText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(updateCustomerTabLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(updateCustomerButton)))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        updateCustomerTabLayout.setVerticalGroup(
            updateCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateCustomerTabLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(updateCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateCusomerCnoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateCustomerCnoTiltle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateCustomerNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateCustomernameTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateCustomerSurnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateCustomerSurnameTitle))
                .addGap(18, 18, 18)
                .addComponent(updateCustomerButton)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        customerTabbedPane.addTab("Update", updateCustomerTab);

        deleteCustomerCnoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerCnoTextActionPerformed(evt);
            }
        });

        deleteCustomerCnoTitle.setText("Cno");

        deleteCustomerButton.setText("Delete");
        deleteCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteCustomerTabLayout = new javax.swing.GroupLayout(deleteCustomerTab);
        deleteCustomerTab.setLayout(deleteCustomerTabLayout);
        deleteCustomerTabLayout.setHorizontalGroup(
            deleteCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteCustomerTabLayout.createSequentialGroup()
                .addGroup(deleteCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deleteCustomerTabLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(deleteCustomerCnoTitle)
                        .addGap(29, 29, 29)
                        .addComponent(deleteCustomerCnoText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(deleteCustomerTabLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(deleteCustomerButton)))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        deleteCustomerTabLayout.setVerticalGroup(
            deleteCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteCustomerTabLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(deleteCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteCustomerCnoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteCustomerCnoTitle))
                .addGap(18, 18, 18)
                .addComponent(deleteCustomerButton)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        customerTabbedPane.addTab("Delete", deleteCustomerTab);

        showCustomerButoon.setText("Refresh");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(customerTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(showCustomerButoon)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(customerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customerTabbedPane)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(showCustomerButoon)
                .addContainerGap(435, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addCustomerCnoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerCnoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCustomerCnoTextActionPerformed

    private void addCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerButtonActionPerformed
        // TODO add your handling code here:
        try {
            deleteEmployee();
        } catch (Exception ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }//GEN-LAST:event_addCustomerButtonActionPerformed

    private void updateCusomerCnoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCusomerCnoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateCusomerCnoTextActionPerformed

    private void updateCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCustomerButtonActionPerformed
        // TODO add your handling code here:
        try {
            deleteEmployee();
        } catch (Exception ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }//GEN-LAST:event_updateCustomerButtonActionPerformed

    private void deleteCustomerCnoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomerCnoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteCustomerCnoTextActionPerformed

    private void deleteCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomerButtonActionPerformed
        // TODO add your handling code here:
        try {
            deleteEmployee();
        } catch (Exception ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }//GEN-LAST:event_deleteCustomerButtonActionPerformed

    private void addCustomerNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCustomerNameTextActionPerformed

    private void addCustomerSurnameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerSurnameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCustomerSurnameTextActionPerformed

    private void updateCustomerNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCustomerNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateCustomerNameTextActionPerformed

    private void updateCustomerSurnameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCustomerSurnameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateCustomerSurnameTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustomerButton;
    private javax.swing.JTextField addCustomerCnoText;
    private javax.swing.JLabel addCustomerCnoTitle;
    private javax.swing.JTextField addCustomerNameText;
    private javax.swing.JLabel addCustomerNameTitle;
    private javax.swing.JTextField addCustomerSurnameText;
    private javax.swing.JLabel addCustomerSurnameTitle;
    private javax.swing.JPanel addCustomerTab;
    private javax.swing.JTabbedPane customerTabbedPane;
    private javax.swing.JLabel customerTitle;
    private javax.swing.JButton deleteCustomerButton;
    private javax.swing.JTextField deleteCustomerCnoText;
    private javax.swing.JLabel deleteCustomerCnoTitle;
    private javax.swing.JPanel deleteCustomerTab;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton showCustomerButoon;
    private javax.swing.JTable showCustomerTable;
    private javax.swing.JTextField updateCusomerCnoText;
    private javax.swing.JButton updateCustomerButton;
    private javax.swing.JLabel updateCustomerCnoTiltle;
    private javax.swing.JTextField updateCustomerNameText;
    private javax.swing.JTextField updateCustomerSurnameText;
    private javax.swing.JLabel updateCustomerSurnameTitle;
    private javax.swing.JPanel updateCustomerTab;
    private javax.swing.JLabel updateCustomernameTitle;
    // End of variables declaration//GEN-END:variables
}
