//Roger Blumin
//September, 6, 2014
//CSE 2
//HW02
//This program calculates the total cost of a few types of items,
//the sales tax for each type of item, the total cost of the purchase excluding sales tax,
//and the total of the purchase including sales tax

public class Arithmetic{
    public static void main(String [] args){ //main method
    
        int nSocks=3; //number of pairs of socks
        double sockCost$=2.58; //cost per pair of socks
        //('$' is part of the variable name)
        
        int nGlasses=6; //number of drinking glasses
        double glassCost$=2.29; //cost per glass
        
        int nEnvelopes=1;//number of boxes of envelopes
        double envelopeCost$=3.25; //cost per box of envelopes
        
        double taxPercent=0.06; //sales tax percentage
        
        double totalSockCost$ = nSocks * sockCost$; //total cost of socks
        double totalGlassCost$ = nGlasses * glassCost$; //total cost of glasses
        double totalEnvelopeCost$ = nEnvelopes * envelopeCost$; //total cost of envelopes
        System.out.println("The total cost for socks is $" + totalSockCost$); //outputs total sock cost
        System.out.println("The total cost for glasses is $" + totalGlassCost$); //outputs total glasses cost
        System.out.println("The total cost for envelopes is $" + totalEnvelopeCost$); //outputs total envelopes cost
        
        double sockTax=totalSockCost$ * taxPercent *100; //calculates sales tax on socks and multiplies it by 100
        int newSockTax = (int) sockTax;
        sockTax = ((double) newSockTax)/100;
        //the above two lines truncate the value of the sock tax to two decimal places
        
        double glassTax=totalGlassCost$ * taxPercent *100; //calculates sales tax on glasses and multiplies by 100
        int newGlassTax = (int) glassTax;
        glassTax = ((double) newGlassTax)/100;
        //the above two lines truncate the value of the glass tax to two decimal places

        double envelopeTax=totalEnvelopeCost$ * taxPercent * 100; //calculates sales tax on envelopes and multiplies by 100
        int newEnvelopeTax = (int) envelopeTax;
        envelopeTax = ((double) newEnvelopeTax)/100;
        //the above two lines truncate the value of the envelope tax to two decimal places
  
        System.out.println("The sales tax on socks is $" + sockTax); //outputs total sock tax
        System.out.println("The sales tax on glasses is $" + glassTax); //outputs total glass tax
        System.out.println("The sales tax on envelopes is $" + envelopeTax); //outputs total envelope tax
        
        double totalCost$ = totalSockCost$ + totalGlassCost$ + totalEnvelopeCost$; //calculates total cost before tax
        double totalTax = sockTax + glassTax + envelopeTax; //calculates total tax for the purhcase
        double transactionCost$ = totalCost$ + totalTax; //calculates total cost of transaction with tax
        System.out.println("The total cost of purchases before tax is $" + totalCost$);//outputs pretax cost
        System.out.println("The total cost for the transaction with sales tax is $" + transactionCost$ + "0");//outputs total transaction cost with tax
        
        
    }//end of main method
}//end of class