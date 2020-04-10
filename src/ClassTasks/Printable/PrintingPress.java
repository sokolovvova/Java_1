package ClassTasks.Printable;

public class PrintingPress {

    public Printable printable[];

    public PrintingPress(Printable[] printable){
        this.printable=printable;
    }


    void printOnAll(String t) {
        for (Printable prn : printable) {
            prn.print(t);
            prn.printNumberOfPages();
        }
    }

    public static void main(String[] args) {
        Printable products[] = new Printable[5];
        products[0] = new Book();
        products[1] = new Book();
        products[2] = new BusinessCard();
        products[3] = new Journal();
        products[4] = new Paper();


        PrintingPress press1 = new PrintingPress(products);

        press1.printOnAll("Какой-то текст");

        }
    }

