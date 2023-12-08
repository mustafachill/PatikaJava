public class Car {
    String type;
    String model;
    String color;
    int speed;
    int speedLimit = 100;
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
