package cardGame24;
/**
 * Class:       <b>StackException</b>
 * File:        StackException.java
 * <pre>
 * Description: Provides a parent classs to EmptyStackException and FullStackexception
 * Date:         3/12/2015
 * History Log:  3/6/2015, 3/12/2015
 * @version:    6.1
 * @see:        javax.swing.JFrame
 * @author:     <i>Fnu Michael, Mikey Dohyun Lim</i>
 * </pre>
 */

/** parent class of all stack exceptions */
class StackException extends Exception 
{
	public StackException()
	{
		System.out.println("Stack Exception");
	}
}

