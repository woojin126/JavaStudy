package STUDY.abstractAndInterface;

public abstract class Creature {
    private int x;
    private int y;
    private int age;

    public Creature(int x, int y, int age) {
        this.x = x;
        this.y = y;
        this.age = age;
    }

    public abstract void attack();
    public abstract void printInfo();

    /*
    * 생명체라면 나이를 먹고 x좌표상으로 이동 할 수 있는 부분이 공통
    * 적인 기능이기 때문에 하위 클래스에서 상속할 수 있도록 일반 메서드로 구현했습니다.
    */
    public void age(){
        age++;
    }

    public void move(int xDistance) {
        x += xDistance;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
