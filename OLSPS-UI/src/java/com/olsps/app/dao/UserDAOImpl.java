/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olsps.app.dao;

import com.olsps.app.model.User;
import com.olsps.app.service.UserService;
import com.olsps.app.serviceImpl.Janoid;
import com.unboundid.ldap.sdk.LDAPConnection;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import org.primefaces.context.RequestContext;

/**
 *
 * @author Eusuph
 */
@ManagedBean
public class UserDAOImpl implements UserService {

    final static Logger log = Logger.getLogger(UserDAOImpl.class.getName());
    LDAPConnection conn;
    private Hashtable<String, String> env = new Hashtable<String, String>();
   
    Janoid facility;

    @Override
    public void newUser(User user) {
      
                try {
            log.log(Level.DEBUG, "Adding..");
            facility = new Janoid("");
            facility.setAttribute("firstname", user.getFirstname());
            facility.setAttribute("lastname", user.getLastname());
            facility.setAttribute("username", user.getUsername());
            facility.setAttribute("password", user.getPassword());
            facility.setAttribute("lastname", user.getGroupname());
            log.log(Level.DEBUG, "user data");
            System.out.println("val: " + facility);
            if (conn != null) {
                log.log(Level.INFO, "Live connection");
                conn.add(facility);
                log.log(Level.WARN, "user data corrupt");
                System.out.println("val: " + facility);
            } else {
            }
        } catch (Exception ex) {
            log.log(Level.ERROR, "something is wrong!");
        }
    
    }

    @Override
    public Boolean deleteUser(String userToDelete) {

        try {
            
            List<String> values = new ArrayList<>();
            values.add("Yusuf");
            values.add("Cassim");
            values.add("Zama");
            log.log(Level.INFO, "Deleting..");
            facility = new Janoid("");
            values.remove(userToDelete);
            for (String value : values) {
                System.out.println(value);
            }
            facility.hasAttribute(userToDelete);
            facility.removeAttribute(userToDelete);

        } catch (Exception ex) {

        }
        return true;
    }

    @Override
    public Boolean updateUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> searchUser(String value) {
        System.out.println("Search for users: " + value);
        return null;
    }

    @Override
    public void newGroup(String value) {
        System.out.println("Search for groups: " + value);
    }

    @Override
    public Boolean deleteGroup(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addUserToGroup(String username, String group) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean deletUserFromGroup(String username, String group) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String searchGroup(String group) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean hasGroup(String username, String droup) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addEntitlement(String entitlement, String role) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean deleteEntitlements(String entitlement, String role) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean isValidUser(String username, String entitlement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void newRole(String role) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean deleteRole(String role) {
          System.out.println("delete successful: " + role);
        return null;
    }

    @Override
    public void assignRoleToGroup(String role, String group) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean removeRole(String role) {
       System.out.println("delete successful: " + role);
        return null;
    }

    @Override
    public Boolean authenticateUser(String username, String password) {
        try {
            RequestContext context = RequestContext.getCurrentInstance();
            FacesMessage message = null;
            boolean loggedIn = false;
            int count = 0;
            if (username.equals("Yusuf") && password.equals("Pa$$w0rd54321")) {
                //log.log(Level.FINER, "Successful login");
                System.out.println(username + " " + password);
                message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", username);
                return true;
            } else {
                message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Invalid credentials");
                //log.log(Level.SEVERE, "{0}{1}", new Object[]{useername, password});
            }
            FacesContext.getCurrentInstance().addMessage(null, message);
            context.addCallbackParam("loggedIn", message);

        } catch (Exception ex) {
            //log.log(Level.FINEST, password);
            ex.printStackTrace();
            ex.getLocalizedMessage();
        }

        return false;
    }

}
