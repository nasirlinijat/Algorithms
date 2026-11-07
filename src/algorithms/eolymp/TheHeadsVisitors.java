package algorithms.eolymp;

public class TheHeadsVisitors {

    /*
     The assistant at an educational institution, Anna Martin, begins each workday with a complaint to the head:
     John Smith, you've already bought scheduling software for the deputy head for academic affairs.
     But what about me? I have to create the visitor schedule as you require, but you haven't provided
     any software for administrative planning...

     Help the assistant by organizing the schedule for the visitors based on their requested time intervals,
     as recorded in the assistant's book.

     It is not allowed to receive two visitors at the same time. As soon as one meeting ends, the next can
     start immediately - their meetings may even overlap at the office door.

     Input:
     The first line contains the number of visitors n (n <= 1000) who have signed up for a meeting.
     Each of the next n lines contains two times: the meeting's start time T1i and end time T2i
     in the format hh:mm, separated by a space.
     All times are within the same day and T2i >= T1i for each i.

     Output:
     Print the maximum number of visitors who can be scheduled to meet with the head during the workday.

     Example:
     Input:
     4
     09:10 13:05
     14:25 14:30
     14:20 15:15
     15:00 17:00
     Output:
     3
     */

    public static void main(String[] args) {
        String[][] visits = {
                {"09:10", "13:05"},
                {"14:25", "14:30"},
                {"14:20", "15:15"},
                {"15:00", "17:00"}
        };
        System.out.println(getMaxVisitors(visits));
    }

    public static int getMaxVisitors(String[][] visits) {
        int n = visits.length;
        int[][] times = new int[n][2];
        for (int i = 0; i < n; i++) {
            String time = visits[i][0];
            times[i][0] = Integer.parseInt(time.substring(0, 2)) * 60 + Integer.parseInt(time.substring(3, 5));
            time = visits[i][1];
            times[i][1] = Integer.parseInt(time.substring(0, 2)) * 60 + Integer.parseInt(time.substring(3, 5));
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (times[j][1] > times[j + 1][1]
                        || (times[j][1] == times[j + 1][1] && times[j][0] > times[j + 1][0])) {
                    int[] temp = times[j];
                    times[j] = times[j + 1];
                    times[j + 1] = temp;
                }
            }
        }
        int count = 0;
        int lastEnd = -1;
        for (int[] time : times) {
            if (time[0] >= lastEnd) {
                count++;
                lastEnd = time[1];
            }
        }
        return count;
    }
}
