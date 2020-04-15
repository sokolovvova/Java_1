package ClassTasks.Computer;

public class WorkWithComputer {
    public static void main(String[] args) {

        USBDrive drive = new USBDrive("film1","MOVIE");
        HDD hdd = new HDD("music1","AUDIO");

        Computer<USBDrive> computer = new Computer<>();

        Computer.USBPort port = computer.new USBPort();



         computer.printFromUSBDrive(drive);

         port.PutInUSBDrive();

         computer.printFromUSBDrive(drive);

         computer.writeToUSBDrive(drive);

         computer.printFromUSBDrive(drive);

         port.putOutUSBDrive();

         computer.printFromUSBDrive(drive);


        Computer<HDD> computer1 = new Computer<>();

        Computer.USBPort port1 = computer1.new USBPort();



        computer1.printFromUSBDrive(hdd);

        port1.PutInUSBDrive();

        computer1.printFromUSBDrive(hdd);

        computer1.writeToUSBDrive(hdd);

        computer1.printFromUSBDrive(hdd);

        port1.putOutUSBDrive();

        computer1.printFromUSBDrive(hdd);



    }
}
