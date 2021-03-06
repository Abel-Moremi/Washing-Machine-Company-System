/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package frontend;

import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.Box;

/**
 *
 * @author Abel Moremi
 */
public class BaseFrame extends JFrame implements ActionListener{
    
    CardLayout cardLayout;
    JPanel base;
    CustomerScene customer;
    MainScene main;
    EmployeeScene employee;
    ProductScene product;
    MachineScene machine;
    OrdersScene orders;
    ReportsScene reports;
    

    /**
     * Creates new form BaseFrame
     */
    public BaseFrame() {
        
       
        
        cardLayout = new CardLayout();
        base = new JPanel(cardLayout);
        
        main = new MainScene();
        customer = new CustomerScene();
        employee = new EmployeeScene();
        product = new ProductScene();
        machine = new MachineScene();
        orders = new OrdersScene();
        reports = new ReportsScene();
        
        base.add(main, "main");
        base.add(customer, "customer");
        base.add(employee, "employee");
        base.add(product, "product");
        base.add(machine, "machine");
        base.add(orders, "orders");
        base.add(reports, "reports");
          
        JButton customerButton = new JButton();
        customerButton.setText("Customer");
        customerButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerButtonActionPerformed(evt);
            }
        });
        
        JButton homeButton = new JButton();
        homeButton.setText("Home");
        homeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        
        JButton employeeButton = new JButton();
        employeeButton.setText("Employee");
        employeeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                employeeButtonActionPerformed(evt);
            }
        });
        
        JButton productButton = new JButton();
        productButton.setText("Product");
        productButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                productButtonActionPerformed(evt);
            }
        });
        
        JButton machineButton = new JButton();
        machineButton.setText("Machine");
        machineButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                machineButtonActionPerformed(evt);
            }
        });
        
        JButton ordersButton = new JButton();
        ordersButton.setText("Orders");
        ordersButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ordersButtonActionPerformed(evt);
            }
        });
        
        JButton reportsButton = new JButton();
        reportsButton.setText("Reports");
        reportsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                reportsButtonActionPerformed(evt);
            }
        });
        
        Box box = Box.createVerticalBox();
        
        box.add(Box.createVerticalStrut(10));
        box.add(homeButton);
        box.add(Box.createVerticalStrut(10));
        box.add(customerButton);
        box.add(Box.createVerticalStrut(10));
        box.add(employeeButton);
        box.add(Box.createVerticalStrut(10));
        box.add(productButton);
        box.add(Box.createVerticalStrut(10));
        box.add(machineButton);
        box.add(Box.createVerticalStrut(10));
        box.add(ordersButton);
        box.add(Box.createVerticalStrut(10));
         box.add(reportsButton);
        box.add(Box.createVerticalStrut(10));
        
        add(box, BorderLayout.WEST);
        
        add(base);  
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationByPlatform(true);
        setVisible(true);
        
        //initComponents();
     
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customerButton = new javax.swing.JButton();
        employeeButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        productButton = new javax.swing.JButton();
        machineButton = new javax.swing.JButton();
        ordersButton = new javax.swing.JButton();
        reportsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        customerButton.setText("Customer");
        customerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerButtonActionPerformed(evt);
            }
        });

        employeeButton.setText("Employee");
        employeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeButtonActionPerformed(evt);
            }
        });

        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        productButton.setText("Product");
        productButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productButtonActionPerformed(evt);
            }
        });

        machineButton.setText("Machine");
        machineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                machineButtonActionPerformed(evt);
            }
        });

        ordersButton.setText("Orders");
        ordersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersButtonActionPerformed(evt);
            }
        });

        reportsButton.setText("Reports");
        reportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerButton)
                    .addComponent(employeeButton)
                    .addComponent(productButton)
                    .addComponent(machineButton)
                    .addComponent(ordersButton)
                    .addComponent(reportsButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(homeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(machineButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ordersButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportsButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerButtonActionPerformed
        // TODO add your handling code here:
       cardLayout.show(base, "customer");
    }//GEN-LAST:event_customerButtonActionPerformed

    private void employeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeButtonActionPerformed
        // TODO add your handling code here:
        cardLayout.show(base, "employee");
    }//GEN-LAST:event_employeeButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        cardLayout.show(base, "main");
    }//GEN-LAST:event_homeButtonActionPerformed

    private void productButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productButtonActionPerformed
        // TODO add your handling code here:
        cardLayout.show(base, "product");
    }//GEN-LAST:event_productButtonActionPerformed

    private void machineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_machineButtonActionPerformed
        // TODO add your handling code here:
        cardLayout.show(base, "machine");
    }//GEN-LAST:event_machineButtonActionPerformed

    private void ordersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersButtonActionPerformed
        // TODO add your handling code here:
        cardLayout.show(base, "orders");
    }//GEN-LAST:event_ordersButtonActionPerformed

    private void reportsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsButtonActionPerformed
        // TODO add your handling code here:
         cardLayout.show(base, "reports");
    }//GEN-LAST:event_reportsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BaseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaseFrame();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton customerButton;
    private javax.swing.JButton employeeButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton machineButton;
    private javax.swing.JButton ordersButton;
    private javax.swing.JButton productButton;
    private javax.swing.JButton reportsButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
         cardLayout.show(base, "customer");
    }

}
