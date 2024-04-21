package movementsystem.areas;

import movementsystem.area;
import movementsystem.events.Ev_enterArea;

public class manorBasement extends area {

	public manorBasement() {
		this.id = 1001;
		this.Name = "Manor Basement";
		buttonevents[0] = 4;
		buttonevents[1] = -1;
		buttonevents[2] = -1;
		buttonevents[3] = -1;
	}
	

}
