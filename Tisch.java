import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

/**
 * Ein Tisch, der manipuliert werden kann und sich selbst auf einer Leinwand zeichnet.
 */
public class Tisch 
{
    private int xPosition;
    private int yPosition;
    private int orientierung;
    private String farbe;
    private boolean istSichtbar;
    private int breite;
    private int tiefe;

    /**
     * Erzeuge einen neuen Tisch mit einer Standardfarbe und Standardgroesse
     * an einer Standardposition. (Standardkonstruktor)
     */
    public Tisch()  {
        xPosition = 120;
        yPosition = 150;
        orientierung = 0;
        farbe = "rot";
        istSichtbar = false;
        breite = 120;
        tiefe  = 100;
    }

    /**
     * Erzeuge einen neuen Tisch mit einer Standardgroesse
     * an einer durch die Paramter x und y definierten Position
     * und mit einer durch einen Parameter f definierten Farbe. 
     */
    public Tisch(int x, int y, String f) {
        xPosition = x;
        yPosition = y;
        farbe = f;
        orientierung = 0;
        istSichtbar = false;
        breite = 120;
        tiefe  = 100;
    }

    /**
     * Berechnet das zu zeichnende Shape anhand der gegebenen Daten
     * [ Zum Anzeigen der Attributwerte �ber Inspect muss hier die Sichtbarkeit 
     *  auf public gesetzt werden. ]
     */
    private Shape gibAktuelleFigur()
    {
        // definieren
        Shape tisch = new Ellipse2D.Double(0 , 0, breite, tiefe);

        return transformiere(tisch);
    }

    /**
     * transformiert das aktuelle Shape.
     */
    private Shape transformiere(Shape shape){
        AffineTransform t = new AffineTransform();
        t.translate(xPosition, yPosition);
        Rectangle2D umriss = shape.getBounds2D();
        t.rotate(Math.toRadians(orientierung),umriss.getX()+umriss.getWidth()/2,umriss.getY()+umriss.getHeight()/2);
        return  t.createTransformedShape(shape);
    }

    /**
     * Mache dieses Objekt sichtbar. Wenn es bereits sichtbar ist, tue nichts.
     */
    public void zeige() {
        if (!istSichtbar) {
            istSichtbar = true;
            zeichne();
        }
    }

    /**
     * Mache dieses Objekt unsichtbar. Wenn es bereits unsichtbar ist, tue nichts.
     */
    public void verberge() {
        loesche(); // "tue nichts" wird in loesche() abgefangen.
        istSichtbar = false;
    }

    /**
     * Drehe auf den angegebenen Winkel
     */
    public void dreheAuf(int neuerWinkel) {
        loesche();
        orientierung = neuerWinkel;
        zeichne();
    }

    /**
     * Bewege dieses Objekt horizontal um 'entfernung' Bildschirmpunkte.
     */
    public void bewegeHorizontal(int entfernung) {
        loesche();
        xPosition += entfernung;
        zeichne();
    }

    public void bewegeHorizontal() {
        loesche();
        xPosition += 100;
        zeichne();
    }

    /**
     * Bewege dieses objekt vertikal um 'entfernung' Bildschirmpunkte.
     */
    public void bewegeVertikal(int entfernung) {
        loesche();
        yPosition += entfernung;
        zeichne();
    }

    /**
     * Bewege dieses objekt diagonal um 'entfernung' Bildschirmpunkte.
     */
    public void bewegeDiagonal(int entfernung) {
        loesche();
        yPosition += entfernung;
        xPosition += entfernung;
        zeichne();
    }

    /**
     * Aendere die Farbe dieses Objektes in 'neueFarbe'.
     * Gueltige Angaben sind "rot", "gelb", "blau", "gruen",
     * "lila" und "schwarz".
     */
    public void aendereFarbe(String neueFarbe) {
        loesche();
        farbe = neueFarbe;
        zeichne();
    }

    /**
     * Zeichne dieses Objekt mit seinen aktuellen Werten auf den Bildschirm.
     */
    private void zeichne() {
        if (istSichtbar) {
            Shape figur = gibAktuelleFigur();
            Leinwand leinwand = Leinwand.gibLeinwand();
            leinwand.zeichne (
                this,           // leinwand kennt das Objekt
                farbe,          // definiert seine Zeichenfarbe
                figur);         // definiert seinen grafischen Aspekt
            leinwand.warte(10);
        }
    }

    /**
     * Loesche dieses Objekt vom Bildschirm.
     */
    private void loesche() {
        if (istSichtbar){
            Leinwand leinwand = Leinwand.gibLeinwand();
            leinwand.entferne(this);
        }
    }
}
