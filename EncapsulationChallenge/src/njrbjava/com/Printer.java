package njrbjava.com;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        else {
            this.tonerLevel = -1;
        }
        this.duplex = isDuplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int level) {
        if (level > 0 && level <= 100) {
            if (this.tonerLevel + level > 100) {
                return -1;
            }
            this.tonerLevel += level;
            return this.tonerLevel;
        }
        else {
            return -1;
        }
    }

    public int printPages(int numberOfPages) {
        if (this.duplex) {
            numberOfPages = (numberOfPages / 2) + (numberOfPages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += numberOfPages;
        return numberOfPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
