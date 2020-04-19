package Week4.Computer;
import java.util.Scanner;

public class HDD implements Drive {

    Scanner scanner = new Scanner(System.in);

    String data;
    DataType type;

    public HDD(String d,String t){
        this.data=d;
        type =DataType.valueOf(t.toUpperCase());
    }


    public void read(){
            switch(type){
                case FILE:
                    System.out.print("читается файл...  ");
                    break;
                case AUDIO:
                    System.out.print("воспроизводится аудио...  ");
                    break;
                case MOVIE:
                    System.out.print("воспроизводится фильм...  ");
                    break;
            }
            System.out.println(data);
    }
    public void write(){
            String[] str = getDataFromKB();
            data=str[0];
            type=DataType.valueOf(str[1].toUpperCase());
    }

    public String[] getDataFromKB(){
        String[] s=new String[2];
        System.out.println("Введите данные которые необходимо записать на HDD: ");
        s[0] =scanner.nextLine();

        System.out.println("Введите тип файла (movie,audio,file):");
        s[1] = scanner.nextLine();
        return s;
    }


}
