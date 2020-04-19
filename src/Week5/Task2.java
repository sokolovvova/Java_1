package Week5;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=10;i++){
            System.out.println("Введите "+i+" число:");
            list.add(scanner.nextInt());
        }
        int count=0,nCount=0;
        int pr=list.get(0);
        for(int i=0;i<list.size();i++){
            if(list.get(i)==pr){
                nCount++;
                if((i==(list.size()-1))&&nCount>count){
                    count = nCount;
                }
            }
            else {
                if (nCount > count) {
                    count = nCount;
                }
                nCount = 1;
            }
                pr=list.get(i);
        }
        System.out.println("Список= "+list);
        if(count==1){
            System.out.println("В списке нет последовательности повторяющихся чисел.");
        }
        else{
            System.out.println("Результат="+count);
        }
    }
}
