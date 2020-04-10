package ClassTasks.Printable;

public class Journal implements Printable {
    public void print(String data){
        System.out.print(data+" на журнале");
    }

    @Override
    public void printNumberOfPages() {
        System.out.println("   5 страниц ");
    }
}
