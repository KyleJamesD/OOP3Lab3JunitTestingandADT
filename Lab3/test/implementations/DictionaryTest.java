/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package implementations;
import java.util.ArrayList;
import exceptions.ElementNotFound;
import exceptions.KeyIsNull;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kyled
 */
public class DictionaryTest<K,V> {
    
    public DictionaryTest() {
    }

    /**
     * Test of insert method, of class Dictionary.
     */
    @Test
    public void testInsert()throws ElementNotFound, KeyIsNull {
        
        //Test 1
        System.out.println("insert");
        Integer k = 1;
        Integer v = 1;
        Dictionary instance = new Dictionary();
        instance.insert(k, v);
        Integer expected = 1;
        Integer actual = (Integer) instance.lookup(1);
        assertEquals(expected,actual);
        
        
        //test 2
        //Test 1
        System.out.println("insert");
        Integer k2 = 2;
        Integer v2 = 21;
        instance.insert(k2, v2);
        Integer expected2 = 21;
        Integer actual2 = (Integer) instance.lookup(2);
        assertEquals(expected2,actual2);
        
        
        //test3
        System.out.println("insert");
        Integer k3 = 3;
        Integer v3 = 31;
        instance.insert(k3, v3);
        Integer expected3 = 31;
        Integer actual3 = (Integer) instance.lookup(3);
        assertEquals(expected3,actual3);
        
        //test4
        
        
        System.out.println("insert");
        String k4 = "four";
        String v4 = "4";
        instance.insert(k4, v4);
        String expected4 = "4";
        String actual4 = (String) instance.lookup("four");
        assertEquals(expected4,actual4);
        
        
        
        
    }

    /**
     * Test of remove method, of class Dictionary.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Integer k = 1;
        Integer v = 1;
        Dictionary instance = new Dictionary();
        instance.insert(k, v);
        Integer k2 = 2;
        Integer v2 = 21;
        instance.insert(k2, v2);
        Integer k3 = 3;
        Integer v3 = 31;
        instance.insert(k3, v3);
        String k4 = "four";
        String v4 = "4";
        instance.insert(k4, v4);
        System.out.println(instance.toString());
        
        
        
        int checksize = 4;
        instance.keys.size();
        assertEquals(checksize,instance.keys.size());
        assertEquals(checksize,instance.values.size());
        
        
        
        String remove = "four";
        instance.remove(remove);

        

        System.out.println(instance.toString());
        
        int checksize2 = 3;
        instance.keys.size();
        
        assertEquals(checksize2,instance.keys.size());
        assertEquals(checksize2,instance.values.size());
        
        
    }

    /**
     * Test of update method, of class Dictionary.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Integer k = 1;
        Integer v = 1;
        Dictionary instance = new Dictionary();
        instance.insert(k, v);
        Integer k2 = 2;
        Integer v2 = 21;
        instance.insert(k2, v2);
        Integer k3 = 3;
        Integer v3 = 31;
        instance.insert(k3, v3);
        String k4 = "four";
        String v4 = "4";
        instance.insert(k4, v4);
        System.out.println(instance.toString());
        String v5 = "five";
        instance.update(k, v5);
        System.out.println(instance.toString());
        
        String expected = v5;
        int actualindex = instance.keys.indexOf(k);
        
        String actual =  (String) instance.values.get(actualindex);
        
        assertEquals(expected,actual);
        
        
    }
    
    

    /**
     * Test of lookup method, of class Dictionary.
     */
    @Test
    public void testLookup()throws ElementNotFound, KeyIsNull {
        System.out.println("lookup");
        System.out.println("update");
        Integer k = 1;
        Integer v = 1;
        Dictionary instance = new Dictionary();
        instance.insert(k, v);
        Integer k2 = 2;
        Integer v2 = 21;
        instance.insert(k2, v2);
        Integer k3 = 3;
        Integer v3 = 31;
        instance.insert(k3, v3);
        String k4 = "four";
        String v4 = "4";
        instance.insert(k4, v4);
        System.out.println(instance.toString());
        
        int expected = 1;
        
        int expected2 = 21;
        
        int expected3 = 31;
        
        String expected4 = "4";
                
        
        var actual = instance.lookup(k);
        var actual2 = instance.lookup(k2);
        var actual3 = instance.lookup(k3);
        var actual4 = instance.lookup(k4);
        
        assertEquals(expected,actual);
        assertEquals(expected2,actual2);
        assertEquals(expected3,actual3);
        assertEquals(expected4,actual4);
        
        
        

    }
    
}
