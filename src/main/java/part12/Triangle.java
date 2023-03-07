package part12;

public class Part12_Create_Class {
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;
    public void Triangle(double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree){
        this.base=base;
        this.height=height;
        this.sideLenOne=sideLenOne;
        this.sideLenTwo=sideLenTwo;
        this.sideLenThree=sideLenThree;

    }

    public double findArea(){
        return (this.base*this.height)/2;
    }
}
