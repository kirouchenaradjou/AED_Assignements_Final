/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacePackage;

import BusinessPackage.VitalSign;
import BusinessPackage.VitalSignHistory;
import javax.swing.JOptionPane;

/**
 *
 * @author ragha
 */
public class CreateVitalPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateVitalPanel
     */
    private VitalSignHistory vitalSignHistory;
    public CreateVitalPanel(VitalSignHistory vitalSignHistory) {
        initComponents();
        this.vitalSignHistory = vitalSignHistory;
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
        dateTextField = new javax.swing.JTextField();
        pulseTextField = new javax.swing.JTextField();
        bloodPressureTextField = new javax.swing.JTextField();
        tempTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Create Vital Signs");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jLabel2.setText("Pulse");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        jLabel3.setText("Temperature");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jLabel4.setText("Date");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        jLabel5.setText("Blood Pressure");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));
        add(dateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 240, -1));
        add(pulseTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 240, -1));
        add(bloodPressureTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 240, -1));
        add(tempTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 240, -1));

        saveButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // save in the arrayList by calling the method addVitals in the VitalSignHistory
        VitalSign vitalSign = vitalSignHistory.addVitals();
        vitalSign.setBloodPressure(Double.parseDouble(bloodPressureTextField.getText()));
        vitalSign.setDate(dateTextField.getText());
        vitalSign.setPulse(Integer.parseInt(pulseTextField.getText()));
        vitalSign.setTemperature(Double.parseDouble(tempTextField.getText()));
        JOptionPane.showMessageDialog(null, "Vital Signs Added");
        
        bloodPressureTextField.setText("");
        dateTextField.setText("");
        pulseTextField.setText("");
        tempTextField.setText("");
        
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bloodPressureTextField;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField pulseTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField tempTextField;
    // End of variables declaration//GEN-END:variables
}