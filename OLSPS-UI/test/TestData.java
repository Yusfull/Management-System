/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.olsps.app.model.User;
import com.olsps.app.dao.UserDAOImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author Eusuph
 */
public class TestData {
    
         UserDAOImpl impl = new UserDAOImpl() ;
         User user = new User();
         List<User> adding = new ArrayList<>();
        final static Logger log = Logger.getLogger(UserDAOImpl.class.getName());
    
    public TestData() throws Exception{
        
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
     System.out.println("Testing..");
     }
     
     @Test
     public void testAddUser() throws Exception{  
         user.setFirstname("khunga");
         user.setLastname("Qolo");
         user.setUsername("yusuf");
         user.setPassword("passowrd");
         user.setDisable(true);
         user.setGroupname("dev");
         adding.add(user);
         user.setUsers(adding);
         Assert.assertNotNull(user);
         impl.newUser(user);
         
     }
     @Test
     public void testDelete(){
         String name = "Yusuf";
         List<String> val = new ArrayList<>();
         List<String> val2 = new ArrayList();
         val2 =  val;
         impl.deleteUser(name);
         val.add(name);
         val2.add(name);
         val.remove(name);
         Assert.assertNotSame(val, val2);
     }
     @Test
     public void login(){
         log.log(Level.FINER, "data");
         String name = "Yusuf";
         String pass = "Pa$$w0rd54321";
         impl.authenticateUser(name, pass);
     }
}
