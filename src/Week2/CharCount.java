package Week2;

import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {

    }
    public static void Count(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст.\n> ");
        String s = scanner.nextLine();
        char c;
        int n=0;
        while (true){
            System.out.print("Введите символ, который необходимо найти.\n> ");
            String sch = scanner.nextLine();
            if(sch.length()==1) c=sch.charAt(0);
            else{
                System.out.println("Введите 1 символ, а не строку.");
                continue;
            }
            break;
        }
        char[] cha =s.toCharArray();
        for(char ch:cha){
            if(ch==c) n++;
        }
        System.out.println("В тексте символ \'"+c+"\' встречается "+n+" раз.");
    }
}
