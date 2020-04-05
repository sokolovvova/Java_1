package Week3.Task2;

public class VirtualPrepaidCard extends Card{
    int nominal;

    public VirtualPrepaidCard(String number,int b,int n,String name){
        super(number,b,name);
        this.nominal=n;
    }

    public void getCardInfo(){
        System.out.println("CardName="+cardName+", "+"CardNumber="+number+", "+"balance="+balance+", "+"PrepaidCardNominal="+nominal+".");
    }
}
