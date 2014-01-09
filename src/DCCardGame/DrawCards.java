package DCCardGame;


/* @author Logan Fernandes */

public class DrawCards extends DCCardGameForm
{        
    public static Card drawFromMainDeck()
    {
        return cards.remove(0);
    }
    
    public static Card drawFromInfiniteKickDeck()
    {        
        return kickCard;
    }
    
    public static Card drawFromKickDeck()
    {
        return standardKickDeck.remove(0);
    }
    
    public static Card drawFromInfiniteWeaknessDeck()
    {        
        return weaknessCard;
    }
    
    public static Card drawFromWeaknessDeck()
    {
        return standardWeaknessDeck.remove(0);
    }
    
    public static Card drawFromSuperVillainDeck()
    {
        return standardSuperVillainDeck.remove(0);
    }
    
    public static Card drawFromSuperHeroDeck()
    {
        return standardSuperHeroDeck.remove(0);
    }
    
    public static Card drawFromPlayerDeck()
    {
        return player_1_deck.remove(0);
    }
}
