/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olsps.app.service;

import com.olsps.app.model.User;
import java.util.List;

/**
 *
 * @author Eusuph
 */

public interface UserService {
    
    
    
    void newUser(User user);
    
    Boolean authenticateUser(String useername,String password);
    
    Boolean deleteUser(String value);
    
    Boolean updateUser(User user);
    
    List<String> searchUser(String value);
    
    void newGroup(String value); 
    
    Boolean deleteGroup(String value);
    
    void addUserToGroup(String username, String group);
    
    Boolean deletUserFromGroup(String username,String group);
    
    String searchGroup(String group);
    
    Boolean hasGroup(String username,String droup);
    
    void addEntitlement(String entitlement,String role);
    
    Boolean deleteEntitlements(String entitlement,String role);
    
    Boolean isValidUser(String username,String entitlement);
    
    void newRole(String role);
    
    Boolean deleteRole(String role);
    
    void assignRoleToGroup(String role,String group);
    
    Boolean removeRole(String role);
    
    
}
