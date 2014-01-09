package DCCardGame;

import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;

/* @author Logan Fernandes */

public class Card
{
    private String cardName;
    private String type;
    private int cost;
    private int value;
    private int power;
    private String image;
    private String cardText;
    
    public Card()
    {
        power = 0;
        cost = 0;
        value = 0;
        type = "";
        cardName = "";
        image = null;
        cardText = "";
    }
    public Card(String cardName, String type, int cost, int value, int power, String image, String cardText)
    {
        this.cardName = cardName;
        this.type = type;
        this.cost = cost;        
        this.value = value;        
        this.power = power;
        this.image = image;
        this.cardText = cardText;
    }

    /*** @return the cardName */
    public String getCardName() {
        return cardName;
    }

    /*** @param cardName the cardName to set */
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    /*** @return the type */
    public String getType() {
        return type;
    }

    /*** @param type the type to set */
    public void setType(String type) {
        this.type = type;
    }

    /*** @return the cost */
    public int getCost() {
        return cost;
    }

    /*** @param cost the cost to set */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /*** @return the value */
    public int getValue() {
        return value;
    }

    /*** @param value the value to set */
    public void setValue(int value) {
        this.value = value;
    }

    /*** @return the power */
    public int getPower() {
        return power;
    }

    /*** @param power the power to set */
    public void setPower(int power) {
        this.power = power;
    }

    /*** @return the image */
    public String getImage() {
        return image;
    }

    /*** @param image the image to set */
    public void setImage(String image) {
        this.image = image;
    }
    
    /*** @return the cardText */
    public String getCardText() {
        return cardText;
    }

    /*** @param cardText the cardText to set */
    public void setCardText(String cardText) {
        this.cardText = cardText;
    }
    @Override
    public String toString()
    {
        return cardName;
    }
    

}
