package ClassTasks.Week5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class ListPerfomance {
    long arrayListTiming(){
        Random random = new Random();
        ArrayList<Integer> al = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            al.add(random.nextInt());
        }
        long time=System.currentTimeMillis()-startTime;
        return time;
    }
    long linkedListTiming(){
        Random random = new Random();
        LinkedList<Integer> al = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        for(int i=0;i<10000001;i++){
            al.add(random.nextInt());
        }
        long time=System.currentTimeMillis()-startTime;
        return time;
    }

    public static void main(String[] args) {
        ListPerfomance t1 = new ListPerfomance();
        System.out.println("ArrayList= "+t1.arrayListTiming()+"мс");
        System.out.println("LinkedList= "+t1.linkedListTiming()+"мс");







    }
}

