public class Part11_Salary_Calculate {

    public static double salaryCalculate(double hoursePerWeek, double amauntPerHour, int vacationDays){

        if (hoursePerWeek<0){
            return -1;
        }
        if (amauntPerHour<0){
            return -1;
        }
        double weaklyPaycheck=hoursePerWeek*amauntPerHour;
        double unpaidTime= vacationDays*amauntPerHour*8;
        return (weaklyPaycheck*52)-unpaidTime;

    }
    public static void main(String[] args) {
      double salary=  salaryCalculate(40,15, 8);
        System.out.println(salary);
    }
}
