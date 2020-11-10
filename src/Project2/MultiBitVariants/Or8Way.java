package Project2.MultiBitVariants;


import Project2.ElementaryLogicGates.Nand;
import Project2.ElementaryLogicGates.Or;

public class Or8Way {
    public boolean out;
    public Or[] or8way= new Or[7];


    public Or8Way(){
        for (int i = 0; i <7; i++) {
            or8way[i]=new Or();
        }
    }
    public void compute(boolean[] in){
            or8way[0].compute(in[0],in[1]);
            or8way[1].compute(in[2],in[3]);
            or8way[2].compute(in[4],in[5]);
            or8way[3].compute(in[6],in[7]);
            or8way[4].compute(or8way[0].out,or8way[1].out);
            or8way[5].compute(or8way[2].out,or8way[3].out);
            or8way[6].compute(or8way[4].out,or8way[5].out);
            out = or8way[6].out;
    }

}
