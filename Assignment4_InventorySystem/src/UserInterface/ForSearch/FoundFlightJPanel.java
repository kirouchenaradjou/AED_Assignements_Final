/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ForSearch;

import Business.Airline;
import Business.Flight;
import Business.TravelAgency;
import UserInterface_ManageAirline.ManageAirlineJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ragha
 */
public class FoundFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FoundFlightJPanel
     */
    private JPanel userContainer;
    private TravelAgency airlineDirectory;
    private Flight flight;

    public FoundFlightJPanel(JPanel userContainer, TravelAgency airlineDirectory, Flight flight) {
        initComponents();
        this.userContainer = userContainer;
        this.airlineDirectory = airlineDirectory;
        this.flight = flight;
        populateTable();

    }

    public void populateTable() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) flightFoundTable.getModel();
        defaultTableModel.setRowCount(0);

        for (Airline airline : airlineDirectory.getTravelAgency()) {
            {
                for (Flight f : airline.getFleet().getFleet()) {
                    if (flight.getDestination().equalsIgnoreCase(f.getDestination()) || (flight.getFlightSerialNum().equalsIgnoreCase(f.getFlightSerialNum()) || (flight.getDepartureDate().equals(f.getDepartureDate()))) || (flight.getSource().equalsIgnoreCase(f.getSource()))) {
                        Object[] row = new Object[2];
                        row[0] = f;
                        row[1] = f.getFlightSerialNum();
                        defaultTableModel.addRow(row);
                    }

                }
            }
        }

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
        flightFoundTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        flightFoundTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Flight Name", "Flight Serial Number"
            }
        ));
        jScrollPane1.setViewportView(flightFoundTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 54, -1, 199));

        backButton.setText("< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // Go to the previous page
        userContainer.remove(this);
        CardLayout layout = (CardLayout) userContainer.getLayout();
        layout.previous(userContainer);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable flightFoundTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}