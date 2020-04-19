package Week4.Computer;

public class Computer {

    public class USBPort<T extends Drive>{
        String name;
        boolean isUSBPut;
        String driveName="";
        public USBPort(String n){
            this.name=n;
        }
        public boolean PutInUSBDrive(String name){
            if(isUSBPut==true){
                System.out.println("В этот порт уже подключено устройство.");
                return false;
            }
            this.isUSBPut=true;
            this.driveName=name;
            return true;
        }
        boolean  putOutUSBDrive(){
            if(isUSBPut==false){
                System.out.println("В этом порту отсутствует устройство");
                return false;
            }
            this.isUSBPut=false;
            this.driveName="";
            return true;
        }
        boolean printFromUSBDrive(T drive){
            if(drive==null){
                System.out.println("В данном порту отсутствуют подключенные устройства.");
                return false;
            }
            drive.read();
            return true;
        }
        boolean writeToUSBDrive(T drive){
            if(drive==null){
                System.out.println("В данном порту отсутствуют подключенные устройства.");
                return false;
            }
            drive.write();
            return true;
        }
    }

}
