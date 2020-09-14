package llab1;

public class TestDog {
    public static void main(String[] args) {
        DogJava d1 = new DogJava("Mike", 2);
        DogJava d2 = new DogJava("Helen", 7);
        DogJava d3 = new DogJava("Bob");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
