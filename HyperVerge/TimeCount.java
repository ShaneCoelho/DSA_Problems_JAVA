import java.util.Scanner;

public class TimeCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for starting time
        String startTime = sc.nextLine(); // e.g., 22:20
        String endTime = sc.nextLine();   // e.g., 23:16

        // Splitting hours and minutes from the input
        String[] start = startTime.split(":");
        String[] end = endTime.split(":");

        int startHour = Integer.parseInt(start[0]);
        int startMinute = Integer.parseInt(start[1]);

        int endHour = Integer.parseInt(end[0]);
        int endMinute = Integer.parseInt(end[1]);

        // Convert both times to total minutes from 00:00
        int startTotalMinutes = startHour * 60 + startMinute;
        int endTotalMinutes = endHour * 60 + endMinute;

        // Find the mid-point in minutes
        int midTotalMinutes = (startTotalMinutes + endTotalMinutes) / 2;

        // Convert back to hours and minutes
        int midHour = midTotalMinutes / 60;
        int midMinute = midTotalMinutes % 60;

        // Format the output to always have two digits for hours and minutes
        System.out.printf("%02d:%02d\n", midHour, midMinute);
        
        sc.close();
    }
}
