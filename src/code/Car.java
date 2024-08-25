package code;

public class Car {
    public int year;
    int speed;

    protected void accelerate() {
        speed+=10;
        System.out.println("your new speed is "+speed);
    }
    public void brake(){
        speed-=5;
        System.out.println("your new speed is "+speed);
    }

    public Car(int Carspeed, int Caryear) {
        speed = Carspeed;
        year = Caryear;
    }
    }
}
