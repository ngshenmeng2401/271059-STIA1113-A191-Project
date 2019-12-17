import java.util.Scanner;

public class GroupAssignment2{
    public static double totalcharge2[]=new double[3];

    public static void choice(){

        Scanner input=new Scanner(System.in);

        int choice;

        /*Display Menu*/
        System.out.printf("1. Input your data\n");
        System.out.printf("2. Return to Main Menu\n");


        System.out.printf("Enter your choice\t\t:");
        choice=input.nextInt();
        while(choice>2){
            System.out.printf("Invalid Input!!! Please key in correct data!!!\n");
            System.out.printf("Enter your choice\t:");
            choice=input.nextInt();
        }while(choice<=2){
            break;
        }

        if(choice==1){

            Table();
            Loop();

            System.out.printf("Enter your choice\t\t\t:");
            choice=input.nextInt();
            while(choice>2){
                System.out.printf("Invalid Input!!! Please key in correct data!!!\n");
                System.out.printf("Enter your choice\t\t\t:");
                choice=input.nextInt();
            }while(choice<=2){
                break;
            }
        }if(choice==2){
            main.choice();
        }
    }

    public static void Table(){

        /*Display Table*/
        line();
        System.out.printf("\nWeight\t\t\t\tLocal Town\t\t\t\t\t\t\t\tCross Town\n\t\t");
        int line = 1;
        while (line <= 80) {
            System.out.printf("%c", 45);
            line++;
        }
        System.out.printf("\n\t\t  Domestic Charge\tSurcharge\tTotal\t  Domestic Charge\tSurcharge\tTotal\n");
        line();
        System.out.printf("\nBelow 500gm\t\t4.90\t\t  6.00\t\t10.90\t\t   5.40\t\t\t  7.50\t\t12.90\n");
        System.out.printf("500gm-750gm\t\t5.70\t\t  6.00\t\t11.70\t\t   6.40\t\t\t  7.50\t\t13.90\n");
        System.out.printf("750gm-1kg\t\t6.50\t\t  6.00\t\t12.50\t\t   7.40\t\t\t  7.50\t\t14.90\n");
        line();
    }

    public static void Loop() {

        Scanner input=new Scanner(System.in);

        int customer;

        String towntype;
        double weight;
        double payment=0,totalpayment=0;
        double grandtotal=0;
        String towntype1;

        for(customer=0;customer<totalcharge2.length;customer++){

            /*Display Customer*/
            System.out.printf("\n\nCustomer %d:\n",customer+1);
            System.out.printf("----------------------\n");

            totalcharge2[customer]=0;

            /*Input First Town Type*/
            System.out.printf("\nEnter your town-type (Local/Cross/X to quit):");
            towntype=input.next();
            towntype=towntype.toUpperCase();

            /*Loop*/
            while(!towntype.equals("X")){

                /*Input Weight*/
                System.out.printf("Enter your weight\t\t\t\t\t\t:");
                weight=input.nextDouble();
                while(weight>1000){
                    System.out.printf("Invalid Input!!! Please key in correct data!!!\n");
                    System.out.printf("Enter your weight\t\t\t\t\t\t:");
                    weight=input.nextDouble();
                }while(weight<=1000){
                    break;
                }

                /*Call calPayment*/
                payment=calPayment(weight,towntype);

                /*Display Charges*/
                System.out.printf("Charges in %s is RM%.2f\n",towntype,payment);

                /*Accuumulate Total Charge*/
                totalcharge2[customer]+=payment;

                /*Input Next Town Type*/
                System.out.printf("\nEnter your town-type (Local/Cross/X to quit):");
                towntype=input.next();
                towntype=towntype.toUpperCase();
            }
            System.out.printf("All charges in RM%.2f\n",totalcharge2[customer]);
        }
    }

    public static double calPayment(double weight,String towntype) {

        double payment=0;
        double surcharge=0;
        double domestic_charge=0;

        switch(towntype){

            case "LOCAL":if(weight<=500){
                    domestic_charge=4.90;
                    surcharge=6.00;
                }if(weight>500&&weight<=750){
                    domestic_charge=5.70;
                    surcharge=6.00;
                }if(weight>750&&weight<=1000){
                    domestic_charge=6.50;
                    surcharge=6.00;
                }break;
            case "CROSS":if(weight<=500){
                    domestic_charge=5.40;
                    surcharge=7.50;
                }if(weight>500&&weight<=750){
                    domestic_charge=6.40;
                    surcharge=7.50;
                }if(weight>750&&weight<=1000){
                    domestic_charge=7.40;
                    surcharge=7.50;
                }break;
        }
        payment=domestic_charge+surcharge;
        return payment;
    }
    public static double[] getTotalCharge(){
        return totalcharge2;
    }

    public static void line() {
        int line = 1;
        while (line <= 100) {
            System.out.printf("%c", 45);
            line++;
        }
    }
}
