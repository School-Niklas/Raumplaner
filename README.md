## Das Raumplanerprojekt
Die Arbeit mit BlueJ erlaubt einen einfachen Umgang mit Klassen und Objekten in der Programmiersprache Java. Beim ersten Start sieht die Oberfläche von BlueJ sehr aufgeräumt aus.

Für die ersten Schritte benötigen Sie die Menüleiste, in der man an erster Stelle den Menüpunkt Projekt findet. Jedes JAVA - „Programm“ ist also ein Projekt und benötigt für seine zugehörigen Daten einen eigenen Ordner. Wenn wir eigene Projekte entwickeln, stellt das aber kein Problem dar, da BlueJ jeweils diesen Projektordner selbst erzeugt.



In dem Projekt-Menü finden Sie den Unterpunkt Projekt öffnen... über den Sie einen Dialog zum Öffnen von BlueJ-Projekten erhalten. Laden die unten abgelegte Datei Startprojekt1.zip herunter und entpacken Sie diese unmittelbar danach in Ihren eigenen Ordner. Nach dem Laden dieses Projektes ergibt sich das rechts dargestellte Bild, wobei sich nach dem Speichern in den eigenen Ordner die Darstellung der orange Rechtecke durch eine hinzugefügte Schraffur geändert hat.

Mit der Schraffur kennzeichnet BlueJ, dass hier noch zu übersetzen ist. Klicken Sie den Button zum Übersetzen (compile) an der linken Seite an und das Bild wird bald den dargestellten Zustand einnehmen.

Im Hauptfenster von BlueJ ist ein Diagramm zu sehen, dass durch beschriftete Rechtecke die Klassen des Projektes Moebel und durch Pfeile ihren Zusammenhang darstellt. Der Begriff Klassen ist ein Fachausdruck der Objektorientierung (OO). Da er eines der wichtigsten Konzepte beschreibt, werden wir ihn in Zukunft ständig benutzen. Jetzt zunächst einmal verwenden wir ihn ohne Erläuterung. Was er beschreibt, sollte sich im Verlauf der Arbeit ergeben.

Konkret enthält dieses Projekt die Klassen:
- Stuhl,
- Tisch und
- Leinwand.

Die Pfeile machen deutlich, dass die zwei Möbel-Klassen Stuhl und Tisch die Klasse Leinwand benutzen. Das Wort „benutzen“ stellt in diesem Zusammenhang einen Fachausdruck der OO dar und zwar für einen Beziehungstyp. Es gibt noch weitere Beziehungstypen bei der OO und wir werden uns mit ihnen und ihrer Unterscheidung beschäftigen.

Zunächst einmal wollen wir uns mit dem Umgang mit BlueJ am Beispiel dieses Projektes beschäftigen. Klicken Sie dazu jetzt mit der rechten Maustaste auf die Klasse Stuhl und wählen Sie aus dem Kontextmenü den ersten Menüpunkt new Stuhl() aus. Im anschließenden Dialog (siehe links), der Sie nach einem Namen für die Instanz (das Exemplar bzw. das Objekt – sind jeweils Fachausdrücke der OO mit der selben Bedeutung) von Stuhl fragt, können Sie einfach auf OK klicken und damit die Vorgabe stuhl1 akzeptieren. Es sollte sich jetzt unten im Programmfenster von BlueJ das rechts dargestellte Bild ergeben, mit dem BlueJ kennzeichnet, dass es nun ein Objekt Stuhl mit dem Namen stuhl1 gibt, das ein Exemplar der Klasse Stuhl ist. Die Leiste unten im Programmfenster heißt Instanzleiste. Die Schreibweisen sind keine Rechtschreibfehler.


