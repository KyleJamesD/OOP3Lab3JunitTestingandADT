package implementations;

import java.util.ArrayList;

import exceptions.ElementNotFound;
import exceptions.KeyIsNull;
import exceptions.DuplicateKeyException;
import utilities.DictionaryADT;

public class Dictionary<K,V> implements DictionaryADT<K,V>
{
	// constant
	private static final int DEFAULT_SIZE = 10;
	
	// index indicates pairing, e.g. keys[1] is stored at values[1]
	public ArrayList<K> keys;
	public ArrayList<V> values;
        
        public Dictionary() {
        this.keys = new ArrayList<>();
        this.values = new ArrayList<>();
    }
        

    @Override
    public void insert(K k, V v) {
        //Duplicate Key
        try{
            if(keys.contains(k)){
            throw new DuplicateKeyException();
            }
        }
        catch(DuplicateKeyException ex){
        System.out.println("DuplicateKeyException error");
        return;
        }
        //KeyisNull
        try{
            if(k == null)
            throw new KeyIsNull();
        }
        catch(KeyIsNull ex){
            System.out.println("Key is Null");
            return;
        }
        keys.add(k);
        values.add(v);
    }
    

    @Override
    public void remove(K k) {
        //Element Not Found
        try{
            if(keys.contains(k) != true)
            throw new ElementNotFound();
        }
        catch(ElementNotFound ex){
            System.out.println("Element Not Found");
            return;
        }
        
        //KeyisNull
        try{
            if(k == null)
            throw new KeyIsNull();
        }
        catch(KeyIsNull ex){
            System.out.println("Key is Null");
            return;
        }
        
        int itemtoremove = keys.indexOf(k);
        values.remove(itemtoremove);
        keys.remove(k);
        
    }
    
    
    

    @Override
    public void update(K k, V v) {
        //Element Not Found
        try{
            if(keys.contains(k) != true)
            throw new ElementNotFound();
        }
        catch(ElementNotFound ex){
            System.out.println("Element Not Found");
            return;
        }
        
        //KeyisNull
        try{
            if(k == null)
            throw new KeyIsNull();
        }
        catch(KeyIsNull ex){
            System.out.println("Key is Null");
            return;
        }
        
        
        int itemtoupdate = keys.indexOf(k);
        values.remove(itemtoupdate);
        values.add(itemtoupdate,v);
    }

    @Override
    public V lookup(K k)throws ElementNotFound, KeyIsNull {
        
        //Element Not Found

            if(keys.contains(k) != true){
            throw new ElementNotFound("Element Not Found");
            }

        //KeyisNull
            if(k == null){
            throw new KeyIsNull("Key is Null");
            }
        int itemtofind = keys.indexOf(k);
        return values.get(itemtofind);
       
    }

    @Override
    public String toString() {
        return "Dictionary{" + "keys=" + keys + ", values=" + values + '}';
    }
    
    
    
    
    
    
    
    
    
      

}
