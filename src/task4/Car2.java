package task4;

public class Car2 {
        public int year;
        public double speed;
        public int weight;
        public String colour;

        public Car2(){
            this(2010, 100,1000,"grey");
        }

        public Car2(int year){
            this(year, 100,1000,"grey");
        }

        public Car2(int year, double speed){
            this(year,speed,1000,"grey");
        }

        public Car2(int year, double speed, int weight) {
            this(year, speed, weight, "grey");
        }

        public Car2(int year, double speed, int weight, String colour){
            this.year = year;
            this.speed = speed;
            this.weight = weight;
            this.colour = colour;
        }

        public int getYear() {
            return year;
        }
        public int getWeight() {
            return weight;
        }
        public double getSpeed() {
            return speed;
        }
        public String getColour() {
            return colour;
        }
    }

    class Main{
        public static void main(String[] args) {
            Car2 car1 = new Car2();
            Car2 car2 = new Car2(2010);
            Car2 car3 = new Car2(2012, 100);
            Car2 car4 = new Car2(2015, 120, 1000);
            Car2 car5 = new Car2(2018, 90, 1000, "grey");

            System.out.println("Car1: Year = " + car1.getYear() + ", Speed = " + car1.getSpeed() +
                    ", Weight = " + car1.getWeight() + ", Colour = " + car1.getColour());
            System.out.println("Car2: Year = " + car2.getYear() + ", Speed = " + car2.getSpeed() +
                    ", Weight = " + car2.getWeight() + ", Colour = " + car2.getColour());
            System.out.println("Car3: Year = " + car3.getYear() + ", Speed = " + car3.getSpeed() +
                    ", Weight = " + car3.getWeight() + ", Colour = " + car3.getColour());
            System.out.println("Car4: Year = " + car4.getYear() + ", Speed = " + car4.getSpeed() +
                    ", Weight = " + car4.getWeight() + ", Colour = " + car4.getColour());
            System.out.println("Car5: Year = " + car5.getYear() + ", Speed = " + car5.getSpeed() +
                    ", Weight = " + car5.getWeight() + ", Colour = " + car5.getColour());
        }
    }
