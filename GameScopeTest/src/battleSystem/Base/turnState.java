package battleSystem.Base;

public enum turnState {
	defeated, // battlestate = -1
	victorious, // battlestate = -1
	turnInProgress, // battlestate >= 2
	moveSelect, // battlestate = 0;
}
