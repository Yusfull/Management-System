/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olsps.app.serviceImpl;

import com.olsps.app.dao.UserDAOImpl;
import com.olsps.app.model.User;
import javax.faces.bean.ManagedBean;
import org.apache.log4j.Logger;

/**
 *
 * @author Eusuph
 */
@ManagedBean
public class UserServiceDecoupled {

    UserDAOImpl  userImpl = new UserDAOImpl();
    final static Logger log = Logger.getLogger(UserServiceDecoupled.class.getName());
    public void add(User user){
       
        userImpl.newUser(user);
        log.debug(user, null);
    }

    public void auth(String name, String pass) {
    
        userImpl.authenticateUser(name, pass);
    }
    
    public void deleteUser(String userToDelete){
       
        userImpl.deleteUser(userToDelete);
    }
    
    public void search(String str){
        
        userImpl.searchUser(str);
    }

}
