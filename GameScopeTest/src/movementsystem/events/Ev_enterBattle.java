package movementsystem.events;

import java.util.ArrayList;

import battleSystem.Base.Character;
import battleSystem.Base.battleFunctions;
import battleSystem.Base.battleObjectGui;
import movementsystem.EventGui;
import movementsystem.event;
import movementsystem.partyData;

public class Ev_enterBattle extends event {
	
	ArrayList<Character> chars = new ArrayList<>(); 
	partyData partyData;
	battleObjectGui battle = null;
	public Ev_enterBattle(Character Char) {
		chars.add(Char);
		name = "Battle: "+ Char.getName();
	}

	@Override
	public int happen(partyData party) {
		partyData = party;
		System.out.println("Batte!");
		battle = new battleObjectGui(this,party.getParty(),chars);
		return 0;
	}
	
	public void happenend(boolean result)
	{
		boolean victory = result;

		battle = null;
		EventGui.maingui.setEnabled(true);
		EventGui.maingui.setVisible(true);
		System.out.println("disposed");
		if(victory)
		{
		partyData.progressQuest(6);
		partyData.location.buttonevents[1] = 3;
		EventGui.maingui.setupbuttons();
		}
		else
		{
			EventGui.sendmsg("You lost");
		}
	}

}
