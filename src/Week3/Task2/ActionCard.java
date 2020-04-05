package Week3.Task2;


public class ActionCard extends NamedPlasticCard{
    boolean participateInAction;

    public ActionCard(String number,int b,String color,boolean nfc,String holder,boolean participateInAction,String name){
        super(number,b,color,nfc,holder,name);
        this.participateInAction=participateInAction;
    }

    public void getCardInfo(){
        System.out.println("CardName="+cardName+", "+"CardNumber="+number+", "+"balance="+balance+", "+"CardColor="+color+", "+"NFC="+haveNFC+", "+"HolderName="+holderName+", "+"ParticipateInAction="+participateInAction+".");
    }
}