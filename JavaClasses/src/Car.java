public class Car {
    String type;
    String model;
    String color;
    int speed;
    int speedLimit = 100;

    Car(){
        System.out.println("Working constructor method which has not parameters");
    }
    Car(String model, int speed){
        this.model = model;
        this.speed = speed;
        System.out.println("Working constructor method which has parameters");
    }
    void increaseSpeed(int increment){
        if((speed + increment) < speedLimit){
            speed += increment;
        }

    }
    void decreaseSpeed(int decrease){
        if((speed > 0)){
            speed -= decrease;
        }
    }
    void printSpeed(){
        System.out.println("Your speed is: " + speed);
    }
}
