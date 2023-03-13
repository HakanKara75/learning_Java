public class Ma{
    public static void main(String[] args) {

        Part13_Student student1=new Part13_Student("Hakan", "Kara", "Huseyin", 3.30, 2020);
        Part13_Student student2= new Part13_Student("Merve", "Kara", "Huseyin", 4.43, 2019);

        student2.incrementExpectedGraduationYear();
        System.out.println(student2.incrementExpectedGraduationYear());
    }
}
