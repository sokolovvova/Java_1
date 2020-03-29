package Week2;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int point;
       while(true){
           point=MenuDraw();
           if(point<1||point>4){
               System.out.println("Ошибка. введите пункт от 1 до 4.\n");
               continue;
           }
           else if(point==4) {
               System.out.println("Завершение работы программы.");
               break;
           }
           else if(point==1||point==2||point==3) {
               System.out.println("В разработке.\n");
               continue;
           }
       }
    }


    public static int MenuDraw() {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("1.Таблица умножения.");
        System.out.println("2.Подсчёт символов.");
        System.out.println("3.Покер.");
        System.out.println("4.Выход.");
        System.out.print("\nВыберите пункт меню (1..4):\n> ");
        n=scanner.nextInt();
        return n;
    }
}