package movementsystem;

import java.util.ArrayList;

import battleSystem.Base.Character;

public class partyData {
	ArrayList<Character> party = new ArrayList<>();
	public int gold;
	public area location;
	
	public ArrayList<quest> questlines = new ArrayList<>();
	public ArrayList<quest> completedQuests = new ArrayList<>();
	@Override
	public String toString() {
		String names = "";
		for (Character character : party) {
			names = names + " " + character.getName();
		}
		return "partyData [party= " + names  + ", gold=" + gold + ", location=" + location.Name + "]";
	}
	public void addNewQuest(quest questToAdd)
	{
		EventGui.sendmsg("New Quest: " + questToAdd.name);
		questToAdd.resetprogress();
		questlines.add(questToAdd);
	}
	public boolean isquestComplete(int qid) {
		for(quest q : completedQuests)
		{
			if(q.questID == qid)
			{
				return true;
			}
		}
		return false;
	}
	public boolean isquestOngoing(int qid)
	{
		for(quest q : questlines)
		{
			if(q.questID == qid)
			{
				return true;
			}
		}
		return false;
	}
	public void progressQuest(int cid) {
		for (int i = 0; i < questlines.size();i++) {
			var q = questlines.get(i);
			if(q.completionEvID == cid) {
				q.progress++;
				if(q.completionEvAmount <= q.progress)
				{
					EventGui.sendmsg("Quest Complete: " + q.name);
					completedQuests.add(q);
					if(q.nextQuestID != -1)
					{
						var newquest = questDatabase.questData.get(q.nextQuestID);
						addNewQuest(newquest);
					}
					questlines.remove(q);
					i--;
				}
			}
		}
	}
	
	
	
	public ArrayList<Character> getParty() {
		return party;
	}
	public void addToParty(Character member) {
		this.party.add(member);
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public area getLocation() {
		return location;
	}
	public void setLocation(area location) {
		this.location = location;
	}
	
	
	
	
}
