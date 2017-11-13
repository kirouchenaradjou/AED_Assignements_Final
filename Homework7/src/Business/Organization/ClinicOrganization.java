/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.SupplierRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Raghavi
 */
public class ClinicOrganization extends Organization{

    public ClinicOrganization() {
        super(Organization.Type.ClinicStaffRole.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SupplierRole());
        return roles;
    }
     
}