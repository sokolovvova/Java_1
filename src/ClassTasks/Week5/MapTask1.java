package ClassTasks.Week5;

import java.util.*;

public class MapTask1 {

    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        Set<String> d = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String lName;
        Double salary;
        Random random = new Random();
        for(int i=1;i<=5;i++){
            System.out.println("Введите фамилию "+i+":");
            lName=scanner.nextLine();
            salary=random.nextDouble()*1000;
            map.put(lName,salary);
        }


        System.out.println(map);

        Set<Map.Entry<String,Double>> set = map.entrySet();

        for(Map.Entry<String,Double> entry : set){
            if(entry.getValue()<500){
                d.add(entry.getKey());
            }
        }

        for(String k: d){
            map.remove(k);
        }

        System.out.println(map);


    }



}

