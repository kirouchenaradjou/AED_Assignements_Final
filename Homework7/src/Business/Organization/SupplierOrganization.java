/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CDCRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raghavi
 */
public class SupplierOrganization extends Organization{
      public SupplierOrganization() {
        super(Organization.Type.Supplier.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CDCRole());
        return roles;
    }
}

