package encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        if (tonerLevel <= 0) {
            this.tonerLevel = 1;
        } else if (tonerLevel > 100) {
            this.tonerLevel = 100;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int amount) {
        if (amount < 0) {
            throw new RuntimeException("Amount of toner can not be negative number");
        }
        this.tonerLevel += amount;
        if (tonerLevel > 100) {
            System.out.println("Toner is full");
            this.tonerLevel = 100;
            return tonerLevel;
        }
        return tonerLevel;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int printPages(int pages) {
        if (this.duplex) {
            if (pages % 2 == 0) {
                System.out.println("This is a duplex printer");
                this.pagesPrinted += pages / 2;
                return pages / 2;
            } else {
                System.out.println("This is a duplex printer");
                this.pagesPrinted += (pages / 2 + 1);
                return pages / 2 + 1;
            }

        } else {
            System.out.println("This is not a duplex printer");
            this.pagesPrinted += pages;
            return pages;
        }
    }
}