## Namenskonventionen in JAVA
In Java gelten folgende Konventionen für die Namen von Klassen und Objekten: Klassen schreibt man mit großem Buchstaben am Anfang des Namens, Exemplarnamen1
fangen mit Kleinbuchstaben an. Unbefriedigend ist, dass dies abgerundete Rechteck keineswegs wie ein Stuhl aussieht, das soll es auch gar nicht. BlueJ kennt nun zwar das Objekt stuhl1, hat es aber nicht dargestellt. Nicht nur das Programm unterscheidet das, auch wir müssen zwischen einem Objekt, seinem Symbol und seiner Darstellung auf dem Bildschirm unterscheiden. Soll der Stuhl dargestellt werden, dann brauchen wir dafür eine Zeichenfläche. Dass diese schon vorgesehen ist, können wir am Klassendiagramm erkennen. Sie wird aber erst dann dargestellt, wenn eines der darstellbaren Objekte dazu aufgefordert wird.


## Methoden aufrufen

Eine solche Aufforderung an ein Objekt zu geben, nennt man „dem Objekt eine Botschaft schicken“ (message) und das programmtechnische Mittel ist der „Aufruf von Methoden“ (Fachausdruck der OO). Um den zugehörigen Stuhl auf den Bildschirm zu bekommen, klicken Sie mit der rechten Maustaste auf das Objekt in der Objektleiste, worauf sich sein Kontextmenü öffnet.

Hier finden Sie alle Methoden, welche die Klasse Stuhl zur Verfügung stellt, also alle messages, die sie versteht. Wenn Sie die Methode zeige() aufrufen, dann erscheint eine Zeichenfläche und auf ihr das Bild eines Stuhls auf dem Bildschirm und zwar in einem speziellen Fenster, welches zur Klasse Leinwand gehört. Dabei wird der Stuhl in Form eines Umrisses dargestellt, so wie es für Innenarchitektenzeichnungen vorgeschrieben ist.





Kontextmenü zum Aufruf von Methoden

Aus dem Kontextmenü von stuhl1 heraus können Sie weitere Methoden aufrufen und damit z.B. den Stuhl horizontal bzw. vertikal verschieben. Manche dieser Methoden, z.B. bewegeHorizontal() erwarten eine Eingabe. Hier geben Sie eine Zahl ein, z.B. 80, worauf der stuhl1 sich um 80 Pixel horizontal verschiebt

## Parameter

Etwas aufpassen müssen Sie, wenn Sie die Methode aendereFarbe aufrufen, hier erwartet der stuhl1 keine Zahl, sondern einen Text, der die Farbe angibt. Dieser Text muss in Anführungsstriche gesetzt werden und es stehen auch nur die im Dialogfenster angegebenen Farben zur Verfügung.


## Kommentare

Wie Sie sehen, erleichtert Ihnen BlueJ – und hoffentlich auch derjenige, der den Programmtext geschrieben hat – dies durch einen im Fenster dargestellten Kommentar. Versuchen Sie einmal eine Zahl einzugeben. Sie bekommen dann eine Fehlermeldung, die den falschen Typ bemängelt.


## Datentypen in Java

Ein Datentyp beschreibt die Art der Information, die Java z.B. als Parameter (ein der Methode übergebener Wert) einer Methode erwartet. Viele der Methoden der Klasse Stuhl erwarten Zahlen als Parameter, der zugehörige Datentyp heißt in Java int, was eine Abkürzung von integer, dem englischen Begriff für ganze Zahl ist. Die Methode aendereFarbe() erwartet einen Text, eine Zeichenkette. Der zugehörige Datentyp heißt in Java String. Strings oder Zeichenketten müssen Sie generell in Anführungsstriche setzen.


## Mehrere Instanzen

Bisher haben Sie nur mit einem einzigen Objekt gearbeitet, nur einer Instanz der Klasse Stuhl. Sie können beliebig viele Instanzen der gleichen Klasse erzeugen, aber auch Instanzen verschiedener Klassen gleichzeitig. Bei verschiedenen Instanzen der gleichen Klasse sollten Sie aber unbedingt darauf achten, dass sie unterschiedliche Positionen besitzen, sonst können Sie sie im Leinwandfenster nicht unterscheiden. Sie sind dann zwar vorhanden – wie man in der Objektleiste bei BlueJ erkennen kann – aber nicht erkennbar.


## Zustand von Objekten

