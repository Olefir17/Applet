package Applet;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Anastasia on 23.11.2016.
 */
/*
<applet code="Sample" width = 500 height = 50>
</applet>

 */
public class Sample extends Applet {
    String msg;

    public void init(){
        setBackground(Color.MAGENTA);
        setForeground(Color.red);
        msg = "Inside init()--";

    }
    public void start(){
        msg = "Inside start()--";
    }

    public void paint(Graphics g){
        msg = "Inside paint().";
        g.drawString(msg,100,30);
    }

}
