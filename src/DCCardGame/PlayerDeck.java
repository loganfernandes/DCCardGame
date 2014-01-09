package DCCardGame;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;

/* @author Logan Fernandes */

public class PlayerDeck 
{
    public ArrayList<Card> playerDeck()
    {
        ArrayList<Card> playerDeck = new ArrayList<>();
        ArrayList<Card> starterDeck = new ArrayList<>();
        ArrayList<Card> tempDeck = new Deck().buildStarterDeck();        
        starterDeck.add(tempDeck.get(0));
        starterDeck.add(tempDeck.get(0));
        starterDeck.add(tempDeck.get(0));
        starterDeck.add(tempDeck.get(1));
        starterDeck.add(tempDeck.get(1));
        
        playerDeck.addAll(starterDeck);
        playerDeck.addAll(Deck.buildSuperVillainDeck());
        playerDeck.addAll(Deck.buildMainDeck());
        
        Collections.shuffle(playerDeck);

        return playerDeck;
    }
    
    public static void addCardToDiscard(Card newCard)
    {
        DCCardGameForm.player_1_discard.add(newCard);
        DCCardGameForm.player_1_deckScore += newCard.getValue();
        DCCardGameForm.deckScoreTextBox.setText(Integer.toString(DCCardGameForm.player_1_deckScore));
    }
    
    public static void removeCardFromDiscard(Card newCard)
    {
        DCCardGameForm.player_1_discard.remove(newCard);
        DCCardGameForm.player_1_deckScore -= newCard.getValue();
    }
    
    public static void addCardToHand(Card newCard, JLabel slot)
    {
        DCCardGameForm.player_1_hand.add(newCard);
        DCCardGameForm.player_1_currentPower += newCard.getPower();
        DCCardGameForm.currentPowerTextBox.setText(Integer.toString(DCCardGameForm.player_1_currentPower));
        slot.setIcon(new ImageIcon(newCard.getImage()));
        slot.setToolTipText(newCard.getCardText());
    }
    
    public static void removeCardFromHand(Card newCard, JLabel slot)
    {
        DCCardGameForm.player_1_hand.remove(newCard);
        DCCardGameForm.player_1_currentPower -= newCard.getPower();
        DCCardGameForm.currentPowerTextBox.setText(Integer.toString(DCCardGameForm.player_1_currentPower));
        DCCardGameForm.playerHandPanel.remove(slot);
        DCCardGameForm.playerHandPanel.repaint();
        DCCardGameForm.playerHandPanel.validate();
        DCCardGameForm.playerHandScrollPane.validate();
        JScrollBar horizontal = DCCardGameForm.playerHandScrollPane.getHorizontalScrollBar();
        horizontal.setValue(horizontal.getMaximum());
    }
}
