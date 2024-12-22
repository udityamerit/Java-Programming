package OppsProgramming;

class Plant{
    public String name;
    public final static int ID = 8;
    private String type;
    protected String size;

    public Plant(){
        this.name = "AAM";

        this.type = "oak";
    }
}
class oak extends Plant{
    public oak(){
//        type = "tree"; // it is not work because the type is private
        this.size = "largest";

    }
}

public class _2_Access_modifiers {
    public static void main(String[] args) {
    Plant p = new Plant();
    oak o = new oak();
        System.out.println(p.name);
        System.out.println(Plant.ID);

        // private value is not accessible
//        System.out.println(p.type);

        //----this is works because the size is protected variable which is accessible in the subclass ----///
        System.out.println(o.size);
    }

}
