package PatikaÖdevleri.Class.BoksOyunu;

public class Ring {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {

        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {

                System.out.println("==========Yeni Round=========");
                f2.health = f1.hit(f2);
                if (isWin()) {
                    break;
                }
                f1.health = f2.hit(f1);
                if (isWin()) {
                    break;
                }
                printScore();
            }
        } else {
            System.out.println("Boksörlerin ağırlıkları uyuşmuyor.");
        }
    }

    private boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0) {
            System.out.println("Maçı kazanan : " + f1.name);
            return true;
        }
        return false;
    }

    public boolean checkWeight() {

        return (f1.weight >= this.minWeight && f1.weight <= this.maxWeight) &&
                (f2.weight >= this.minWeight && f2.weight <= this.maxWeight);
    }

    public void printScore() {

        System.out.println("-------------------");
        System.out.println("Kalan can : " + f1.health);
        System.out.println("Kalan can : " + f2.health);
    }
}
