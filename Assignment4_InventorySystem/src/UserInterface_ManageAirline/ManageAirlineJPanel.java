/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface_ManageAirline;

import Business.Airline;
import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ragha
 */
public class ManageAirlineJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAirlineJPanel
     */
    TravelAgency airlineDirectory;
    JPanel userContainer;
    public ManageAirlineJPanel(JPanel userContainer,TravelAgency airlineDirectory) {
        this.airlineDirectory = airlineDirectory;
        this.userContainer = userContainer;
        initComponents();
        populateTable();
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
        tableAccount = new javax.swing.JTable();
        newAirlinerButton = new javax.swing.JButton();
        viewAirlinerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableAccount.setBorder(new javax.swing.border.MatteBorder(null));
        tableAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Serial Number", "Number of flights", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableAccount.setSelectionBackground(new java.awt.Color(204, 255, 255));
        tableAccount.setSelectionForeground(new java.awt.Color(0, 102, 102));
        jScrollPane1.setViewportView(tableAccount);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 670, 420));

        newAirlinerButton.setBackground(new java.awt.Color(204, 255, 204));
        newAirlinerButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        newAirlinerButton.setForeground(new java.awt.Color(0, 51, 51));
        newAirlinerButton.setText("New Airliner <<");
        newAirlinerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAirlinerButtonActionPerformed(evt);
            }
        });
        add(newAirlinerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, 180, -1));

        viewAirlinerButton.setBackground(new java.awt.Color(153, 255, 204));
        viewAirlinerButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viewAirlinerButton.setForeground(new java.awt.Color(0, 51, 51));
        viewAirlinerButton.setText("View Airliner <<");
        viewAirlinerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAirlinerButtonActionPerformed(evt);
            }
        });
        add(viewAirlinerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, 180, -1));

        jLabel1.setBackground(new java.awt.Color(102, 153, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Airlines");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 340, 35));
    }// </editor-fold>//GEN-END:initComponents

    private void newAirlinerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAirlinerButtonActionPerformed
        // Call the create Airline Jpanel to create Airlines
        CreateAirlinerJPanel createNewAirlinerJPanel = new CreateAirlinerJPanel(userContainer,airlineDirectory);
            userContainer.add("CreateAirlinerJPanel", createNewAirlinerJPanel);
            CardLayout cardLayout = (CardLayout) userContainer.getLayout();
            cardLayout.next(userContainer);

        
    }//GEN-LAST:event_newAirlinerButtonActionPerformed

    private void viewAirlinerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAirlinerButtonActionPerformed
        // View Airline Directory
          int selectedRows = tableAccount.getSelectedRow();
        if (selectedRows < 0) {
            JOptionPane.showMessageDialog(null, "Select any row from the table to view the details", "Warning", JOptionPane.WARNING_MESSAGE);

        } else {
            Airline airline = (Airline) tableAccount.getValueAt(selectedRows, 0);
            ViewAirlinerJPanel viewAccountJPanel = new ViewAirlinerJPanel(userContainer, airline);
            userContainer.add("ViewAirlinerJPanel", viewAccountJPanel);
            CardLayout cardLayout = (CardLayout) userContainer.getLayout();
            cardLayout.next(userContainer);

        }
    }//GEN-LAST:event_viewAirlinerButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newAirlinerButton;
    private javax.swing.JTable tableAccount;
    private javax.swing.JButton viewAirlinerButton;
    // End of variables declaration//GEN-END:variables

public void populateTable() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) tableAccount.getModel();
        defaultTableModel.setRowCount(0);
        for (Airline airline : airlineDirectory.getTravelAgency())
        {
            Object[] row = new Object[4];
            row[0] = airline;
            row[1] = airline.getSerialNum();
            row[2] = airline.getNoOfFlights();
            row[3] = airline.getAddress();
            defaultTableModel.addRow(row);
        }
    }
}
