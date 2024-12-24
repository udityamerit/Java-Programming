package OppsProgramming;

class person{
    private int id;
    private String name;

    public person(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString(){
        return "Peron [id="+ id+ ", name="+ name+ "]";
    }
}
public class _18_Equal_method {
    public static void main(String[] args) {
//        person p1 = new person(5, "bob");
//        person p12 = new person(8, "sue");

//        System.out.println(p1==p12);
        // in this case the output is false because the == operation is check the reference of the persons which is different in the nature like 1 is p1 and 2nd is p12 so that's why it gives the false,
        // if you give the same instance name of the p1 and p12 then also it is give the false because of different references

//        p12 = p1;
//        System.out.println(p1==p12); // output is true because it is give the same reference and assign the p11 to the p1

        Double value1   = 5.4;
        Double value2 = 5.4;
        System.out.println(value2==value1); // output  is False
        System.out.println(value2.equals(value1)); // it is give the true value

        Integer num1 = 9;
        Integer num2 = 9;
        System.out.println(num2==num1); // output is Ture
    }
}
