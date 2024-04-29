package movementsystem.events;

import java.awt.Toolkit;

import javax.swing.ImageIcon;

import battleSystem.Base.Action;
import battleSystem.Base.Character;
import battleSystem.Base.CharacterTemplate;
import battleSystem.Base.guitestClass;
import battleSystem.Moves.Awareness;
import battleSystem.Moves.Beartrap;
import battleSystem.Moves.Bruise;
import battleSystem.Moves.ChantOfDestruction;
import battleSystem.Moves.DarkPulse;
import battleSystem.Moves.Dash;
import battleSystem.Moves.Dekunda;
import battleSystem.Moves.EmotionalDamage;
import battleSystem.Moves.Firebolt;
import battleSystem.Moves.PreciseShot;
import battleSystem.Moves.Protect;
import battleSystem.Moves.Rally;
import battleSystem.Moves.ShieldBreak;
import battleSystem.Moves.SongOfPeace;
import battleSystem.Moves.Volley;
import battleSystem.Moves.WeightOfTheWorld;
import movementsystem.arealist;
import movementsystem.event;
import movementsystem.partyData;

public class Ev_begin extends event {

	@Override
	public int happen(partyData party) {
		Action[] casterActions = new Action[4];
		casterActions[0] = new Dekunda();
		casterActions[1] = new ChantOfDestruction();
		casterActions[2] = new DarkPulse();
		casterActions[3] = new EmotionalDamage();
		
		Action[] knightActions = new Action[4];
		knightActions[0] = new Dash();
		knightActions[1] = new Bruise();
		knightActions[2] = new ShieldBreak();
		knightActions[3] = new Rally();
		
		Action[] rangerActions = new Action[4]; 
		
		rangerActions[0] = new Beartrap();
		rangerActions[1] = new Volley();
		rangerActions[2] = new Awareness();
		rangerActions[3] = new PreciseShot();
		
		
		Action[] enchanterActions = new Action[4]; 
		enchanterActions[0] = new Protect();
		enchanterActions[1] = new WeightOfTheWorld();
		enchanterActions[2] = new Firebolt();
		enchanterActions[3] = new SongOfPeace();
		

		CharacterTemplate caster = new CharacterTemplate(0,10, 10, 10, 25, 20, 25);
		CharacterTemplate bruiser = new CharacterTemplate(1,30, 20, 15, 5, 5, 10);
		CharacterTemplate ranger = new CharacterTemplate(2,20, 15, 15, 5, 10, 5);
		CharacterTemplate enchanter = new CharacterTemplate(3, 10, 10, 10, 20, 10, 5);
		
		
		Character char1 = new Character("Natalia, Bane of Cookies", 20,caster,new ImageIcon (Toolkit.getDefaultToolkit().getImage(guitestClass.class.getResource("/images/char1.png"))),new ImageIcon (Toolkit.getDefaultToolkit().getImage(guitestClass.class.getResource("/images/chardeath1.png"))));
		char1.setupMoves(casterActions);
		Character char2 = new Character("Gary The Magnificent", 20, bruiser,new ImageIcon (Toolkit.getDefaultToolkit().getImage(guitestClass.class.getResource("/images/char2.png"))),new ImageIcon (Toolkit.getDefaultToolkit().getImage(guitestClass.class.getResource("/images/chardeath2.png"))));
		char2.setupMoves(knightActions);
		
		Character char3 = new Character("Theoden The Not Knight",20, ranger, new ImageIcon (Toolkit.getDefaultToolkit().getImage(guitestClass.class.getResource("/images/char_4.png"))),new ImageIcon (Toolkit.getDefaultToolkit().getImage(guitestClass.class.getResource("/images/char4dead.png"))));
		char3.setupMoves(rangerActions);
	
		Character char4 = new Character("Clara, One Without Shoes",20, enchanter,new ImageIcon (Toolkit.getDefaultToolkit().getImage(guitestClass.class.getResource("/images/char3.png"))),new ImageIcon (Toolkit.getDefaultToolkit().getImage(guitestClass.class.getResource("/images/chardeath3.png"))));
		char4.setupMoves(enchanterActions);
		
		
		party.setGold(0);
		party.setLocation(arealist.arealist.get(0));
		party.addToParty(char1);
		party.addToParty(char2);		
		party.addToParty(char3);
		party.addToParty(char4);
		
		
		
		
		
		System.out.println("The adventure has begun!");
		return 0;
	}

}
