package movementsystem;

import java.util.Scanner;

import movementsystem.events.Ev_TalkToErina;
import movementsystem.events.Ev_begin;
import movementsystem.events.Ev_enterArea;

public class EventConsole {
	public eventManager manager;
	public Scanner inputScanner;
	public EventConsole()
	{
		arealist.setupAreas();
		inputScanner = new Scanner(System.in);
		eventDatabase database = new eventDatabase();
		database.setupEvents();
		manager = new eventManager(database);
		manager.eventStart(1);
	}
	public Boolean getinput()
	{
		var input = inputScanner.next();
		inputScanner.nextLine();
		var selection = -1;
		switch(input)
		{
		default:
			break;
		case "exit":
			inputScanner.close();
			return false;
		case "quests":
			for (quest q : manager.party.questlines) {
				System.out.println("Quest Name: " +q.name);
				System.out.println("Description: " +q.definition);
			}
			return true;
		case "0":
			selection = manager.party.location.buttonevents[0];
			break;

		case "1":
			selection = manager.party.location.buttonevents[1];
			break;

		case "2":
			selection = manager.party.location.buttonevents[2];
			break;

		case "3":
			selection = manager.party.location.buttonevents[3];
			break;
		}
		if(selection != -1)
		{
			manager.eventStart(selection);
		}
		return true;
	}
}
