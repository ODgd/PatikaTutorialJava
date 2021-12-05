package PatikaÖdevleri.Class.BoksOyunu;

public class Main {

    public static void main(String[] args) {

        Fighter f1 = new Fighter("Marc", 15, 100, 95, 0);
        Fighter f2= new Fighter("Scala", 12, 100, 90, 0);

        Ring r1 = new Ring(f1, f2, 80, 110);
        r1.run();
    }
}
