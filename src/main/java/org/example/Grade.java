public class Grade {

    private double marks;

    public Grade(double marks){
        this.marks=marks;
    }

    public double calculateGPA(){

        if(marks>=85)
            return 4.0;

        else if(marks>=75)
            return 3.5;

        else if(marks>=65)
            return 3.0;

        return 2.0;
    }
}