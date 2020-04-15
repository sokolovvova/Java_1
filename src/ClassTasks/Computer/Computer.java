package ClassTasks.Computer;

import java.util.Scanner;

public class Computer<T extends Drive> {
    Scanner scanner = new Scanner(System.in);
    boolean isUSBDataExists;

    public Computer(){
        isUSBDataExists=false;
    }


    public void printFromUSBDrive(T drive){
        drive.read(isUSBDataExists);
    }
    public void writeToUSBDrive(T drive){
        drive.write(isUSBDataExists);
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
