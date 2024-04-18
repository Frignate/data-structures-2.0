package battleSystem.Moves;
import java.util.ArrayList;

import battleSystem.Base.Action;
import battleSystem.Base.Character;
import battleSystem.Base.battleFunctions;

public class Suffer extends Action {

	public Suffer() {
		this.Name = "Suffer";
		this.Energy = 10;
		this.MaxEnergy = 10;
		this.Power = 20;
		this.Priority = 1;
		this.TargetsEnemy = 2;
	}

	@Override
	public void Execute(Character caster, Character opponent, ArrayList<Character> allies,
			ArrayList<Character> opponents) {
		for(Character character : opponents)
		{
			battleFunctions.calculatePhysicalDamage(caster,character,Power);
		}
		battleFunctions.DealDamage(caster, caster.getHP());
	}

}
