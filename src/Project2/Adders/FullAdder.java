package Project2.Adders;

import Project2.ElementaryLogicGates.And;
import Project2.ElementaryLogicGates.Or;
import Project2.ElementaryLogicGates.Xor;

public class FullAdder {

    public boolean sum;
    public boolean carry;
    private And and = new And();
    private And and2 = new And();
    private Xor xor = new Xor();
    private Xor xor2 = new Xor();
    private Or or1 = new Or();
    private HalfAdder half = new HalfAdder();
    public FullAdder() {
    }

    public void compute(boolean a, boolean b, boolean c){
        xor.compute(a,b);
        and.compute(a,b);
//        half.compute(a,b);
        xor2.compute(c,xor.out);
        and2.compute(c,xor.out);
//        xor2.compute(c,half.sum);
//        and2.compute(c,half.carry);
        or1.compute(and.out,and2.out);
        sum=xor2.out;
        carry=or1.out;
    }
}
