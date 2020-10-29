package Project2.ElementaryLogicGates;

public class Xor {
    public boolean out;
    private And and1 = new And();
    private And and2 = new And();
    private Not not1 = new Not();
    private Not not2 = new Not();
    private Or or1 = new Or();

    public Xor() {
    }

    public void compute(boolean a, boolean b){
        not1.compute(a);
        not2.compute(b);
        and1.compute(not1.out,b);
        and2.compute(a,not2.out);
        or1.compute(and2.out,and1.out);
        out = or1.out;

    }
}
