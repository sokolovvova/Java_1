package Week2;

public class MultTable {
    public static void main(String[] args) {
    }
    public static void TableDraw(){
        System.out.println("Таблица умножения:");
        for(int i=1;i<10;i++){
            for(int j=1;j<10;j++){
                System.out.print(" "+j+"*"+i+"="+i*j);
                if(i*j<10) System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
