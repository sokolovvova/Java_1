package Week1;

public class Task2 {
    public static void main(String[] args) {
        int a=7;
        int b=8;
        int c=6;
        int temp;
        if(a>b){
            temp = a;
            a = b;
            b = temp;
        }
        if(a>c) {
            temp = a;
            a = c;
            c = temp;
        }
        if(b>c){
            temp = b;
            b = c;
            c = temp;
        }
        System.out.println("a="+a+" b="+b+" c="+c);
    }
}
