/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package frontend;

import backend.Part;
import backend.Product;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 201503625
 */
public class ProductScene extends javax.swing.JPanel {
    
    Part partData;
    Product productData;

    /**
     * Creates new form Product
     */
    public ProductScene() {
        initComponents();
        
        partData = new Part();
        productData = new Product();
        
    }
    
    /**
     * Part User Defined functions
     */
    public void showParts() throws SQLException{
        clearPartTable();
        ArrayList<String[]> list = partData.getAllParts();
        DefaultTableModel model = (DefaultTableModel) showPartTable.getModel();
        Object[] row = new Object[6];
            
        for(String[] array: list){
            row[0] = array[0];
            row[1] = array[1];
            row[2] = array[2];
            row[3] = array[3];
            row[4] = array[4];
            row[5] = array[5];
            model.addRow(row);
        }
            
    }
    
    public void showPart(String PNo) throws SQLException{
        clearPartTable();
        ArrayList<String[]> list = partData.getAllPart(PNo);
        DefaultTableModel model = (DefaultTableModel) showPartTable.getModel();
        Object[] row = new Object[6];
            
        for(String[] array: list){
            row[0] = array[0];
            row[1] = array[1];
            row[2] = array[2];
            row[3] = array[3];
            row[4] = array[4];
            row[5] = array[5];
            model.addRow(row);
        }
            
    }
    
    public void clearPartTable(){
        DefaultTableModel model = (DefaultTableModel) showPartTable.getModel();
        if(model.getRowCount() > 0){
            model.setRowCount(0);
        }
    }
    
    public void addPart() throws SQLException{
        String pNo ="FK-0" + partData.getlastPNo();
        String pDescription = addPartDescriptionText.getText();
        String pCost = addPartCostText.getText();
        String pMno = addPartMachineText.getText();
        String pEno = addPartEmployeeText.getText();
        
        partData.addAllPart(pNo, pDescription, pCost, pMno, pEno);
        showPart(pNo);
        clearAddPartFields();
    }
    
     public void clearAddPartFields(){
        addPartDescriptionText.setText(" ");
        addPartCostText.setText(" ");
        addPartMachineText.setText(" ");
        addPartEmployeeText.setText(" ");
    }
     
     public void updatePart() throws SQLException{
        String pNo = updatePartNoText.getText();
        String pDescription = updatePartDescriptionText.getText();
        String pCost = updatePartCostText.getText();
        
        partData.updatePart(pNo, pDescription, pCost);
        showPart(pNo);
        clearUpdatePartFields();
    }
    
    public void clearUpdatePartFields(){
        updatePartNoText.setText(" ");
        updatePartDescriptionText.setText(" ");
        updatePartCostText.setText(" ");
    }
    
     public void deletePart() throws SQLException{
        String pNo = deletePartNoText.getText();
        
        partData.deleteAllPart(pNo);
        showParts();
        clearDeletePartField();
    }
    
     public void clearDeletePartField(){
        deletePartNoText.setText(" ");
    }
     
    /**
     * End Part User Defined functions
     */
     
     /**
     * Product User Defined functions
     */
     
     public void showProducts() throws SQLException{
        clearProductTable();
        ArrayList<String[]> list = productData.getProducts();
        DefaultTableModel model = (DefaultTableModel) showProductTable.getModel();
        Object[] row = new Object[3];
            
        for(String[] array: list){
            row[0] = array[0];
            row[1] = array[1];
            row[2] = array[2];
            model.addRow(row);
        }
            
    }
     
    public void showProduct(String pNo) throws SQLException{
        clearProductTable();
        ArrayList<String[]> list = productData.getProduct(pNo);
        DefaultTableModel model = (DefaultTableModel) showProductTable.getModel();
        Object[] row = new Object[3];
            
        for(String[] array: list){
            row[0] = array[0];
            row[1] = array[1];
            row[2] = array[2];
            model.addRow(row);
        }
            
    }
     
     public void clearProductTable(){
        DefaultTableModel model = (DefaultTableModel) showProductTable.getModel();
        if(model.getRowCount() > 0){
            model.setRowCount(0);
        }
    }
     
