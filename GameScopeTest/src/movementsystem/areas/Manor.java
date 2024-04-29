package movementsystem.areas;

import movementsystem.area;
import movementsystem.events.Ev_TalkToErina;
import movementsystem.events.Ev_enterArea;

public class Manor extends area {

	public Manor() {
		this.id = 1000;
		this.Name = "Manor of thousand Screams";
		
		buttonevents[0] = 2;
		buttonevents[1] = 3;
		buttonevents[2] = 6;
		buttonevents[3] = 6;
	}

}