Bei der Arbeit mit mehreren Objekten, vor allem bei der exakten Positionierung, kann es immer wieder vorkommen, dass Angaben über einzelne Objekte benötigt, z.B. ihre Position oder ihre Größe. Die Gesamtheit der Werte wie Position, Farbe, Breite, Tiefe, die ein Objekt zu einem Zeitpunkt besitzt, bezeichnet man als seinen Zustand. Der Zustand eines Objektes lässt sich mit BlueJ relativ einfach ermitteln. Im Kontextmenü jedes Objektes steht Ihnen der Menüpunkt Inspizieren zur Verfügung.

Der Zustand eines Objektes der Klasse Stuhl lässt sich durch die angegebenen sieben Datenfelder beschreiben, die hier für die Instanz stuhl2 zu sehen sind. Jede Instanz der Klasse Stuhl verfügt über die gleichen Datenfelder, aber die Werte unterscheiden sich normalerweise von Instanz zu Instanz. Andererseits können sich aber zwei Instanzen der Klasse Stuhl auch nur in diesen Datenfeldern unterscheiden.


## Attribute

Eigenschaften von Objekten werden auch als Attribute bezeichnet. Jeder Eigenschaft eines Objektes entspicht ein Datenfeld in der zugehörigen Klasse. Die in ihnen gespeicherten Werte heißen Attributwerte. Sie erfordern unterschiedliche Datentypen. Die Attribute der Klasse Stuhl erfordern die Datentypen int, String, und boolean. Der Datentyp boolean wird für Datenfelder verwendet, die nur die Werte wahr (true) oder falsch (false) speichern müssen. Für das Datenfeld istSichtbar wurde der Datentyp boolean verwendet, da nur gespeichert werden muss, ob der Stuhl in der Zeichnung sichtbar ist (true) oder nicht (false).


## Funktionalität verbessern

Für die vorliegende Anwendung lässt sich feststellen: Die Klassen Stuhl und Tisch haben für den Benutzer unzureichende Funktionalität.
Erzeugt man nämlich mehrere Exemplare dieser Klasse und stellt sie dar, erhält man das unbefriedigende Ergebnis, dass alle – in ihren Eigenschaften gleichen – Exemplare sich überdecken, wie eines aussehen, also optisch nicht unterscheidbar sind, obwohl sie
selbstverständlich nicht dieselben Objekte sind.
Allgemein gilt, dass verschiedene Objekte durchaus in allen ihren Attributwerten übereinstimmen dürfen, ohne dass sie damit dasselbe Objekt sind. Gerade bei Möbelstücken kann das an sich sinnvoll sein, wenn es z.B. nur einen Typ gibt. Allerdings stehen sie aber sicher nicht alle am selben Platz und sollten in diesen Attributwerten verschieden sein. Daher wäre es vorteilhaft, bereits beim Erstellen von neuen Stühlen und Tischen die Position, deren Größe, usw. beeinflussen zu können.


##Konstruktor

Ein Konstruktor einer Klasse ist eine Initialisierungsmethode für ein neu zu erzeugendes Objekt. Der Konstruktor kann Parameter mit der Bedeutung von Initvariablen haben. Initvariable sind Variable für Startwerte (Initwerte) von Attributen.


## Alternative Konstruktoren

So kann es sinnvoll sein, in der Klasse einen weiteren Konstruktor anzubieten, der zwar die selben Standardwerte von Orientierung, Farbe, Länge und Breite vorsieht, aber beim Erzeugen des Exemplars die Übergabe einer unterscheidbaren Position vorsieht.

Die Methode einer Klassendefinition, die man zum Erstellen eines Exemplars verwendet, also im Fall der Klasse Stuhl, um ein Objekt wie stuhl1 zu erzeugen, heißt Konstruktor (Fachausdruck). Der vorgegebene Konstruktor erzeugt ein Objekt mit vollständig vorgegebenen Standardwerten, erstellt man zwei, dann sind sie optisch nicht unterscheidbar, da einer den anderen exakt verdeckt. Daher wäre es schön, wenn man in der Anwendung die Möglichkeit hat, den zweiten Stuhl gleich mit einer anderen Position zu erzeugen.


