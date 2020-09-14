package llab1;

public class TestMyach {
    public static void main(String[] args) {
        MyachJava d1 = new MyachJava("Blue", "football");
        MyachJava d2 = new MyachJava("Brown", "basketball");
        MyachJava d3 = new MyachJava("Yellow", "tennis");
        System.out.println(d1);
        d1.typeOfBall();
        d2.typeOfBall();
        d3.typeOfBall();
    }
}
