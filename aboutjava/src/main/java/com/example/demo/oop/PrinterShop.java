package com.example.demo.oop;

public class PrinterShop {
    /*
    Com ABC sells printer ...
    1. printer  with wifi,color,fax
    2. Printer black and white
    3. printer with wifi,color,b/w, scan, fax
     */
    public static void main(String[] args) {

        PrinterOne one = new PrinterOne();
        one.wifiSupport();

        PrinterTwo two = new PrinterTwo();
        two.bandWPrinterSupport();

        PrinterThree three = new PrinterThree();
        three.bandWPrinterSupport();
        three.colorPrintSupport();
        three.wifiSupport();
    }
}

class PrinterOne implements Wifi,ColorPrint,fax{

    @Override
    public void wifiSupport() {
        System.out.println("Printer one: Wifi");

    }

    @Override
    public void colorPrintSupport() {

    }

    @Override
    public void faxSupport() {

    }
}

class PrinterTwo implements BandW{

    @Override
    public void bandWPrinterSupport() {
        System.out.println("Printer two:banw");

    }
}

class PrinterThree implements Wifi,ColorPrint,BandW{

    @Override
    public void colorPrintSupport() {
        System.out.println("Printer three: color print support ");

    }

    @Override
    public void bandWPrinterSupport() {
        System.out.println("Printer three: bandw printer");
    }

    @Override
    public void wifiSupport() {
        System.out.println("Printer three: wifi support");
    }
}

interface Wifi {
    void wifiSupport();
}

interface ColorPrint{
    void colorPrintSupport();
}

interface BandW{
    void bandWPrinterSupport();
}

interface Scan{
    void scanSupport();
}

interface fax{
    void faxSupport();
}
