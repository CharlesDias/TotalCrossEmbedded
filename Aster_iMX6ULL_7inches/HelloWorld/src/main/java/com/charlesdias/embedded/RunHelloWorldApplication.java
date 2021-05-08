package com.charlesdias.embedded;

import totalcross.TotalCrossApplication;

public class RunHelloWorldApplication {
    public static void main(String [] args) {
        TotalCrossApplication.run(HelloWorld.class, "/scr", "800x480", "/r", "5443444B5AAEEB90306B00E4");
    }
}
