package ru.adapter;

public class PC {

    public void readFromUsb(UsbInterface usbInterface) {
        usbInterface.connect();
        System.out.println("Считываю информацию");
    }
}
