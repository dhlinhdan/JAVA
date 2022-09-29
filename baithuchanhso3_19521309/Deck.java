/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanhso3_19521309;

/**
 *
 * @author ASUS
 */

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
public class Deck {
    private ArrayList<Card> cards;

    public Deck()
    {
        cards = new ArrayList<Card>();

        for(int a =0; a<=3; a++)
        {
            for(int b =0; b<=12;b++)
            {
                cards.add(new Card(a,b));
            }
        }  
    }

    public Card drawRandomCard()
    {
        Random generator = new Random();
        int index = generator.nextInt(cards.size());
        return cards.remove(index);
    }

    public String toString()
    {
        String result = "Cards remaining in deck: " + cards;

        return result;

    }
    
    public void shuffle()
    {
        Collections.shuffle(this.cards); 
    }
}
