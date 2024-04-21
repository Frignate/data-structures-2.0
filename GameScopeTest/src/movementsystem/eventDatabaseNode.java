package movementsystem;

public class eventDatabaseNode {
	
	
	eventDatabaseNode nextNode;
	int key;
	event value;
	
	protected void attach(eventDatabaseNode node)
	{
		if(nextNode != null)
		{
			nextNode.attach(node);
		}
		else
		{
		nextNode = node;
		}
	}	
	
	public eventDatabaseNode key_exists(int key_)
	{
		if(key == key_)
		{
			return this;
		}
		if(nextNode != null)
		{
			return nextNode.key_exists(key_);
		}
		return null;
		
	}
	
	
	public eventDatabaseNode(int key_,event value_,eventDatabaseNode prevNode)
	{
		key = key_;
		value = value_;
		prevNode.attach(this);
	}
	
	public eventDatabaseNode(int key_,event value_)
	{
		key = key_;
		value = value_;
	}

}