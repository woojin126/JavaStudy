package STUDY.referenceAndValue;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

class Person {
    private final String mName;
    private final int mAge;

    public Person (String name, int age) {
        mName = name;
        mAge = age;
    }

    public String getName() {
        return mName;
    }

    public int getAge() {
        return mAge;
    }

    public int ageDiff(final Person other) {
        return mAge - other.getAge();
    }

    public String toString() {
        return mName + " | " + mAge;
    }

}
public class PassByValueOrReference {
    public static void main(String[] args) {
        Cheese myCheese = new Cheese();
        myCheese.setLevelOfStinkiness(10);
        increaseStinkiness(myCheese);
        System.out.println(myCheese.getLevelOfStinkiness());
    }
    private static void increaseStinkiness(Cheese cheese) {
        cheese = new Cheese();
        cheese.setLevelOfStinkiness(182);
        System.out.println(cheese.getLevelOfStinkiness());


        final List<Person> people = Arrays.asList(
                new Person("홍길동", 18),
                new Person("임꺽정", 23),
                new Person("민수", 13),
                new Person("영희", 14),
                new Person("철수", 15));


        String[] greetrings = {"안녕하세요~~", "hello", "Good morning", "반갑습니다~~^^"};

        String s = Arrays.stream(greetrings).reduce(new CompareString()).get();
        System.out.println(s);

    }
}

class CompareString implements BinaryOperator<String> {

    @Override
    public String apply(String s, String s2) {
        if (s.getBytes().length >= s2.getBytes().length) return s;
        else return s2;
    }
}