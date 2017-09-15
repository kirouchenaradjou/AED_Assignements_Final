/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessPackage;

import java.util.Date;

/**
 *
 * @author ragha
 */
public class LicenseData {
    
    private String licenseNum;
    private Date licenseExpDate;
    private Date dateOfIssuance;
    private String placeOfIssuance;
    private String typeOfClass;

    
    
    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public Date getLicenseExpDate() {
        return licenseExpDate;
    }

    public void setLicenseExpDate(Date licenseExpDate) {
        this.licenseExpDate = licenseExpDate;
    }

    public Date getDateOfIssuance() {
        return dateOfIssuance;
    }

    public void setDateOfIssuance(Date dateOfIssuance) {
        this.dateOfIssuance = dateOfIssuance;
    }

    public String getPlaceOfIssuance() {
        return placeOfIssuance;
    }

    public void setPlaceOfIssuance(String placeOfIssuance) {
        this.placeOfIssuance = placeOfIssuance;
    }

    public String getTypeOfClass() {
        return typeOfClass;
    }

    public void setTypeOfClass(String typeOfClass) {
        this.typeOfClass = typeOfClass;
    }
    
}
