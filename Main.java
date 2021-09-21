public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("Sarcină la nivel de bază:\n");

        Monitor monitor = new Monitor("galben", 15, "1080 x 1920");
        System.out.println(monitor.arataDate());

        Monitor monitor1 = new Monitor("ros", 15, "2160 x 3840");
        System.out.println(monitor1.arataDate1());

        if (monitor.culoare.equals(monitor1.culoare)){System.out.println("Monitoarele au aceeași culoare.");}
        else {System.out.println("Monitoarele au culori diferite. Mai întâi are culoarea " + monitor.culoare + " , a doua culoare este " + monitor1.culoare + " .");}

        if (monitor.rezolutie.equals(monitor1.rezolutie)){System.out.println("Monitoarele au aceeași rezoluție.");}
        else {System.out.println("Monitoarele au rezoluții diferite. Mai întâi are rezolutia " + monitor.rezolutie + " , a doua rezolutie are" + monitor1.rezolutie + ".");}

        if(monitor.dimensiune > monitor1.dimensiune) {System.out.println("Primul are monitor are dimensiuni mai mari.");}
        else if(monitor.dimensiune < monitor1.dimensiune) { System.out.println("Al doilea monitor are dimensiuni mai mari.");} 
        else if(monitor.dimensiune == monitor1.dimensiune){System.out.println("Dimensiunea e egala.");}

        System.out.println("\nNivel avansat:\n");

        Student s1 = new Student("Moruz Ana-Maria", 21, 9.99);
        Student s2 = new Student("Caruta Diana", 19, 7.99);
        Student s3 = new Student("Balan Ana", 19, 10);
        Student s4 = new Student("Camenschi Nina", 20, 9.21);
        Student s5 = new Student("Gherganov Serghei", 23, 6.35);
        Student s6 = new Student("Manolachi Nikoleta", 19, 8.32);
        Student s7 = new Student("Petrenco Alexandra", 21, 9.27);
        Student s8 = new Student("Sibov Sergiu", 23, 5.01);
        Student s9 = new Student("Cuculer Alina", 20, 9.65);

        Student[] UTM  = {s1,s2,s3};
        Student[] ULIM = {s4,s5,s6};
        Student[] UASM = {s7,s8,s9};

        University u1 = new University(UTM,"Universitatea Thehnica din Moldova", 1964);
        University u2 = new University(ULIM,"Universitatea Libera Internationala din Moldova", 1992);
        University u3 = new University(UASM,"Universitatea Agrară de Stat din Moldova",1933);

        System.out.println("Nota medie a studenților UTM: " + s1.nume + ", " + s2.nume + ", " + s3.nume + " este: " + u1.media());
        System.out.println("Nota medie a studenților ULIM: " + s4.nume + ", " + s5.nume + ", " + s6.nume + " este: " + u2.media());
        System.out.println("Nota medie a studenților UTM: " + s7.nume + ", " + s8.nume + ", " + s9.nume + " este: " + u3.media());

        double Avg, a = u1.media(), b = u2.media(), c = u3.media();
        Avg = (a + b + c)/3;

        System.out.println("Nota medie a UTM, ULIM și UASM este: " + Avg);
    }
}
