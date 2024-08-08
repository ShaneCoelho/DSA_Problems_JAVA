import java.util.*;

public class MaxMeetings {
    public static int maximumMeetings(int []start, int []end) {
        // Write your code here.
        int n=start.length;
        ArrayList<meeting> meet=new ArrayList<>();

        for(int i=0;i<n;i++){
            meet.add(new meeting(start[i],end[i],i+1));
        }

        ArrayList<Integer> ans=new ArrayList<>();

        meetingComparator mc=new meetingComparator();
        Collections.sort(meet,mc);

        ans.add(meet.get(0).pos);

        int length=meet.get(0).end;

        for(int i=1;i<n;i++){
            if(meet.get(i).start>length){
                ans.add(meet.get(i).pos);
                length=meet.get(i).end;
            }
        }

        return ans.size();


    }
}

class meeting {
    int start, pos, end;

    meeting(int start,int end, int pos) {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}

class meetingComparator implements Comparator<meeting> {
    public int compare(meeting o1, meeting o2) {
        if (o1.end < o2.end) {
            return -1;
        } else if (o1.end > o2.end) {
            return 1;
        } else if (o1.pos < o2.pos) {
            return -1;
        }
        return 1;
    }
}