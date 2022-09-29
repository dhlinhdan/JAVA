/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanhso3_19521309;

/**
 *
 * @author ASUS
 */
public class Card {
    private int type, value;
    private String[] cardType = {"Clubs", "Spades", "Diamonds", "Hearts"};
    private String[] cardValue = {"Ace", "King", "Queen", "Jack", "10",
                                   "9", "8", "7", "6", "5", "4", "3", "2"};

    public Card(int types, int values)
    {
        type = types; 
        value = values;
    }     

    public String toString()
    {
        String finalCard = cardValue[value] + " of " + cardType[type] + "\n";
        
        return finalCard;
    }
}
