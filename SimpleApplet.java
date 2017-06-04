package Applet;

import java.applet.Applet;
import java.awt.*;
/*<applet code="SimpleApplet" width=200 height=60>
</applet>
*/

/**
 * Created by Анастасия on 26.10.2016.
 */
public class SimpleApplet extends Applet {
    public void paint(Graphics g){
        g.drawString("Простейший аплет",20,20);
    }
}
