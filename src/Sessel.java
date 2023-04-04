import java.awt.Shape;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;


public class Sessel extends Moebel
{
    public Sessel() {
        xPosition = 250;
        yPosition = 90;
        farbe = "blau";
        orientierung = 90;
        istSichtbar = false;
        breite = 60;
        tiefe  = 60;
    }

    protected Shape gibAktuelleFigur() {
        GeneralPath sessel = new GeneralPath();
        Rectangle2D linkeSesselLehne = new Rectangle2D.Double(0, 0, breite/6, tiefe);
        Rectangle2D rechteSesselLehne = new Rectangle2D.Double(5*breite/6, 0, breite/6, tiefe);
        Rectangle2D sitzFlaeche = new Rectangle2D.Double(breite/6, tiefe/6, 2*breite/3, tiefe-tiefe/6);
        Rectangle2D ruecken = new Rectangle2D.Double(breite/6, 0, 2*breite/3, tiefe/6);
        sessel.append(linkeSesselLehne,false);
        sessel.append(rechteSesselLehne,false);
        sessel.append(sitzFlaeche,false);
        sessel.append(ruecken,false);
        return transformiere(sessel);
    }

}
