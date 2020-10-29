package Project2.ElementaryLogicGates;

public class And {

    public boolean out;
    private Nand nand1 = new Nand();
    private Not not1 = new Not();

    public And() {

    }

    public void compute(boolean a, boolean b){
        nand1.compute(a,b);
        not1.compute(nand1.out);
        out = not1.out;
    }
}
