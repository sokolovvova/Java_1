package ClassTasks.Computer;

public class USBDrive {


    String data;
    DataType type;

    public USBDrive(String d,String t){
        this.data=d;
        type =DataType.valueOf(t.toUpperCase());
    }
}
