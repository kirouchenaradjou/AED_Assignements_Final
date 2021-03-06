/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageTravelAgency;

import Business.Airline;
import Business.Flight;
import Business.TravelAgency;
import UserInterface.ForSearch.FoundFlightJPanel;
import java.awt.CardLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ragha
 */
public class ManageTravelAgencyJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageTravelAgencyJPanel
     */
    private JPanel userContainer;
    private TravelAgency airlineDirectory;
   ArrayList<String> airlineNameList = new ArrayList<String>();

    public ManageTravelAgencyJPanel(JPanel userContainer, TravelAgency airlineDirectory) {
        initComponents();
        this.userContainer = userContainer;
        this.airlineDirectory = airlineDirectory;
        try {
            populateTable();
        } catch (ParseException ex) {
            Logger.getLogger(ManageTravelAgencyJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        manageTable = new javax.swing.JTable();
        airlineComboBox = new javax.swing.JComboBox<>();
        airlinerSearchButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableForAirliner = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        flightNumText = new javax.swing.JTextField();
        sourceText = new javax.swing.JTextField();
        destText = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        viewButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Flight Name", "Airliner Name", "Source (From)", "Destination", "Flight Serial Number", "Departure Date", "Depature Time", "Arrival Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(manageTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 940, 100));

        add(airlineComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 170, -1));

        airlinerSearchButton.setText("Go");
        airlinerSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlinerSearchButtonActionPerformed(evt);
            }
        });
        add(airlinerSearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        tableForAirliner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Flight Name", "Flight Serial Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableForAirliner);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 180));

        jLabel1.setText("Flight Serial Number");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, -1, -1));

        jLabel2.setText("Depature Location");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, -1, -1));

        jLabel3.setText("Arrival Location");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, -1, -1));

        jLabel4.setText("Date");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 110, -1));

        flightNumText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightNumTextActionPerformed(evt);
            }
        });
        add(flightNumText, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, 170, -1));

        sourceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceTextActionPerformed(evt);
            }
        });
        add(sourceText, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, 170, -1));

        destText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destTextActionPerformed(evt);
            }
        });
        add(destText, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 300, 170, -1));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 340, 170, -1));

        viewButton2.setText("Search Flights <<");
        viewButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButton2ActionPerformed(evt);
            }
        });
        add(viewButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 450, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void airlinerSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinerSearchButtonActionPerformed
        // List all the flights of that airliner
        DefaultTableModel defaultTableModel = (DefaultTableModel) tableForAirliner.getModel();
        defaultTableModel.setRowCount(0);
        Airline airline = airlineDirectory.searchAirline(airlineComboBox.getSelectedItem().toString());

        for (Flight f : airline.getFleet().getFleet())
        {
            Object[] row = new Object[2];
            row[0] = f;
            row[1] = f.getAirlineName();

            defaultTableModel.addRow(row);

        }

    }//GEN-LAST:event_airlinerSearchButtonActionPerformed

    private void flightNumTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightNumTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightNumTextActionPerformed

    private void sourceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sourceTextActionPerformed

    private void destTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destTextActionPerformed

    private void viewButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButton2ActionPerformed
        // View Operation
        Flight flight = new Flight();
        flight.setDepartureDate(jDateChooser1.getDate());
        flight.setDestination(destText.getText());
        flight.setSource(sourceText.getText());
        flight.setFlightSerialNum(flightNumText.getText());
        FoundFlightJPanel foundFlightJPanel = new FoundFlightJPanel(userContainer, airlineDirectory,flight);
        userContainer.add("FoundFlightJPanel", foundFlightJPanel);
        CardLayout cardLayout = (CardLayout) userContainer.getLayout();
        cardLayout.next(userContainer);

    }//GEN-LAST:event_viewButton2ActionPerformed

    private void populateTable() throws ParseException {
        DefaultTableModel defaultTableModel = (DefaultTableModel) manageTable.getModel();
        defaultTableModel.setRowCount(0);

        for (Airline airline : airlineDirectory.getTravelAgency()) {
            {
                for (Flight f : airline.getFleet().getFleet()) {
                    Object[] row = new Object[8];
                    row[0] = f;
                    row[1] = f.getAirlineName();
                    row[2] = f.getSource();
                    row[3] = f.getDestination();
                    row[4] = f.getFlightSerialNum();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
                    String startDateString = dateFormat.format(f.getDepartureDate());
                    System.out.println(startDateString);
                    //    java.util.Date date = new SimpleDateFormat("MM-dd-yyyy").parse(startDateString);

                    row[5] = startDateString;
                    row[6] = f.getDeptTime();
                    row[7] = f.getArrivalTime();

                    defaultTableModel.addRow(row);

                }
            }
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> airlineComboBox;
    private javax.swing.JButton airlinerSearchButton;
    private javax.swing.JTextField destText;
    private javax.swing.JTextField flightNumText;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable manageTable;
    private javax.swing.JTextField sourceText;
    private javax.swing.JTable tableForAirliner;
    private javax.swing.JButton viewButton2;
    // End of variables declaration//GEN-END:variables
}
