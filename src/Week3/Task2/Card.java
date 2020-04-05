package Week3.Task2;

public class Card {
    String cardName;
    String number;
    int balance;

    public Card(String number,int b,String name){
        this.number=number;
        this.balance=b;
        this.cardName=name;
    }

    public void getCardInfo(){
        System.out.println("CardName="+cardName+", "+"CardNumber="+number+", "+"balance="+balance+".");
    }
}
