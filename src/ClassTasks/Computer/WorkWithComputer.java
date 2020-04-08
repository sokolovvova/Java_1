package ClassTasks.Computer;

public class WorkWithComputer {
    public static void main(String[] args) {

        USBDrive drive = new USBDrive("film1","MOVIE");

        Computer computer = new Computer();

        Computer.USBPort port = computer.new USBPort();


     // computer.printFromUSBDrive(drive);

        port.PutInUSBDrive();

        computer.printFromUSBDrive(drive);

        computer.writeToUSBDrive(drive);

        computer.printFromUSBDrive(drive);

     //   port.putOutUSBDrive();

     //  computer.printFromUSBDrive(drive);

    }
}
