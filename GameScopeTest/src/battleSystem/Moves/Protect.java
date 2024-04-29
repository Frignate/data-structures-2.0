package battleSystem.Moves;
import java.util.ArrayList;

import battleSystem.Base.Action;
import battleSystem.Base.Character;
import battleSystem.Base.actionResult;
import battleSystem.Base.battleObjectGui;

public class Protect extends Action {

	public Protect() {
		this.Name = "Shield Team";
		this.Energy = 1;
		this.MaxEnergy = 1;
		this.Power = 30;
		this.Priority = 5;
		this.TargetsEnemy = 0;
	}

	@Override
	public void Execute(Character caster, Character opponent, ArrayList<Character> allies,
			ArrayList<Character> opponents) {
		battleObjectGui.addMessage(new actionResult("Temporary shield surrounds their Team"));
		for (Character character : allies) {
			
			character.ReflectCounter = 1;
			
		}

	}

}
