package movementsystem;

import java.util.ArrayList;

public class eventDatabase {
	eventDatabaseNode[] table = new eventDatabaseNode[16];
	
	
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
