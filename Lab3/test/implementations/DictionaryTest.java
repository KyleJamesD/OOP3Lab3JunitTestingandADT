/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package implementations;

import exceptions.ElementNotFound;
import exceptions.KeyIsNull;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kyled
 */
public class DictionaryTest {
    
    public DictionaryTest() {
    }

    /**
     * Test of insert method, of class Dictionary.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Object k = null;
        Object v = null;
        Dictionary instance = new Dictionary();
        instance.insert(k, v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        //assertEquals(expected,actual);
    }

    /**
     * Test of remove method, of class Dictionary.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Object k = null;
        Dictionary instance = new Dictionary();
        instance.remove(k);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Dictionary.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Object k = null;
        Object v = null;
        Dictionary instance = new Dictionary();
        instance.update(k, v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lookup method, of class Dictionary.
     */
    @Test
    public void testLookup()throws ElementNotFound, KeyIsNull {
        System.out.println("lookup");
        Object k = null;
        Dictionary instance = new Dictionary();
        instance.lookup(k);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
