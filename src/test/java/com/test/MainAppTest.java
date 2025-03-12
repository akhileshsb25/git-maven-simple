package com.test;



import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.MainApp;
public class MainAppTest {

    @Test
    public void testAddition() {
        MainApp mainApp = new MainApp();
        
        // Test case 1: 4 + 5 = 9
        assertEquals(9, mainApp.addition(4, 5));
        
        // Test case 2: 10 + 20 = 30
        assertEquals(30, mainApp.addition(10, 20));
        
        // Test case 3: -5 + 5 = 0
        assertEquals(0, mainApp.addition(-5, 5));
        
        // Test case 4: -4 + -6 = -10
        assertEquals(-10, mainApp.addition(-4, -6));
    }
}

