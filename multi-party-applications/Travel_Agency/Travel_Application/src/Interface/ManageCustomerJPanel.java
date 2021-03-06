/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Customer;
import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author aelinadas
 */
public class ManageCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomerJPanel
     */
    private JPanel displayPanel;
    private TravelAgency travelAgency;
    private Customer customer;
    ManageCustomerJPanel(TravelAgency travelAgency, JPanel displayPanel) {
        initComponents();
        this.displayPanel = displayPanel;
        this.travelAgency = travelAgency;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        btnFlightView = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnViewTicket = new javax.swing.JButton();

        btnAdd.setText("Add Customer");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnFlightView.setText("View Flight Schedule");
        btnFlightView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlightViewActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD CUSTOMER / BOOK A SEAT");
        jLabel1.setToolTipText("");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnViewTicket.setText("View Ticket");
        btnViewTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnFlightView, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(275, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnFlightView, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnViewTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(402, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        CustomerSignupJPanel customerSignupJPanel = new CustomerSignupJPanel(travelAgency, displayPanel);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        displayPanel.add("CustomerSignupJPanel", customerSignupJPanel);
        layout.next(displayPanel);
                        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnFlightViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlightViewActionPerformed
        // TODO add your handling code here:
        FlightScheduleJPanel flightScheduleJPanel = new FlightScheduleJPanel(travelAgency,displayPanel,"Customer");
        displayPanel.add("FlightScheduleJPanel", flightScheduleJPanel);
        CardLayout cardLayout = (CardLayout) displayPanel.getLayout();
        cardLayout.next(displayPanel);
    }//GEN-LAST:event_btnFlightViewActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        displayPanel.remove(this);
        CardLayout cardLayout = (CardLayout)displayPanel.getLayout();
        cardLayout.previous(displayPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTicketActionPerformed
        // TODO add your handling code here
        TicketIdCheckJPanel ticketIdCheckJPanel = new TicketIdCheckJPanel(travelAgency, displayPanel);
        displayPanel.add("TicketIdCheckJPanel", ticketIdCheckJPanel);
        CardLayout cardLayout = (CardLayout) displayPanel.getLayout();
        cardLayout.next(displayPanel);
    }//GEN-LAST:event_btnViewTicketActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFlightView;
    private javax.swing.JButton btnViewTicket;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
