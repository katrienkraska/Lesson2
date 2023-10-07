package task3;

public class Car1 {
        public int year;
        public double speed;
        public int weight;
        public String colour;

        public Car1(){
            year = 2010;
            speed = 100;
            weight = 1000;
            colour = "grey";
        }

        public Car1(int year){
            this.year = year;
            speed = 100;
            weight = 1000;
            colour = "grey";
        }

        public Car1(int year, double speed){
            this.year = year;
            this.speed = speed;
            weight = 1000;
            colour = "grey";
        }

        public Car1(int year, double speed, int weight) {
            this.year = year;
            this.speed = speed;
            this.weight = weight;
            colour = "grey";
        }

        public Car1(int year, double speed, int weight, String colour){
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
            Car1 car1 = new Car1();
            Car1 car2 = new Car1(2010);
            Car1 car3 = new Car1(2012, 100);
            Car1 car4 = new Car1(2015, 120, 1000);
            Car1 car5 = new Car1(2018, 90, 1000, "grey");

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
