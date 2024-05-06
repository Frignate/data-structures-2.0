package movementsystem;

public class quest {
	public int questID = 0;
	public int completionEvID = 0;
	public int completionEvAmount = 1;
	public int progress = 0;
	public String name = "undefined";
	public String definition = "dunno";
	public int nextQuestID = 0;
	
	
	public quest(int questID, int completionEvID, int completionEvAmount, String name, String definition,
			int nextQuest) {
		super();
		this.questID = questID;
		this.completionEvID = completionEvID;
		this.completionEvAmount = completionEvAmount;
		this.name = name;
		this.definition = definition;
		this.nextQuestID = nextQuest;
	}
	public void resetprogress()
	{
		progress = 0;
	}
}
