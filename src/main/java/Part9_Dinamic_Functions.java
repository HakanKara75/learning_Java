public class Part9_Dinamic_Functions {
    public static void calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
double tip=tipRate*listedMealPrice;
double tax=taxRate*listedMealPrice;
double result=listedMealPrice+tip+tax;
        System.out.println("Your total nmeall price is "+ result);

    }

    public static void main(String[] args) {
        calculateTotalMealPrice(15,.2,.08);
        calculateTotalMealPrice(25,.18,.08);
    }
}
