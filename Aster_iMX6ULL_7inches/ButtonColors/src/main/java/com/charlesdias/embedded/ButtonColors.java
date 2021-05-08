package com.charlesdias.embedded;
import totalcross.ui.MainWindow;
import totalcross.ui.Label;
import totalcross.sys.Settings;
import totalcross.ui.Button;
import totalcross.ui.gfx.Color;
import totalcross.util.UnitsConverter;
public class ButtonColors extends MainWindow {
    
    private Button btn;
    private Boolean state = false;

    public ButtonColors() {
        setUIStyle(Settings.MATERIAL_UI);
    }

    @Override
    public void initUI() {
        btn = new Button("Press Button!");
        btn.setBackForeColors(Color.BLACK, Color.WHITE);
        
        btn.addPressListener((event) -> {
            // DO SOMETHING
            state = !state;

            if(state) {
                btn.setText("Button RED");
                btn.setBackColor(Color.RED);
            }else {
                btn.setText("Button BLUE");
                btn.setBackColor(Color.BLUE);
            }            
        });

        add(btn, CENTER, CENTER, UnitsConverter.toPixels(DP + 200), UnitsConverter.toPixels(DP + 100));
    }
}
