/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HRRole;

import Business.Business;
import Business.Person;
import UserInterface.AdminRole.FoundUserAccountJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ragha
 */
public class SearchPersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchPersonJPanel
     */
    private JPanel userContainer;
    private Business b;

    public SearchPersonJPanel(JPanel userContainer, Business b) {
        initComponents();
        this.userContainer = userContainer;
        this.b = b;
        populatePerson();
    }

    public void populatePerson() {
        for (Person p : b.getPersonDir().getPersonDir()) {

            personComboBox.addItem(p.getLastName());

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

        cancelButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        goButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        personComboBox = new javax.swing.JComboBox<>();

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(0, 102, 102));
        cancelButton.setText("<<Back ");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Find the Person");

        goButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        goButton.setForeground(new java.awt.Color(0, 102, 102));
        goButton.setText("Go");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel2.setText("Person Last Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(cancelButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(personComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(goButton))
                            .addComponent(jLabel2))))
                .addContainerGap(328, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(133, 133, 133)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goButton)
                    .addComponent(personComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(208, 208, 208)
                .addComponent(cancelButton)
                .addContainerGap(262, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        userContainer.remove(this);
        Component[] componentArray = userContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManagePersonDirectoryJPanel managePersonDirectoryJPanel = (ManagePersonDirectoryJPanel) component;
        managePersonDirectoryJPanel.populateTable();
        CardLayout layout = (CardLayout) userContainer.getLayout();
        layout.previous(userContainer);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        // TODO add your handling code here:
        Person person = b.getPersonDir().findPersonByLastName(personComboBox.getSelectedItem().toString());
        if (person != null) {
            FoundPersonJPanel foundPersonJPanel = new FoundPersonJPanel(userContainer, person);
            userContainer.add("FoundPersonJPanel", foundPersonJPanel);
            CardLayout cardLayout = (CardLayout) userContainer.getLayout();
            cardLayout.next(userContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Person isnt existing in our system", "Information", JOptionPane.INFORMATION_MESSAGE);

        }

    }//GEN-LAST:event_goButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton goButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<Object> personComboBox;
    // End of variables declaration//GEN-END:variables
}
