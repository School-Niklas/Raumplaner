import java.awt.Shape;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;


public class Schrank extends Moebel
{
    public Schrank() {
        xPosition = 330;
        yPosition = 50;
        farbe = "schwarz";
        orientierung = 90;
        istSichtbar = false;
        breite = 60;
        tiefe  = 37;
    }

    public Schrank(int xPosition,
                   int yPosition,
                   String farbe,
                   int orientierung,
                   int breite,
                   int tiefe) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.farbe = farbe;
        this.orientierung = orientierung;
        istSichtbar = false;
        this.breite = breite;
        this.tiefe  = tiefe;
    }

    protected Shape gibAktuelleFigur() {
        GeneralPath schrank = new GeneralPath();
        Rectangle2D rahmen = new Rectangle2D.Double(0, 0, breite, tiefe);
        schrank.append(rahmen, false);
        Line2D diagonale1 = new Line2D.Double(0, 0, breite, tiefe);
        schrank.append(diagonale1, false);
        Line2D diagonale2 = new Line2D.Double(0, tiefe, breite, 0);
        schrank.append(diagonale2, false);
        return transformiere(schrank);
    }
}
