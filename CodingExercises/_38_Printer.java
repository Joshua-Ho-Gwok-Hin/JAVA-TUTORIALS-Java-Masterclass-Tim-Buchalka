public class _38_Printer {

    private int tonerLevel, pagesPrinted;
    private boolean duplex;

    public _38_Printer(int tonerLevel, boolean duplex) {

        if (tonerLevel<0||100<tonerLevel){
            this.tonerLevel = -1;
        }else
            this.tonerLevel = tonerLevel;

        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if ((0<tonerAmount)&&(tonerAmount<=100)){
            if (100<(tonerLevel + tonerAmount))
                return -1;
            else
                return this.tonerLevel += tonerAmount;
        }
        return -1;
    }

    public int printPages(int pages){

        int pagesToPrint = pages;

        if(duplex){
            System.out.println("Printing in duplex mode");
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("pagesToPrint = " + pagesToPrint);
            pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }else{
            pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public static void main(String[] args) {
        _38_Printer printer = new _38_Printer(50, false);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
    }


}
