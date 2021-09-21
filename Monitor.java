public class Monitor
{
    public String culoare;
    public int dimensiune;
    public String rezolutie;

    public Monitor(String culoare, int dimensiune, String rezolutie)
    {
        this.culoare=culoare;
        this.dimensiune = dimensiune;
        this.rezolutie = rezolutie;
    }

    String arataDate() 
    {
        return "Informatie 1 Monitor:"+
                "\nculoare: " + culoare +
                "\ndimensiune: " + dimensiune + " inch" +
                "\nrezolutie: " + rezolutie + "\n";
    }
    String arataDate1() 
    {
        return "Informatie 2 Monitor:" +
                "\nculoare: " + culoare +
                "\ndimensiune: " + dimensiune + " inch" +
                "\nrezolutie: " + rezolutie + "\n";
    }
}