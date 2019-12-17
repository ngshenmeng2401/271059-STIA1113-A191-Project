import java.util.Scanner;

public class GroupAssignment3{
    public static double totalcharge3[]=new double[3];

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

            System.out.printf("Enter your choice\t\t:");
            choice=input.nextInt();
            while(choice>2){
                System.out.printf("Invalid Input!!! Please key in correct data!!!\n");
                System.out.printf("Enter your choice\t:");
                choice=input.nextInt();
            }while(choice<=2){
                break;
            }
        }if(choice==2){
            main.choice();
        }
    }

    public static void Table() {

        int line;

        /*Display Table*/
        line();
        System.out.printf("\nJenis\t\t Envelope S\t\t\t Envelope L\t\t      Prepaid Box S\t\t  Prepaid Box M\t\t  Prepaid Box L\n");
        line();
        System.out.printf("\nSaiz\t\t280mm*200mm\t\t\t380mm*320mm\t\t\t340mm*250mm*80mm\t340mm*250mm*150mm\t380mm*320mm*x200mm\n\n");
        System.out.printf("Berat Max\t\t500g\t\t\t\t1kg\t\t\t\t\t 2kg\t\t\t\t\t5kg\t\t\t\t  10kg\n\n");
        System.out.printf("Harga\t\t   RM7.31\t\t\t  Rm10.49\t\t\t   RM13.78\t\t\t\t  RM21.20\t\t\t RM31.80\n");
        line();
    }

    public static void Loop() {

        Scanner input=new Scanner(System.in);

        int customer,quantity;
        String ItemType;
        double weight;
        double totalprice=0;
        double grandtotal=0;

        for(customer=0;customer<totalcharge3.length;customer++){

            /*Display Customer*/
            System.out.printf("\nCustomer %d:\n",customer+1);
            System.out.printf("----------------------\n");

            totalcharge3[customer]=0;

            /*Input First Item Type*/
            System.out.printf("\nEnter your item (Envelope S/M or Prepaid Box S/M/L /X to quit)\t:");
            ItemType=input.next()+input.nextLine();
            ItemType=ItemType.toUpperCase();

            /*Loop*/
            while(!ItemType.equals("X")){

                /*Input Quantity*/
                System.out.printf("Enter your quantity\t\t\t\t\t\t:");
                quantity=input.nextInt();

                /*Input Weight*/
                System.out.printf("Enter your weight\t\t\t\t\t\t:");
                weight=input.nextDouble();
                while(weight>10000){
                    System.out.printf("Invalid Input!!! Please key in correct data!!!\n");
                    System.out.printf("Enter your weight\t\t\t\t\t\t:");
                    weight=input.nextDouble();
                }while(weight<=10000){
                    break;
                }

                /*Call calTotalPrice*/
                totalprice=calTotalPrice(weight,quantity);

                /*Display Charges*/
                System.out.printf("Charges in %s is RM%.2f\n",ItemType,totalprice);

                /*Accumulate Total Charge*/
                totalcharge3[customer]=totalprice;

                /*Input First Item Type*/
                System.out.printf("\nEnter your item (Envelope S/M or Prepaid Box S/M/L /X to quit)\t:");
                ItemType=input.next()+input.nextLine();
                ItemType=ItemType.toUpperCase();

            }
            System.out.printf("All charges in RM%.2f\n",totalcharge3[customer]);
        }
    }

    public static double calTotalPrice(double weight,int quantity) {

        double price=0;
        double totalprice;

        if(weight<=500){
            price=7.31;
        }if(weight>500&&weight<=1000){
            price=10.49;
        }if(weight>1000&&weight<=2000){
            price=13.78;
        }if(weight>2000&&weight<=5000){
            price=21.20;
        }if(weight>5000&&weight<=10000){
            price=31.80;
        }
        totalprice=price*quantity;
        return totalprice;
    }
    public static double[] getTotalCharge(){

        return totalcharge3;
    }

    public static void line() {
        int line = 1;
        while (line <= 120) {
            System.out.printf("%c", 45);
            line++;
        }
    }
}
