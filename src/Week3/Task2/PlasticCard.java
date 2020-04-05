package Week3.Task2;

public class PlasticCard extends Card{
    String color;
    boolean haveNFC;

    public PlasticCard(String number,int b,String color,boolean nfc,String name){
        super(number,b,name);
        this.color=color;
        this.haveNFC=nfc;
    }

    public void getCardInfo(){
        System.out.println("CardName="+cardName+", "+"CardNumber="+number+", "+"balance="+balance+", "+"CardColor="+color+", "+"NFC="+haveNFC+".");
    }
}
