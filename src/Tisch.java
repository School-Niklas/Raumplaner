import java.awt.Shape;
import java.awt.geom.Ellipse2D;


public class Tisch extends Moebel
{
    private int xPosition;
    private int yPosition;
    private int orientierung;
    private String farbe;
    private boolean istSichtbar;
    private final int breite;
    private final int tiefe;
    

    public Tisch(int xPosition, int yPosition, String farbe, int orientierung, boolean istSichtbar) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.farbe = farbe;
        this.orientierung = orientierung;
        this.istSichtbar = istSichtbar;
        breite = 120;
        tiefe  = 100;
    }

    public Tisch()  {
        xPosition = 120;
        yPosition = 150;
        orientierung = 0;
        farbe = "rot";
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
