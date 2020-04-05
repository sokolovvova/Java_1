package Week3.Task2;

public class NamedPlasticCard extends PlasticCard{
    String holderName;

    public NamedPlasticCard(String number,int b,String color,boolean nfc,String holder,String name){
        super(number,b,color,nfc,name);
        this.holderName=holder;
    }

    public void getCardInfo(){
        System.out.println("CardName="+cardName+", "+"CardNumber="+number+", "+"balance="+balance+", "+"CardColor="+color+", "+"NFC="+haveNFC+", "+"HolderName="+holderName+".");
    }
}
