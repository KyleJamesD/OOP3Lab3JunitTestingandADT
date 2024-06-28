/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author kyled
 */
public class KeyIsNull extends Exception {
    

	public KeyIsNull()
	{
		super();
	}

	/**
	 * @param message error message specific to cause of error.
	 */
	public KeyIsNull( String message )
	{
		super( message );
	}
}
