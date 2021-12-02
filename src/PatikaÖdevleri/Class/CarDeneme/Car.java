package PatikaÖdevleri.Class.CarDeneme;

public class Car {
    String firm;
    String model;
    String type;
    String color;
    int speed;
    int maxSpeed;

    public Car(String firm, String model, String type, String color, int speed, int maxSpeed) {
        this.firm = firm;
        this.model = model;
        this.type = type;
        this.color = color;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }

    int increaseSpeed(int inc) {
        if (this.speed + inc < this.maxSpeed && this.speed > 0) {
            this.speed += inc;
        } else if (this.speed + inc > this.maxSpeed){
            System.out.println("En Yüksek Hız Aşılamaz");
        }
        return this.speed;
    }

    int decreaseSpeed(int dec) {
        if (this.speed > dec) {
            this.speed -= dec;
        } else {
            System.out.println("Hız Daha Fazla Azaltılamaz");
        }
        return this.speed;
    }

    void info(){
        System.out.println("================");
        System.out.println("Model  \t: " + this.model);
        System.out.println("Color  \t: " + this.color);
        System.out.println("Type  \t: " + this.type);
        System.out.println("Speed  \t: " + this.speed);
    }




}
