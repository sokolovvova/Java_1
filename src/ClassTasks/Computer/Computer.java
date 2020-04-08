package ClassTasks.Computer;

import java.util.Scanner;

public class Computer {
    Scanner scanner = new Scanner(System.in);
    boolean isUSBDataExists;


    public Computer(){
        isUSBDataExists=false;
    }


    public void printFromUSBDrive(USBDrive usb){
        if(isUSBDataExists==true){

            switch(usb.type){
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
            System.out.println(usb.data);
        }
        else System.out.println("USB dont put in");
    }
    public void writeToUSBDrive(USBDrive usb){
        String[] str = getDataFromKB();
        usb.data=str[0];
        usb.type=DataType.valueOf(str[1].toUpperCase());

    }

    public String[] getDataFromKB(){
        String[] s=new String[2];
        System.out.println("Введите данные которые необходимо записать на флешку: ");
        s[0] =scanner.nextLine();

        System.out.println("Введите тип файла (movie,aufio,file):");
        s[1] = scanner.nextLine();
        return s;
    }

    public class USBPort{
        public void PutInUSBDrive(){
            Computer.this.isUSBDataExists=true;
        }
        public  void putOutUSBDrive(){
            Computer.this.isUSBDataExists=false;
        }
    }

}
