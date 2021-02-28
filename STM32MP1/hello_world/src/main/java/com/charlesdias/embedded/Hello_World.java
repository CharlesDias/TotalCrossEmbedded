package com.charlesdias.embedded;
import totalcross.ui.MainWindow;
import totalcross.ui.Label;
import totalcross.sys.Settings;
public class Hello_World extends MainWindow {
    
    public Hello_World() {
        setUIStyle(Settings.MATERIAL_UI);
    }

    @Override
    public void initUI() {
        Label helloWord = new Label("Hello World!");
        add(helloWord, CENTER, CENTER);
    }
}
