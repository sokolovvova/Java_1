package Week1;

public class Task3 {
    public static void main(String[] args) {
        float a =-8.5f;
        float b =11.45f;
        float difa=a-10;
        float difb=b-10;

        difa=difa<0?-difa:difa;
        difb=difb<0?-difb:difb;

        if(difa<difb){
            System.out.println("Ближайшее к 10 число a: "+a);
        }
        else if(difb<difa){
            System.out.println("Ближайшее к 10 число b : "+b);
        }
        else {
            System.out.println("числа a и b на одинаковом расстоянии от 10.  a="+a+" b="+b);
        }
        
    }
}
