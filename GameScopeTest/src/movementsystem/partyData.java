package movementsystem;

import java.util.ArrayList;

import battleSystem.Base.Character;

public class partyData {
	ArrayList<Character> party;
	public int gold;
	public area location;
	
	
	@Override
	public String toString() {
		String names = "";
		for (Character character : party) {
			names = names + " " + character.getName();
		}
		return "partyData [party= " + names  + ", gold=" + gold + ", location=" + location.Name + "]";
	}
	
	
	public ArrayList<Character> getParty() {
		return party;
	}
	public void setParty(ArrayList<Character> party) {
		this.party = party;
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
