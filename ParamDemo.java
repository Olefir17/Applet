package Applet;

import java.applet.Applet;
import java.awt.*;
/*
<applet code="ParamDemo" width=300 height=80>
<param name=fontName value=Courier>
<param name=fontSize value=14>
<param name=leading value=2>
<param name=accountEnabled value=true>
</applet>
 */
public class ParamDemo extends Applet {
    String fontName;
    int fontSize;
    float leading;
    boolean active;

    public void start(){
        String param;
        fontName=getParameter("fontName");
        if(fontName==null)
            fontName="Not found";

        param=getParameter("fontSize");
        try {
            if(param!=null)
                fontSize=Integer.parseInt(param);
            else fontSize=0;
        }
        catch (NumberFormatException e){
            fontSize=-1;
        }

        param=getParameter("leading");
        try {
            if(param!=null)
                leading= Integer.parseInt(param);
            else leading=0;
        }
        catch (NumberFormatException e){
            leading=-1;
        }

        param=getParameter("accountEnabled");
        if(param!=null)
            active=Boolean.valueOf(param).booleanValue();
        }

        public void print(Graphics g){
            g.drawString("Font name "+ fontName,3,10);
            g.drawString("Размер шрифта "+fontSize,5,25);
            g.drawString("Отступ "+leading,3,42);
            g.drawString("Активный счет "+active,6,58);
        }

}
