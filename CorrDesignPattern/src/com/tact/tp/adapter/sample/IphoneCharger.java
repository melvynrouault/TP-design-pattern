package com.tact.tp.adapter.sample;

public class IphoneCharger implements ChargerLightningConnector {

    @Override
    public void load(IphonePhone phone) {
        System.out.println("Charge un  iPhone depuis un chargeur d'iPhone.");
    }

}
