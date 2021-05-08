package com.charlesdias.embedded;

import totalcross.TotalCrossApplication;

public class RunLightSwitchApplication {
    public static void main(String [] args) {
        TotalCrossApplication.run(LightSwitch.class, "/scr", "800x480", "/r", "5443444B5AAEEB90306B00E4");
    }
}
