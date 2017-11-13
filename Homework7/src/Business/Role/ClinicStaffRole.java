/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.CDCRole.CDCRoleWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class ClinicStaffRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CDCRoleWorkAreaJPanel(userProcessContainer, account, organization, business);
    }
    
}
