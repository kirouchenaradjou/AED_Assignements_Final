/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIPackage;

import BusinessPackage.Person;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author ragha
 */
public class ViewProfileJForm extends javax.swing.JPanel {

    /**
     * Creates new form ViewProfileJForm
     */
    
    public ViewProfileJForm(Person person,Person spouse) {
        initComponents();
        display(person,spouse);
    }
    
    private void display(Person person,Person spouse)
    {
        //Basic Details for a person
        firstNameTextField1.setText(person.getFirstName());
        lastNameTextField.setText(person.getLastName());
        emailIDTextField2.setText(person.getEmailID());
        
        dobTextField3.setText(person.getDate().toString());
        phoneNumberTextField.setText(person.getPhoneNum());
        genderTextField.setText(person.getGenderValue());
        //Address Details
        streetNameTextField2.setText(person.getAddress().getStreetName());
        cityTextField1.setText(person.getAddress().getCityName());
        stateTextField.setText(person.getAddress().getStateName());
        pincodeTextField.setText(person.getAddress().getPinCode());
        countryTextField.setText(person.getAddress().getCountryName());
        //License Details
        licenseClassTextField.setText(person.getLicenseData().getTypeOfClass());
        licenseDOITextField.setText(person.getLicenseData().getDateOfIssuance().toString());
        licensePlaceTextField.setText(person.getLicenseData().getPlaceOfIssuance());
        licenseNumTextField.setText(person.getLicenseData().getLicenseNum());
        ExpiryDateTextField.setText(person.getLicenseData().getLicenseExpDate().toString());
        //Credit Card Details
        creditPlaceTxtField.setText(person.getCreditCard().getCreditIssuePlace());
        creditDOETxtField1.setText(person.getCreditCard().getCreditExpiry().toString());
        creditDOITxtField.setText(person.getCreditCard().getCreditIssueDate().toString());
        creditNumTxtField1.setText(person.getCreditCard().getCreditNum());
        bankTxtField.setText(person.getCreditCard().getCreditBank());
        //Savings Account Details
        accountStatusTextField1.setText(person.getFinAccounts().getSavingsAccount().getAccountStatus());
        
        sDebtTextField.setText((person.getFinAccounts().getSavingsAccount().getAccountDebt()).toString());
        secHolderTxtField.setText(person.getFinAccounts().getSavingsAccount().getAccountSecHolderName());
        creationDateAccountTxt.setText(person.getFinAccounts().getSavingsAccount().getAccountDate().toString());
        sCreditAmtTextField.setText(person.getFinAccounts().getSavingsAccount().getAccountCredit());
           //Checking Accounts Details 
        cDebtTextField.setText(person.getFinAccounts().getCheckingAccount().getAccountDebt());
        cSecHolderTxtField.setText(person.getFinAccounts().getCheckingAccount().getAccountSecHolderName());
        cCreationDateAccountTxt.setText(person.getFinAccounts().getCheckingAccount().getAccountDate());
        caAcountStatusTextField.setText(person.getFinAccounts().getCheckingAccount().getAccountStatus());
        cCreditAmtTextField1.setText(person.getFinAccounts().getCheckingAccount().getAccountCredit());
        //for Image display
        if(person.getPicture()!=null)
        {
         Image resizedImg = person.getPicture().getScaledInstance(210, 200,
                Image.SCALE_SMOOTH);
        photoLabel.setIcon(new ImageIcon(resizedImg));
        }
        if(spouse.getFirstName()!=null)
        {
                if(spouse.getPicture()!=null)
                {
         Image resizedImgForSpouse = spouse.getPicture().getScaledInstance(210, 200,
                Image.SCALE_SMOOTH);
        photoLabelSpouse.setIcon(new ImageIcon(resizedImgForSpouse));
        }
        if(spouse.getFirstName()!= null)
     spouseNameTextField.setText(spouse.getFirstName());
        if(spouse.getLastName()!= null)
       spouseLastNameTextField.setText(spouse.getLastName());
         spouseEmailTextField.setText(spouse.getEmailID());
        spouseLicenseNum.setText(spouse.getLicenseData().getLicenseNum());
       spouseExpDateText.setText(spouse.getLicenseData().getLicenseExpDate().toString());
        spouseDOIText.setText(spouse.getLicenseData().getDateOfIssuance().toString());
        spouseBankTextField.setText(spouse.getCreditCard().getCreditBank());
       spouseCreditCardNumText.setText(spouse.getCreditCard().getCreditNum());
        spouseCreExpText.setText(spouse.getCreditCard().getCreditExpiry().toString());
        }
        else
        {
             spouse.setFirstName("");
                spouse.setLastName("");
                spouse.setEmailID("");
 spouseLicenseNum.setText("");
       spouseExpDateText.setText("");
        spouseDOIText.setText(null);
        spouseBankTextField.setText("");
       spouseCreditCardNumText.setText("");
        spouseCreExpText.setText("");
                
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

        photoLabel = new javax.swing.JLabel();
        headerForCreate = new javax.swing.JLabel();
        financialLabel = new javax.swing.JLabel();
        accountStatusLabel = new javax.swing.JLabel();
        accountLabel2 = new javax.swing.JLabel();
        accountLabel3 = new javax.swing.JLabel();
        creationDateAccountTxt = new javax.swing.JTextField();
        accountLabel4 = new javax.swing.JLabel();
        secHolderTxtField = new javax.swing.JTextField();
        sDebtTextField = new javax.swing.JTextField();
        accountStatusTextField1 = new javax.swing.JTextField();
        accountStatusLabel1 = new javax.swing.JLabel();
        accountLabel5 = new javax.swing.JLabel();
        accountLabel6 = new javax.swing.JLabel();
        cCreationDateAccountTxt = new javax.swing.JTextField();
        accountLabel7 = new javax.swing.JLabel();
        cSecHolderTxtField = new javax.swing.JTextField();
        cDebtTextField = new javax.swing.JTextField();
        caAcountStatusTextField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        firstNameLabel1 = new javax.swing.JLabel();
        emailID = new javax.swing.JLabel();
        lastNameLabel1 = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        firstNameTextField1 = new javax.swing.JTextField();
        phoneNumberTextField = new javax.swing.JTextField();
        emailIDTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lastNameLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        genderTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pincodeTextField = new javax.swing.JTextField();
        stateTextField = new javax.swing.JTextField();
        streetNameTextField2 = new javax.swing.JTextField();
        countryTextField = new javax.swing.JTextField();
        cityTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        licenseNumLabel = new javax.swing.JLabel();
        licenseNumTextField = new javax.swing.JTextField();
        licenseDOILabel = new javax.swing.JLabel();
        licenseDOITextField = new javax.swing.JTextField();
        licenseExpiryLabel = new javax.swing.JLabel();
        ExpiryDateTextField = new javax.swing.JTextField();
        licenseClassLabel = new javax.swing.JLabel();
        licenseClassTextField = new javax.swing.JTextField();
        licensePlaceOfIssueLabel = new javax.swing.JLabel();
        licensePlaceTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        creditCardNameLabel = new javax.swing.JLabel();
        creditPlaceTxtField = new javax.swing.JTextField();
        issuancePlaceLabel = new javax.swing.JLabel();
        creditNumTxtField1 = new javax.swing.JTextField();
        creditCardDOE1 = new javax.swing.JLabel();
        creditDOETxtField1 = new javax.swing.JTextField();
        bankLabel = new javax.swing.JLabel();
        bankTxtField = new javax.swing.JTextField();
        creditCardDOI = new javax.swing.JLabel();
        creditDOITxtField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dobTextField3 = new javax.swing.JTextField();
        accountLabel8 = new javax.swing.JLabel();
        sCreditAmtTextField = new javax.swing.JTextField();
        accountLabel9 = new javax.swing.JLabel();
        accountLabel10 = new javax.swing.JLabel();
        cCreditAmtTextField1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        firstNameLabel4 = new javax.swing.JLabel();
        spouseNameTextField = new javax.swing.JTextField();
        lastNameLabel7 = new javax.swing.JLabel();
        spouseLastNameTextField = new javax.swing.JTextField();
        emailID3 = new javax.swing.JLabel();
        spouseEmailTextField = new javax.swing.JTextField();
        licenseNumLabel3 = new javax.swing.JLabel();
        spouseLicenseNum = new javax.swing.JTextField();
        licenseDOILabel3 = new javax.swing.JLabel();
        spouseDOIText = new javax.swing.JTextField();
        licenseExpiryLabel3 = new javax.swing.JLabel();
        spouseExpDateText = new javax.swing.JTextField();
        creditCardNameLabel2 = new javax.swing.JLabel();
        spouseCreditCardNumText = new javax.swing.JTextField();
        creditCardDOE3 = new javax.swing.JLabel();
        spouseCreExpText = new javax.swing.JTextField();
        bankLabel2 = new javax.swing.JLabel();
        spouseBankTextField = new javax.swing.JTextField();
        photoLabelSpouse = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        photoLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(photoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 100, 210, 200));

        headerForCreate.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        headerForCreate.setText("View Your Details");
        add(headerForCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 8, 455, -1));

        financialLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        financialLabel.setText("Financial Accounts Section");
        add(financialLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, -1, -1));

        accountStatusLabel.setText("Status");
        add(accountStatusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));

        accountLabel2.setText("Secondary Holder");
        add(accountLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, -1, -1));

        accountLabel3.setText("Debt");
        add(accountLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, -1, -1));

        creationDateAccountTxt.setEditable(false);
        add(creationDateAccountTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, 143, -1));

        accountLabel4.setText("Creation Date");
        add(accountLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 570, -1, -1));

        secHolderTxtField.setEditable(false);
        add(secHolderTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 530, 143, -1));

        sDebtTextField.setEditable(false);
        sDebtTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sDebtTextFieldActionPerformed(evt);
            }
        });
        add(sDebtTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, 143, -1));

        accountStatusTextField1.setEditable(false);
        add(accountStatusTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 143, -1));

        accountStatusLabel1.setText("Status");
        add(accountStatusLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 450, -1, -1));

        accountLabel5.setText("Secondary Holder");
        add(accountLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 530, -1, -1));

        accountLabel6.setText("Debt");
        add(accountLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 490, -1, -1));

        cCreationDateAccountTxt.setEditable(false);
        add(cCreationDateAccountTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 570, 143, -1));

        accountLabel7.setText("Creation Date");
        add(accountLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 570, -1, -1));

        cSecHolderTxtField.setEditable(false);
        add(cSecHolderTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 530, 143, -1));

        cDebtTextField.setEditable(false);
        add(cDebtTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 490, 143, -1));

        caAcountStatusTextField.setEditable(false);
        add(caAcountStatusTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 450, 143, -1));

        lastNameLabel.setText("Last Name");
        add(lastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 143, 26));

        firstNameLabel1.setText("First Name");
        add(firstNameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 143, 26));

        emailID.setText("Email ID");
        add(emailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 143, 26));

        lastNameLabel1.setText("Gender");
        add(lastNameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 143, 26));

        lastNameTextField.setEditable(false);
        lastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextFieldActionPerformed(evt);
            }
        });
        add(lastNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 143, -1));

        firstNameTextField1.setEditable(false);
        firstNameTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextField1ActionPerformed(evt);
            }
        });
        add(firstNameTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 143, -1));

        phoneNumberTextField.setEditable(false);
        phoneNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberTextFieldActionPerformed(evt);
            }
        });
        add(phoneNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 143, -1));

        emailIDTextField2.setEditable(false);
        emailIDTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailIDTextField2ActionPerformed(evt);
            }
        });
        add(emailIDTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 143, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Basic Info");
        jLabel9.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        lastNameLabel2.setText("Date Of Birth");
        add(lastNameLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 143, 26));

        jLabel10.setText("Phone Number");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        genderTextField.setEditable(false);
        genderTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderTextFieldActionPerformed(evt);
            }
        });
        add(genderTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 143, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Address");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 143, 26));

        jLabel2.setText("Street Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jLabel3.setText("City");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        jLabel4.setText("State");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        jLabel5.setText("Country");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, -1, -1));

        jLabel6.setText("Pin Code");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        pincodeTextField.setEditable(false);
        pincodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pincodeTextFieldActionPerformed(evt);
            }
        });
        add(pincodeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 143, -1));

        stateTextField.setEditable(false);
        stateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateTextFieldActionPerformed(evt);
            }
        });
        add(stateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 143, -1));

        streetNameTextField2.setEditable(false);
        streetNameTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetNameTextField2ActionPerformed(evt);
            }
        });
        add(streetNameTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 143, -1));

        countryTextField.setEditable(false);
        countryTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryTextFieldActionPerformed(evt);
            }
        });
        add(countryTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 143, -1));

        cityTextField1.setEditable(false);
        cityTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTextField1ActionPerformed(evt);
            }
        });
        add(cityTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 143, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("License Data");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));

        licenseNumLabel.setText("License Number");
        add(licenseNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        licenseNumTextField.setEditable(false);
        licenseNumTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenseNumTextFieldActionPerformed(evt);
            }
        });
        add(licenseNumTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 143, -1));

        licenseDOILabel.setText("Date of Issue");
        add(licenseDOILabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        licenseDOITextField.setEditable(false);
        licenseDOITextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenseDOITextFieldActionPerformed(evt);
            }
        });
        add(licenseDOITextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 143, -1));

        licenseExpiryLabel.setText("Expiry Date");
        add(licenseExpiryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        ExpiryDateTextField.setEditable(false);
        ExpiryDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpiryDateTextFieldActionPerformed(evt);
            }
        });
        add(ExpiryDateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 143, -1));

        licenseClassLabel.setText("Class");
        add(licenseClassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        licenseClassTextField.setEditable(false);
        licenseClassTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenseClassTextFieldActionPerformed(evt);
            }
        });
        add(licenseClassTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 143, -1));

        licensePlaceOfIssueLabel.setText("Place Of Issuance");
        add(licensePlaceOfIssueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));

        licensePlaceTextField.setEditable(false);
        licensePlaceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licensePlaceTextFieldActionPerformed(evt);
            }
        });
        add(licensePlaceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 143, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Credit Card");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 60, -1, -1));

        creditCardNameLabel.setText("Credit Card Number ");
        add(creditCardNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, -1, -1));

        creditPlaceTxtField.setEditable(false);
        add(creditPlaceTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 230, 143, -1));

        issuancePlaceLabel.setText("Issuance Place");
        add(issuancePlaceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, -1, -1));

        creditNumTxtField1.setEditable(false);
        add(creditNumTxtField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 110, 143, -1));

        creditCardDOE1.setText("Credit Card Expiry");
        add(creditCardDOE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, -1, -1));

        creditDOETxtField1.setEditable(false);
        add(creditDOETxtField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 150, 143, -1));

        bankLabel.setText("Bank");
        add(bankLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 270, -1, -1));

        bankTxtField.setEditable(false);
        add(bankTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 270, 143, -1));

        creditCardDOI.setText("Issue Date");
        add(creditCardDOI, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, -1, -1));

        creditDOITxtField.setEditable(false);
        add(creditDOITxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 190, 143, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("Checking Accounts Info");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 400, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setText("Saving Account Info");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, -1, -1));

        dobTextField3.setEditable(false);
        dobTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobTextField3ActionPerformed(evt);
            }
        });
        add(dobTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 143, -1));

        accountLabel8.setText("Debt");
        add(accountLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, -1, -1));

        sCreditAmtTextField.setEditable(false);
        add(sCreditAmtTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 610, 143, -1));

        accountLabel9.setText("Credit Amount");
        add(accountLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 620, -1, -1));

        accountLabel10.setText("Credit Amount");
        add(accountLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 610, -1, -1));

        cCreditAmtTextField1.setEditable(false);
        add(cCreditAmtTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 610, 143, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel24.setText("Spouse Info ");
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, -1, -1));

        firstNameLabel4.setText("First Name");
        add(firstNameLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 710, 143, 26));

        spouseNameTextField.setEditable(false);
        spouseNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spouseNameTextFieldActionPerformed(evt);
            }
        });
        add(spouseNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 710, 143, -1));

        lastNameLabel7.setText("Last Name");
        add(lastNameLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 750, 143, 26));

        spouseLastNameTextField.setEditable(false);
        spouseLastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spouseLastNameTextFieldActionPerformed(evt);
            }
        });
        add(spouseLastNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 750, 143, -1));

        emailID3.setText("Email ID");
        add(emailID3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 790, 143, 26));

        spouseEmailTextField.setEditable(false);
        spouseEmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spouseEmailTextFieldActionPerformed(evt);
            }
        });
        add(spouseEmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 790, 143, -1));

        licenseNumLabel3.setText("License Number");
        add(licenseNumLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 710, -1, -1));

        spouseLicenseNum.setEditable(false);
        spouseLicenseNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spouseLicenseNumActionPerformed(evt);
            }
        });
        add(spouseLicenseNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 710, 143, -1));

        licenseDOILabel3.setText("Date of Issue");
        add(licenseDOILabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 750, -1, -1));

        spouseDOIText.setEditable(false);
        spouseDOIText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spouseDOITextActionPerformed(evt);
            }
        });
        add(spouseDOIText, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 750, 143, -1));

        licenseExpiryLabel3.setText("Expiry Date");
        add(licenseExpiryLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 790, -1, -1));

        spouseExpDateText.setEditable(false);
        spouseExpDateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spouseExpDateTextActionPerformed(evt);
            }
        });
        add(spouseExpDateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 790, 143, -1));

        creditCardNameLabel2.setText("Credit Card Number ");
        add(creditCardNameLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 710, -1, -1));

        spouseCreditCardNumText.setEditable(false);
        add(spouseCreditCardNumText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 710, 143, -1));

        creditCardDOE3.setText("Credit Card Expiry");
        add(creditCardDOE3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 750, -1, -1));

        spouseCreExpText.setEditable(false);
        add(spouseCreExpText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 750, 143, -1));

        bankLabel2.setText("Bank");
        add(bankLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 790, -1, -1));

        spouseBankTextField.setEditable(false);
        spouseBankTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spouseBankTextFieldActionPerformed(evt);
            }
        });
        add(spouseBankTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 790, 143, -1));

        photoLabelSpouse.setText("         Your Photo");
        photoLabelSpouse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(photoLabelSpouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 660, 181, 163));
    }// </editor-fold>//GEN-END:initComponents

    private void lastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTextFieldActionPerformed

    private void firstNameTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextField1ActionPerformed

    private void phoneNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberTextFieldActionPerformed

    private void emailIDTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailIDTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailIDTextField2ActionPerformed

    private void genderTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderTextFieldActionPerformed

    private void pincodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pincodeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pincodeTextFieldActionPerformed

    private void stateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateTextFieldActionPerformed

    private void streetNameTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetNameTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_streetNameTextField2ActionPerformed

    private void countryTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryTextFieldActionPerformed

    private void cityTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTextField1ActionPerformed

    private void licenseNumTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenseNumTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_licenseNumTextFieldActionPerformed

    private void licenseDOITextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenseDOITextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_licenseDOITextFieldActionPerformed

    private void ExpiryDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpiryDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExpiryDateTextFieldActionPerformed

    private void licenseClassTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenseClassTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_licenseClassTextFieldActionPerformed

    private void licensePlaceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licensePlaceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_licensePlaceTextFieldActionPerformed

    private void dobTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobTextField3ActionPerformed

    private void sDebtTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sDebtTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sDebtTextFieldActionPerformed

    private void spouseNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spouseNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spouseNameTextFieldActionPerformed

    private void spouseLastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spouseLastNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spouseLastNameTextFieldActionPerformed

    private void spouseEmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spouseEmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spouseEmailTextFieldActionPerformed

    private void spouseDOITextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spouseDOITextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spouseDOITextActionPerformed

    private void spouseExpDateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spouseExpDateTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spouseExpDateTextActionPerformed

    private void spouseBankTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spouseBankTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spouseBankTextFieldActionPerformed

    private void spouseLicenseNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spouseLicenseNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spouseLicenseNumActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ExpiryDateTextField;
    private javax.swing.JLabel accountLabel10;
    private javax.swing.JLabel accountLabel2;
    private javax.swing.JLabel accountLabel3;
    private javax.swing.JLabel accountLabel4;
    private javax.swing.JLabel accountLabel5;
    private javax.swing.JLabel accountLabel6;
    private javax.swing.JLabel accountLabel7;
    private javax.swing.JLabel accountLabel8;
    private javax.swing.JLabel accountLabel9;
    private javax.swing.JLabel accountStatusLabel;
    private javax.swing.JLabel accountStatusLabel1;
    private javax.swing.JTextField accountStatusTextField1;
    private javax.swing.JLabel bankLabel;
    private javax.swing.JLabel bankLabel2;
    private javax.swing.JTextField bankTxtField;
    private javax.swing.JTextField cCreationDateAccountTxt;
    private javax.swing.JTextField cCreditAmtTextField1;
    private javax.swing.JTextField cDebtTextField;
    private javax.swing.JTextField cSecHolderTxtField;
    private javax.swing.JTextField caAcountStatusTextField;
    private javax.swing.JTextField cityTextField1;
    private javax.swing.JTextField countryTextField;
    private javax.swing.JTextField creationDateAccountTxt;
    private javax.swing.JLabel creditCardDOE1;
    private javax.swing.JLabel creditCardDOE3;
    private javax.swing.JLabel creditCardDOI;
    private javax.swing.JLabel creditCardNameLabel;
    private javax.swing.JLabel creditCardNameLabel2;
    private javax.swing.JTextField creditDOETxtField1;
    private javax.swing.JTextField creditDOITxtField;
    private javax.swing.JTextField creditNumTxtField1;
    private javax.swing.JTextField creditPlaceTxtField;
    private javax.swing.JTextField dobTextField3;
    private javax.swing.JLabel emailID;
    private javax.swing.JLabel emailID3;
    private javax.swing.JTextField emailIDTextField2;
    private javax.swing.JLabel financialLabel;
    private javax.swing.JLabel firstNameLabel1;
    private javax.swing.JLabel firstNameLabel4;
    private javax.swing.JTextField firstNameTextField1;
    private javax.swing.JTextField genderTextField;
    private javax.swing.JLabel headerForCreate;
    private javax.swing.JLabel issuancePlaceLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JLabel lastNameLabel1;
    private javax.swing.JLabel lastNameLabel2;
    private javax.swing.JLabel lastNameLabel7;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel licenseClassLabel;
    private javax.swing.JTextField licenseClassTextField;
    private javax.swing.JLabel licenseDOILabel;
    private javax.swing.JLabel licenseDOILabel3;
    private javax.swing.JTextField licenseDOITextField;
    private javax.swing.JLabel licenseExpiryLabel;
    private javax.swing.JLabel licenseExpiryLabel3;
    private javax.swing.JLabel licenseNumLabel;
    private javax.swing.JLabel licenseNumLabel3;
    private javax.swing.JTextField licenseNumTextField;
    private javax.swing.JLabel licensePlaceOfIssueLabel;
    private javax.swing.JTextField licensePlaceTextField;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JLabel photoLabelSpouse;
    private javax.swing.JTextField pincodeTextField;
    private javax.swing.JTextField sCreditAmtTextField;
    private javax.swing.JTextField sDebtTextField;
    private javax.swing.JTextField secHolderTxtField;
    private javax.swing.JTextField spouseBankTextField;
    private javax.swing.JTextField spouseCreExpText;
    private javax.swing.JTextField spouseCreditCardNumText;
    private javax.swing.JTextField spouseDOIText;
    private javax.swing.JTextField spouseEmailTextField;
    private javax.swing.JTextField spouseExpDateText;
    private javax.swing.JTextField spouseLastNameTextField;
    private javax.swing.JTextField spouseLicenseNum;
    private javax.swing.JTextField spouseNameTextField;
    private javax.swing.JTextField stateTextField;
    private javax.swing.JTextField streetNameTextField2;
    // End of variables declaration//GEN-END:variables
}