## Überladen

Java bietet die Möglichkeit, Methoden und Konstruktoren zu definieren, die bei gleichem Namen trotzdem auf unterschiedliche Arten aufgerufen werden können. Diese Technik bezeichnet man als Überladen. Wir untersuchen diese Möglichkeit am Beispiel der Konstruktoren.


## Vorgehen

Wenn sich unsere Klasse ändern soll, müssen wir den zu ihr gehörenden Text verändern. Dazu doppelklicken wir in BlueJ auf das Klassensymbol und es erscheint ein Textfenster mit dem Text der Klassendefinition. Diesen können wir nun bearbeiten.

Nach dem Bearbeiten müssen wir unser Ergebnis übersetzen (compile) und können dann – hoffentlich – mit der neuen Variante arbeiten. Durch die Möglichkeit des Überladens brauchen wir den bisherigen Konstruktor nicht zu ersetzen, wir fügen der Klasse einfach einen weiteren, sogar mit dem selben Namen hinzu.

Zum vorgegebenen Konstruktor gehört folgender Programmtext:

/**
* Erzeuge einen neuen Stuhl mit einer Standardfarbe und Standardgroesse
* an einer Standardposition. (Standardkonstruktor)
*/
public Stuhl() {
xPosition = 160;
yPosition = 80;
farbe = "blau";
orientierung = 0;
istSichtbar = false;
breite = 40;
tiefe  = 40;
}
Die Klasse Stuhl verwendet also für das Speichern der Eigenschaften (Attribute) die Felder (Variablen) xPosition, yPosition, farbe, orientierung, istSichtbar, breite und tiefe. Auch hier, bei den Attributen finden wir eine allgemein verwendete Schreibweise: Die Attributnamen beginnen alle mit einem kleinen Buchstaben, setzt sich der Name aus mehreren Worten zusammen, werden sie zusammenhängend geschrieben – damit das System nicht meint, es seien mehrere gemeint – und der Anfangsbuchstabe der nachfolgenden Teilworte wird jeweils mitten im Wort groß geschrieben.

Die Parameter, die wir einbringen wollen, müssen in der Klammer nach dem Konstruktornamen auftauchen. Wollen wir also die Stühle mit verschiedenen Startpositionen erzeugen können, müssen für diese Startwerte (Initwerte) in der Klammer Initvariable angegeben werden. Der Kopf unseres Konstruktors könnte dann so aussehen (Namen kann man frei wählen):

public Stuhl(int initX, int initY)
int kennzeichnet wieder den Datentyp. Diese Werte müssen nun beim Erzeugen eines Objektes den Objektvariablen zugewiesen werden:

xPosition = initX;
yPosition = initY;
Das war schon alles. Sollten wir keine Fehler gemacht haben, können wir die geänderte Klasse nun übersetzen und anschließend benutzen. Beim Erzeugen des Objektes haben sich nun die Fenster geändert: Wir können mit dem zweiten bereitgestellten Konstruktor die Startwerte für x und y übergeben.


## Aufgaben
### A1.1
Erstelle zwei Tische mit jeweils vier Stühlen darum. Erstellen Sie von ein Bildschirmfoto von Ihrer Sitzgruppe (Tipp: benutzen Sie hierfür das Snipping Tool von Windows) und laden Sie dieses Bild hoch.

### A1.2
Was war bei der Arbeit an der vorherigen Aufgabe unbefriedigend bezüglich der Funktionalität ? Geben Sie Ihre Anforderungen an die Funktionalität als Texteingabe ein.

### A1.3
Versuche die Klassen um diese Funktionalität zu erweitern. Packen Sie das geänderte Projekt, d.h. den Ordner, und laden Sie die gepackte Datei hoch.

### A2.1
Erstellen Sie für die Klasse Stuhl einen Konstruktor, der es erlaubt, die x- und y-Position anzugeben (siehe oben).

### A2.2
Erstellen für die Klasse Tisch einen Konstruktor, der es erlaubt neben der x- und y-Position auch eine Farbe anzugeben. 
