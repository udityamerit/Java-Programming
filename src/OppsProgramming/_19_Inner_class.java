package OppsProgramming;

class Robo{
    private int id;

    // this is called as inner class or nested class

    public class Brain{
        public void think(){
            System.out.println("Robot "+ id+ " is thinking. ");
        }
    }
    public Robo(int id){
        this.id = id;
    }
    public void start(){
        System.out.println("starting robot "+ id);
        Brain brain = new Brain();
        brain.think();
    }

    static class battery{
        public void charge(){
            System.out.println("battery charging. ");
        }
    }

}
public class _19_Inner_class {
    public static void main(String[] args) {
        Robo r = new Robo(7);
        r.start();

        Robo.Brain brain = r.new Brain();
        brain.think();

        Robo.battery b = new Robo.battery();
        b.charge();
    }
}
