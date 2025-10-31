import java.nio.file.PathMatcher;
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String ampm;
		if (hours >= 12) { 
			ampm = " PM";
			if (hours > 12) {
				hours = hours - 12; 
			}
		}
		else {
			ampm = " AM";
		}
		if (minutes < 10) {
			System.out.println(hours + ":0" + minutes + ampm); 
		}
		else {
			System.out.println(hours + ":" + minutes + ampm);
		}
	}
}