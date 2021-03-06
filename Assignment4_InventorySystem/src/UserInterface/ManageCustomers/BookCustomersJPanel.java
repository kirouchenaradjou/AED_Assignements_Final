/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomers;

import Business.Customer;
import Business.Flight;
import UserInterface_ManageAirline.ViewAirlinerJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class BookCustomersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookCustomersJPanel
     */
    JPanel userContainer;
    private Flight flight;
    private  Customer customer ;

    public BookCustomersJPanel(JPanel userProcessContainer, Flight flight) {
        initComponents();
        this.userContainer = userProcessContainer;
        this.flight = flight;
        populatetheBookedFlightDetails();
    }

    public void populatetheBookedFlightDetails() {
        airlineNameLabel.setText(flight.getAirlineName());
        sourceLabel.setText(flight.getSource());
        destinationLabel.setText(flight.getDestination());
        depTimeLabel.setText(flight.getDeptTime().toString());
        arrivalTimeLabel.setText(flight.getArrivalTime().toString());
        seatsTextLabel.setText(String.valueOf(flight.getSeat().getNumOfSeats()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bookFlightButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        customerFirstName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        airlineNameLabel = new javax.swing.JLabel();
        arrivalTimeLabel = new javax.swing.JLabel();
        depTimeLabel = new javax.swing.JLabel();
        destinationLabel = new javax.swing.JLabel();
        sourceLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lastNameText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        customerContactText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        passportNum = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        seatsTextLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        custSeats = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Airliner:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 90, -1));

        jLabel3.setText("Source: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 90, -1));

        jLabel5.setText("Destination:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 90, -1));

        jLabel7.setText("Departure Time:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 130, -1));

        jLabel8.setText("Arrival Time:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 153));
        jLabel9.setText("Customer Details");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        bookFlightButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        bookFlightButton.setForeground(new java.awt.Color(0, 0, 102));
        bookFlightButton.setText("Book the flight");
        bookFlightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookFlightButtonActionPerformed(evt);
            }
        });
        add(bookFlightButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 660, -1, 40));

        jLabel10.setText("First Name");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, -1));
        add(customerFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 150, -1));

        jLabel12.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Book Flight for the Customer");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        backButton.setBackground(new java.awt.Color(0, 153, 153));
        backButton.setForeground(new java.awt.Color(102, 0, 102));
        backButton.setText("<<Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));
        add(airlineNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 80, 20));
        add(arrivalTimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 80, 20));
        add(depTimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 80, 20));
        add(destinationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 80, 20));
        add(sourceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 80, 20));

        jLabel2.setText("Last Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, -1, -1));
        add(lastNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 150, -1));

        jLabel4.setText("Contact Number");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, -1, -1));
        add(customerContactText, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 150, -1));

        jLabel6.setText("Passport Number");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, -1, -1));
        add(passportNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, 150, -1));

        jLabel11.setText("Availabe Seats:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, -1));
        add(seatsTextLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 80, 20));

        jLabel13.setText("Num Of Seats");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 600, -1, -1));
        add(custSeats, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 600, 150, -1));

        jButton1.setText("View Ticket Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 670, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userContainer.remove(this);
        CardLayout layout = (CardLayout) userContainer.getLayout();
        layout.previous(userContainer);

    }//GEN-LAST:event_backButtonActionPerformed

    private void bookFlightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookFlightButtonActionPerformed
        // TODO add your handling code here:
        try
        {
        if (customerFirstName.getText() == null || lastNameText.getText() == null  || customerContactText.getText() == null || passportNum.getText() == null || 
                     custSeats.getText() == null) {
                JOptionPane.showMessageDialog(null, "Enter all the details", "Warning", JOptionPane.WARNING_MESSAGE);
                
            } 
            else if ((Integer.parseInt(custSeats.getText()) <= 0) ) {
                JOptionPane.showMessageDialog(null, "Seat cannot be negative or 0", "Warning", JOptionPane.WARNING_MESSAGE);

            }
        else
            {
         customer = flight.addCustomer();
        customer.setCustomerFirstName(customerFirstName.getText());
        customer.setCustomerLastName(lastNameText.getText());
        customer.setMobileNum(customerContactText.getText());
        customer.setPassportNum(passportNum.getText());
        customer.setNumberOfSeats(Integer.parseInt(custSeats.getText()));
        int finalSeat = flight.getSeat().getNumOfSeats() - Integer.parseInt(custSeats.getText());
        flight.getSeat().setNumOfSeats(finalSeat);
        customer.setFlight(flight);
        //Go ahead and view the Ticket
        if (Integer.parseInt(custSeats.getText()) > finalSeat) {
                    JOptionPane.showMessageDialog(null, "Number of seats available is less" , "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            EticketJPanel eticketJPanel = new EticketJPanel(userContainer, customer);
            userContainer.add("EticketJPanel", eticketJPanel);
            CardLayout layout = (CardLayout) userContainer.getLayout();
            layout.next(userContainer);
        }
            }
        }
        catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Seat should be numeric");
            
        } 
    }//GEN-LAST:event_bookFlightButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(customer!=null)
        {
        EticketJPanel eticketJPanel= new EticketJPanel(userContainer, customer);
            userContainer.add("EticketJPanel", eticketJPanel);
            CardLayout cardLayout = (CardLayout) userContainer.getLayout();
            cardLayout.next(userContainer);
        }
        else
        {
                                JOptionPane.showMessageDialog(null, "No Booking under your name" , "Warning", JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel airlineNameLabel;
    private javax.swing.JLabel arrivalTimeLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JButton bookFlightButton;
    private javax.swing.JTextField custSeats;
    private javax.swing.JTextField customerContactText;
    private javax.swing.JTextField customerFirstName;
    private javax.swing.JLabel depTimeLabel;
    private javax.swing.JLabel destinationLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JTextField passportNum;
    private javax.swing.JLabel seatsTextLabel;
    private javax.swing.JLabel sourceLabel;
    // End of variables declaration//GEN-END:variables

}
