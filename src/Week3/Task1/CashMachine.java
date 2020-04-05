package Week3.Task1;

public class CashMachine {
    private int cash20;
    private int cash50;
    private int cash100;
    private int balance;
    public CashMachine(int c20,int c50,int c100){
        this.cash20=c20;
        this.cash50=c50;
        this.cash100=c100;
        this.balance=c20*20+c50*50+c100*100;
    }

    public boolean addMoney(int c20,int c50,int c100){
        cash20+=c20;
        cash50+=c50;
        cash100+=c100;
        balance+=c20*20+c50*50+c100*100;
        return true;
    }

    public int[] outMoney(int sum){
        int[] array = new int[4];
        if(balance<sum){
            array[0]=0;
            return array;
        }
        else {
            return array;
            //under development
        }
    }
}
