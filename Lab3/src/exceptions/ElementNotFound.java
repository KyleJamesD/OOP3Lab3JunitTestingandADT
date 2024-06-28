/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author kyled
 */
public class ElementNotFound extends Exception {
    
        public ElementNotFound()
	{
		super();
	}

	/**
	 * @param message error message specific to cause of error.
	 */
	public ElementNotFound( String message )
	{
		super( message );
	}
    
    
    
    
}
