import java.awt.Shape;
import java.awt.geom.GeneralPath;

public class Schrankwand extends Moebel
{
    private Schrank schrank1;
    private Schrank schrank2;
    private Schrank schrank3;

    public Schrankwand()  // Konstruktor
    {
        xPosition = 40;
        yPosition = 80;
        farbe = "blau";
        orientierung = 0;
        istSichtbar = false;
        breite = 180;
        tiefe = 37;
        schrank1 = new Schrank(0, 0, farbe, orientierung, breite/3, tiefe);
        schrank2 = new Schrank(breite/3, 0, farbe, orientierung, breite/3, tiefe);
        schrank3 = new Schrank(2*breite/3, 0, farbe, orientierung, breite/3, tiefe);
    }

    protected Shape gibAktuelleFigur()
    {
        GeneralPath schrankwand = new GeneralPath();
        schrankwand.append(schrank1.gibAktuelleFigur(), false);
        schrankwand.append(schrank2.gibAktuelleFigur(), false);
        schrankwand.append(schrank3.gibAktuelleFigur(), false);

        return transformiere(schrankwand);
    }
}