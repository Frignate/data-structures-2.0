package movementsystem.events;

import java.util.ArrayList;

import battleSystem.Base.Character;
import battleSystem.Base.battleObjectGui;
import battleSystem.Base.guitestClass;
import battleSystem.Base.turnState;
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
		Thread battleThread = new Thread(()->{
		guitestClass battleui = new guitestClass(party.getParty(), chars );
		while (battleui.battleManager.state != turnState.defeated || battleui.battleManager.state != turnState.victorious )
				{
		}
		battleObjectGui.battleresult = true;
		if(battleui.battleManager.state == turnState.defeated )
		{
			battleObjectGui.battleresult = false;

			return;
		}
		Thread.currentThread().interrupt();
		battleui = null;
		return;
		});
		battleThread.start();
		try {
			battleThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if(!battleObjectGui.battleresult)
		{
			System.out.println("dead");
			return 0;
		}
		party.progressQuest(6);
		party.location.buttonevents[1] = 3;
		return 0;
	}

}
