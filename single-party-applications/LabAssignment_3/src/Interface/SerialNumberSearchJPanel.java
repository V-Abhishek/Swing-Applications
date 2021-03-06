/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import Business.FleetOfCars;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */
public class SerialNumberSearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SerialNumberSearchJPanel
     */
    private JPanel userProcessContainer;
    private FleetOfCars fleetOfCars;
    private ArrayList<Car> tempList = new ArrayList<Car>();

    SerialNumberSearchJPanel(JPanel userProcessContainer, FleetOfCars fleetOfCars) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.fleetOfCars = fleetOfCars;
    }

    public void populate(ArrayList<Car> populateList) {
        DefaultTableModel defaultTableModel = (DefaultTableModel) serialNumberJTable.getModel();
        defaultTableModel.setRowCount(0);
        for (Car car : populateList) {
            Object[] row = new Object[6];
            row[0] = car;
            row[1] = car.getCityOfOrigin();
            row[2] = car.getManufacturer();
            row[3] = car.getModelNumber();
            row[4] = car.getSerialNumber();
            if (car.isAvailability()) {
                row[5] = "Available";
            } else {
                row[5] = "Not Available";
            }
            defaultTableModel.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        serialNumberSearchTextField = new javax.swing.JTextField();
        searchSerialNumberBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        serialNumberJTable = new javax.swing.JTable();
        viewCarDetailsBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        modelNumberSearchTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        availabilityCheckBox = new javax.swing.JCheckBox();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("SEARCH BY SERIAL/MODEL NUMBER");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("Serial Number:");

        serialNumberSearchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                serialNumberSearchTextFieldKeyTyped(evt);
            }
        });

        searchSerialNumberBtn.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        searchSerialNumberBtn.setText("Search");
        searchSerialNumberBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchSerialNumberBtnActionPerformed(evt);
            }
        });

        serialNumberJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car Name", "City", "Manufacturer", "Model Number", "Serial Number", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(serialNumberJTable);

        viewCarDetailsBtn.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        viewCarDetailsBtn.setText("View Car Details");
        viewCarDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCarDetailsBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(0, 0, 0));
        backBtn.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("<< BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setText("Model Number:");

        modelNumberSearchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modelNumberSearchTextFieldKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("Show Only Availabile:");

        availabilityCheckBox.setText("Yes");
        availabilityCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availabilityCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(availabilityCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151)
                .addComponent(viewCarDetailsBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(modelNumberSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(serialNumberSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(76, 76, 76)
                                .addComponent(searchSerialNumberBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(backBtn)
                                .addGap(152, 152, 152)
                                .addComponent(jLabel1)))
                        .addGap(0, 208, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(backBtn))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serialNumberSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modelNumberSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(searchSerialNumberBtn)
                        .addGap(34, 34, 34)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(availabilityCheckBox)
                    .addComponent(viewCarDetailsBtn))
                .addContainerGap(210, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchSerialNumberBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSerialNumberBtnActionPerformed
        // TODO add your handling code here:
        int serialNumber = 0;
        int modelNumber = 0;
        if (!serialNumberSearchTextField.getText().equals("") && !modelNumberSearchTextField.getText().equals("")) {
            serialNumber = Integer.parseInt(serialNumberSearchTextField.getText().trim());
            modelNumber = Integer.parseInt(modelNumberSearchTextField.getText().trim());
            tempList = fleetOfCars.searchBySerialModelNumber(serialNumber, modelNumber);
            if (tempList != null) {
                populate(tempList);
            } else {
                JOptionPane.showMessageDialog(null, "No Car Exist with Model Number " + modelNumber + " and Serial Number " + serialNumber);
            }
        } else if (!serialNumberSearchTextField.getText().equals("")) {
            serialNumber = Integer.parseInt(serialNumberSearchTextField.getText().trim());
            tempList = fleetOfCars.searchBySerialNumber(serialNumber);
            if (tempList != null) {
                populate(tempList);
            } else {
                JOptionPane.showMessageDialog(null, "No Car Exist with Serial Number " + serialNumber);
            }
        } else if (!modelNumberSearchTextField.getText().equals("")) {
            modelNumber = Integer.parseInt(modelNumberSearchTextField.getText().trim());
            tempList = fleetOfCars.searchByModelNumber(modelNumber);
            if (tempList != null) {
                populate(tempList);
            } else {
                JOptionPane.showMessageDialog(null, "No Car Exist with Model Number " + modelNumber);
            }
        } else {
            if (serialNumberSearchTextField.getText().equals("") && modelNumberSearchTextField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please input either Model Number or Serial Number");
            }

        }
    }//GEN-LAST:event_searchSerialNumberBtnActionPerformed

    private void viewCarDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCarDetailsBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = serialNumberJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select A Row", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Car car = (Car) serialNumberJTable.getValueAt(selectedRow, 0);
            SearchViewJPanel searchViewJPanel = new SearchViewJPanel(userProcessContainer, car);
            userProcessContainer.add("SearchViewJPanel", searchViewJPanel);
            CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
            cardLayout.next(userProcessContainer);
        }
    }//GEN-LAST:event_viewCarDetailsBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void serialNumberSearchTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serialNumberSearchTextFieldKeyTyped
        // TODO add your handling code here:
        char enteredChar = evt.getKeyChar();
        if (!Character.isDigit(enteredChar) || (enteredChar == KeyEvent.VK_BACK_SPACE) || (enteredChar == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_serialNumberSearchTextFieldKeyTyped

    private void modelNumberSearchTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modelNumberSearchTextFieldKeyTyped
        // TODO add your handling code here:
        char enteredChar = evt.getKeyChar();
        if (!Character.isDigit(enteredChar) || (enteredChar == KeyEvent.VK_BACK_SPACE) || (enteredChar == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_modelNumberSearchTextFieldKeyTyped

    private void availabilityCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availabilityCheckBoxActionPerformed
        // TODO add your handling code here:
        if (availabilityCheckBox.isSelected()) {
            if (tempList != null && !tempList.isEmpty()) {
                ArrayList<Car> secondaryList = new ArrayList<Car>();
                for (Car car : tempList) {
                    if (car.isAvailability()) {
                        secondaryList.add(car);
                    }
                }
                if (secondaryList != null && !secondaryList.isEmpty()) {
                    populate(secondaryList);
                } else {
                    JOptionPane.showMessageDialog(null, "Sorry!! There are no cars available under this category.");
                    availabilityCheckBox.setSelected(false);
                }
            }

        } else {
            searchSerialNumberBtnActionPerformed(evt);
        }
    }//GEN-LAST:event_availabilityCheckBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox availabilityCheckBox;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField modelNumberSearchTextField;
    private javax.swing.JButton searchSerialNumberBtn;
    private javax.swing.JTable serialNumberJTable;
    private javax.swing.JTextField serialNumberSearchTextField;
    private javax.swing.JButton viewCarDetailsBtn;
    // End of variables declaration//GEN-END:variables
}
