package movementsystem;

public class quest {
	public int questID = 0;
	public int completionEvID = 0;
	public int completinoEvAmount = 1;
	public String name = "undefined";
	public String definition = "dunno";
	public int nextQuestID = 0;
	
	
	public quest(int questID, int completionEvID, int completinoEvAmount, String name, String definition,
			int nextQuest) {
		super();
		this.questID = questID;
		this.completionEvID = completionEvID;
		this.completinoEvAmount = completinoEvAmount;
		this.name = name;
		this.definition = definition;
		this.nextQuestID = nextQuest;
	}
}
