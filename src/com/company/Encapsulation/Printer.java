package com.company.Encapsulation;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;


    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
    }

    public int addToner (int tonerAmount){
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (tonerAmount + tonerLevel > 100) {
                return -1;
            } else {
                return tonerLevel + tonerAmount;
            }
        } else {
            return -1;
        }
    }

    public int printPages (int pages) {
        int pagesToPrint = pages;
        if (pagesToPrint == 1){
            this.pagesPrinted = pagesToPrint;
            return pagesToPrint;
        }
        int extra = 0;
        if (duplex == true) {
            if (pagesToPrint % 2 == 1){
                extra = 1;
            }
            pagesToPrint = pagesToPrint/2;
            pagesToPrint = pagesToPrint + extra;
            this.pagesPrinted = pagesPrinted + pagesToPrint;
        }
        if (pagesToPrint % 2 == 1){
            this.pagesPrinted = pagesPrinted + pagesToPrint;
        }
        return  pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
