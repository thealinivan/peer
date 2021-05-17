package peer;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestTask1 {
 	Task1 t1 = new Task1();
 	
    @BeforeClass
    public static void start() {
        
    }
    
    @Before
    public void before() {
  
    }
    
 
    @Test
    public void TestGetFactorial() {
    	assertEquals("Number is 5!", t1.getFactorial(120));
    	assertEquals("Number is not factorial", t1.getFactorial(150));
    }
    
    
    

 

    
    @After
    public void after() {

    }
    
    @AfterClass
    public static void end() {

    }
}


