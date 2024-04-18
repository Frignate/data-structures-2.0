package battleSystem.Moves;
import java.util.ArrayList;

import battleSystem.Base.Action;
import battleSystem.Base.Character;
import battleSystem.Base.Stats;
import battleSystem.Base.battleFunctions;

public class ShieldBreak extends Action {
	
	public ShieldBreak() {
		this.Name = "ShieldBreak";
		this.Energy = 10;
		this.MaxEnergy = 10;
		this.Power = 10;
		this.Priority = 1;
		this.TargetsEnemy = 1;
	}
	@Override
	public void Execute(Character caster, Character opponent, ArrayList<Character> allies,
			ArrayList<Character> opponents) {
			battleFunctions.calculatePhysicalDamage(caster, opponent, Power);
			battleFunctions.ReduceStat(caster, Stats.DEF, -1);
	}

}