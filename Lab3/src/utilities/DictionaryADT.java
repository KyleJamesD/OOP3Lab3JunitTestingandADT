package utilities;

import exceptions.DuplicateKeyException;
import exceptions.ElementNotFound;
import exceptions.KeyIsNull;

/**
* DictionaryADT.java
*
* @author Kyle Dyck
* @version major.minor revision number starting at 1.0
* 
* Class Definition: This interface represents the public contract for the
* implementation of Dictionary for the DictionaryADT Lab. 
* This Dictionary must be able to hold data of Type <V> and each value must have a unique key.
* 
* 
* 
* 
*/

public interface DictionaryADT<K,V>
{
    
    
    /**
     * preConditions:
     * @param k The Unique Key of the Element
     * @param v The value to be Added
     * k cannot be Null.
     * 
     * postConditions:
     * Inserts a value with a unique Key to the Dictionary if it is possible to do so.
     * 
     * @throws an DuplicateKeyException error if The key passed is the same as another Key.
     * @throws a Key is Null error if Key is passed as null
     * 
     * 
     */
    public void insert(K k, V v);
    
    
    /**
     * preConditions:
     * The Dictionary cannot be empty
     * @param k The key of the Element to be removed
     * postConditions:
     * Will remove the element from the dictionary with the matching unique key
     * 
     * @throws a Key is Null error if Key is passed as null
     * @throws an ElementNotFound error if Key passed does not match another key.
     * 
     */
    public void remove(K k);
    
    
    /**
     * preConditions:
     * k cannot be Null.
     * @param k The key of the element to be updated
     * @param v The new value to update the element with
     * 
     * postConditions:
     * Updates an already existing element value with a new value.
     * 
     * @throws a Key is Null error if Key is passed as null
     * @throws a ElementNotFound error if Key passed does not match another key.
     * 
     * 
     */
    public void update(K k, V v);
    
    
    /**
     * preConditions:
     * @param k The key of the element to be updated
     * k cannot be Null.
     * 
     * postConditions:
     * @return The value of the element that has a matching key
     * 
     * @throws a Key is Null error if Key is passed as null
     * @throws a ElementNotFound error if Key passed does not match another key.
     * 
     * 
     */
    
    public V lookup(K k)throws ElementNotFound, KeyIsNull;
    
    
    
    
    
}
