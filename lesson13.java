package curso_java;

public class lesson13 {
    public static void main(String[] args){
        double hc, hz;
        int i = 0;
        hc = 1.50;
        hz = 1.10;
        while(hz<=hc)
        {
            hc = hc + 0.02;
            hz = hz + 0.03;
            i = i + 1;
        }
        System.out.println("Foram necessários "+i+" anos para que a altura de Zé ultrapassasse a de Chico");


    }
}
