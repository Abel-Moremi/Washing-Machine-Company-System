/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package frontend;

import backend.Employee;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abel Moremi
 */
public class EmployeeScene extends javax.swing.JPanel {
    
    Employee employeeData;

    /**
     * Creates new form EmployeeScene
     */
    public EmployeeScene() {
        initComponents();
        employeeData = new Employee();
    }
    
    /**
     * The methods below are user defined
     * @throws java.sql.SQLException
     */
    
    public void showEmployees() throws SQLException{
        clearTable();
        ArrayList<String[]> list = employeeData.getEmployees();
        DefaultTableModel model = (DefaultTableModel) employeeDisplayTable.getModel();
        Object[] row = new Object[4];
            
        for(String[] array: list){
            row[0] = array[0];
            row[1] = array[1];
            row[2] = array[2];
            row[3] = array[3];
            model.addRow(row);
        }
            
    }
    
     public void showEmployee(String eno) throws SQLException{
        clearTable();
        ArrayList<String[]> list = employeeData.getEmployee(eno);
        DefaultTableModel model = (DefaultTableModel) employeeDisplayTable.getModel();
        Object[] row = new Object[4];
            
        for(String[] array: list){
            row[0] = array[0];
            row[1] = array[1];
            row[2] = array[2];
            row[3] = array[3];
            model.addRow(row);
        }
            
    }
    
    public void clearTable(){
        DefaultTableModel model = (DefaultTableModel) employeeDisplayTable.getModel();
        if(model.getRowCount() > 0){
            model.setRowCount(0);
        }
    }
    
    public void addEmployee() throws SQLException{
        String eno ="Eno-" + employeeData.getlastEno();
        String eName = addEmployeeName.getText();
        String eDesignation = addEmployeeDesignation.getText();
        int eSalary = Integer.parseInt(addEmployeeSalary.getText());
        
        employeeData.addEmplyee(eno, eName, eDesignation, eSalary);
        showEmployee(eno);
        clearAddEmployeeFields();
    }
    
    public void clearAddEmployeeFields(){
        addEmployeeName.setText(" ");
        addEmployeeDesignation.setText(" ");
        addEmployeeSalary.setText(" ");
    }
    
    public void updateEmployee() throws SQLException{
        String eno = updateEmployeeCno.getText();
        String eName = updateEmployeeName.getText();
        String eDesignation = updateEmployeeDesignation.getText();
        int eSalary = Integer.parseInt(updateEmployeeSalary.getText());
        
        employeeData.updateEmployee(eno, eName, eDesignation, eSalary);
        showEmployee(eno);
        clearUpdateEmployeeFields();
    }
    
