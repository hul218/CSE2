import java.util.Random;
public class Rag{
    public static void main(String [] args) {
        int[][] A=new int[5][];
        for (int i=0; i<5; i++) {
            A[i]=new int[i*3+5];
        }
        for (int i1=0; i1<5; i1++) {
            for (int i2=0; i2<i1*3+5; i2++) {
                A[i1][i2]=(int) (Math.random()*39);
                System.out.print(" "+A[i1][i2]);
            }
            System.out.println();
        }
        for (int i3=0; i3<5; i3++) {
            A[i3]=Sort(A[i3]);
        }
        for (int i4=0; i4<5; i4++) {
            for (int i5=0; i5<i4*3+5; i5++) {
               
                System.out.print(" "+A[i4][i5]);
            }
            System.out.println();
        }
    }
    public static int[] Sort (int [] A) {
        for (int i=0; i<A.length-1; i++) {
            int currentMin=A[i];
            int currentMinIndex=i;
        
        for (int j=i+1; j<A.length; j++) {
            if (currentMin>A[j]) {
                currentMin=A[j];
                currentMinIndex=j;
            }
        }
        if (currentMinIndex!=i) {
            A[currentMinIndex]=A[i];
            A[i]=currentMin;
        }
        }
        return A;
    }
}