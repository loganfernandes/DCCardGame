package DCCardGame;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import jxl.*;
import jxl.read.biff.BiffException;
import java.util.ArrayList;
import java.util.Collections;

/******************************************************************************
 * @author Logan Fernandes
 *****************************************************************************/

public class Deck 
{
    public static ArrayList<Card> buildMainDeck()
    {
        //initializes the workbook and creates a variable
        Workbook mainDeckcardList  = null;
        try
        {
            mainDeckcardList  = Workbook.getWorkbook(new File("C:\\DC Card Game\\src\\DCCardGame\\resources\\CardList.xls"));
        }
        catch (IOException e)
        {
            String message = "The file titled CardList.xls was not found.";
            String title = "File Not Found";
            JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
        } catch (BiffException ex) 
        {
            String message = "File must have an extension of .xls";
            String title = "Incompatible CardList File";
            JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
        }        
        
            //creates objects of each sheet in the CardList spreadsheet
            Sheet typeSheet = mainDeckcardList.getSheet(0);
            Sheet equipmentSheet = mainDeckcardList.getSheet(1);
            Sheet heroSheet = mainDeckcardList.getSheet(2);
            Sheet superPowerSheet = mainDeckcardList.getSheet(4);
            Sheet villainSheet = mainDeckcardList.getSheet(6);
            Sheet locationSheet = mainDeckcardList.getSheet(10);
            
            //assigns the card type to a variable
            String equipmentType = typeSheet.getCell(0,1).getContents();
            String heroType = typeSheet.getCell(0,2).getContents();           
            String superPowerType = typeSheet.getCell(0,4).getContents();
            String villainType = typeSheet.getCell(0,6).getContents();
            String locationType = typeSheet.getCell(0,9).getContents();
       
            //Loads all equipment cards into variables
            Card aquamansTrident =  new Card(equipmentSheet.getCell(0, 1).getContents(),equipmentType,Integer.parseInt(equipmentSheet.getCell(2,1).getContents()),Integer.parseInt(equipmentSheet.getCell(3,1).getContents()),Integer.parseInt(equipmentSheet.getCell(4,1).getContents()),equipmentSheet.getCell(5,1).getContents(), equipmentSheet.getCell(6, 1).getContents());
            Card batmobile =        new Card(equipmentSheet.getCell(0, 2).getContents(),equipmentType,Integer.parseInt(equipmentSheet.getCell(2,2).getContents()),Integer.parseInt(equipmentSheet.getCell(3,2).getContents()),Integer.parseInt(equipmentSheet.getCell(4,2).getContents()),equipmentSheet.getCell(5,2).getContents(), equipmentSheet.getCell(6, 2).getContents());
            Card greenArrowsBow =   new Card(equipmentSheet.getCell(0, 3).getContents(),equipmentType,Integer.parseInt(equipmentSheet.getCell(2,3).getContents()),Integer.parseInt(equipmentSheet.getCell(3,3).getContents()),Integer.parseInt(equipmentSheet.getCell(4,3).getContents()),equipmentSheet.getCell(5,3).getContents(), equipmentSheet.getCell(6, 3).getContents());
            Card lassoOfTruth =     new Card(equipmentSheet.getCell(0, 4).getContents(),equipmentType,Integer.parseInt(equipmentSheet.getCell(2,4).getContents()),Integer.parseInt(equipmentSheet.getCell(3,4).getContents()),Integer.parseInt(equipmentSheet.getCell(4,4).getContents()),equipmentSheet.getCell(5,4).getContents(), equipmentSheet.getCell(6, 4).getContents());
            Card nthMetal =         new Card(equipmentSheet.getCell(0, 5).getContents(),equipmentType,Integer.parseInt(equipmentSheet.getCell(2,5).getContents()),Integer.parseInt(equipmentSheet.getCell(3,5).getContents()),Integer.parseInt(equipmentSheet.getCell(4,5).getContents()),equipmentSheet.getCell(5,5).getContents(), equipmentSheet.getCell(6, 5).getContents());
            Card powerRing =        new Card(equipmentSheet.getCell(0, 6).getContents(),equipmentType,Integer.parseInt(equipmentSheet.getCell(2,6).getContents()),Integer.parseInt(equipmentSheet.getCell(3,6).getContents()),Integer.parseInt(equipmentSheet.getCell(4,6).getContents()),equipmentSheet.getCell(5,6).getContents(), equipmentSheet.getCell(6, 6).getContents());
            Card theBatSignal =     new Card(equipmentSheet.getCell(0, 7).getContents(),equipmentType,Integer.parseInt(equipmentSheet.getCell(2,7).getContents()),Integer.parseInt(equipmentSheet.getCell(3,7).getContents()),Integer.parseInt(equipmentSheet.getCell(4,7).getContents()),equipmentSheet.getCell(5,7).getContents(), equipmentSheet.getCell(6, 7).getContents());
            Card theCapeAndCowl =   new Card(equipmentSheet.getCell(0, 8).getContents(),equipmentType,Integer.parseInt(equipmentSheet.getCell(2,8).getContents()),Integer.parseInt(equipmentSheet.getCell(3,8).getContents()),Integer.parseInt(equipmentSheet.getCell(4,8).getContents()),equipmentSheet.getCell(5,8).getContents(), equipmentSheet.getCell(6, 8).getContents());
            Card utilityBelt =      new Card(equipmentSheet.getCell(0, 9).getContents(),equipmentType,Integer.parseInt(equipmentSheet.getCell(2,9).getContents()),Integer.parseInt(equipmentSheet.getCell(3,9).getContents()),Integer.parseInt(equipmentSheet.getCell(4,9).getContents()),equipmentSheet.getCell(5,9).getContents(), equipmentSheet.getCell(6, 9).getContents());
            
            //Adds all equipment to an ArrayList
            ArrayList<Card> equipmentDeck = new ArrayList<>();
            equipmentDeck.add(aquamansTrident);
            equipmentDeck.add(batmobile);
            equipmentDeck.add(greenArrowsBow);
            equipmentDeck.add(lassoOfTruth);
            equipmentDeck.add(nthMetal);
            equipmentDeck.add(powerRing);
            equipmentDeck.add(theBatSignal);
            equipmentDeck.add(theCapeAndCowl);
            equipmentDeck.add(utilityBelt);
            
            //Loads all hero cards into variables
            Card blueBeetle =       new Card(heroSheet.getCell(0, 1).getContents(),heroType,Integer.parseInt(heroSheet.getCell(2,1).getContents()),Integer.parseInt(heroSheet.getCell(3,1).getContents()),Integer.parseInt(heroSheet.getCell(4,1).getContents()),heroSheet.getCell(5,1).getContents(), heroSheet.getCell(6, 1).getContents());
            Card catwoman =         new Card(heroSheet.getCell(0, 2).getContents(),heroType,Integer.parseInt(heroSheet.getCell(2,2).getContents()),Integer.parseInt(heroSheet.getCell(3,2).getContents()),Integer.parseInt(heroSheet.getCell(4,2).getContents()),heroSheet.getCell(5,2).getContents(), heroSheet.getCell(6, 2).getContents());
            Card darkKnight =       new Card(heroSheet.getCell(0, 3).getContents(),heroType,Integer.parseInt(heroSheet.getCell(2,3).getContents()),Integer.parseInt(heroSheet.getCell(3,3).getContents()),Integer.parseInt(heroSheet.getCell(4,3).getContents()),heroSheet.getCell(5,3).getContents(), heroSheet.getCell(6, 3).getContents());
            Card emeraldKnight =    new Card(heroSheet.getCell(0, 4).getContents(),heroType,Integer.parseInt(heroSheet.getCell(2,4).getContents()),Integer.parseInt(heroSheet.getCell(3,4).getContents()),Integer.parseInt(heroSheet.getCell(4,4).getContents()),heroSheet.getCell(5,4).getContents(), heroSheet.getCell(6, 4).getContents());
            Card greenArrow =       new Card(heroSheet.getCell(0, 5).getContents(),heroType,Integer.parseInt(heroSheet.getCell(2,5).getContents()),Integer.parseInt(heroSheet.getCell(3,5).getContents()),Integer.parseInt(heroSheet.getCell(4,5).getContents()),heroSheet.getCell(5,5).getContents(), heroSheet.getCell(6, 5).getContents());
            Card highTechHero =     new Card(heroSheet.getCell(0, 6).getContents(),heroType,Integer.parseInt(heroSheet.getCell(2,6).getContents()),Integer.parseInt(heroSheet.getCell(3,6).getContents()),Integer.parseInt(heroSheet.getCell(4,6).getContents()),heroSheet.getCell(5,6).getContents(), heroSheet.getCell(6, 6).getContents());
            Card jonnJonzz =        new Card(heroSheet.getCell(0, 7).getContents(),heroType,Integer.parseInt(heroSheet.getCell(2,7).getContents()),Integer.parseInt(heroSheet.getCell(3,7).getContents()),Integer.parseInt(heroSheet.getCell(4,7).getContents()),heroSheet.getCell(5,7).getContents(), heroSheet.getCell(6, 7).getContents());
            Card kidFlash =         new Card(heroSheet.getCell(0, 8).getContents(),heroType,Integer.parseInt(heroSheet.getCell(2,8).getContents()),Integer.parseInt(heroSheet.getCell(3,8).getContents()),Integer.parseInt(heroSheet.getCell(4,8).getContents()),heroSheet.getCell(5,8).getContents(), heroSheet.getCell(6, 8).getContents());
            Card kingOfAtlantis =   new Card(heroSheet.getCell(0, 9).getContents(),heroType,Integer.parseInt(heroSheet.getCell(2,9).getContents()),Integer.parseInt(heroSheet.getCell(3,9).getContents()),Integer.parseInt(heroSheet.getCell(4,9).getContents()),heroSheet.getCell(5,9).getContents(), heroSheet.getCell(6, 9).getContents());
            Card manOfSteel =       new Card(heroSheet.getCell(0, 10).getContents(),heroType,Integer.parseInt(heroSheet.getCell(2,10).getContents()),Integer.parseInt(heroSheet.getCell(3,10).getContents()),Integer.parseInt(heroSheet.getCell(4,10).getContents()),heroSheet.getCell(5,10).getContents(), heroSheet.getCell(6, 10).getContents());
            Card mera =             new Card(heroSheet.getCell(0, 11).getContents(),heroType,Integer.parseInt(heroSheet.getCell(2,11).getContents()),Integer.parseInt(heroSheet.getCell(3,11).getContents()),Integer.parseInt(heroSheet.getCell(4,11).getContents()),heroSheet.getCell(5,11).getContents(), heroSheet.getCell(6, 11).getContents());
            Card princessDiana =    new Card(heroSheet.getCell(0, 12).getContents(),heroType,Integer.parseInt(heroSheet.getCell(2,12).getContents()),Integer.parseInt(heroSheet.getCell(3,12).getContents()),Integer.parseInt(heroSheet.getCell(4,12).getContents()),heroSheet.getCell(5,12).getContents(), heroSheet.getCell(6, 12).getContents());
            Card robin =            new Card(heroSheet.getCell(0, 13).getContents(),heroType,Integer.parseInt(heroSheet.getCell(2,13).getContents()),Integer.parseInt(heroSheet.getCell(3,13).getContents()),Integer.parseInt(heroSheet.getCell(4,13).getContents()),heroSheet.getCell(5,13).getContents(), heroSheet.getCell(6, 13).getContents());
            Card supergirl =        new Card(heroSheet.getCell(0, 14).getContents(),heroType,Integer.parseInt(heroSheet.getCell(2,14).getContents()),Integer.parseInt(heroSheet.getCell(3,14).getContents()),Integer.parseInt(heroSheet.getCell(4,14).getContents()),heroSheet.getCell(5,14).getContents(), heroSheet.getCell(6, 14).getContents());
            Card swampThing =       new Card(heroSheet.getCell(0, 15).getContents(),heroType,Integer.parseInt(heroSheet.getCell(2,15).getContents()),Integer.parseInt(heroSheet.getCell(3,15).getContents()),Integer.parseInt(heroSheet.getCell(4,15).getContents()),heroSheet.getCell(5,15).getContents(), heroSheet.getCell(6, 15).getContents());
            Card fastestManAlive =  new Card(heroSheet.getCell(0, 16).getContents(),heroType,Integer.parseInt(heroSheet.getCell(2,16).getContents()),Integer.parseInt(heroSheet.getCell(3,16).getContents()),Integer.parseInt(heroSheet.getCell(4,16).getContents()),heroSheet.getCell(5,16).getContents(), heroSheet.getCell(6, 16).getContents());
            Card zatannaZatara =    new Card(heroSheet.getCell(0, 17).getContents(),heroType,Integer.parseInt(heroSheet.getCell(2,17).getContents()),Integer.parseInt(heroSheet.getCell(3,17).getContents()),Integer.parseInt(heroSheet.getCell(4,17).getContents()),heroSheet.getCell(5,17).getContents(), heroSheet.getCell(6, 17).getContents());
            
            //Adds all heroes to an ArrayList
            ArrayList<Card> heroDeck = new ArrayList<>();
            heroDeck.add(blueBeetle);
            heroDeck.add(catwoman);
            heroDeck.add(darkKnight);
            heroDeck.add(emeraldKnight);
            heroDeck.add(greenArrow);
            heroDeck.add(highTechHero);
            heroDeck.add(jonnJonzz);
            heroDeck.add(kidFlash);
            heroDeck.add(kingOfAtlantis);
            heroDeck.add(manOfSteel);
            heroDeck.add(mera);
            heroDeck.add(princessDiana);
            heroDeck.add(robin);
            heroDeck.add(supergirl);
            heroDeck.add(swampThing);
            heroDeck.add(fastestManAlive);
            heroDeck.add(zatannaZatara);            
                        
            //Loads all Super Powers into variables
            Card bulletproof =      new Card(superPowerSheet.getCell(0, 1).getContents(),superPowerType,Integer.parseInt(superPowerSheet.getCell(2,1).getContents()),Integer.parseInt(superPowerSheet.getCell(3,1).getContents()),Integer.parseInt(superPowerSheet.getCell(4,1).getContents()),superPowerSheet.getCell(5,1).getContents(), superPowerSheet.getCell(6, 1).getContents());
            Card heatVision =       new Card(superPowerSheet.getCell(0, 2).getContents(),superPowerType,Integer.parseInt(superPowerSheet.getCell(2,2).getContents()),Integer.parseInt(superPowerSheet.getCell(3,2).getContents()),Integer.parseInt(superPowerSheet.getCell(4,2).getContents()),superPowerSheet.getCell(5,2).getContents(), superPowerSheet.getCell(6, 2).getContents());
            Card superSpeed =       new Card(superPowerSheet.getCell(0, 3).getContents(),superPowerType,Integer.parseInt(superPowerSheet.getCell(2,3).getContents()),Integer.parseInt(superPowerSheet.getCell(3,3).getContents()),Integer.parseInt(superPowerSheet.getCell(4,3).getContents()),superPowerSheet.getCell(5,3).getContents(), superPowerSheet.getCell(6, 3).getContents());
            Card superStrength =    new Card(superPowerSheet.getCell(0, 4).getContents(),superPowerType,Integer.parseInt(superPowerSheet.getCell(2,4).getContents()),Integer.parseInt(superPowerSheet.getCell(3,4).getContents()),Integer.parseInt(superPowerSheet.getCell(4,4).getContents()),superPowerSheet.getCell(5,4).getContents(), superPowerSheet.getCell(6, 4).getContents());
            Card xrayVision =       new Card(superPowerSheet.getCell(0, 5).getContents(),superPowerType,Integer.parseInt(superPowerSheet.getCell(2,5).getContents()),Integer.parseInt(superPowerSheet.getCell(3,5).getContents()),Integer.parseInt(superPowerSheet.getCell(4,5).getContents()),superPowerSheet.getCell(5,5).getContents(), superPowerSheet.getCell(6, 5).getContents());
    
            //Adds all Super Powers to an Arraylist
            ArrayList<Card> superPowersDeck = new ArrayList<>();
            superPowersDeck.add(bulletproof);
            superPowersDeck.add(heatVision);
            superPowersDeck.add(superSpeed);
            superPowersDeck.add(superStrength);
            superPowersDeck.add(xrayVision);            
            
            //Load all Villains into variables
            Card bane =             new Card(villainSheet.getCell(0, 1).getContents(),villainType,Integer.parseInt(villainSheet.getCell(2,1).getContents()),Integer.parseInt(villainSheet.getCell(3,1).getContents()),Integer.parseInt(villainSheet.getCell(4,1).getContents()),villainSheet.getCell(5,1).getContents(), villainSheet.getCell(6, 1).getContents());
            Card bizarro =          new Card(villainSheet.getCell(0, 2).getContents(),villainType,Integer.parseInt(villainSheet.getCell(2,2).getContents()),Integer.parseInt(villainSheet.getCell(3,2).getContents()),Integer.parseInt(villainSheet.getCell(4,2).getContents()),villainSheet.getCell(5,2).getContents(), villainSheet.getCell(6, 2).getContents());
            Card cheetah =          new Card(villainSheet.getCell(0, 3).getContents(),villainType,Integer.parseInt(villainSheet.getCell(2,3).getContents()),Integer.parseInt(villainSheet.getCell(3,3).getContents()),Integer.parseInt(villainSheet.getCell(4,3).getContents()),villainSheet.getCell(5,3).getContents(), villainSheet.getCell(6, 3).getContents());
            Card clayface =         new Card(villainSheet.getCell(0, 4).getContents(),villainType,Integer.parseInt(villainSheet.getCell(2,4).getContents()),Integer.parseInt(villainSheet.getCell(3,4).getContents()),Integer.parseInt(villainSheet.getCell(4,4).getContents()),villainSheet.getCell(5,4).getContents(), villainSheet.getCell(6, 4).getContents());
            Card doomsday =         new Card(villainSheet.getCell(0, 5).getContents(),villainType,Integer.parseInt(villainSheet.getCell(2,5).getContents()),Integer.parseInt(villainSheet.getCell(3,5).getContents()),Integer.parseInt(villainSheet.getCell(4,5).getContents()),villainSheet.getCell(5,5).getContents(), villainSheet.getCell(6, 5).getContents());
            Card gorillaGrodd =     new Card(villainSheet.getCell(0, 6).getContents(),villainType,Integer.parseInt(villainSheet.getCell(2,6).getContents()),Integer.parseInt(villainSheet.getCell(3,6).getContents()),Integer.parseInt(villainSheet.getCell(4,6).getContents()),villainSheet.getCell(5,6).getContents(), villainSheet.getCell(6, 6).getContents());
            Card harleyQuinn =      new Card(villainSheet.getCell(0, 7).getContents(),villainType,Integer.parseInt(villainSheet.getCell(2,7).getContents()),Integer.parseInt(villainSheet.getCell(3,7).getContents()),Integer.parseInt(villainSheet.getCell(4,7).getContents()),villainSheet.getCell(5,7).getContents(), villainSheet.getCell(6, 7).getContents());
            Card lobo =             new Card(villainSheet.getCell(0, 8).getContents(),villainType,Integer.parseInt(villainSheet.getCell(2,8).getContents()),Integer.parseInt(villainSheet.getCell(3,8).getContents()),Integer.parseInt(villainSheet.getCell(4,8).getContents()),villainSheet.getCell(5,8).getContents(), villainSheet.getCell(6, 8).getContents());
            Card poisonIvy =        new Card(villainSheet.getCell(0, 9).getContents(),villainType,Integer.parseInt(villainSheet.getCell(2,9).getContents()),Integer.parseInt(villainSheet.getCell(3,9).getContents()),Integer.parseInt(villainSheet.getCell(4,9).getContents()),villainSheet.getCell(5,9).getContents(), villainSheet.getCell(6, 9).getContents());
            Card scarecrow =        new Card(villainSheet.getCell(0, 10).getContents(),villainType,Integer.parseInt(villainSheet.getCell(2,10).getContents()),Integer.parseInt(villainSheet.getCell(3,10).getContents()),Integer.parseInt(villainSheet.getCell(4,10).getContents()),villainSheet.getCell(5,10).getContents(), villainSheet.getCell(6, 10).getContents());
            Card solomonGrundy =    new Card(villainSheet.getCell(0, 11).getContents(),villainType,Integer.parseInt(villainSheet.getCell(2,11).getContents()),Integer.parseInt(villainSheet.getCell(3,11).getContents()),Integer.parseInt(villainSheet.getCell(4,11).getContents()),villainSheet.getCell(5,11).getContents(), villainSheet.getCell(6, 11).getContents());
            Card starro =           new Card(villainSheet.getCell(0, 12).getContents(),villainType,Integer.parseInt(villainSheet.getCell(2,12).getContents()),Integer.parseInt(villainSheet.getCell(3,12).getContents()),Integer.parseInt(villainSheet.getCell(4,12).getContents()),villainSheet.getCell(5,12).getContents(), villainSheet.getCell(6, 12).getContents());
            Card suicideSquad =     new Card(villainSheet.getCell(0, 13).getContents(),villainType,Integer.parseInt(villainSheet.getCell(2,13).getContents()),Integer.parseInt(villainSheet.getCell(3,13).getContents()),Integer.parseInt(villainSheet.getCell(4,13).getContents()),villainSheet.getCell(5,13).getContents(), villainSheet.getCell(6, 13).getContents());
            Card thePenguin =       new Card(villainSheet.getCell(0, 14).getContents(),villainType,Integer.parseInt(villainSheet.getCell(2,14).getContents()),Integer.parseInt(villainSheet.getCell(3,14).getContents()),Integer.parseInt(villainSheet.getCell(4,14).getContents()),villainSheet.getCell(5,14).getContents(), villainSheet.getCell(6, 14).getContents());
            Card theRiddler =       new Card(villainSheet.getCell(0, 15).getContents(),villainType,Integer.parseInt(villainSheet.getCell(2,15).getContents()),Integer.parseInt(villainSheet.getCell(3,15).getContents()),Integer.parseInt(villainSheet.getCell(4,15).getContents()),villainSheet.getCell(5,15).getContents(), villainSheet.getCell(6, 15).getContents());
            Card twoFace =          new Card(villainSheet.getCell(0, 16).getContents(),villainType,Integer.parseInt(villainSheet.getCell(2,16).getContents()),Integer.parseInt(villainSheet.getCell(3,16).getContents()),Integer.parseInt(villainSheet.getCell(4,16).getContents()),villainSheet.getCell(5,16).getContents(), villainSheet.getCell(6, 16).getContents());
            
            //Adds all Villains to an ArrayList
            ArrayList<Card> villainsDeck = new ArrayList<>();
            villainsDeck.add(bane);
            villainsDeck.add(bizarro);
            villainsDeck.add(cheetah);
            villainsDeck.add(clayface);
            villainsDeck.add(doomsday);
            villainsDeck.add(gorillaGrodd);
            villainsDeck.add(harleyQuinn);
            villainsDeck.add(lobo);
            villainsDeck.add(poisonIvy);
            villainsDeck.add(scarecrow);
            villainsDeck.add(solomonGrundy);
            villainsDeck.add(starro);
            villainsDeck.add(suicideSquad);
            villainsDeck.add(thePenguin);
            villainsDeck.add(theRiddler);
            villainsDeck.add(twoFace);
                                                          
            //Loads all Locations into variables
            Card arkhamAsylum =         new Card(locationSheet.getCell(0, 1).getContents(),locationType,Integer.parseInt(locationSheet.getCell(2,1).getContents()),Integer.parseInt(locationSheet.getCell(3,1).getContents()),Integer.parseInt(locationSheet.getCell(4,1).getContents()),locationSheet.getCell(5,1).getContents(), locationSheet.getCell(6, 1).getContents());
            Card fortressOfSolitude =   new Card(locationSheet.getCell(0, 2).getContents(),locationType,Integer.parseInt(locationSheet.getCell(2,2).getContents()),Integer.parseInt(locationSheet.getCell(3,2).getContents()),Integer.parseInt(locationSheet.getCell(4,2).getContents()),locationSheet.getCell(5,2).getContents(), locationSheet.getCell(6, 2).getContents());
            Card theBatcave =           new Card(locationSheet.getCell(0, 3).getContents(),locationType,Integer.parseInt(locationSheet.getCell(2,3).getContents()),Integer.parseInt(locationSheet.getCell(3,3).getContents()),Integer.parseInt(locationSheet.getCell(4,3).getContents()),locationSheet.getCell(5,3).getContents(), locationSheet.getCell(6, 3).getContents());
            Card theWatchtower =        new Card(locationSheet.getCell(0, 4).getContents(),locationType,Integer.parseInt(locationSheet.getCell(2,4).getContents()),Integer.parseInt(locationSheet.getCell(3,4).getContents()),Integer.parseInt(locationSheet.getCell(4,4).getContents()),locationSheet.getCell(5,4).getContents(), locationSheet.getCell(6, 4).getContents());
            Card titansTower =          new Card(locationSheet.getCell(0, 5).getContents(),locationType,Integer.parseInt(locationSheet.getCell(2,5).getContents()),Integer.parseInt(locationSheet.getCell(3,5).getContents()),Integer.parseInt(locationSheet.getCell(4,5).getContents()),locationSheet.getCell(5,5).getContents(), locationSheet.getCell(6, 5).getContents());
            
            //Adds all Locations to an ArrayList
            ArrayList<Card> locationsDeck = new ArrayList<>();
            locationsDeck.add(arkhamAsylum);
            locationsDeck.add(fortressOfSolitude);
            locationsDeck.add(theBatcave);
            locationsDeck.add(theWatchtower);
            locationsDeck.add(titansTower);
            
            //Adds all type decks to an Arraylist
            ArrayList<Card> mainDeck = new ArrayList<>();
            mainDeck.addAll(equipmentDeck);
            mainDeck.addAll(heroDeck);
            mainDeck.addAll(superPowersDeck);
            mainDeck.addAll(villainsDeck);
            mainDeck.addAll(locationsDeck);
            
            mainDeckcardList.close();
            
            Collections.shuffle(mainDeck);
            Collections.shuffle(mainDeck);
            
            return mainDeck;
    }
    
