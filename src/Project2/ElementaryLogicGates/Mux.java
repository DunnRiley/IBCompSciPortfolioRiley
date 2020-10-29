package Project2.ElementaryLogicGates;

public class Mux {

    public boolean out;
    private And and1 = new And();
    private And and2 = new And();
    private Not not1 = new Not();
    private Or or1 = new Or();
    public Mux() {
    }

    public void compute(boolean a, boolean b, boolean sel){
        not1.compute(sel);
        and1.compute(not1.out,a);
        and2.compute(sel,b);
        or1.compute(and1.out,and2.out);
        out=or1.out;
    }
}
