package Week3.Task1;

import java.util.Scanner;

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

    public boolean cashBalance(){
        System.out.println("Баланс купюр в банкомате: ");
        System.out.print("20="+cash20+"шт, ");
        System.out.print("50="+cash50+"шт, ");
        System.out.print("100="+cash100+"шт.");
        System.out.println("Всего="+balance+"\n");
        return true;
    }

    public boolean outMoney(int sum){
        Scanner scanner = new Scanner(System.in);
        int[][] cashVar = new int[(cash20+1)*(cash50+1)*(cash100+1)][3];
        int[][] outVar = new int[cashVar.length][3];
        int i=0,iOut=0,nMin=cash20+cash50+cash100,n,iMin=0;

        for(int c20=0;c20<=cash20;c20++){
            for (int c50=0;c50<=cash50;c50++){
                for(int c100=0;c100<=cash100;c100++){
                    cashVar[i][0]=c20;
                    cashVar[i][1]=c50;
                    cashVar[i][2]=c100;
                    i++;
                }
            }
        }
        if(sum>balance){
            System.out.println("В банкомате недостаточно средств.");
            return false;
        }

        //возможные варианты выдачи нужной суммы
        for(int[] ar:cashVar){
            if(sum==(ar[0]*20+ar[1]*50+ar[2]*100)){
                outVar[iOut][0]=ar[0];
                outVar[iOut][1]=ar[1];
                outVar[iOut][2]=ar[2];
                n=ar[0]+ar[1]+ar[2];
                if(n<nMin){
                    nMin=n;
                    iMin=iOut;
                }
                iOut++;
            }
        }
        if(iOut==0){
            System.out.println("Выдать данную сумму имеющимися купюрами невозможно.");
            return false;
        }

        //предлагаются варианты выдачи купюр, если их больше 5, деньги выдаются с использованием минимального количества купюр

        else if(iOut>1&&iOut<=5){
            System.out.println("Выберите какими купюрами хотите получить деньги (0.."+(iOut-1)+"):");
            for(int iOut2=0;iOut2<iOut;iOut2++){
                System.out.println(iOut2+". 20="+outVar[iOut2][0]+"шт, 50="+outVar[iOut2][1]+"шт, 100="+outVar[iOut2][2]+"шт.");
            }

            System.out.print("> ");
            int variant = scanner.nextInt();
            cash20-=outVar[variant][0];
            cash50-=outVar[variant][1];
            cash100-=outVar[variant][2];
            System.out.println("Выдано: 20="+outVar[variant][0]+"шт, "+"50="+outVar[variant][1]+"шт, 100="+outVar[variant][2]+"шт.");
            this.balance=cash20*20+cash50*50+cash100*100;
            return true;
        }
        else{
            cash20-=outVar[iMin][0];
            cash50-=outVar[iMin][1];
            cash100-=outVar[iMin][2];
            System.out.println("Выдано: 20="+outVar[iMin][0]+"шт, "+"50="+outVar[iMin][1]+"шт, 100="+outVar[iMin][2]+"шт.");
            this.balance=cash20*20+cash50*50+cash100*100;
            return true;

        }

     /*   if(balance<sum){
            array[0]=0;
            return array;
        }
        else {
            return array;
            //under development
        }*/
    }
}