    public static Card buildInfiniteWeaknessDeck()
    {
        //initializes the workbook and creates a variable
        Workbook weaknessCardList  = null;
        try
        {
            weaknessCardList  = Workbook.getWorkbook(new File("C:\\DC Card Game\\src\\DCCardGame\\resources\\CardList.xls"));
        }
        catch (IOException e)
        {
            String message = "The file titled CardList.xls was not found.";
            String title = "File Not Found";
            JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
        } catch (BiffException ex) 
        {
            String message = "File must have an extension of .xls";
            String title = "Incompatible CardList File";
            JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
        }        
        
            //creates objects of the needed sheets in the CardList spreadsheet
            Sheet typeSheet = weaknessCardList.getSheet(0);
            Sheet weaknessSheet = weaknessCardList.getSheet(7); 
            
            //assigns the weakness type to a variable
            String weaknessType = typeSheet.getCell(0,7).getContents();
            
            //Loads Weakness into variable
            Card weakness =         new Card(weaknessSheet.getCell(0, 1).getContents(),weaknessType,Integer.parseInt(weaknessSheet.getCell(2,1).getContents()),Integer.parseInt(weaknessSheet.getCell(3,1).getContents()),Integer.parseInt(weaknessSheet.getCell(4,1).getContents()),weaknessSheet.getCell(5,1).getContents(), weaknessSheet.getCell(6, 1).getContents());

            weaknessCardList.close();
            return weakness;
    }
    
