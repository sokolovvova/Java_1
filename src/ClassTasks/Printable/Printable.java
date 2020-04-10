package ClassTasks.Printable;

public interface Printable {


    void print(String data);

    default void printNumberOfPages(){
        System.out.println("   default страниц");
    }

}
