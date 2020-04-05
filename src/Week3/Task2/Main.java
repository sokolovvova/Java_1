package Week3.Task2;

public class Main {
    public static void main(String[] args) {
        Card card = new Card("0000",100,"SimpleCard");
        card.getCardInfo();
        VirtualPrepaidCard card2 = new VirtualPrepaidCard("0001",150,200,"VirtualPrepaidCard");
        card2.getCardInfo();
        PlasticCard card3 = new PlasticCard("0002",300,"black",true,"SimplePlasticCard");
        card3.getCardInfo();
        NamedPlasticCard card4 = new NamedPlasticCard("0003",500,"blue",false,"Vladimir","NamedPlasticCard");
        card4.getCardInfo();
        ActionCard card5 = new ActionCard("0004",375,"green",true,"Dmitry",true,"ActionCard");
        card5.getCardInfo();
        CreditCard card6 =new CreditCard("0005",300,"yellow",true,"Alexey",800,"CreditCard");
        card6.getCardInfo();
    }
}