    public static ArrayList<Card> buildStandardWeaknessDeck()
    {
        Card weakness = buildInfiniteWeaknessDeck();
        ArrayList<Card> weaknessDeck = new ArrayList<>();
        for (int i = 0; i < 20; i++)
        weaknessDeck.add(weakness);
        return weaknessDeck;
    }
    
    public static ArrayList<Card> buildSuperVillainDeck()
    {       
        //initializes the workbook and creates a variable
        Workbook superVillainCardList  = null;
        try
        {
            superVillainCardList  = Workbook.getWorkbook(new File("C:\\DC Card Game\\src\\DCCardGame\\resources\\CardList.xls"));
        }
        catch (IOException e)
        {
            String message = "The file titled CardList.xls was not found.";
            String title = "File Not Found";
            JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
        } catch (BiffException ex) 
        {
            String message = "File must have an extension of .xls";
            String title = "Incompatible CardList File";
            JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
        }
        
        //creates objects of the needed sheets in the CardList spreadsheet
        Sheet typeSheet = superVillainCardList.getSheet(0);
        Sheet superVillainSheet = superVillainCardList.getSheet(3);
        
        //assigns the Super Villain type to a variable
        String superVillainType = typeSheet.getCell(0,3).getContents();
        
        //Loads all Super Villains into variables
        Card atrocitus =        new Card(superVillainSheet.getCell(0, 1).getContents(),superVillainType,Integer.parseInt(superVillainSheet.getCell(2,1).getContents()),Integer.parseInt(superVillainSheet.getCell(3,1).getContents()),Integer.parseInt(superVillainSheet.getCell(4,1).getContents()),superVillainSheet.getCell(5,1).getContents(),superVillainSheet.getCell(6, 1).getContents());
        Card blackManta =       new Card(superVillainSheet.getCell(0, 2).getContents(),superVillainType,Integer.parseInt(superVillainSheet.getCell(2,2).getContents()),Integer.parseInt(superVillainSheet.getCell(3,2).getContents()),Integer.parseInt(superVillainSheet.getCell(4,2).getContents()),superVillainSheet.getCell(5,2).getContents(),superVillainSheet.getCell(6, 2).getContents());
        Card brainiac =         new Card(superVillainSheet.getCell(0, 3).getContents(),superVillainType,Integer.parseInt(superVillainSheet.getCell(2,3).getContents()),Integer.parseInt(superVillainSheet.getCell(3,3).getContents()),Integer.parseInt(superVillainSheet.getCell(4,3).getContents()),superVillainSheet.getCell(5,3).getContents(),superVillainSheet.getCell(6, 3).getContents());
        Card captainCold =      new Card(superVillainSheet.getCell(0, 4).getContents(),superVillainType,Integer.parseInt(superVillainSheet.getCell(2,4).getContents()),Integer.parseInt(superVillainSheet.getCell(3,4).getContents()),Integer.parseInt(superVillainSheet.getCell(4,4).getContents()),superVillainSheet.getCell(5,4).getContents(),superVillainSheet.getCell(6, 4).getContents());
        Card darkseid =         new Card(superVillainSheet.getCell(0, 5).getContents(),superVillainType,Integer.parseInt(superVillainSheet.getCell(2,5).getContents()),Integer.parseInt(superVillainSheet.getCell(3,5).getContents()),Integer.parseInt(superVillainSheet.getCell(4,5).getContents()),superVillainSheet.getCell(5,5).getContents(),superVillainSheet.getCell(6, 5).getContents());
        Card deathstroke =      new Card(superVillainSheet.getCell(0, 6).getContents(),superVillainType,Integer.parseInt(superVillainSheet.getCell(2,6).getContents()),Integer.parseInt(superVillainSheet.getCell(3,6).getContents()),Integer.parseInt(superVillainSheet.getCell(4,6).getContents()),superVillainSheet.getCell(5,6).getContents(),superVillainSheet.getCell(6, 6).getContents());
        Card lexLuthor =        new Card(superVillainSheet.getCell(0, 7).getContents(),superVillainType,Integer.parseInt(superVillainSheet.getCell(2,7).getContents()),Integer.parseInt(superVillainSheet.getCell(3,7).getContents()),Integer.parseInt(superVillainSheet.getCell(4,7).getContents()),superVillainSheet.getCell(5,7).getContents(),superVillainSheet.getCell(6, 7).getContents());
        Card parallax =         new Card(superVillainSheet.getCell(0, 8).getContents(),superVillainType,Integer.parseInt(superVillainSheet.getCell(2,8).getContents()),Integer.parseInt(superVillainSheet.getCell(3,8).getContents()),Integer.parseInt(superVillainSheet.getCell(4,8).getContents()),superVillainSheet.getCell(5,8).getContents(),superVillainSheet.getCell(6, 8).getContents());
        Card rasAlGhul =        new Card(superVillainSheet.getCell(0, 9).getContents(),superVillainType,Integer.parseInt(superVillainSheet.getCell(2,9).getContents()),Integer.parseInt(superVillainSheet.getCell(3,9).getContents()),Integer.parseInt(superVillainSheet.getCell(4,9).getContents()),superVillainSheet.getCell(5,9).getContents(),superVillainSheet.getCell(6, 9).getContents());
        Card sinestro =         new Card(superVillainSheet.getCell(0, 10).getContents(),superVillainType,Integer.parseInt(superVillainSheet.getCell(2,10).getContents()),Integer.parseInt(superVillainSheet.getCell(3,10).getContents()),Integer.parseInt(superVillainSheet.getCell(4,10).getContents()),superVillainSheet.getCell(5,10).getContents(),superVillainSheet.getCell(6, 10).getContents());
        Card theAntiMonitor =   new Card(superVillainSheet.getCell(0, 11).getContents(),superVillainType,Integer.parseInt(superVillainSheet.getCell(2,11).getContents()),Integer.parseInt(superVillainSheet.getCell(3,11).getContents()),Integer.parseInt(superVillainSheet.getCell(4,11).getContents()),superVillainSheet.getCell(5,11).getContents(),superVillainSheet.getCell(6, 11).getContents());
        Card theJoker =         new Card(superVillainSheet.getCell(0, 12).getContents(),superVillainType,Integer.parseInt(superVillainSheet.getCell(2,12).getContents()),Integer.parseInt(superVillainSheet.getCell(3,12).getContents()),Integer.parseInt(superVillainSheet.getCell(4,12).getContents()),superVillainSheet.getCell(5,12).getContents(),superVillainSheet.getCell(6, 12).getContents());

        //Adds all Super Villains to an ArrayList
        ArrayList<Card> superVillainsDeck = new ArrayList<>();
        superVillainsDeck.add(atrocitus);
        superVillainsDeck.add(blackManta);
        superVillainsDeck.add(brainiac);
        superVillainsDeck.add(captainCold);
        superVillainsDeck.add(darkseid);
        superVillainsDeck.add(deathstroke);
        superVillainsDeck.add(lexLuthor);
        superVillainsDeck.add(parallax);
        superVillainsDeck.add(sinestro);
        superVillainsDeck.add(theAntiMonitor);
        superVillainsDeck.add(theJoker);
        
        superVillainCardList.close();
        
        Collections.shuffle(superVillainsDeck);
        Collections.shuffle(superVillainsDeck);
        
        superVillainsDeck.add(0, rasAlGhul);
        
        return superVillainsDeck;
        
    }
    
