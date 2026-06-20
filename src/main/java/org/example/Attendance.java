public class Attendance {

    private int totalClasses;
    private int attendedClasses;

    public double getPercentage(){

        return (double) attendedClasses / totalClasses * 100;
    }
}