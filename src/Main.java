public class main {
    public main(String[] args) {
        Stuhl stuhl = new Stuhl();
        Tisch tisch = new Tisch();

        stuhl.aendereFarbe("Blau");
        stuhl.zeige();

        tisch.bewegeHorizontal(20);
        tisch.bewegeVertikal(50);
        tisch.zeige();
    }
}
