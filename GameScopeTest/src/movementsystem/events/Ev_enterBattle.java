package movementsystem.events;

import java.util.ArrayList;

import battleSystem.Base.Character;
import battleSystem.Base.battleObjectGui;
import battleSystem.Base.guitestClass;
import battleSystem.Base.turnState;
import movementsystem.EventGui;
import movementsystem.arealist;
import movementsystem.event;
import movementsystem.partyData;

public class Ev_enterBattle extends event {
	
	ArrayList<Character> chars = new ArrayList<>(); 

	public Ev_enterBattle(Character Char) {
		chars.add(Char);
		name = "Battle: "+ Char.getName();
	}

	@Override
	public int happen(partyData party) {
		System.out.println("Batte!");
		{
		var battle = new battleObjectGui(party.getParty(),chars);
		EventGui.maingui.setEnabled(false);
		while(!battleObjectGui.battleresult)
		{
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		EventGui.maingui.setEnabled(true);
		boolean victory = battleObjectGui.isVictorious;
		}
		System.out.println("disposed");
		party.progressQuest(6);
		party.location.buttonevents[1] = 3;
		return 0;
	}

}
