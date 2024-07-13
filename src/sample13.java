import java.io.*;
public class sample13{
    public static void main(String[] args) {
        int[][] timesArray = {
            {8, 15},
            {13, 30},
            {21, 5},
            {4, 45},
            {18, 0}
        };
        for (int[] time : timesArray) {
            String timeString = convertToHHmmFormat(time[0], time[1]);
            System.out.println(timeString);
        }
    }
    public static String convertToHHmmFormat(int hour, int minute) {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Hour and minute values must be within valid range");
        }
        String timeHHmm = String.format("%02d:%02d", hour, minute);
        return timeHHmm;
    }
}
