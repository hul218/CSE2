public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
  
  public static String equals(double [] y, double [] z){
      int n=Math.max(y.length,z.length);
      if (y.length==z.length){
      for (int i=0;i<n;i++){
          if (y[i]==z[i]){
              continue;
              }
              else {return "false";}
          }
          return "true";
      }
      else {return "false";}
  }
  public static double[] addArrays(double [] u, double [] w){
      int n=Math.max(u.length,w.length);
      int m=Math.min(u.length,w.length);
      double[] output=new double[n];
      for (int i=0;i<m;i++){
          output[i]=u[i]+w[i];
      }
      for (int s=1;s+m<=n;s++){
          int c=n-s;
          if (u.length>w.length){
              output[c]=u[c];
          }
          else {
              output[c]=w[c];
          }
          
      }
      return output;
  }
      
 
}
