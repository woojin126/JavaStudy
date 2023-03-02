package STUDY.abstractAndInterface;

public class Main {
    public static void main(String[] args) {
        Pigeon p = new Pigeon(2, 2 ,2);
        p.printInfo();
        p.age();
        p.move(100);
        p.printInfo();


        Kevin kevin = new Kevin(10, 10, 10);
        kevin.attack();
        kevin.HumanFunction();
        kevin.HumanCoding();
    }
}
