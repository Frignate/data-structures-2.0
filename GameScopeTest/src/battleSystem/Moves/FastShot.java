package battleSystem.Moves;
import java.util.ArrayList;

import battleSystem.Base.Action;
import battleSystem.Base.Character;
import battleSystem.Base.battleFunctions;

public class FastShot extends Action {
	
	public FastShot() {
		this.Name = "FastShot";
		this.Energy = 10;
		this.MaxEnergy = 10;
		this.Power = 5;
		this.Priority = 3;
		this.TargetsEnemy = 1;
	}
	@Override
	public void Execute(Character caster, Character opponent, ArrayList<Character> allies,
			ArrayList<Character> opponents) {
			battleFunctions.calculatePhysicalDamage(caster, opponent, Power);
		}
	}


