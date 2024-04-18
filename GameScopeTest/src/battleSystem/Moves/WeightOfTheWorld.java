package battleSystem.Moves;
import java.util.ArrayList;

import battleSystem.Base.Action;
import battleSystem.Base.Character;
import battleSystem.Base.Stats;
import battleSystem.Base.battleFunctions;

public class WeightOfTheWorld extends Action {

		public WeightOfTheWorld(){
		this.Name = "WeightOfTheWorld";
		this.Energy = 10;
		this.MaxEnergy = 10;
		this.Power = 20;
		this.Priority = 1;
		this.TargetsEnemy = 2;
	}
	@Override
	public void Execute(Character caster, Character opponent, ArrayList<Character> allies,
			ArrayList<Character> opponents) {
		for (Character character : opponents) {
			battleFunctions.ReduceStat(character, Stats.SPDEF, -1);
			battleFunctions.ReduceStat(character, Stats.SPATK, -1);
		}

	}

}