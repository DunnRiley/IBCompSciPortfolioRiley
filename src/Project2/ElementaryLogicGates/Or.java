package Project2.ElementaryLogicGates;

public class Or {

    public boolean out;
    private Nand nand1 = new Nand();
    private Not not1 = new Not();
    private Not not2 = new Not();

    public Or() {
    }

    public void compute(boolean a, boolean b){
        not1.compute(a);
        not2.compute(b);
        nand1.compute(not1.out, not2.out);
        out = nand1.out;
    }

}
