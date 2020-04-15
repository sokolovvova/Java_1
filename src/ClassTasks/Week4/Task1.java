package ClassTasks.Week4;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        for(int i=1;i<6;i++){
            System.out.print("Введите "+i+" слово\n>");
            list.add(scanner.nextLine());
        }


        list.remove(2);


      //  for(int i2=list.size()-1;i2>=0;i2--){
        //     System.out.println(list.get(i2));
      //  }

        Collections.reverse(list);
        for(String s:list){
            System.out.print(s+" ");
        }
    }
}
