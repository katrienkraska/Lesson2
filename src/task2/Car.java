package task2;

public class Car {

    public int year;
    public double speed;

    public Car(){
        year = 2010;
        speed = 100;

    }

    public Car(int year){
        this.year = year;
        speed = 100;
    }

    public Car(int year, double speed){
        this.year = year;
        this.speed = speed;
    }


    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }
}

class Main{
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2010);
        Car car3 = new Car(2012, 100);


        System.out.println("Car1: Year = " + car1.getYear() + ", Speed = " + car1.getSpeed());
        System.out.println("Car2: Year = " + car2.getYear() + ", Speed = " + car2.getSpeed());
        System.out.println("Car3: Year = " + car3.getYear() + ", Speed = " + car3.getSpeed());
    }

}