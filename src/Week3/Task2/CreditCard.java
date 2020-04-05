package Week3.Task2;

public class CreditCard extends NamedPlasticCard{
    int creditLimit;

    public CreditCard(String number,int b,String color,boolean nfc,String holder,int creditLimit,String name){
        super(number,b,color,nfc,holder,name);
        this.creditLimit=creditLimit;
    }

    public void getCardInfo(){
        System.out.println("CardName="+cardName+", "+"CardNumber="+number+", "+"balance="+balance+", "+"CardColor="+color+", "+"NFC="+haveNFC+", "+"HolderName="+holderName+", "+"CreditLimit="+creditLimit+".");
    }
}