    public ArrayList<Card> buildStarterDeck()
    {
        //initializes the workbook and creates a variable
        Workbook starterDeckCardList  = null;
        try
        {
            starterDeckCardList  = Workbook.getWorkbook(new File("C:\\DC Card Game\\src\\DCCardGame\\resources\\CardList.xls"));
        }
        catch (IOException e)
        {
            String message = "The file titled CardList.xls was not found.";
            String title = "File Not Found";
            JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
        } catch (BiffException ex) 
        {
            String message = "File must have an extension of .xls";
            String title = "Incompatible CardList File";
            JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
        }
        
        //creates objects of the needed sheets in the CardList spreadsheet
        Sheet typeSheet = starterDeckCardList.getSheet(0);
        Sheet starterSheet = starterDeckCardList.getSheet(5);
        
        //assigns the Starter type to a variable
        String starterType = typeSheet.getCell(0,5).getContents();
                    
        //Loads all Starters into variables
        Card punch =            new Card(starterSheet.getCell(0, 1).getContents(),starterType,Integer.parseInt(starterSheet.getCell(2,1).getContents()),Integer.parseInt(starterSheet.getCell(3,1).getContents()),Integer.parseInt(starterSheet.getCell(4,1).getContents()),starterSheet.getCell(5,1).getContents(),starterSheet.getCell(6, 1).getContents());
        Card vulnerability =    new Card(starterSheet.getCell(0, 2).getContents(),starterType,Integer.parseInt(starterSheet.getCell(2,2).getContents()),Integer.parseInt(starterSheet.getCell(3,2).getContents()),Integer.parseInt(starterSheet.getCell(4,2).getContents()),starterSheet.getCell(5,2).getContents(),null);

        //Adds all Starters to an ArrayList
        ArrayList<Card> startersDeck = new ArrayList<>();
        startersDeck.add(punch);
        startersDeck.add(vulnerability);
        
        starterDeckCardList.close();
        return startersDeck;
    }
    
