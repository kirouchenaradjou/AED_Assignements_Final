/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import UserInterface_ManageAirline.ManageAirlineJPanel;
import Business.TravelAgency;
import UserInterface.ForSearch.SearchFlightsJPanel;
import UserInterface.ManageCustomers.ManageCustomersWorkAreaJPanel;
import UserInterface.ManageFlights.ManageFlightJPanel;
import UserInterface.ManageTravelAgency.ManageTravelAgencyJPanel;
import java.awt.CardLayout;

/**
 *
 * @author ragha
 */
public class TravelAgencyMain extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    TravelAgency airlineDirectory;
    public TravelAgencyMain() {
      

        initComponents();
        this.airlineDirectory = new TravelAgency();
    }
 public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravelAgencyMain().setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        userContainer = new javax.swing.JPanel();
        leftPanel = new javax.swing.JPanel();
        searchButton = new javax.swing.JButton();
        manageButton = new javax.swing.JButton();
        manageFlightsButton = new javax.swing.JButton();
        manageCustomerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setMinimumSize(new java.awt.Dimension(7, 3));

        userContainer.setBackground(new java.awt.Color(204, 204, 204));
        userContainer.setForeground(new java.awt.Color(0, 204, 204));
        userContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(userContainer);

        leftPanel.setBackground(new java.awt.Color(102, 102, 102));
        leftPanel.setPreferredSize(new java.awt.Dimension(300, 1000));
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        searchButton.setForeground(new java.awt.Color(51, 0, 51));
        searchButton.setText("Manage Travel Agency");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        leftPanel.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 230, 50));

        manageButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        manageButton.setForeground(new java.awt.Color(51, 0, 51));
        manageButton.setText("Manage Airlines");
        manageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageButtonActionPerformed(evt);
            }
        });
        leftPanel.add(manageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 230, 50));

        manageFlightsButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        manageFlightsButton.setForeground(new java.awt.Color(51, 0, 51));
        manageFlightsButton.setText("Manage Flights");
        manageFlightsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageFlightsButtonActionPerformed(evt);
            }
        });
        leftPanel.add(manageFlightsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 230, 50));

        manageCustomerButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        manageCustomerButton.setForeground(new java.awt.Color(51, 0, 51));
        manageCustomerButton.setText("Manage Customers");
        manageCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCustomerButtonActionPerformed(evt);
            }
        });
        leftPanel.add(manageCustomerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 230, 50));

        jSplitPane1.setLeftComponent(leftPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageButtonActionPerformed
        // All the airlines should be displayed
 ManageAirlineJPanel manageAirlinePanel = new  ManageAirlineJPanel(userContainer,airlineDirectory);
        userContainer.add("ManageAirlineJPanel",manageAirlinePanel);
        CardLayout cardLayout = (CardLayout) userContainer.getLayout();
        cardLayout.next(userContainer);
   
    }//GEN-LAST:event_manageButtonActionPerformed

    private void manageFlightsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageFlightsButtonActionPerformed
        // TODO add your handling code here:
         ManageFlightJPanel manageFlightJPanel = new  ManageFlightJPanel(userContainer,airlineDirectory);
        userContainer.add("ManageFlightJPanel",manageFlightJPanel);
        CardLayout cardLayout = (CardLayout) userContainer.getLayout();
        cardLayout.next(userContainer);
    }//GEN-LAST:event_manageFlightsButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // List all the flights of all the airline
          ManageTravelAgencyJPanel manageTravelAgencyJPanel = new  ManageTravelAgencyJPanel(userContainer,airlineDirectory);
        userContainer.add("ManageTravelAgencyJPanel",manageTravelAgencyJPanel);
        CardLayout cardLayout = (CardLayout) userContainer.getLayout();
        cardLayout.next(userContainer);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void manageCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCustomerButtonActionPerformed
        ManageCustomersWorkAreaJPanel manageCustomersWorkAreaJPanel = new  ManageCustomersWorkAreaJPanel(userContainer,airlineDirectory);
        userContainer.add("ManageCustomersWorkAreaJPanel",manageCustomersWorkAreaJPanel);
        CardLayout cardLayout = (CardLayout) userContainer.getLayout();
        cardLayout.next(userContainer);
    }//GEN-LAST:event_manageCustomerButtonActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton manageButton;
    private javax.swing.JButton manageCustomerButton;
    private javax.swing.JButton manageFlightsButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel userContainer;
    // End of variables declaration//GEN-END:variables

    
    
    }
