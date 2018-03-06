package cardGame24;
/**
 * Class:       <b>GenericStack</b>
 * File:        GenericStack.java
 * <pre>
 * Description: Provides GenericStack class to be used in the CardDriver
 * Date:         3/12/2015
 * History Log:  3/6/2015, 3/12/2015
 * @version:    6.1
 * @see:        javax.swing.JFrame
 * @author:     <i>Fnu Michael, Mikey Dohyun Lim</i>
 * </pre>
 */
public class GenericStack<E> 
{
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();

    public int getSize() 
    {
      return list.size();
    }

    public E peek() throws EmptyStackException
    {
      if ( isEmpty() ) 
      {
         throw new EmptyStackException();
      }
      return list.get(getSize() - 1);
    }

    public void push(E o) throws FullStackException
    {
      list.add(o);
    }

    public E pop() throws EmptyStackException
    {
      if ( isEmpty() ) 
      {
         throw new EmptyStackException();
      }
      E o = list.get(getSize() - 1);
      list.remove(getSize() - 1);
      return o;
    }

    public boolean isEmpty() 
    {
      return list.isEmpty();
    }

    @Override
    public String toString() 
    {
      return "stack: " + list.toString();
    }
}
