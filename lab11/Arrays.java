import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
       final int Ints=10;
       int[] array=new int[Ints];
       System.out.print("Enter 10 ints- ");
       for (int i=0;i<10;i++){
           Scanner scan=new Scanner(System.in);
           int sc=scan.nextInt();
           array[i]=sc;
       }
       int mi=0;
       for (int j=0;j<10;j++){
           mi=Math.min(mi,array[j]);
       }
       System.out.println("The lowest entry is "+mi);
       int mx=0;
       for (int h=0;h<10;h++){
           mx=Math.max(mx,array[h]);
       }
       System.out.println("The highest entry is "+mx);
       int sum=0;
       for (int y=0;y<10;y++){
           sum+=array[y];
       }
       System.out.println("The sum is "+sum);
       for (int x=0,z=9;x<10||z>=0;x++,z--){
           System.out.println("  "+array[x]+"   "+array[z]);
       }
    }
}