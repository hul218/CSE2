public class Arithmetic {
    public static void main(String[] args) {
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        double sockCost$=2.58;
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        //total cost of socks
        double totalSockCost$=nSocks*sockCost$;   
        //sale tax of socks
        double saleTaxOfSocks=totalSockCost$*taxPercent;
        //total cost of glasses
        double totalGlassCost$=nGlasses*glassCost$;
        //sale tax of glasses
        double saleTaxOfGlasses=totalGlassCost$*taxPercent;
        //total cost of envelope
        double totalEnvelopeCost$=nEnvelopes*envelopeCost$;
        //sale tax of envelopes
        double saleTaxOfEnvelopes=totalEnvelopeCost$*taxPercent;
        //total cost before tax
        double tCBT=(totalEnvelopeCost$+totalGlassCost$+totalSockCost$)*100;
        int tCostBeforeTax$= (int) tCBT;
        //total sale tax
        double tSaleTax=saleTaxOfEnvelopes+saleTaxOfGlasses+saleTaxOfSocks;
        //total cost includes tax
        double tCIT=(totalEnvelopeCost$+totalGlassCost$+totalSockCost$+tSaleTax)*100;
        int tCostIncludeTax$= (int) tCIT;
        //print out the output data
        System.out.println("Cost per pair of socks is $"+sockCost$);
        System.out.println(nSocks+" pairs of socks totally cost $"+totalSockCost$);
        System.out.println("Sale tax of socks is $"+saleTaxOfSocks);
        System.out.println("  ");
        System.out.println("Cost per Glass is $"+glassCost$);
        System.out.println(nGlasses+" glasses totally cost $"+totalGlassCost$);
        System.out.println("Sale tax of glass is $"+saleTaxOfGlasses);
        System.out.println("  ");
        System.out.println("Cost per box of Envelopes is $"+envelopeCost$);
        System.out.println(nEnvelopes+" boxes of envelopes totally cost $"+totalEnvelopeCost$);
        System.out.println("Sale tax of envelopes is $"+saleTaxOfEnvelopes);
        System.out.println("  ");
        System.out.println("Total cost before tax: $"+(tCostBeforeTax$/100.0));
        System.out.println("Total sale tax: $"+tSaleTax);
        System.out.println("Total cost after tax: $"+(tCostIncludeTax$/100.0));
        
    }
}