package ch04;

public class FlowEx14 {
    public static void main(String[] args){
        for(int i=10, j=1; i>=1; i--,j*=2){
            System.out.printf("%d\t%d%n", i, j);
        }
    }
}
