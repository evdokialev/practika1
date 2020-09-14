package llab1;

public class BookJava {
    private String title;
    private int pagecount;
    public BookJava(String n, int a){
        title = n;
        pagecount = a;
    }
    public BookJava(String n){
        title = n;
        pagecount = 0;
    }
    public BookJava(){
        title = "The chronicles of Narnia";
        pagecount = 0;
    }
    public void setPagecount(int pagecount) {
        this.pagecount = pagecount;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle(String title){
        return title;
    }
    public int getPagecount() {
        return pagecount;
    }
    public String toString(){
        return "''"+this.title+"'', page count: "+this.pagecount;
    }
    public void inElectronicForm(){
        System.out.println("In the book ''" + title + "'' in electronic form number of pages: " + pagecount*2 + ".");
    }
}
