package com.tact.tp.adapter.sample;

public class AndroidCharger implements ChargerUsbConnector {

    @Override
    public void load(AndroidPhone phone) {
        System.out.println("Charge un  Android depuis un chargeur d'android.");
    }

}
