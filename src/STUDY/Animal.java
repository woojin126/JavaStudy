package STUDY;

public class Animal extends Creature implements Talkable{

    public Animal(int x, int y, int age) {
        super(x, y, age);
    }

    @Override
    public void attack() {
        System.out.println("몸을 사용하여 공격!!");
    }

    @Override
    public void printInfo() {
        System.out.println(getX());
        System.out.println(getY());
        System.out.println(getAge());
    }

    @Override
    public void talk() {
        System.out.println("나이가" + getAge() + "살인 강아지가 짖는다");
    }
}
