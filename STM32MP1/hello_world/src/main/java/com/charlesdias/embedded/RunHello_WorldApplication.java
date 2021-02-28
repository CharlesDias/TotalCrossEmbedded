package com.charlesdias.embedded;

import totalcross.TotalCrossApplication;

public class RunHello_WorldApplication {
    public static void main(String [] args) {
        TotalCrossApplication.run(Hello_World.class, 
        "/scr", "480x800",
        "/r", "5443444B5AAEEB90306B00E4");
    }
}
