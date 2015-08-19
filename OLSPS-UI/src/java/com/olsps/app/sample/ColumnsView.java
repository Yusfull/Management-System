/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olsps.app.sample;

/**
 *
 * @author Eusuph
 */
import com.olsps.app.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

 
@ManagedBean(name="dtColumnsView")
@ViewScoped
public class ColumnsView implements Serializable {
     
    private final static List<String> VALID_COLUMN_KEYS = Arrays.asList("username", "firstname", "lastname", "group", "price");
     
    private String columnTemplate = "username firstname lastname group";
     
    private List<ColumnModel> columns;
     
    private List<User> cars;
     
    private List<User> filteredCars;
     
    //@ManagedProperty("#{carService}")
   // private CarService service;
 
    @PostConstruct
    public void init() {
        //cars = service.createCars(10);
         
        createDynamicColumns();
    }
     
    public List<User> getCars() {
        return cars;
    }
 
    public List<User> getFilteredCars() {
        return filteredCars;
    }
 
    public void setFilteredCars(List<User> filteredCars) {
        this.filteredCars = filteredCars;
    }
 
//    public void setService(CarService service) {
//        this.service = service;
//    }
 
    public String getColumnTemplate() {
        return columnTemplate;
    }
 
    public void setColumnTemplate(String columnTemplate) {
        this.columnTemplate = columnTemplate;
    }
 
    public List<ColumnModel> getColumns() {
        return columns;
    }
 
    private void createDynamicColumns() {
        String[] columnKeys = columnTemplate.split(" ");
        columns = new ArrayList<ColumnModel>();   
         
        for(String columnKey : columnKeys) {
            String key = columnKey.trim();
             
            if(VALID_COLUMN_KEYS.contains(key)) {
                columns.add(new ColumnModel(columnKey.toUpperCase(), columnKey));
            }
        }
    }
     
    public void updateColumns() {
        //reset table state
        UIComponent table = FacesContext.getCurrentInstance().getViewRoot().findComponent(":form:cars");
        table.setValueExpression("sortBy", null);
         
        //update columns
        createDynamicColumns();
    }
     
    static public class ColumnModel implements Serializable {
 
        private String header;
        private String property;
 
        public ColumnModel(String header, String property) {
            this.header = header;
            this.property = property;
        }
 
        public String getHeader() {
            return header;
        }
 
        public String getProperty() {
            return property;
        }
    }
}