    public static Card buildInfinitedKickDeck()
    {
        //initializes the workbook and creates a variable
        Workbook kickDeckcardList  = null;
        try
        {
            kickDeckcardList  = Workbook.getWorkbook(new File("C:\\DC Card Game\\src\\DCCardGame\\resources\\CardList.xls"));
        }
        catch (IOException e)
        {
            String message = "The file titled CardList.xls was not found.";
            String title = "File Not Found";
            JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
        } catch (BiffException ex) 
        {
            String message = "File must have an extension of .xls";
            String title = "Incompatible CardList File";
            JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
        }        
        
        //creates objects of the needed sheets in the CardList spreadsheet
        Sheet typeSheet = kickDeckcardList.getSheet(0);
        Sheet kickSheet = kickDeckcardList.getSheet(8);
        
        //assigns the Super Power type to a variable
        String superPowerType = typeSheet.getCell(0,4).getContents();
        
        //Loads Kick into variable
        Card kick =  new Card(kickSheet.getCell(0, 1).getContents(),superPowerType,Integer.parseInt(kickSheet.getCell(2,1).getContents()),Integer.parseInt(kickSheet.getCell(3,1).getContents()),Integer.parseInt(kickSheet.getCell(4,1).getContents()),kickSheet.getCell(5,1).getContents(),kickSheet.getCell(6,1).getContents());

        kickDeckcardList.close();
        return kick;
    }
    
