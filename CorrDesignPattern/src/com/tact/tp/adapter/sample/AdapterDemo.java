package com.tact.tp.adapter.sample;

public class AdapterDemo {

    public static void main(String[] args) {
        // iPhone system
        XsIphonePhone iPhone = new XsIphonePhone();
        IphoneCharger chargerIphone = new IphoneCharger();
        chargerIphone.load(iPhone);

        // Android system
        SamsungAndroidPhone android = new SamsungAndroidPhone();
        AndroidCharger chargerAndroid = new AndroidCharger();
        chargerAndroid.load(android);

        // Cross test...
        AdapterAndroid adapterAndroid = new AdapterAndroid(android);
        chargerIphone.load(adapterAndroid);

        AdapterIphone adapterIphone = new AdapterIphone(iPhone);
        chargerAndroid.load(adapterIphone);

        XiaomiAndroidPhone xiaomi = new XiaomiAndroidPhone();
        chargerAndroid.load(xiaomi);

        AdapterAndroid adapterAndroidXiaomi = new AdapterAndroid(xiaomi);
        chargerIphone.load(adapterAndroidXiaomi);
    }

}
