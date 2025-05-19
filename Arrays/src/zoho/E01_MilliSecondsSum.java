package zoho;

import java.util.Scanner;

public class E01_MilliSecondsSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the time in milliseconds: ");
        long inputTimeMillis = scanner.nextLong();

        long hours = inputTimeMillis / 3600000;

        String greeting;
        if (hours >= 0 && hours < 12) {
            greeting = "Good Morning";
        } else if (hours >= 12 && hours < 18) {
            greeting = "Good Afternoon";
        } else {
            greeting = "Good Night";
        }

        System.out.println("Greeting: " + greeting);

        scanner.close();
	}

}
