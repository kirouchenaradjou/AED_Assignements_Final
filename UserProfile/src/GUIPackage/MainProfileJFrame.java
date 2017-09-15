/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIPackage;

import BusinessPackage.Address;
import BusinessPackage.CheckingAccount;
import BusinessPackage.CreditCard;
import BusinessPackage.FinancialAccounts;
import BusinessPackage.LicenseData;
import BusinessPackage.Person;
import BusinessPackage.SavingsAccount;

/**
 *
 * @author ragha
 */
public class MainProfileJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainProfileJFrame
     */
    
    Person person,spouse;
    Address address;
    LicenseData licenseData,spouseLicense;
    CreditCard creditCard,spouseCredit;
    FinancialAccounts finAccounts;
    SavingsAccount savingsAccount;
    CheckingAccount checkingAccount;
    public MainProfileJFrame() {
        initComponents();
        address = new Address();
        licenseData = new LicenseData();
        creditCard= new CreditCard();
        savingsAccount = new SavingsAccount();
        checkingAccount = new CheckingAccount();
        finAccounts = new FinancialAccounts(savingsAccount,checkingAccount);
        person = new Person(address, licenseData,creditCard,finAccounts);
        spouse = new Person(address, licenseData, creditCard, finAccounts);
        spouseCredit=new CreditCard();
        spouseLicense=new LicenseData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        createJPanel = new javax.swing.JPanel();
        viewJPanel = new javax.swing.JPanel();
        viewJButton = new javax.swing.JButton();
        createJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createJPanel.setLayout(new java.awt.BorderLayout());
        splitPane.setRightComponent(createJPanel);

        viewJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viewJButton.setText("View");
        viewJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewJButtonActionPerformed(evt);
            }
        });

        createJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        createJButton.setText("Create");
        createJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewJPanelLayout = new javax.swing.GroupLayout(viewJPanel);
        viewJPanel.setLayout(viewJPanelLayout);
        viewJPanelLayout.setHorizontalGroup(
            viewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(viewJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(viewJPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(createJButton)))
                .addGap(6, 6, 6))
        );
        viewJPanelLayout.setVerticalGroup(
            viewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewJPanelLayout.createSequentialGroup()
                .addContainerGap(288, Short.MAX_VALUE)
                .addComponent(createJButton)
                .addGap(127, 127, 127)
                .addComponent(viewJButton)
                .addGap(268, 268, 268))
        );

        splitPane.setLeftComponent(viewJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1173, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewJButtonActionPerformed

        ViewProfileJForm viewProfile = new ViewProfileJForm(person,spouse);
        splitPane.setRightComponent(viewProfile);
    }//GEN-LAST:event_viewJButtonActionPerformed

    private void createJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJButtonActionPerformed
        // Toggle to the create profile form
        CreateProfileJForm createProfile = new CreateProfileJForm(person,address,licenseData,creditCard,finAccounts,spouse,spouseCredit,spouseLicense);
        splitPane.setRightComponent(createProfile);
    }//GEN-LAST:event_createJButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MainProfileJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainProfileJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainProfileJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainProfileJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainProfileJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createJButton;
    private javax.swing.JPanel createJPanel;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JButton viewJButton;
    private javax.swing.JPanel viewJPanel;
    // End of variables declaration//GEN-END:variables
}
