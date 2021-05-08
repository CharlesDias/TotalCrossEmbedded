package com.charlesdias.embedded;

import com.charlesdias.embedded.util.*;
import totalcross.ui.MainWindow;
import totalcross.ui.Switch;
import totalcross.ui.ImageControl;
import totalcross.ui.event.ControlEvent;
import totalcross.ui.event.PressListener;
import totalcross.util.UnitsConverter;
import totalcross.sys.Settings;
public class LightSwitch extends MainWindow {
    
    public LightSwitch() {
        setUIStyle(Settings.MATERIAL_UI);
        setBackColor(Colors.COLOR_DARK_GRAY);
    }

    private Switch swLightSwitch;
    private ImageControl icLight;

    @Override
    public void initUI() {
        Images.loadImages();
        
        //Create switch components
        swLightSwitch = new Switch();
        
        //Set the colors of the switch's parts
        swLightSwitch.colorBallOn = Colors.COLOR_DARK_YELLOW;
        swLightSwitch.colorBallOff = Colors.COLOR_LIGHT_GRAY;
        swLightSwitch.colorBarOn = Colors.COLOR_LIGHT_YELLOW;
        swLightSwitch.colorBarOff = Colors.COLOR_MEDIUM_GRAY;
        
        //Create image control component with initial light off image
        icLight = new ImageControl(Images.iLightOff);
        icLight.scaleToFit = true;
        
        // Position light bulb at the center of the screen,
        // using the original size of the image
        add(icLight, CENTER, CENTER - UnitsConverter.toPixels(DP + 100), 
                PREFERRED, PREFERRED);

        // Position the switch below the image 
        add(swLightSwitch, CENTER, AFTER, UnitsConverter.toPixels(DP + 200), 
                UnitsConverter.toPixels(DP + 50));

        swLightSwitch.addPressListener(onSwitchPressed);
    }

    PressListener onSwitchPressed = new PressListener() {
        @Override
        public void controlPressed(ControlEvent controlEvent) {
            if (swLightSwitch.isOn()) {
                icLight.setImage(Images.iLightOn);
            } else {
                icLight.setImage(Images.iLightOff);
            }
        }
    };    
}