      public void addProduct() throws SQLException{
        String pNo ="pd-" + productData.getlastPNo();
        String pName = addProductNameText.getText();
        String pCost = addProductCostText.getText();
        
        productData.addProduct(pNo, pName, pCost);
        showProduct(pNo);
        clearAddProductFields();
    }
      
    public void clearAddProductFields(){
        addProductNameText.setText(" ");
        addProductCostText.setText(" ");
    }
    
    public void updateProduct() throws SQLException{
        String pNo = updateProductNoText.getText();
        String pName = updateProductNameText.getText();
        String pCost = updateProductCostText.getText();
        
        productData.updateProduct(pNo, pName, pCost);
        showProduct(pNo);
        clearUpdateProductFields();
    }
    
    public void clearUpdateProductFields(){
        updateProductNoText.setText(" ");
        updateProductNameText.setText(" ");
        updateProductCostText.setText(" ");
    }
    
    public void deleteProduct() throws SQLException{
        String pNo = deleteProductNoText.getText();
        
        productData.deleteProduct(pNo);
        showProducts();
        clearDeleteProductField();
    }
    
     public void clearDeleteProductField(){
        deleteProductNoText.setText(" ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productTitle = new javax.swing.JLabel();
        productTabbedPane = new javax.swing.JTabbedPane();
        partTab = new javax.swing.JPanel();
        partScrollPane = new javax.swing.JScrollPane();
        showPartTable = new javax.swing.JTable();
        partRefreshButton = new javax.swing.JButton();
        partActionTab = new javax.swing.JTabbedPane();
        addPanel = new javax.swing.JPanel();
        addPartDescriptionText = new javax.swing.JTextField();
        addPartCostText = new javax.swing.JTextField();
        addPartMachineText = new javax.swing.JTextField();
        addPartCostTitle = new javax.swing.JLabel();
        addPartMachineTitle = new javax.swing.JLabel();
        addPartEmployeeTitle = new javax.swing.JLabel();
        addPartEmployeeText = new javax.swing.JTextField();
        addPartDescriptionTitle = new javax.swing.JLabel();
        addPartButton = new javax.swing.JButton();
        updatePanel = new javax.swing.JPanel();
        updatePartCostText = new javax.swing.JTextField();
        updatePartNoText = new javax.swing.JTextField();
        updatePartDescriptionTitle = new javax.swing.JLabel();
        updatePartCostTitle = new javax.swing.JLabel();
        updatePartButton = new javax.swing.JButton();
        updatePartDescriptionText = new javax.swing.JTextField();
        updatePartNoTitle = new javax.swing.JLabel();
        deletePanel = new javax.swing.JPanel();
        deletePartButton = new javax.swing.JButton();
        deletePartNoTitle = new javax.swing.JLabel();
        deletePartNoText = new javax.swing.JTextField();
        productTab = new javax.swing.JPanel();
        productScrollPane = new javax.swing.JScrollPane();
        showProductTable = new javax.swing.JTable();
        refreshProductButton = new javax.swing.JButton();
        productActionTab = new javax.swing.JTabbedPane();
        addProductPane = new javax.swing.JPanel();
        addProductNameTitle = new javax.swing.JLabel();
        addProductNameText = new javax.swing.JTextField();
        addProductCostTitle = new javax.swing.JLabel();
        addProductCostText = new javax.swing.JTextField();
        addProductButton = new javax.swing.JButton();
        updateProductPane = new javax.swing.JPanel();
        updateProductNameText = new javax.swing.JTextField();
        updateProductCostText = new javax.swing.JTextField();
        updateproductNameTitle = new javax.swing.JLabel();
        updateProducteCostTitle = new javax.swing.JLabel();
        updateProductButton = new javax.swing.JButton();
        updateProductNoText = new javax.swing.JTextField();
        updateProductNoTitle = new javax.swing.JLabel();
        deleteProductPane = new javax.swing.JPanel();
        deleteProductNoText = new javax.swing.JTextField();
        deleteProductNoTitle = new javax.swing.JLabel();
        deleteProductButton = new javax.swing.JButton();
        productAssembleTab = new javax.swing.JPanel();
        productAssembleScrollPane = new javax.swing.JScrollPane();
        showProductAssembleTable = new javax.swing.JTable();
        refreshProductAssembleButton = new javax.swing.JButton();
        productAssembleActionTab = new javax.swing.JTabbedPane();
        addProductAssemblePane = new javax.swing.JPanel();
        addProductAssemblePrNoTitle = new javax.swing.JLabel();
        addProductAssemblePartnoText = new javax.swing.JTextField();
        addProductAssemblePartNoTitle = new javax.swing.JLabel();
        addProductAssemblePartNoText = new javax.swing.JTextField();
        addProductAssembleButton = new javax.swing.JButton();
        updateProductAssemblePane = new javax.swing.JPanel();
        updateProductAssemblePrNoText = new javax.swing.JTextField();
        updateProductAssemblePartNoText = new javax.swing.JTextField();
        updateproductAssemblePrNoTitle = new javax.swing.JLabel();
        updateProductAssemblePartNoTitle = new javax.swing.JLabel();
        updateProductAssembleButton = new javax.swing.JButton();
        deleteProductAssemblePane = new javax.swing.JPanel();
        deleteProductAssemblePrNoText = new javax.swing.JTextField();
        deleteProductAssemblePrNoTitle = new javax.swing.JLabel();
        deleteProductAssembleButton = new javax.swing.JButton();

        productTitle.setText("Product");

        showPartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PartNo", "Description", "Cost", "Machine", "Employee", "Date"
            }
        ));
        partScrollPane.setViewportView(showPartTable);

        partRefreshButton.setText("Refresh");
        partRefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partRefreshButtonActionPerformed(evt);
            }
        });

        addPartDescriptionText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPartDescriptionTextActionPerformed(evt);
            }
        });

        addPartCostText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPartCostTextActionPerformed(evt);
            }
        });

        addPartMachineText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPartMachineTextActionPerformed(evt);
            }
        });

        addPartCostTitle.setText("partCost");

        addPartMachineTitle.setText("Machine");

        addPartEmployeeTitle.setText("Employee");

        addPartEmployeeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPartEmployeeTextActionPerformed(evt);
            }
        });

        addPartDescriptionTitle.setText("Description");

        addPartButton.setText("Add");
        addPartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addPartEmployeeTitle)
                    .addComponent(addPartDescriptionTitle)
                    .addComponent(addPartCostTitle)
                    .addComponent(addPartMachineTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addPartDescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPartCostText, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPartMachineText, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPartEmployeeText, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addPartButton)
                .addGap(118, 118, 118))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPartDescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPartDescriptionTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPartCostText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPartCostTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPartMachineText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPartMachineTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPartEmployeeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPartEmployeeTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addPartButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        partActionTab.addTab("add", addPanel);

        updatePartCostText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePartCostTextActionPerformed(evt);
            }
        });

        updatePartNoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePartNoTextActionPerformed(evt);
            }
        });

        updatePartDescriptionTitle.setText("newDescription");

        updatePartCostTitle.setText("newPartCost");

        updatePartButton.setText("Update");
        updatePartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePartButtonActionPerformed(evt);
            }
        });

        updatePartDescriptionText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePartDescriptionTextActionPerformed(evt);
            }
        });

        updatePartNoTitle.setText("PartNo");

        javax.swing.GroupLayout updatePanelLayout = new javax.swing.GroupLayout(updatePanel);
        updatePanel.setLayout(updatePanelLayout);
        updatePanelLayout.setHorizontalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(updatePartDescriptionTitle)
                    .addComponent(updatePartCostTitle)
                    .addComponent(updatePartNoTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updatePartNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatePartCostText, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatePartDescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updatePartButton)
                .addGap(118, 118, 118))
        );
        updatePanelLayout.setVerticalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatePartNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatePartNoTitle))
                .addGap(6, 6, 6)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatePartDescriptionTitle)
                    .addComponent(updatePartDescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatePartCostText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatePartCostTitle))
                .addGap(18, 18, 18)
                .addComponent(updatePartButton)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        partActionTab.addTab("Update", updatePanel);

        deletePartButton.setText("Delete");
        deletePartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePartButtonActionPerformed(evt);
            }
        });

        deletePartNoTitle.setText("PartNo");

        deletePartNoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePartNoTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deletePanelLayout = new javax.swing.GroupLayout(deletePanel);
        deletePanel.setLayout(deletePanelLayout);
        deletePanelLayout.setHorizontalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletePanelLayout.createSequentialGroup()
                        .addComponent(deletePartNoTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deletePartNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletePanelLayout.createSequentialGroup()
                        .addComponent(deletePartButton)
                        .addGap(145, 145, 145))))
        );
        deletePanelLayout.setVerticalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletePanelLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletePartNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletePartNoTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deletePartButton)
                .addGap(79, 79, 79))
        );

        partActionTab.addTab("Delete", deletePanel);

        javax.swing.GroupLayout partTabLayout = new javax.swing.GroupLayout(partTab);
        partTab.setLayout(partTabLayout);
        partTabLayout.setHorizontalGroup(
            partTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(partScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, partTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(partRefreshButton)
                .addContainerGap())
            .addGroup(partTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(partActionTab, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        partTabLayout.setVerticalGroup(
            partTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(partTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(partScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(partRefreshButton)
                .addGap(18, 18, 18)
                .addComponent(partActionTab)
                .addContainerGap())
        );

        productTabbedPane.addTab("Part", partTab);

        showProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product#", "Name", "Cost"
            }
        ));
        productScrollPane.setViewportView(showProductTable);
        if (showProductTable.getColumnModel().getColumnCount() > 0) {
            showProductTable.getColumnModel().getColumn(2).setHeaderValue("Cost");
        }

        refreshProductButton.setText("Refresh");
        refreshProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshProductButtonActionPerformed(evt);
            }
        });

        addProductNameTitle.setText("Name");

        addProductCostTitle.setText("Cost");

        addProductButton.setText("Add");
        addProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addProductPaneLayout = new javax.swing.GroupLayout(addProductPane);
        addProductPane.setLayout(addProductPaneLayout);
        addProductPaneLayout.setHorizontalGroup(
            addProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addProductPaneLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(addProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addProductCostTitle)
                    .addComponent(addProductNameTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addProductCostText, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(addProductNameText)
                    .addGroup(addProductPaneLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(addProductButton)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        addProductPaneLayout.setVerticalGroup(
            addProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addProductPaneLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(addProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addProductNameTitle)
                    .addComponent(addProductNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addProductCostTitle)
                    .addComponent(addProductCostText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addProductButton)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        productActionTab.addTab("Add", addProductPane);

        updateproductNameTitle.setText("Name");

        updateProducteCostTitle.setText("Cost");

        updateProductButton.setText("Update");
        updateProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProductButtonActionPerformed(evt);
            }
        });

        updateProductNoTitle.setText("PNo");

        javax.swing.GroupLayout updateProductPaneLayout = new javax.swing.GroupLayout(updateProductPane);
        updateProductPane.setLayout(updateProductPaneLayout);
        updateProductPaneLayout.setHorizontalGroup(
            updateProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateProductPaneLayout.createSequentialGroup()
                .addGroup(updateProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateProductPaneLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(updateProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(updateProducteCostTitle)
                            .addComponent(updateproductNameTitle)
                            .addComponent(updateProductNoTitle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(updateProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updateProductCostText, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(updateProductNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(updateProductNoText)))
                    .addGroup(updateProductPaneLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(updateProductButton)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        updateProductPaneLayout.setVerticalGroup(
            updateProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateProductPaneLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(updateProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateProductNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateProductNoTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateProductNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateproductNameTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(updateProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateProductCostText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateProducteCostTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateProductButton)
                .addContainerGap())
        );

        productActionTab.addTab("Update", updateProductPane);

        deleteProductNoTitle.setText("PNo");

        deleteProductButton.setText("Delete");
        deleteProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProductButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteProductPaneLayout = new javax.swing.GroupLayout(deleteProductPane);
        deleteProductPane.setLayout(deleteProductPaneLayout);
        deleteProductPaneLayout.setHorizontalGroup(
            deleteProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteProductPaneLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(deleteProductNoTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteProductNoText, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addGap(105, 105, 105))
            .addGroup(deleteProductPaneLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(deleteProductButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        deleteProductPaneLayout.setVerticalGroup(
            deleteProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteProductPaneLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(deleteProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteProductNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteProductNoTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteProductButton)
                .addGap(45, 45, 45))
        );

        productActionTab.addTab("Delete", deleteProductPane);

        javax.swing.GroupLayout productTabLayout = new javax.swing.GroupLayout(productTab);
        productTab.setLayout(productTabLayout);
        productTabLayout.setHorizontalGroup(
            productTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshProductButton)
                .addGap(154, 154, 154))
            .addGroup(productTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(productTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productActionTab, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        productTabLayout.setVerticalGroup(
            productTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(refreshProductButton)
                .addGap(18, 18, 18)
                .addComponent(productActionTab, javax.swing.GroupLayout.PREFERRED_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );

        productTabbedPane.addTab("Product", productTab);

        showProductAssembleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product#", "Part#"
            }
        ));
        productAssembleScrollPane.setViewportView(showProductAssembleTable);

        refreshProductAssembleButton.setText("Refresh");

        addProductAssemblePrNoTitle.setText("Product#");

        addProductAssemblePartNoTitle.setText("Part#");

        addProductAssembleButton.setText("Add");

        javax.swing.GroupLayout addProductAssemblePaneLayout = new javax.swing.GroupLayout(addProductAssemblePane);
        addProductAssemblePane.setLayout(addProductAssemblePaneLayout);
        addProductAssemblePaneLayout.setHorizontalGroup(
            addProductAssemblePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addProductAssemblePaneLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(addProductAssemblePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addProductAssemblePartNoTitle)
                    .addComponent(addProductAssemblePrNoTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addProductAssemblePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addProductAssemblePartNoText, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(addProductAssemblePartnoText)
                    .addGroup(addProductAssemblePaneLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(addProductAssembleButton)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        addProductAssemblePaneLayout.setVerticalGroup(
            addProductAssemblePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addProductAssemblePaneLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(addProductAssemblePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addProductAssemblePrNoTitle)
                    .addComponent(addProductAssemblePartnoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addProductAssemblePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addProductAssemblePartNoTitle)
                    .addComponent(addProductAssemblePartNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addProductAssembleButton)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        productAssembleActionTab.addTab("Add", addProductAssemblePane);

        updateproductAssemblePrNoTitle.setText("Product#");

        updateProductAssemblePartNoTitle.setText("Part#");

        updateProductAssembleButton.setText("Update");

        javax.swing.GroupLayout updateProductAssemblePaneLayout = new javax.swing.GroupLayout(updateProductAssemblePane);
        updateProductAssemblePane.setLayout(updateProductAssemblePaneLayout);
        updateProductAssemblePaneLayout.setHorizontalGroup(
            updateProductAssemblePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateProductAssemblePaneLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(updateProductAssemblePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateProductAssemblePaneLayout.createSequentialGroup()
                        .addGroup(updateProductAssemblePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(updateProductAssemblePartNoTitle)
                            .addComponent(updateproductAssemblePrNoTitle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(updateProductAssemblePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updateProductAssemblePartNoText)
                            .addComponent(updateProductAssemblePrNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(updateProductAssemblePaneLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(updateProductAssembleButton)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        updateProductAssemblePaneLayout.setVerticalGroup(
            updateProductAssemblePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateProductAssemblePaneLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(updateProductAssemblePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateProductAssemblePrNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateproductAssemblePrNoTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(updateProductAssemblePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateProductAssemblePartNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateProductAssemblePartNoTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateProductAssembleButton)
                .addGap(39, 39, 39))
        );

        productAssembleActionTab.addTab("Update", updateProductAssemblePane);

        deleteProductAssemblePrNoTitle.setText("Product#");

        deleteProductAssembleButton.setText("Delete");

        javax.swing.GroupLayout deleteProductAssemblePaneLayout = new javax.swing.GroupLayout(deleteProductAssemblePane);
        deleteProductAssemblePane.setLayout(deleteProductAssemblePaneLayout);
        deleteProductAssemblePaneLayout.setHorizontalGroup(
            deleteProductAssemblePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteProductAssemblePaneLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(deleteProductAssemblePrNoTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteProductAssemblePrNoText, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(105, 105, 105))
            .addGroup(deleteProductAssemblePaneLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(deleteProductAssembleButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        deleteProductAssemblePaneLayout.setVerticalGroup(
            deleteProductAssemblePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteProductAssemblePaneLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(deleteProductAssemblePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteProductAssemblePrNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteProductAssemblePrNoTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteProductAssembleButton)
                .addGap(45, 45, 45))
        );

        productAssembleActionTab.addTab("Delete", deleteProductAssemblePane);

        javax.swing.GroupLayout productAssembleTabLayout = new javax.swing.GroupLayout(productAssembleTab);
        productAssembleTab.setLayout(productAssembleTabLayout);
        productAssembleTabLayout.setHorizontalGroup(
            productAssembleTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productAssembleTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshProductAssembleButton)
                .addGap(154, 154, 154))
            .addGroup(productAssembleTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(productAssembleTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productAssembleScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productAssembleActionTab, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        productAssembleTabLayout.setVerticalGroup(
            productAssembleTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productAssembleTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productAssembleScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(refreshProductAssembleButton)
                .addGap(18, 18, 18)
                .addComponent(productAssembleActionTab, javax.swing.GroupLayout.PREFERRED_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );

        productTabbedPane.addTab("Product Assemble", productAssembleTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(productTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productTabbedPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productTitle)
                .addGap(18, 18, 18)
                .addComponent(productTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addPartDescriptionTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPartDescriptionTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addPartDescriptionTextActionPerformed

    private void addPartCostTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPartCostTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addPartCostTextActionPerformed

    private void addPartMachineTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPartMachineTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addPartMachineTextActionPerformed

    private void addPartEmployeeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPartEmployeeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addPartEmployeeTextActionPerformed

    private void updatePartCostTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePartCostTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatePartCostTextActionPerformed

    private void updatePartNoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePartNoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatePartNoTextActionPerformed

    private void updatePartDescriptionTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePartDescriptionTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatePartDescriptionTextActionPerformed

    private void deletePartNoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePartNoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletePartNoTextActionPerformed

    private void partRefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partRefreshButtonActionPerformed
        // TODO add your handling code here:
        try {
            showParts();  
        } catch (Exception ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }     
    }//GEN-LAST:event_partRefreshButtonActionPerformed

    private void addPartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPartButtonActionPerformed
        // TODO add your handling code here:
         try {
            addPart();
        } catch (Exception ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }//GEN-LAST:event_addPartButtonActionPerformed

    private void updatePartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePartButtonActionPerformed
        // TODO add your handling code here:
         try {
            updatePart();
        } catch (Exception ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }//GEN-LAST:event_updatePartButtonActionPerformed

    private void deletePartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePartButtonActionPerformed
        // TODO add your handling code here:
         try {
            deletePart();
        } catch (Exception ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }//GEN-LAST:event_deletePartButtonActionPerformed

    private void refreshProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshProductButtonActionPerformed
        // TODO add your handling code here:
         try {
            showProducts();  
        } catch (Exception ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }     
    }//GEN-LAST:event_refreshProductButtonActionPerformed

    private void addProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductButtonActionPerformed
        // TODO add your handling code here:
          try {
            addProduct();  
        } catch (Exception ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }     
    }//GEN-LAST:event_addProductButtonActionPerformed

    private void updateProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProductButtonActionPerformed
        // TODO add your handling code here:
         try {
            updateProduct();  
        } catch (Exception ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }     
    }//GEN-LAST:event_updateProductButtonActionPerformed

    private void deleteProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProductButtonActionPerformed
        // TODO add your handling code here:
         try {
            deleteProduct();  
        } catch (Exception ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }     
    }//GEN-LAST:event_deleteProductButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addPanel;
    private javax.swing.JButton addPartButton;
    private javax.swing.JTextField addPartCostText;
    private javax.swing.JLabel addPartCostTitle;
    private javax.swing.JTextField addPartDescriptionText;
    private javax.swing.JLabel addPartDescriptionTitle;
    private javax.swing.JTextField addPartEmployeeText;
    private javax.swing.JLabel addPartEmployeeTitle;
    private javax.swing.JTextField addPartMachineText;
    private javax.swing.JLabel addPartMachineTitle;
    private javax.swing.JButton addProductAssembleButton;
    private javax.swing.JPanel addProductAssemblePane;
    private javax.swing.JTextField addProductAssemblePartNoText;
    private javax.swing.JLabel addProductAssemblePartNoTitle;
    private javax.swing.JTextField addProductAssemblePartnoText;
    private javax.swing.JLabel addProductAssemblePrNoTitle;
    private javax.swing.JButton addProductButton;
    private javax.swing.JTextField addProductCostText;
    private javax.swing.JLabel addProductCostTitle;
    private javax.swing.JTextField addProductNameText;
    private javax.swing.JLabel addProductNameTitle;
    private javax.swing.JPanel addProductPane;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JButton deletePartButton;
    private javax.swing.JTextField deletePartNoText;
    private javax.swing.JLabel deletePartNoTitle;
    private javax.swing.JButton deleteProductAssembleButton;
    private javax.swing.JPanel deleteProductAssemblePane;
    private javax.swing.JTextField deleteProductAssemblePrNoText;
    private javax.swing.JLabel deleteProductAssemblePrNoTitle;
    private javax.swing.JButton deleteProductButton;
    private javax.swing.JTextField deleteProductNoText;
    private javax.swing.JLabel deleteProductNoTitle;
    private javax.swing.JPanel deleteProductPane;
    private javax.swing.JTabbedPane partActionTab;
    private javax.swing.JButton partRefreshButton;
    private javax.swing.JScrollPane partScrollPane;
    private javax.swing.JPanel partTab;
    private javax.swing.JTabbedPane productActionTab;
    private javax.swing.JTabbedPane productAssembleActionTab;
    private javax.swing.JScrollPane productAssembleScrollPane;
    private javax.swing.JPanel productAssembleTab;
    private javax.swing.JScrollPane productScrollPane;
    private javax.swing.JPanel productTab;
    private javax.swing.JTabbedPane productTabbedPane;
    private javax.swing.JLabel productTitle;
    private javax.swing.JButton refreshProductAssembleButton;
    private javax.swing.JButton refreshProductButton;
    private javax.swing.JTable showPartTable;
    private javax.swing.JTable showProductAssembleTable;
    private javax.swing.JTable showProductTable;
    private javax.swing.JPanel updatePanel;
    private javax.swing.JButton updatePartButton;
    private javax.swing.JTextField updatePartCostText;
    private javax.swing.JLabel updatePartCostTitle;
    private javax.swing.JTextField updatePartDescriptionText;
    private javax.swing.JLabel updatePartDescriptionTitle;
    private javax.swing.JTextField updatePartNoText;
    private javax.swing.JLabel updatePartNoTitle;
    private javax.swing.JButton updateProductAssembleButton;
    private javax.swing.JPanel updateProductAssemblePane;
    private javax.swing.JTextField updateProductAssemblePartNoText;
    private javax.swing.JLabel updateProductAssemblePartNoTitle;
    private javax.swing.JTextField updateProductAssemblePrNoText;
    private javax.swing.JButton updateProductButton;
    private javax.swing.JTextField updateProductCostText;
    private javax.swing.JTextField updateProductNameText;
    private javax.swing.JTextField updateProductNoText;
    private javax.swing.JLabel updateProductNoTitle;
    private javax.swing.JPanel updateProductPane;
    private javax.swing.JLabel updateProducteCostTitle;
    private javax.swing.JLabel updateproductAssemblePrNoTitle;
    private javax.swing.JLabel updateproductNameTitle;
    // End of variables declaration//GEN-END:variables
}
