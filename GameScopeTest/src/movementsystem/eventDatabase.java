package movementsystem;

import java.awt.Toolkit;
import java.util.ArrayList;

import battleSystem.Base.*;
import javax.swing.ImageIcon;
import battleSystem.Base.Character;
import battleSystem.Moves.*;
import movementsystem.events.Ev_TalkToErina;
import movementsystem.events.Ev_begin;
import movementsystem.events.Ev_doNothing;
import movementsystem.events.Ev_enterArea;
import movementsystem.events.Ev_enterBattle;

public class eventDatabase {
	eventDatabaseNode[] table = new eventDatabaseNode[16];
	public void setupEvents()
	{
		
		Action[] enemyActions = new Action[4];
		enemyActions[0] = new HealSpell();
		enemyActions[1] = new ChantOfDestruction();
		enemyActions[2] = new Dash();
		enemyActions[3] = new Firebolt();
		CharacterTemplate boss = new CharacterTemplate(-1,20, 10, 10, 10, 10, 10);
		Character bossChar = new Character("Erina, Corrupt",10, boss,new ImageIcon (Toolkit.getDefaultToolkit().getImage(guitestClass.class.getResource("/images/monster.png"))),new ImageIcon (Toolkit.getDefaultToolkit().getImage(guitestClass.class.getResource("/images/impdead.png"))));
		bossChar.setupMoves(enemyActions);
		
		
		add(1, new Ev_begin());
		add(2, new Ev_enterArea(1001));
		add(3, new Ev_TalkToErina());
		add(4, new Ev_enterArea(1000));
		add(5, new Ev_enterBattle(bossChar));
		add(6, new Ev_doNothing());
	}
	
	
	
	
	private int hash(int key)
	{
		return ((key - (key % 100)) / 100) %16;
	}
	
	public event get(int key)
	{
		int hashedkey = hash(key);
		if(table[hashedkey] == null)
		{
		return null;
		}
		return table[hashedkey].key_exists(key).value;
	}
	
	
	public void add(int key, event ev)
	{
		int hashedkey = hash(key);
		if(table[hashedkey] == null)
		{
			table[hashedkey] = new eventDatabaseNode(key, ev);
			return;
		}
		var keyNode = table[hashedkey].key_exists(key);
		if(keyNode == null)
		{
			table[hashedkey].attach(new eventDatabaseNode(key, ev));
			return;
		}
		keyNode.value = ev;
	}
	
}
