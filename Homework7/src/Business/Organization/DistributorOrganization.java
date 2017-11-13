/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CDCRole;
import Business.Role.DistributorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Raghavi
 */
public class DistributorOrganization extends Organization{

    public DistributorOrganization() {
        super(Organization.Type.DistributorRole.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DistributorRole());
        return roles;
    }
     
   
    
    
}
