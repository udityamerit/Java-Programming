package OppsProgramming;

class thing{
    public String name;
    public static String description;

    public void showName(){
        System.out.println(name);
        System.out.println(description+" "+ name);

    }
    public static void showInfo(){
        System.out.println(description);
    }
}
public class _6_Static_and_final {
    public static void main(String[] args) {
    thing th = new thing();
    thing.description = "i am thinking";
    th.name = "bob";
    th.showName();
    thing.showInfo();
    /* so if you create a static variable or function then only class can access those static variable and methods like in the above code only thing class can assign the description and the method of showI nfo() but the static variable can be used inside the normal instance functions */
    }
}
