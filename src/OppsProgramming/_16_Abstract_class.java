package OppsProgramming;

class smartPhone extends phone{
    @Override
    public void start() {
        System.out.println("start the smartphone");
    }

    @Override
    public void doStuff() {

    }

    @Override
    public void shutdown() {

    }
}

class superPhone extends phone{
    @Override
    public void start(){
        System.out.println("start the superphone");
    }

    @Override
    public void doStuff() {
        System.out.println("do stuff in superphone");
    }

    @Override
    public void shutdown() {
        System.out.println("shutdown the superphone");
    }
}
public class _16_Abstract_class {
    public static void main(String[] args) {
        smartPhone sm = new smartPhone();
        sm.setId(5);
        superPhone sp = new superPhone();
        sp.setId(4);

        sp.run();

    }
}
