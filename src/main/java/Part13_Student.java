public class Part13_Student {

    String name;
    String surname;
    int gradeYear;
    String major;
    double gpa;


    public double incrementExpectedGraduationYear(){
        this.gpa=gpa+1;
        return gpa;
    }

    public Part13_Student(String name,String surname,String major, double gpa, int gradeYear){
this.name=name;
this.surname=surname;
this.gpa=gpa;
this.gradeYear=gradeYear;
this.major=major;

    }


}
