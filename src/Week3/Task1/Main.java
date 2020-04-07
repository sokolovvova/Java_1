package Week3.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CashMachine ATM = new CashMachine(10,10,10);
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("1.Добавить деньги в банкомат.\n2.Наличие купюр в банкомате\n3.Снять деньги\n4.Выход.\n> ");
            int n = scanner.nextInt();
            switch(n){
                case 1:
                    System.out.print("Введите количество банкнот номиналом : 20 50 100. (Пример \"10 15 10\").\n> ");
                    errCheck(ATM.addMoney(scanner.nextInt(),scanner.nextInt(),scanner.nextInt()));

                    System.out.print("1.Продолжить.\n2.Выход.\n> ");
                    int i=scanner.nextInt();
                    if(i==1) continue;
                    else if (i==2) break;


                case 2:
                    errCheck(ATM.cashBalance());

                    System.out.print("1.Продолжить.\n2.Выход.\n> ");
                    i=scanner.nextInt();
                    if(i==1) continue;
                    else if (i==2) break;

                case 3:
                    System.out.print("Введите сумму которую необходимо снять: \n> ");
                    int s =scanner.nextInt();
                    errCheck(ATM.outMoney(s));

                    System.out.print("1.Продолжить.\n2.Выход.\n> ");
                    i=scanner.nextInt();
                    if(i==1) continue;
                    else if (i==2) break;
                case 4:
                    System.out.println("Завершение работы программы.");
                    break;
                default:
                    System.out.println("Вариант меню не найден, попробуйте снова.");
            }
            break;



        }
    }

    public static void errCheck(boolean s){
        if(s) System.out.println("Операция успешно завершена.\n");
        else System.out.println("Во время операции произошла ошибка.\n");
    }
}
