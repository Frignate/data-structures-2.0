package battleSystem.Moves;
import java.util.ArrayList;

import battleSystem.Base.Action;
import battleSystem.Base.Character;
import battleSystem.Base.battleFunctions;

public class HealSpell extends Action {

	public HealSpell() {
		this.Name = "Heal Spell";
		this.Energy = 5;
		this.MaxEnergy = 5;
		this.Power = 5;
		this.Priority = 1;
		this.TargetsEnemy = 0;
	}
	@Override
	public void Execute(Character caster, Character opponent, ArrayList<Character> allies,
			ArrayList<Character> opponents) {
		for (Character character : allies) {
			battleFunctions.Heal(character, Power * caster.getSPATK());
		}
	}
}