     public void clearUpdateEmployeeFields(){
        updateEmployeeCno.setText(" ");
        updateEmployeeName.setText(" ");
        updateEmployeeDesignation.setText(" ");
        updateEmployeeSalary.setText(" ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EmployeeTab = new javax.swing.JTabbedPane();
        addEmployeeTab = new javax.swing.JPanel();
        addEmployeeButton = new javax.swing.JToggleButton();
        addEmployeeDesignation = new javax.swing.JTextField();
        addEmployeeSalary = new javax.swing.JTextField();
        addEmployeeDesignationTitle = new javax.swing.JLabel();
        addEmployeeSalaryTitle = new javax.swing.JLabel();
        addEmployeeName = new javax.swing.JTextField();
        addEmployeeNameTitle = new javax.swing.JLabel();
        updateEmployeeTab = new javax.swing.JPanel();
        updateEmployeeCno = new javax.swing.JTextField();
        updateEmployeeName = new javax.swing.JTextField();
        updateEmployeeDesignation = new javax.swing.JTextField();
        updateEmployeeCnoTitle = new javax.swing.JLabel();
        updateEmployeeNameTitle = new javax.swing.JLabel();
        updateEmployeeDesignationTitle = new javax.swing.JLabel();
        updateEmployeeButton = new javax.swing.JToggleButton();
        updateEmployeeSalaryTitle = new javax.swing.JLabel();
        updateEmployeeSalary = new javax.swing.JTextField();
        deleteEmployeeTab = new javax.swing.JPanel();
        deleteEmployeeCno = new javax.swing.JTextField();
        deleteEmployeeCnoTitle = new javax.swing.JLabel();
        deleteEmployeeButton = new javax.swing.JButton();
        refreshEmployeeListButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        employeeDisplayTableScroll = new javax.swing.JScrollPane();
        employeeDisplayTable = new javax.swing.JTable();

        addEmployeeButton.setText("Add");
        addEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeButtonActionPerformed(evt);
            }
        });

        addEmployeeDesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeDesignationActionPerformed(evt);
            }
        });

        addEmployeeSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeSalaryActionPerformed(evt);
            }
        });

        addEmployeeDesignationTitle.setText("Designation");

        addEmployeeSalaryTitle.setText("Salary");

        addEmployeeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeNameActionPerformed(evt);
            }
        });

        addEmployeeNameTitle.setText("Name");

        javax.swing.GroupLayout addEmployeeTabLayout = new javax.swing.GroupLayout(addEmployeeTab);
        addEmployeeTab.setLayout(addEmployeeTabLayout);
        addEmployeeTabLayout.setHorizontalGroup(
            addEmployeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEmployeeTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addEmployeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addEmployeeDesignationTitle)
                    .addComponent(addEmployeeNameTitle)
                    .addComponent(addEmployeeSalaryTitle))
                .addGap(18, 18, 18)
                .addGroup(addEmployeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addEmployeeTabLayout.createSequentialGroup()
                        .addComponent(addEmployeeSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(addEmployeeTabLayout.createSequentialGroup()
                        .addGroup(addEmployeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addEmployeeDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addEmployeeTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addEmployeeButton)
                .addGap(83, 83, 83))
        );
        addEmployeeTabLayout.setVerticalGroup(
            addEmployeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEmployeeTabLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(addEmployeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addEmployeeNameTitle))
                .addGap(18, 18, 18)
                .addGroup(addEmployeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEmployeeDesignationTitle)
                    .addComponent(addEmployeeDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addEmployeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEmployeeSalaryTitle)
                    .addComponent(addEmployeeSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addEmployeeButton)
                .addContainerGap(330, Short.MAX_VALUE))
        );

        EmployeeTab.addTab("Add", addEmployeeTab);

        updateEmployeeCno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEmployeeCnoActionPerformed(evt);
            }
        });

        updateEmployeeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEmployeeNameActionPerformed(evt);
            }
        });

        updateEmployeeCnoTitle.setText("CNo");

        updateEmployeeNameTitle.setText("newName");

        updateEmployeeDesignationTitle.setText("newDesignation");

        updateEmployeeButton.setText("Update");
        updateEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEmployeeButtonActionPerformed(evt);
            }
        });

        updateEmployeeSalaryTitle.setText("newSalary");

        javax.swing.GroupLayout updateEmployeeTabLayout = new javax.swing.GroupLayout(updateEmployeeTab);
        updateEmployeeTab.setLayout(updateEmployeeTabLayout);
        updateEmployeeTabLayout.setHorizontalGroup(
            updateEmployeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateEmployeeTabLayout.createSequentialGroup()
                .addGroup(updateEmployeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateEmployeeTabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(updateEmployeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateEmployeeDesignationTitle)
                            .addComponent(updateEmployeeNameTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(updateEmployeeSalaryTitle, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateEmployeeTabLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateEmployeeCnoTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(updateEmployeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateEmployeeCno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateEmployeeDesignation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateEmployeeName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateEmployeeSalary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateEmployeeTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateEmployeeButton)
                .addGap(63, 63, 63))
        );
        updateEmployeeTabLayout.setVerticalGroup(
            updateEmployeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateEmployeeTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updateEmployeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateEmployeeCno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateEmployeeCnoTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateEmployeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateEmployeeNameTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateEmployeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateEmployeeDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateEmployeeDesignationTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateEmployeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateEmployeeSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateEmployeeSalaryTitle))
                .addGap(18, 18, 18)
                .addComponent(updateEmployeeButton)
                .addContainerGap(338, Short.MAX_VALUE))
        );

        EmployeeTab.addTab("Update", updateEmployeeTab);

        deleteEmployeeCno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmployeeCnoActionPerformed(evt);
            }
        });

        deleteEmployeeCnoTitle.setText("Cno");

        deleteEmployeeButton.setText("Delete");
        deleteEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmployeeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteEmployeeTabLayout = new javax.swing.GroupLayout(deleteEmployeeTab);
        deleteEmployeeTab.setLayout(deleteEmployeeTabLayout);
        deleteEmployeeTabLayout.setHorizontalGroup(
            deleteEmployeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteEmployeeTabLayout.createSequentialGroup()
                .addGroup(deleteEmployeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deleteEmployeeTabLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(deleteEmployeeCnoTitle)
                        .addGap(18, 18, 18)
                        .addComponent(deleteEmployeeCno, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(deleteEmployeeTabLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(deleteEmployeeButton)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        deleteEmployeeTabLayout.setVerticalGroup(
            deleteEmployeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteEmployeeTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deleteEmployeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteEmployeeCno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteEmployeeCnoTitle))
                .addGap(26, 26, 26)
                .addComponent(deleteEmployeeButton)
                .addContainerGap(420, Short.MAX_VALUE))
        );

        EmployeeTab.addTab("Delete", deleteEmployeeTab);

        refreshEmployeeListButton.setText("Refresh");
        refreshEmployeeListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshEmployeeListButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("EMPLOYEE");

        employeeDisplayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Eno", "Name", "Designation", "Salary (P)"
            }
        ));
        employeeDisplayTableScroll.setViewportView(employeeDisplayTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(refreshEmployeeListButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(employeeDisplayTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(EmployeeTab, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(289, 289, 289))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(EmployeeTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(employeeDisplayTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addComponent(refreshEmployeeListButton)
                .addGap(100, 100, 100))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshEmployeeListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshEmployeeListButtonActionPerformed
        // TODO add your handling code here:
       try {
          showEmployees();  
        } catch (Exception ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
       
    }//GEN-LAST:event_refreshEmployeeListButtonActionPerformed

    private void addEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeButtonActionPerformed
        // TODO add your handling code here:
         try {
          addEmployee();  
        } catch (Exception ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }//GEN-LAST:event_addEmployeeButtonActionPerformed

    private void updateEmployeeCnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEmployeeCnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateEmployeeCnoActionPerformed

    private void updateEmployeeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEmployeeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateEmployeeNameActionPerformed

    private void deleteEmployeeCnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmployeeCnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteEmployeeCnoActionPerformed

    private void deleteEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmployeeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteEmployeeButtonActionPerformed

    private void updateEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEmployeeButtonActionPerformed
        // TODO add your handling code here:
        try {
            updateEmployee();  
        } catch (Exception ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }//GEN-LAST:event_updateEmployeeButtonActionPerformed

    private void addEmployeeDesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeDesignationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addEmployeeDesignationActionPerformed

    private void addEmployeeSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addEmployeeSalaryActionPerformed

    private void addEmployeeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addEmployeeNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane EmployeeTab;
    private javax.swing.JToggleButton addEmployeeButton;
    private javax.swing.JTextField addEmployeeDesignation;
    private javax.swing.JLabel addEmployeeDesignationTitle;
    private javax.swing.JTextField addEmployeeName;
    private javax.swing.JLabel addEmployeeNameTitle;
    private javax.swing.JTextField addEmployeeSalary;
    private javax.swing.JLabel addEmployeeSalaryTitle;
    private javax.swing.JPanel addEmployeeTab;
    private javax.swing.JButton deleteEmployeeButton;
    private javax.swing.JTextField deleteEmployeeCno;
    private javax.swing.JLabel deleteEmployeeCnoTitle;
    private javax.swing.JPanel deleteEmployeeTab;
    private javax.swing.JTable employeeDisplayTable;
    private javax.swing.JScrollPane employeeDisplayTableScroll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton refreshEmployeeListButton;
    private javax.swing.JToggleButton updateEmployeeButton;
    private javax.swing.JTextField updateEmployeeCno;
    private javax.swing.JLabel updateEmployeeCnoTitle;
    private javax.swing.JTextField updateEmployeeDesignation;
    private javax.swing.JLabel updateEmployeeDesignationTitle;
    private javax.swing.JTextField updateEmployeeName;
    private javax.swing.JLabel updateEmployeeNameTitle;
    private javax.swing.JTextField updateEmployeeSalary;
    private javax.swing.JLabel updateEmployeeSalaryTitle;
    private javax.swing.JPanel updateEmployeeTab;
    // End of variables declaration//GEN-END:variables
}
