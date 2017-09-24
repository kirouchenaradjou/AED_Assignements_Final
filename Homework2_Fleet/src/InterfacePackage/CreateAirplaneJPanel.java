/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacePackage;

import BusinessPackage.Airplane;
import BusinessPackage.Fleet;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ragha
 */
public class CreateAirplaneJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateAirplaneJPanel
     */
    private Fleet fleet;
    public CreateAirplaneJPanel(Fleet fleet) {
        
        initComponents();
        //Button Group for Availability Status
        buttonGroupForAvailability.add(availableRadioButton);
        buttonGroupForAvailability.add(notAvailableRadioButton);
        //Button Group for Maintanance Certficate Expiry Status
        buttonGroupForCertificate.add(expiredRadioButton);
        buttonGroupForCertificate.add(validRadioButton);
        this.fleet=fleet;
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupForAvailability = new javax.swing.ButtonGroup();
        buttonGroupForCertificate = new javax.swing.ButtonGroup();
        createLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        manufacturerTextField = new javax.swing.JTextField();
        seatsTextField = new javax.swing.JTextField();
        serialNumTextField = new javax.swing.JTextField();
        modelTextField = new javax.swing.JTextField();
        manufactureDateTxt = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        availableRadioButton = new javax.swing.JRadioButton();
        notAvailableRadioButton = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        expiredRadioButton = new javax.swing.JRadioButton();
        validRadioButton = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        airplaneName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        airportComboBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        createLabel.setText("Create Airplane Entry");
        createLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(createLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 400, -1));

        jLabel1.setText("Manufacturer");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel2.setText("No of seats");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel3.setText("Serial Number");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        jLabel4.setText("Model Number");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        jLabel5.setText("Manufacture Date");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, -1, -1));
        add(manufacturerTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 280, -1));
        add(seatsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 280, -1));
        add(serialNumTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 280, -1));
        add(modelTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 280, -1));
        add(manufactureDateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 280, -1));

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 850, -1, -1));

        availableRadioButton.setText("Yes");
        availableRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableRadioButtonActionPerformed(evt);
            }
        });
        add(availableRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, -1, -1));

        notAvailableRadioButton.setText("No");
        add(notAvailableRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 480, -1, -1));

        jLabel6.setText("Availability");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, -1, -1));

        jLabel7.setText("Maintanence Certificate");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, -1, -1));

        expiredRadioButton.setText("Expired");
        add(expiredRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, -1, -1));

        validRadioButton.setText("Valid");
        add(validRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, -1, -1));

        jLabel8.setText("Name");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));
        add(airplaneName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 280, -1));

        jLabel9.setText("Airport");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, -1, -1));

        airportComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dallas/Fort Worth International Airport", "Logan International Airport", "LaGuardia Airport", "Washington Dulles International Airport", "San Francisco International Airport", "John F. Kennedy International Airport", "Los Angeles International Airport", " " }));
        add(airportComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, 280, -1));

        jLabel10.setText("Date Of Availability");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 640, -1, -1));
        add(jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 640, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // Save it in the ArrayList of type Airplane
         DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Airplane airplane = fleet.addAirplane();
        try {
            airplane.setAirplaneManufactureDate(df.parse(manufactureDateTxt.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(CreateAirplaneJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        airplane.setAirplaneName(airplaneName.getText());
        airplane.setAirplaneManufacturer(manufacturerTextField.getText());
        airplane.setAirplaneModelNum(modelTextField.getText());
        airplane.setAirplaneSeats(Integer.parseInt(seatsTextField.getText()));
        airplane.setAirplaneSerialNum(serialNumTextField.getText());
       // airplane.setAvailabityDate(jDateChooser.getDate());
          //     System.out.println(jDateChooser.getDate());

        if(availableRadioButton.isSelected())
        {
                    airplane.setIsAvailable(Boolean.TRUE);

        }
        else
        {
            airplane.setIsAvailable(Boolean.FALSE);
        }
        if(expiredRadioButton.isSelected())
        {
        airplane.setIsExpired(Boolean.TRUE);
        }
        else{
                    airplane.setIsExpired(Boolean.FALSE);

        }
        airplane.setAirportName(airportComboBox.getSelectedItem().toString());
        airplane.setAvailabityDate(jDateChooser.getDate());
        System.out.println(airplane.getAvailabityDate());
        JOptionPane.showMessageDialog(null, "Airplane Entry Added");
         
        airplaneName.setText("");
        manufacturerTextField.setText("");
        modelTextField.setText("");
        seatsTextField.setText("");
        serialNumTextField.setText("");
        manufactureDateTxt.setText("");
        buttonGroupForAvailability.clearSelection();
        buttonGroupForCertificate.clearSelection();
        airportComboBox.setSelectedIndex(0);
     jDateChooser.setDate(null);
    }//GEN-LAST:event_submitButtonActionPerformed

    private void availableRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availableRadioButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airplaneName;
    private javax.swing.JComboBox<String> airportComboBox;
    private javax.swing.JRadioButton availableRadioButton;
    private javax.swing.ButtonGroup buttonGroupForAvailability;
    private javax.swing.ButtonGroup buttonGroupForCertificate;
    private javax.swing.JLabel createLabel;
    private javax.swing.JRadioButton expiredRadioButton;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField manufactureDateTxt;
    private javax.swing.JTextField manufacturerTextField;
    private javax.swing.JTextField modelTextField;
    private javax.swing.JRadioButton notAvailableRadioButton;
    private javax.swing.JTextField seatsTextField;
    private javax.swing.JTextField serialNumTextField;
    private javax.swing.JButton submitButton;
    private javax.swing.JRadioButton validRadioButton;
    // End of variables declaration//GEN-END:variables
}
