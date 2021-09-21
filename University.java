public class University 
{
    public Student[] student;
    public String  nume;
    public int  fondAn;
    
    public University(Student[] student , String nume , int fondAn) 
    {
        this.student = student;
        this.nume = nume;
        this.fondAn = fondAn;
    }

    public double media() 
    {
        double sum = 0 ;
        //average will have decimal point
        for (int i = 0 ; i < student.length; i++) 
        {
            //parse string to double
            sum += student[i].arata();
        }
        return sum/student.length;
    }    
}