    public static ArrayList<Card> buildStandardKickDeck()
    {
        Card kick = buildInfinitedKickDeck();
        ArrayList<Card> kickDeck = new ArrayList<>();
        for (int i = 0; i < 16; i++)
            kickDeck.add(kick);
        return kickDeck;
    }
    
    public static ArrayList<Card> buildSuperHeroDeck()
    {
        //initializes the workbook and creates a variable
        Workbook superHeroDeckCardList  = null;
        try
        {
            superHeroDeckCardList  = Workbook.getWorkbook(new File("C:\\DC Card Game\\src\\DCCardGame\\resources\\CardList.xls"));
        }
        catch (IOException e)
        {
            String message = "The file titled CardList.xls was not found.";
            String title = "File Not Found";
            JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
        } catch (BiffException ex) 
        {
            String message = "File must have an extension of .xls";
            String title = "Incompatible CardList File";
            JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
        }
        
        //creates objects of the needed sheets in the CardList spreadsheet
        Sheet typeSheet = superHeroDeckCardList.getSheet(0);
        Sheet superHeroSheet = superHeroDeckCardList.getSheet(9);
        
        //assigns the Super Hero type to a variable
        String superHeroType = typeSheet.getCell(0,8).getContents();
        
        
        //Loads all Superheroes into variables
        Card aquaman =          new Card(superHeroSheet.getCell(0, 1).getContents(),superHeroType,Integer.parseInt(superHeroSheet.getCell(2,1).getContents()),Integer.parseInt(superHeroSheet.getCell(3,1).getContents()),Integer.parseInt(superHeroSheet.getCell(4,1).getContents()),superHeroSheet.getCell(5,1).getContents(),superHeroSheet.getCell(6, 1).getContents());
        Card batman =           new Card(superHeroSheet.getCell(0, 2).getContents(),superHeroType,Integer.parseInt(superHeroSheet.getCell(2,2).getContents()),Integer.parseInt(superHeroSheet.getCell(3,2).getContents()),Integer.parseInt(superHeroSheet.getCell(4,2).getContents()),superHeroSheet.getCell(5,2).getContents(),superHeroSheet.getCell(6, 1).getContents());
        Card cyborg =           new Card(superHeroSheet.getCell(0, 3).getContents(),superHeroType,Integer.parseInt(superHeroSheet.getCell(2,3).getContents()),Integer.parseInt(superHeroSheet.getCell(3,3).getContents()),Integer.parseInt(superHeroSheet.getCell(4,3).getContents()),superHeroSheet.getCell(5,3).getContents(),superHeroSheet.getCell(6, 1).getContents());
        Card greenLantern =     new Card(superHeroSheet.getCell(0, 4).getContents(),superHeroType,Integer.parseInt(superHeroSheet.getCell(2,4).getContents()),Integer.parseInt(superHeroSheet.getCell(3,4).getContents()),Integer.parseInt(superHeroSheet.getCell(4,4).getContents()),superHeroSheet.getCell(5,4).getContents(),superHeroSheet.getCell(6, 1).getContents());
        Card martianManhunter = new Card(superHeroSheet.getCell(0, 5).getContents(),superHeroType,Integer.parseInt(superHeroSheet.getCell(2,5).getContents()),Integer.parseInt(superHeroSheet.getCell(3,5).getContents()),Integer.parseInt(superHeroSheet.getCell(4,5).getContents()),superHeroSheet.getCell(5,5).getContents(),superHeroSheet.getCell(6, 1).getContents());
        Card superman =         new Card(superHeroSheet.getCell(0, 6).getContents(),superHeroType,Integer.parseInt(superHeroSheet.getCell(2,6).getContents()),Integer.parseInt(superHeroSheet.getCell(3,6).getContents()),Integer.parseInt(superHeroSheet.getCell(4,6).getContents()),superHeroSheet.getCell(5,6).getContents(),superHeroSheet.getCell(6, 1).getContents());
        Card theFlash =         new Card(superHeroSheet.getCell(0, 7).getContents(),superHeroType,Integer.parseInt(superHeroSheet.getCell(2,7).getContents()),Integer.parseInt(superHeroSheet.getCell(3,7).getContents()),Integer.parseInt(superHeroSheet.getCell(4,7).getContents()),superHeroSheet.getCell(5,7).getContents(),superHeroSheet.getCell(6, 1).getContents());
        Card wonderWoman =      new Card(superHeroSheet.getCell(0, 8).getContents(),superHeroType,Integer.parseInt(superHeroSheet.getCell(2,8).getContents()),Integer.parseInt(superHeroSheet.getCell(3,8).getContents()),Integer.parseInt(superHeroSheet.getCell(4,8).getContents()),superHeroSheet.getCell(5,8).getContents(),superHeroSheet.getCell(6, 1).getContents());

        //Adds all Super Heroes into an ArrayList
        ArrayList<Card> superHeroesDeck = new ArrayList<>();
        superHeroesDeck.add(aquaman);
        superHeroesDeck.add(batman);
        superHeroesDeck.add(cyborg);
        superHeroesDeck.add(greenLantern);
        superHeroesDeck.add(martianManhunter);
        superHeroesDeck.add(superman);
        superHeroesDeck.add(theFlash);
        superHeroesDeck.add(wonderWoman);
        
        Collections.shuffle(superHeroesDeck);
        
        superHeroDeckCardList.close();
        return superHeroesDeck;
    }
    
    public static Card noCard()
    {
        Card noCard = new Card("NoCardHere","None",500,0,0,"C:\\DC Card Game\\src\\DCCardGame\\resources\\Other Cards\\Empty Card Slot.png", null);
        return noCard;
    }
    
    public static Card noDiscard()
    {
        Card noDiscard = new Card("NoDiscardCardHere","None",500,0,0,"C:\\DC Card Game\\src\\DCCardGame\\resources\\Other Cards\\Empty Discard.png", null);
        return noDiscard;
    }
}


//String cardName, String type, int cost, int value, int power, BufferedImage image