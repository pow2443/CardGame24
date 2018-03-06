package cardGame24;
/**
 * Class:       <b>FullStackException</b>
 * File:        FullStackException.java
 * Description: Provides an exception class to be used in CardDriver, which
 *              inherits from StackException class. Class of objects thrown 
 *              when an operation to add an element to a full stack is attempted
 * Date:         3/12/2015
 * History Log:  3/6/2015, 3/12/2015
 * @version:    6.1
 * @see:        javax.swing.JFrame
 * @author:     Fnu Michael, Mikey Dohyun Lim
 */
public class FullStackException extends StackException
{
	public FullStackException()
	{
            System.out.println("Stack is Full");
	}
}

