/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Abhishek
 */
public class CreatePanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePanel
     */
    private Car car;

    public CreatePanel(Car car) {
        initComponents();
        this.car = car;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        descriptionTextFiled = new javax.swing.JTextField();
        isAutomaticTextField = new javax.swing.JTextField();
        dimensionsTextField = new javax.swing.JTextField();
        hasSpoilersTextField = new javax.swing.JTextField();
        hasSeaterWarmerTextFiled = new javax.swing.JTextField();
        isConvertibleTextField = new javax.swing.JTextField();
        isTwoSeaterTextField = new javax.swing.JTextField();
        isFourWheelDriveTextField = new javax.swing.JTextField();
        isSportsCarTextField = new javax.swing.JTextField();
        colorTextField = new javax.swing.JTextField();
        warrantyTextField = new javax.swing.JTextField();
        manufacturerTextField = new javax.swing.JTextField();
        engineTextField = new javax.swing.JTextField();
        modelTextField = new javax.swing.JTextField();
        carNameTextField = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        uploadImage = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));
        setMaximumSize(new java.awt.Dimension(30000, 30000));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Car Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Model");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Manufacturer");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Engine Type");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Warranty");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Color");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Sports Car?");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("4WD?");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Two Seater?");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Convertible?");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Seat Warmers?");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("Spoilers?");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("Dimensions");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("Automatic?");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setText("Description");

        hasSpoilersTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasSpoilersTextFieldActionPerformed(evt);
            }
        });

        hasSeaterWarmerTextFiled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasSeaterWarmerTextFiledActionPerformed(evt);
            }
        });

        isTwoSeaterTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isTwoSeaterTextFieldActionPerformed(evt);
            }
        });

        isFourWheelDriveTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isFourWheelDriveTextFieldActionPerformed(evt);
            }
        });

        isSportsCarTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isSportsCarTextFieldActionPerformed(evt);
            }
        });

        colorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorTextFieldActionPerformed(evt);
            }
        });

        warrantyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warrantyTextFieldActionPerformed(evt);
            }
        });

        manufacturerTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manufacturerTextFieldActionPerformed(evt);
            }
        });

        engineTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                engineTextFieldActionPerformed(evt);
            }
        });

        modelTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelTextFieldActionPerformed(evt);
            }
        });

        createBtn.setBackground(new java.awt.Color(51, 153, 0));
        createBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Create A Car");

        uploadImage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        uploadImage.setText("Upload Image");
        uploadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadImageActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("Car Image");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(402, 402, 402)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14)
                            .addComponent(jLabel11)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel15)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6))
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(isFourWheelDriveTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(uploadImage))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hasSeaterWarmerTextFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(warrantyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(engineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isAutomaticTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isTwoSeaterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isSportsCarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hasSpoilersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(colorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manufacturerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionTextFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dimensionsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isConvertibleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(manufacturerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(dimensionsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(colorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(isConvertibleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasSeaterWarmerTextFiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(isFourWheelDriveTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uploadImage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(hasSpoilersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(isSportsCarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(isTwoSeaterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(isAutomaticTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(engineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(descriptionTextFiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(warrantyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createBtn))
                .addContainerGap(217, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void hasSpoilersTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasSpoilersTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasSpoilersTextFieldActionPerformed

    private void hasSeaterWarmerTextFiledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasSeaterWarmerTextFiledActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasSeaterWarmerTextFiledActionPerformed

    private void isFourWheelDriveTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isFourWheelDriveTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isFourWheelDriveTextFieldActionPerformed

    private void isSportsCarTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isSportsCarTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isSportsCarTextFieldActionPerformed

    private void colorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colorTextFieldActionPerformed

    private void warrantyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warrantyTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_warrantyTextFieldActionPerformed

    private void manufacturerTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manufacturerTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manufacturerTextFieldActionPerformed

    private void engineTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_engineTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_engineTextFieldActionPerformed

    private void modelTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelTextFieldActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        car.setCarName(carNameTextField.getText().trim());
        car.setColor(colorTextField.getText().trim());
        car.setDescription(descriptionTextFiled.getText().trim());
        car.setDimensions(dimensionsTextField.getText().trim());
        car.setEngineType(engineTextField.getText().trim());
        car.setHasSeatWarmers(hasSeaterWarmerTextFiled.getText().trim());
        car.setHasSpoilers(hasSpoilersTextField.getText().trim());
        car.setIsAutomatic(isAutomaticTextField.getText().trim());
        car.setIsConvertible(isConvertibleTextField.getText().trim());
        car.setIsFourWheelDrive(isFourWheelDriveTextField.getText().trim());
        car.setIsSports(isSportsCarTextField.getText().trim());
        car.setIsTwoSeater(isTwoSeaterTextField.getText().trim());
        car.setManufacturerName(manufacturerTextField.getText().trim());
        car.setModel(modelTextField.getText().trim());
        car.setProductionWarranty(warrantyTextField.getText().trim());
        JOptionPane.showMessageDialog(null, "Succesfully created a car!!!");
    }//GEN-LAST:event_createBtnActionPerformed

    private void isTwoSeaterTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isTwoSeaterTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isTwoSeaterTextFieldActionPerformed

    private void uploadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadImageActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("jpg", "png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            if (null != path) {
                car.setImagePath(path);
            }
        } else if (result == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "No Image Selected");
        }

    }//GEN-LAST:event_uploadImageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField carNameTextField;
    private javax.swing.JTextField colorTextField;
    private javax.swing.JButton createBtn;
    private javax.swing.JTextField descriptionTextFiled;
    private javax.swing.JTextField dimensionsTextField;
    private javax.swing.JTextField engineTextField;
    private javax.swing.JTextField hasSeaterWarmerTextFiled;
    private javax.swing.JTextField hasSpoilersTextField;
    private javax.swing.JTextField isAutomaticTextField;
    private javax.swing.JTextField isConvertibleTextField;
    private javax.swing.JTextField isFourWheelDriveTextField;
    private javax.swing.JTextField isSportsCarTextField;
    private javax.swing.JTextField isTwoSeaterTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField manufacturerTextField;
    private javax.swing.JTextField modelTextField;
    private javax.swing.JButton uploadImage;
    private javax.swing.JTextField warrantyTextField;
    // End of variables declaration//GEN-END:variables
}