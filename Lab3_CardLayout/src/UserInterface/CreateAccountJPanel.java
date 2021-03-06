/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import BusinessPackage.Account;
import BusinessPackage.AccountDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ragha
 */
public class CreateAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateAccountJPanel
     */
    
private JPanel userContainer;
    private AccountDirectory accountDir;
    CreateAccountJPanel(JPanel userContainer, AccountDirectory accountDir) {
initComponents();   
this.userContainer = userContainer;
        this.accountDir = accountDir;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        routingTextField = new javax.swing.JTextField();
        accNumTextField = new javax.swing.JTextField();
        bankNameTextField = new javax.swing.JTextField();
        balanceTextField = new javax.swing.JTextField();
        submitAccountDetailsButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Create Account");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Routing Number");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Account Numer");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Balance");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Bank Name");

        accNumTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                accNumTextFieldKeyReleased(evt);
            }
        });

        bankNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankNameTextFieldActionPerformed(evt);
            }
        });

        submitAccountDetailsButton.setBackground(new java.awt.Color(102, 255, 102));
        submitAccountDetailsButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        submitAccountDetailsButton.setForeground(new java.awt.Color(51, 204, 0));
        submitAccountDetailsButton.setText("Submit");
        submitAccountDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitAccountDetailsButtonActionPerformed(evt);
            }
        });

        backButton.setText("< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(160, 160, 160)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(accNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(routingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bankNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(balanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(451, 451, 451)
                        .addComponent(submitAccountDetailsButton)))
                .addContainerGap(428, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(routingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(backButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(bankNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(balanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addComponent(submitAccountDetailsButton)
                .addContainerGap(339, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bankNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankNameTextFieldActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // Go to the previous page
        userContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userContainer.getLayout();
        cardLayout.previous(userContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void submitAccountDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitAccountDetailsButtonActionPerformed
        // for creation
        
        int x,y;
         try {
        x = Integer.parseInt(accNumTextField.getText());
        y = Integer.parseInt(balanceTextField.getText());
    } catch (NumberFormatException nfe) {
        JOptionPane.showMessageDialog(null, "Account Number and Balance should be numeric");
        accNumTextField.setText("");
    }
        if(accNumTextField.getText()==null || balanceTextField.getText() == null || bankNameTextField.getText() == null 
                || routingTextField.getText() ==null  )
        {
                    JOptionPane.showMessageDialog(null, "Enter all the details" , "Warning", JOptionPane.WARNING_MESSAGE);

        }
        else
        {
        Account account = accountDir.addAccount();
        account.setAccNum(Integer.parseInt(accNumTextField.getText()));
        account.setBalance(Integer.parseInt(balanceTextField.getText()));
        account.setBankName(bankNameTextField.getText());
        account.setRoutingNum(routingTextField.getText());
        JOptionPane.showMessageDialog(null, "Account details added ! " , "Account Creation", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_submitAccountDetailsButtonActionPerformed

    private void accNumTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accNumTextFieldKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_accNumTextFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accNumTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField balanceTextField;
    private javax.swing.JTextField bankNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField routingTextField;
    private javax.swing.JButton submitAccountDetailsButton;
    // End of variables declaration//GEN-END:variables
}
