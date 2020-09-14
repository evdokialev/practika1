package llab1;

public class TestBook {
    public static void main(String[] args) {
        BookJava d1 = new BookJava("War and Peace", 1274);
        BookJava d2 = new BookJava("Pride and Prejudice", 319);
        BookJava d3 = new BookJava("The Picture of Dorian Gray", 352);
        System.out.println(d1);
        d1.inElectronicForm();
        d2.inElectronicForm();
        d3.inElectronicForm();
    }
}
