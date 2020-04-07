package Week3.Task1;

public class Main {
    public static void main(String[] args) {
        CashMachine ATM = new CashMachine(10,10,10);
        ATM.cashBalance();
        errCheck(ATM.outMoney(720));
        errCheck(ATM.outMoney(40));
        errCheck(ATM.outMoney(700));
        errCheck(ATM.outMoney(400));
        errCheck(ATM.addMoney(5,5,5));
        errCheck(ATM.outMoney(720));

        ATM.cashBalance();
    }

    public static void errCheck(boolean s){
        if(s) System.out.println("Операция успешно завершена.\n");
        else System.out.println("Во время операции произошла ошибка.\n");
    }
}
