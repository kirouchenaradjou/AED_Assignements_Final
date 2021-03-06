/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HRRole;

import Business.Business;
import Business.UserAccount;
import UserInterface.AdminRole.ManageUserAccountJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ragha
 */
public class HRRoleWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HRRoleWorkAreaJPanel
     */
    private JPanel userContainer;
    private UserAccount user;
private Business b;
    public HRRoleWorkAreaJPanel(JPanel userContainer,Business b, UserAccount user) {
        initComponents();
         this.userContainer = userContainer;
        this.user = user;
        this.b = b;
        displayUserDetails();
    }
public void displayUserDetails() 
    {
        userIDLabel.setText(user.getUserID());
        roleLabel.setText(user.getRole());
        nameLabel.setText(user.getP().toString());
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
        userIDLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        roleLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        managePersonButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("UserID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 70, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Role");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 70, -1));

        userIDLabel.setText("jLabel4");
        add(userIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 180, -1));

        nameLabel.setText("jLabel5");
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 180, -1));

        roleLabel.setText("jLabel6");
        add(roleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 180, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Human Resource Work Area");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        managePersonButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        managePersonButton.setForeground(new java.awt.Color(0, 102, 102));
        managePersonButton.setText("Manage Person Directory ");
        managePersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePersonButtonActionPerformed(evt);
            }
        });
        add(managePersonButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void managePersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePersonButtonActionPerformed
        // TODO add your handling code here:
        ManagePersonDirectoryJPanel managePersonDirectoryJPanel = new ManagePersonDirectoryJPanel(userContainer, b);
        userContainer.add("ManagePersonDirectoryJPanel", managePersonDirectoryJPanel);
        CardLayout cardLayout = (CardLayout) userContainer.getLayout();
        cardLayout.next(userContainer);
    }//GEN-LAST:event_managePersonButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton managePersonButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JLabel userIDLabel;
    // End of variables declaration//GEN-END:variables
}
