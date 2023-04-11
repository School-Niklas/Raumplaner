import java.awt.*;
import java.awt.geom.Rectangle2D;


public class Nachttisch extends Moebel
{

    public Nachttisch()  {
        xPosition = 120;
        yPosition = 150;
        orientierung = 0;
        farbe = "rot";
        istSichtbar = false;
        breite = 120;
        tiefe  = 100;
    }

    public Nachttisch(int x, int y, String f) {
        xPosition = x;
        yPosition = y;
        farbe = f;
        orientierung = 0;
        istSichtbar = false;
        breite = 120;
        tiefe  = 100;
    }

    protected Shape gibAktuelleFigur()
    {
        Shape nachttisch = new Rectangle2D.Double(0, 0, breite, tiefe);
        return transformiere(nachttisch);
    }
}
