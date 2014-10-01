//Huanlunn Li [CSE 002-110] 9/28/2014 BoolaBoola.java  hw05
import java.util.Scanner;//import
public class BoolaBoola {//define the class
    public static void main(String[] args) {//main method
        int fir=(int) (Math.random()*2);
        String firs="a";
        String secd="a";
        String thir="a";
        String four="a";
        String fift="a";
        String firCal="a";
        String secCal="a"; //declare the variables & prevent ‘initialized error'
        if (fir==0) {//I don't know how to get random 'true or false'
            firs= "true";//So I just transform randome numbers 0&1 to true&false or ||and&&
        }
        else if (fir==1) {
            firs= "false";
        }
        int sec=(int) (Math.random()*2);
        if (sec==0) {
            secd="&&";
        }
        else if (sec==1) {
            secd="||";
        }
        int thi=(int) (Math.random()*2);
        if (thi==0) {
            thir= "true";
        }
        else if (thi==1) {
            thir= "false";
        }
        int fou=(int) (Math.random()*2);
        if (fou==0) {
            four="&&";
        }
        else if (fou==1) {
            four="||";
        }
        int fif=(int) (Math.random()*2);
        if (fif==0) {
            fift= "true";
        }
        else if (fif==1) {
            fift= "false";
        }
        // 8 situations can include all the possible answers
        if ((firs.equals ("true")&&secd.equals ("||"))||(thir.equals ("true")&&secd.equals ("||"))) {
            firCal= "true";
        }
        else if ((firs.equals ("false")&&secd.equals ("&&"))||(thir.equals ("false")&&secd.equals ("&&"))) {
            firCal="false";
        }
        else if (firs.equals ("true")&&secd.equals ("&&")&&thir.equals ("true")) {
            firCal="true";
        }
        else if (firs.equals ("false")&&secd.equals ("||")&&thir.equals ("false")) {
            firCal="false";
        }
        if ((firCal.equals ("true")&&four.equals ("||"))||(fift.equals ("true")&&four.equals ("||"))) {
            secCal= "true";
        }
        else if ((firCal.equals ("false")&&four.equals ("&&"))||(fift.equals ("false")&&four.equals ("&&"))) {
            secCal="false";
        }
        else if (firCal.equals ("true")&&four.equals ("&&")&&fift.equals ("true")) {
            secCal="true";
        }
        else if (firCal.equals ("false")&&four.equals ("||")&&fift.equals ("false")) {
            secCal="false";
        }
        Scanner MS;
        MS= new Scanner(System.in);
        System.out.print("Dose "+firs+" "+secd+" "+thir+" "+four+" "+fift+" have the value true(t/T) or false(f/F)?" );
        String ans=MS.next(); //allow user enter the answer
        //Check whether user entered a correct answer.
        if ((ans.equals ("t")||ans.equals ("T"))&&secCal.equals ("true")) {
            System.out.println("Correct");
        }
        else if ((ans.equals ("f")||ans.equals ("F"))&&secCal.equals ("false")) {
            System.out.println("Correct");
        }
        else {
            System.out.println("Wrong; try again.");
        }
    }
}
//It should have easier way but I don't know how to simplify this....such a hard question...