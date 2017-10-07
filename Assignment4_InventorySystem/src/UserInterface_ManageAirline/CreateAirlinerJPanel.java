/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface_ManageAirline;

import Business.Airline;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ragha
 */
public class CreateAirlinerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateAirlinerJPanel
     */
   private JPanel userContainer;
   private TravelAgency airlineDirectory;
   
    public CreateAirlinerJPanel(JPanel userContainer, TravelAgency airlineDirectory) {
        initComponents();
        this.userContainer = userContainer;
        this.airlineDirectory = airlineDirectory;
        
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
        airlineName = new javax.swing.JLabel();
        numFlightsLabel = new javax.swing.JLabel();
        serialLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        airlineAddressText = new javax.swing.JTextField();
        airlinenumFlightsText = new javax.swing.JTextField();
        airlineSerialText = new javax.swing.JTextField();
        airlineNameText = new javax.swing.JTextField();
        airlinerSubmitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("Create Airliner");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        airlineName.setText("Airline Name");
        add(airlineName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 130, -1));

        numFlightsLabel.setText("Number Of Flights");
        add(numFlightsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 130, -1));

        serialLabel.setText("Serial Number");
        add(serialLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 130, -1));

        addressLabel.setText("Address");
        add(addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 130, -1));

        airlineAddressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlineAddressTextActionPerformed(evt);
            }
        });
        add(airlineAddressText, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 180, -1));
        add(airlinenumFlightsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 180, -1));
        add(airlineSerialText, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 180, -1));
        add(airlineNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 180, -1));

        airlinerSubmitButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        airlinerSubmitButton.setForeground(new java.awt.Color(0, 102, 102));
        airlinerSubmitButton.setText("Submit");
        airlinerSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlinerSubmitButtonActionPerformed(evt);
            }
        });
        add(airlinerSubmitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, -1, -1));

        backButton.setText("< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void airlineAddressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlineAddressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airlineAddressTextActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // Go to the previous page
        userContainer.remove(this);
        Component[] componentArray = userContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageAirlineJPanel manageAccountJPanel = (ManageAirlineJPanel) component;
        manageAccountJPanel.populateTable();
        CardLayout layout = (CardLayout) userContainer.getLayout();
        layout.previous(userContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void airlinerSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinerSubmitButtonActionPerformed
        // TODO add your handling code here:
                if(airlineAddressText.getText()==null || airlineNameText.getText() == null || airlineSerialText.getText() == null 
                || airlinenumFlightsText.getText() ==null  )
        {
                    JOptionPane.showMessageDialog(null, "Enter all the details" , "Warning", JOptionPane.WARNING_MESSAGE);

        }
        else
        {
        Airline airline = airlineDirectory.addAirline();
        airline.setName(airlineNameText.getText());
        airline.setNoOfFlights(Integer.parseInt(airlinenumFlightsText.getText()));
        airline.setSerialNum(airlineSerialText.getText());
        airline.setAddress(airlineAddressText.getText());
        JOptionPane.showMessageDialog(null, "Airline details added ! " , "Airline Creation", JOptionPane.INFORMATION_MESSAGE);
        }
                                                             

    }//GEN-LAST:event_airlinerSubmitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField airlineAddressText;
    private javax.swing.JLabel airlineName;
    private javax.swing.JTextField airlineNameText;
    private javax.swing.JTextField airlineSerialText;
    private javax.swing.JTextField airlinenumFlightsText;
    private javax.swing.JButton airlinerSubmitButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel numFlightsLabel;
    private javax.swing.JLabel serialLabel;
    // End of variables declaration//GEN-END:variables
}