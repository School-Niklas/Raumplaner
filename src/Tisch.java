import java.awt.Shape;
import java.awt.geom.Ellipse2D;


public class Tisch extends Moebel
{

    public Tisch()  {
        xPosition = 120;
        yPosition = 150;
        orientierung = 0;
        farbe = "rot";
        istSichtbar = false;
        breite = 120;
        tiefe  = 100;
    }

    public Tisch(int x, int y, String f) {
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
        Shape tisch = new Ellipse2D.Double(0 , 0, breite, tiefe);
        return transformiere(tisch);
    }
}
