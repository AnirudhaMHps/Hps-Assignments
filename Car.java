public class Car {
    int speed, noOfGear;
    void drive(){
        speed = 80;
        noOfGear = 4;
    }
    void display(){
        System.out.println("Speed : "+speed+"\n Number of Gears : "+noOfGear);
    }
}
class SportCar extends Car{
    String s= "AirBallon Type";
    @Override
    void display(){
        super.display();
        System.out.println("New Features : "+s);
    }
}
class MainClass1 {
    public static void main(String[] args) {
        SportCar s = new SportCar();
        s.drive();
        s.display();
    }
}
