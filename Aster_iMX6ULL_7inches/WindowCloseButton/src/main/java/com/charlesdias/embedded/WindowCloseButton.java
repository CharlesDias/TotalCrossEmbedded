package com.charlesdias.embedded;
import totalcross.ui.MainWindow;
import totalcross.ui.gfx.Color;
import totalcross.util.UnitsConverter;
import totalcross.ui.Button;
import totalcross.sys.Settings;
import totalcross.ui.font.Font;

public class WindowCloseButton extends MainWindow {
    
    public WindowCloseButton() {
        setUIStyle(Settings.MATERIAL_UI);
        setBackColor(Color.DARK);
    }

    private Button bntClose;
    
    @Override
    public void initUI() {
        bntClose = new Button("Close Window!");
        bntClose.setBackForeColors(Color.RED, Color.BLACK);
        bntClose.setFont(Font.getFont("Lato Regular", false, 26));

        bntClose.addPressListener((event) -> {
            // DO SOMETHING
            WindowCloseButton.super.exit(0);
        });

        add(bntClose, CENTER, CENTER, UnitsConverter.toPixels(DP + 200), UnitsConverter.toPixels(DP + 100));        
    }
}
