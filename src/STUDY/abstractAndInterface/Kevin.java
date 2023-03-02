package STUDY.abstractAndInterface;

public class Kevin extends Human {

    public Kevin(int x, int y, int age) {
        super(x, y, age);
    }

    public void HumanCoding(){
        System.out.println("사람은 코딩도 가능한걸?");
    }

    @Override
    public void HumanFunction() {
        super.HumanFunction();
    }

    @Override
    public void attack() {
        super.attack();
    }

    @Override
    public void talk() {
        super.talk();
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }

    @Override
    public void age() {
        super.age();
    }

    @Override
    public void move(int xDistance) {
        super.move(xDistance);
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public void setX(int x) {
        super.setX(x);
    }

    @Override
    public int getY() {
        return super.getY();
    }

    @Override
    public void setY(int y) {
        super.setY(y);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }
}
