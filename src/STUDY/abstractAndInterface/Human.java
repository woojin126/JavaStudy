package STUDY.abstractAndInterface;

public abstract class Human extends Creature implements Talkable{

    public Human(int x, int y, int age) {
        super(x, y, age);
    }

    public void HumanFunction(){
        System.out.println("사람은 지성이 있습니다.");
    }

    @Override
    public void attack() {
        System.out.println("도구로 공격");
    }

    @Override
    public void talk() {
        System.out.println("사람은 말을 할 수 있습니다.");
    }

    @Override
    public void printInfo() {

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
