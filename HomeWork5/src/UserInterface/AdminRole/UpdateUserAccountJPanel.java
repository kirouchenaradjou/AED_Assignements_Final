/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminRole;

import Business.Business;
import Business.Person;
import Business.PersonDirectory;
import Business.UserAccount;
import Business.UserAccountDirectory;
import static UserInterface.AdminRole.ManageUserAccountJPanel.generateHash;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ragha
 */
public class UpdateUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateUserAccountJPanel
     */
    private JPanel userContainer;
    private UserAccount ua;

    public UpdateUserAccountJPanel(JPanel userContainer, UserAccount ua) {
        initComponents();
        this.userContainer = userContainer;
        this.ua = ua;
        accButtonGrp.add(disabledButton);
        accButtonGrp.add(activeRadioButton);
        populateUserDetails();
    }

    public void populateUserDetails() {
        personLabel.setText(ua.getP().toString());
        roleLabel.setText(ua.getRole());
        userNameText.setText(ua.getUserID());
        passwordText.setText(ua.getPassword());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accButtonGrp = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        userNameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();
        updateButoon = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        personLabel = new javax.swing.JLabel();
        roleLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        disabledButton = new javax.swing.JRadioButton();
        activeRadioButton = new javax.swing.JRadioButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Update User Account");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 43, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Role");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 280, -1, -1));

        jLabel3.setText("User Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 182, -1, -1));

        jLabel4.setText("Password");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 232, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Person");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 101, -1, -1));
        add(userNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 182, 210, -1));
        add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 232, 210, -1));

        updateButoon.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        updateButoon.setText("Update");
        updateButoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButoonActionPerformed(evt);
            }
        });
        add(updateButoon, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 405, 110, -1));

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cancelButton.setText("<<Back ");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 405, 110, -1));

        personLabel.setText("jLabel6");
        add(personLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 130, 210, -1));

        roleLabel.setText("jLabel6");
        add(roleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 309, 210, -1));

        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Account Status");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 143, -1, -1));

        disabledButton.setText("Disabled");
        add(disabledButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 216, -1, -1));

        activeRadioButton.setText("Active");
        add(activeRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 181, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void updateButoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButoonActionPerformed
        // Create a user Account for the person selected
        ua.setUserID(userNameText.getText());
        if(!ua.getPassword().equals(String.valueOf(passwordText.getPassword())))
        {
            String hashedPassword = generateHash(String.valueOf(passwordText.getPassword()));
            ua.setPassword(hashedPassword);
        }
        
        if (activeRadioButton.isSelected()) {
            ua.setStatus(Boolean.TRUE);
        } else {
            ua.setStatus(Boolean.FALSE);
        }
        JOptionPane.showMessageDialog(null, "User Account Updated", "Information", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_updateButoonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        userContainer.remove(this);
        Component[] componentArray = userContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageUserAccountJPanel manageUserAccountJPanel = (ManageUserAccountJPanel) component;
        manageUserAccountJPanel.populateTable();
        CardLayout layout = (CardLayout) userContainer.getLayout();
        layout.previous(userContainer);
    }//GEN-LAST:event_cancelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup accButtonGrp;
    private javax.swing.JRadioButton activeRadioButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JRadioButton disabledButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel personLabel;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JButton updateButoon;
    private javax.swing.JTextField userNameText;
    // End of variables declaration//GEN-END:variables
}
