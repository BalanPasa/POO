public class Student 
{
    public String nume;
    public int an;
    public double nota;
    public Student(String nume, int an, double nota)
    {
        this.nume = nume;
        this.an = an;
        this.nota = nota;
    }
    public double arata() {return nota;}
}
