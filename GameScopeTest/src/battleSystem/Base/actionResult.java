package battleSystem.Base;
import java.util.HashMap;

public class actionResult {
	public String text;
	public HashMap<Character, Integer> changes;
	public actionResult() {
		changes = new HashMap<Character, Integer>();
	}
	public actionResult(String text) {
		changes = new HashMap<Character, Integer>();
		this.text = text;
	}

}
