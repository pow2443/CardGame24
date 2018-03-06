package cardGame24;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
/**
 * Class:       <b>DeckOfCards</b>
 * File:        DeckOfCards.java
 * <pre>
 * Description: This DeckOfCard class is used to create a deck of card. It has a
 *               default constructor that uses for loop to read png image files 
 *              in resources folder and stores them into an arraylist. It also
 *              has a refresh() method to deal a new random 4 cards.
 *               
 * Date:         3/12/2015
 * History Log:  3/6/2015, 3/7/2015, 3/9/2015, 3/10/2015, 3/11/2015, 3/12/2015
 * @version:    6.1
 * @see:        javax.swing.JFrame
 * @author:     <i>Fnu Michael, Mikey Dohyun Lim</i>
 * </pre>
 */
public class DeckOfCards 
{
    //instance variables
    public ArrayList<ImageIcon> list = new ArrayList<>();    
    public Random rnd = new Random();
    public final int MAX_NUM_CARDS = 52;
    public int one;
    public int two;
    public int three;
    public int four;
    
    /**
     * default constructor
     */
    public DeckOfCards()
    {
        for(int i = 0; i < MAX_NUM_CARDS; i++)
        {
            list.add(new ImageIcon("src/resources/" + (i + 1) + ".png"));
        }
        // randomly generated numbers
        one = rnd.nextInt(MAX_NUM_CARDS);
        two = rnd.nextInt(MAX_NUM_CARDS);
        three = rnd.nextInt(MAX_NUM_CARDS);
        four = rnd.nextInt(MAX_NUM_CARDS);
    }
    /**
     *  refreshes 4 new cards and make sure they are not the same exact card
     */
    public void refresh()
    {       
        one = rnd.nextInt(MAX_NUM_CARDS);
        two = rnd.nextInt(MAX_NUM_CARDS);
        three = rnd.nextInt(MAX_NUM_CARDS);
        four = rnd.nextInt(MAX_NUM_CARDS);
        
        while(one == two || one == three || one == four ||  
              two == three || two == four || three == four)
        {
            two = rnd.nextInt(MAX_NUM_CARDS);
            three = rnd.nextInt(MAX_NUM_CARDS);
            four = rnd.nextInt(MAX_NUM_CARDS);            
        }
    }
}
