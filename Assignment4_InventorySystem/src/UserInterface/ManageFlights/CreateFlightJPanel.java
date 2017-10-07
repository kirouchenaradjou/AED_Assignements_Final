/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageFlights;

import Business.Airline;
import Business.Fleet;
import Business.Flight;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;

/**
 *
 * @author ragha
 */
public class CreateFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateFlightJPanel
     */
    private JPanel userContainer;
   private TravelAgency airlineDirectory;
   ArrayList<String> airlineNameList = new ArrayList<String>();
    public CreateFlightJPanel(JPanel userContainer, TravelAgency airlineDirectory) {
        initComponents();
        this.userContainer = userContainer;
        this.airlineDirectory = airlineDirectory;
        for(Airline airline : airlineDirectory.getTravelAgency())
        {
             airlineNameList.add(airline.getName());
        }
        airlineComboBox.setModel(new DefaultComboBoxModel(airlineNameList.toArray()));
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
        flightNameText = new javax.swing.JTextField();
        flightNumText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        submitFlightButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        airlineComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        sourceText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        destText = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Flight Creation");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        flightNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightNameTextActionPerformed(evt);
            }
        });
        add(flightNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 170, -1));

        flightNumText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightNumTextActionPerformed(evt);
            }
        });
        add(flightNumText, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 170, -1));

        jLabel2.setText("Flight Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        jLabel3.setText("Flight Serial Number");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        jLabel4.setText("Airline Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        submitFlightButton.setText("Submit");
        submitFlightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitFlightButtonActionPerformed(evt);
            }
        });
        add(submitFlightButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, -1, -1));

        backButton.setText("< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        add(airlineComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 170, -1));

        jLabel5.setText("Destination");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 150, -1));

        sourceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceTextActionPerformed(evt);
            }
        });
        add(sourceText, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 170, -1));

        jLabel6.setText("Source");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 150, -1));

        destText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destTextActionPerformed(evt);
            }
        });
        add(destText, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void flightNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightNameTextActionPerformed

    private void flightNumTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightNumTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightNumTextActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // Go to the previous page
        userContainer.remove(this);
        Component[] componentArray = userContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageFlightJPanel manageFlightJPanel = (ManageFlightJPanel) component;
        manageFlightJPanel.populateTable();
        CardLayout layout = (CardLayout) userContainer.getLayout();
        layout.previous(userContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void submitFlightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitFlightButtonActionPerformed
        // TODO add your handling code here:
         Airline airline = airlineDirectory.searchAirline(airlineComboBox.getSelectedItem().toString());
         Fleet fleet = airline.getFleet();
         Flight flight = fleet.addAirplane();
         flight.setFlightName(flightNameText.getText());
         flight.setFlightSerialNum(flightNumText.getText());
         flight.setAirlineName(airlineComboBox.getSelectedItem().toString());
         flight.setDestination(destText.getText());
         flight.setSource(sourceText.getText());
    }//GEN-LAST:event_submitFlightButtonActionPerformed

    private void sourceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sourceTextActionPerformed

    private void destTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> airlineComboBox;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField destText;
    private javax.swing.JTextField flightNameText;
    private javax.swing.JTextField flightNumText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField sourceText;
    private javax.swing.JButton submitFlightButton;
    // End of variables declaration//GEN-END:variables
}
