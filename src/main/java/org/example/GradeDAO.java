package org.example;

public class GradeDAO {

    public String calculateGrade(double marks) {

        if (marks >= 90)
            return "A";

        if (marks >= 80)
            return "B";

        if (marks >= 70)
            return "C";

        if (marks >= 60)
            return "D";

        return "F";
    }
}