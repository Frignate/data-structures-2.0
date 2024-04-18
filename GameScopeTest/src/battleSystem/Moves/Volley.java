package battleSystem.Moves;
import java.util.ArrayList;

import battleSystem.Base.Action;
import battleSystem.Base.Character;
import battleSystem.Base.battleFunctions;

public class Volley extends Action {

	public Volley() {
		this.Name = "Volley";
		this.Energy = 5;
		this.MaxEnergy = 5;
		this.Power = 5;
		this.Priority = 1;
		this.TargetsEnemy = 2;
	}

	@Override
	public void Execute(Character caster, Character opponent, ArrayList<Character> allies,
			ArrayList<Character> opponents) {
		
		
		for (Character character : opponents) {
			battleFunctions.calculatePhysicalDamage(caster, character, Power);
		}

	}

}
