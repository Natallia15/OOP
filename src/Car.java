public class Car {
    String model;
    String color;
    int speed;
    int god;

    Car() {

    }

    Car(String model, String color, int god) {
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.god = god;

    }


    public void getInfo() {
        System.out.println("model " + model + ", color " + color + " , speed " + speed);
    }

    public void gas() {
        this.speed = 60;
    }
    public void breaK () {
        this.speed = 0;
    }
}
