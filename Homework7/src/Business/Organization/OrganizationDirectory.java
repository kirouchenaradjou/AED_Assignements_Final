/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.ClinicStaffRole.getValue())){
            organization = new ClinicOrganization();
            organizationList.add(organization);
        }
         if (type.getValue().equals(Type.DistributorRole.getValue())){
            organization = new DistributorOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Type.Supplier.getValue())){
            organization = new SupplierOrganization();
            organizationList.add(organization);
        }
         if (type.getValue().equals(Type.CDC.getValue())){
            organization = new CDCOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}