package OppsProgramming;
class ped{
    public void grow(){
        System.out.println("Tree growing");
    }
}

class Tree extends ped{

    public void grow(){
        System.out.println("Tree growing");
    }
    public void shedLeaves(){
        System.out.println("Leaves shedding");
    }
}
public class _9_Polymorphism {
    public static void main(String[] args) {
    ped ped1 = new ped();
    Tree tree = new Tree();
    ped ped2 = tree;

    doGrow(tree);
    ped2.grow();
    tree.shedLeaves();
    }
    public static void doGrow(ped ped1){
        ped1.grow();
    }
}
