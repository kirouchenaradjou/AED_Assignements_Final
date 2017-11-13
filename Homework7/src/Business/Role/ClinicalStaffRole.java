/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ClinicOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.ClinicalRole.ClinicalWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Raghavi
 */
public class ClinicalStaffRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ClinicalWorkAreaJPanel(userProcessContainer, account, (ClinicOrganization)organization, enterprise);
    }
    
    
}
