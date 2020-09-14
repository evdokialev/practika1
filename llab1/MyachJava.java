package llab1;

public class MyachJava {
    private String color;
    private String play;
    public MyachJava(String n, String a){
        color = n;
        play = a;
    }
    public MyachJava(String n){
        color = n;
        play = "";
    }
    public MyachJava(){
        color = "Red";
        play = "volleyball";
    }
    public void setPlay(String play) {
        this.play = play;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(String color){
        return color;
    }
    public String getPlay() {
        return play;
    }
    public String toString(){
        return this.color+" ball for playing in "+this.play + ".";
    }
    public void typeOfBall() {
        System.out.println(color + " and white ball for playing in " + play + " in computer game.");
    }
}
