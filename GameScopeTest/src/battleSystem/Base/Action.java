package battleSystem.Base;


import java.util.ArrayList;

public abstract class Action implements Cloneable{
	protected String Name;
	protected int Energy;
	protected int MaxEnergy;
	protected int Power;
	protected int Priority;
	protected int TargetsEnemy = 1; // 1 = targets enemy , 0 = targets allies, -1 = targets caster; 2 = targets every enemy;
	protected void RestoreAction()
	{
		Energy = MaxEnergy;
	}
	public abstract void Execute(Character caster,Character opponent , ArrayList<Character> allies, ArrayList<Character> opponents);
}
