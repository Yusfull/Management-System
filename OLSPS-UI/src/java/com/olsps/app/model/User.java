/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olsps.app.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.validation.constraints.NotNull;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Eusuph
 */

@ManagedBean
@SessionScoped
public class User implements Serializable {

    @NotNull
    private String username;
    @NotNull
    private String password;
    @NotNull
    private String firstname;
    @NotNull
    private String lastname;
    @NotNull
    private String groupname;

    private List<User> users;
    private static Map<String, Object> userValue;

    private boolean disable;

    public User() {
        this.disable = false;
    }

    public String getUsername() {

        return username;

    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isDisable() {
        if (disable) {
            return disable = true;
        } else {
            return disable = false;
        }

    }

    public void setDisable(boolean disable) {
        this.disable = disable;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void login() {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage message = null;
        boolean loggedIn = false;
        int count = 0;
        try {
            if (username != null && !username.isEmpty() && username.equals("Yusuf")
                    || password != null && !password.isEmpty() && password.equals("Pa$$w0rd54321")) {
                loggedIn = true;
                message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", username);
            } else {
                loggedIn = false;
                message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Invalid credentials");
            }
            FacesContext.getCurrentInstance().addMessage(null, message);
            context.addCallbackParam("loggedIn", loggedIn);

        } catch (Exception exe) {
            exe.printStackTrace();
            exe.getLocalizedMessage();
        }
    }
}
