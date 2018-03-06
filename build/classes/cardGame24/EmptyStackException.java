
package cardGame24;
/**
 * Class:       <b>EmptyStackException</b>
 * File:        EmptyStackException.java
 * <pre>
 * Description: Provides an exception class to be used in CardDriver, which 
 *              inherits from StackException class class of objects thrown when
 *              an operation to access an element of an empty stack is attempted
 * Date:         3/12/2015
 * History Log:  3/6/2015, 3/12/2015
 * @version:    6.1
 * @see:        javax.swing.JFrame
 * @author:     <i>Fnu Michael, Mikey Dohyun Lim</i>
 * </pre>
 */
public class EmptyStackException extends StackException 
{
	public EmptyStackException()
	{
            System.out.println("Stack is Empty");
	}
}
