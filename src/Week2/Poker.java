package Week2;

import java.util.Random;
import java.util.Scanner;

public class Poker {

    /*генерируем колоду из 52 карт*/

    public static String[] DeckGen(){
        int n=0;
        String[] cards = new String[52];
        String[] cardSuit ={"♠","♣","♥","♦"};
        String[] cardN ={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for(String s1 : cardN){
            for(String s2 : cardSuit){
                cards[n]=s1+s2;
                n++;
            }
        }
        return cards;
    }

    public static void CardDistr() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] cards =DeckGen();
        int n;
        while(true){
            System.out.print("Введите количество игроков.\n> ");
            n = scanner.nextInt();
            if(n>10){
                System.out.println("Слишком много людей, недостаточно карт.");
                continue;
            }
            else if(n<=0){
                System.out.println("Введите положительное количество игроков.");
                continue;
            }
            else break;
        }

        for(int i=1;i<=n;i++){
            System.out.print(i+": ");
            for(int j=0;j<5;j++){
                while(true){
                    int c = random.nextInt(52);
                    String curCard = cards[c];
                    if(curCard.equals("1")) continue;
                    else{
                        System.out.print(curCard+" ");
                        cards[c]="1";
                        break;
                    }
                }
            }
            System.out.println();
        }
    }
}