package njrbjava.com;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted);
        System.out.println("New total print count for printer = " + printer.getPagesPrinted());

        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted);
        System.out.println("New total print count for printer = " + printer.getPagesPrinted());

        Printer printer1 = new Printer(50, false);
        System.out.println("Initial page count = " + printer.getPagesPrinted());

        pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted);
        System.out.println("New total print count for printer = " + printer.getPagesPrinted());

        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted);
        System.out.println("New total print count for printer = " + printer.getPagesPrinted());

    }
}
