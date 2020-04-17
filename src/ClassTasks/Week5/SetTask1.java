package ClassTasks.Week5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class SetTask1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        set.add(12);
        for(int i=0;i<20;i++){
            set.add((int)(random.nextDouble()*100));
        }

        Iterator<Integer> value = set.iterator();
        System.out.println(set);


        while(value.hasNext()){
            if(value.next()>=10){
                value.remove();
            }
        }

        System.out.println(set);
    }
}
