public class Main{
    public static void main(String[] args){
        Car audi = new Car("audi", 100);
        audi.increaseSpeed(120);
        System.out.println(audi.speed);

        Car mercedes = new Car();
        mercedes.speed = 20;
        mercedes.decreaseSpeed(15);
        System.out.println(mercedes.speed);

        Car bmw = new Car();
        bmw.speed = 20;
        bmw.model = "m3";
        bmw.printSpeed();
    }
}