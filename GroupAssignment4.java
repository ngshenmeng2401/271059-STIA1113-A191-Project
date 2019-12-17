import java.util.Scanner;

public class GroupAssignment4{
    public static double totalcharge4[]=new double[3];

    public static void choice(){

        Scanner input=new Scanner(System.in);

        int choice;

        /*Display Menu*/
        System.out.printf("1. Input your data\n");
        System.out.printf("2. Return to Main Menu\n");

        System.out.printf("Enter your choice\t:");
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

            System.out.printf("Enter your choice\t:");
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
        System.out.printf("\nJenis\t\t\t  LG\t\t\t\t  LE(C5)\t\t\t LD(B4)\t\t\t     LK\n");
        line();
        System.out.printf("\nSaiz\t\t   220mm*110mm\t\t\t229mm*162mm\t\t  353mm*250mm\t\t 340mm*250mm\n\n");
        System.out.printf("Berat Max\t\t 100g\t\t\t\t   250g\t\t\t\t  500g\t\t\t\t1000g\n\n");
        System.out.printf("Berat Max\t\t 3mm\t\t\t\t   5mm\t\t\t\t  10mm\t\t\t\t25mm\n\n");
        System.out.printf("Harga\t\t\tRM3.18\t\t\t\t  Rm3.71\t\t\t RM4.77\t\t\t    RM7.42\n");
        line();
    }

    public static void Loop() {

        Scanner input=new Scanner(System.in);

        /*Declaration*/
        int quantity;
        int customer;
        String ItemType;
        double weight;
        double totalprice=0;
        double grandtotal=0;

        for(customer=0;customer<totalcharge4.length;customer++){

            /*Display Customer*/
            System.out.printf("\n\nCustomer %d:\n",customer+1);
            System.out.printf("----------------------\n");

            totalcharge4[customer]=0;

            /*Input First Item Type*/
            System.out.printf("\nEnter your item (LG/LE/LD/LK/X to quit)):");
            ItemType=input.next();
            ItemType=ItemType.toUpperCase();

            /*Loop*/
            while(!ItemType.equals("X")){

                /*Input Quantity*/
                System.out.printf("Enter your quantity\t\t\t\t\t:");
                quantity=input.nextInt();

                /*Input Weight*/
                System.out.printf("Enter your weight\t\t\t\t\t:");
                weight=input.nextDouble();
                while(weight>1000){
                    System.out.printf("Invalid Input!!! Please key in correct data!!!\n");
                    System.out.printf("Enter your weight\t\t:");
                    weight=input.nextDouble();
                }while(weight<=1000){
                    break;
                }

                /*Call calTotalPrice*/
                totalprice=calTotalPrice(quantity,weight);

                /*Display Charges*/
                System.out.printf("Charges in %s is RM%.2f\n",ItemType,totalprice);

                /*Accumulate Total Charge*/
                totalcharge4[customer]+=totalprice;

                /*Input First Item Type*/
                System.out.printf("\nEnter your item (LG/LE/LD/LK/X to quit)):");
                ItemType=input.next();
                ItemType=ItemType.toUpperCase();

            }
            System.out.printf("All charges in RM%.2f\n",totalcharge4[customer]);
//            grandtotal+=totalcharge4[customer];
        }
//        System.out.printf("\nGrand total\t\t\t:RM%.2f\n",grandtotal);

    }

    public static double calTotalPrice(int quantity,double weight) {

        double price=0;
        double totalprice;

        if(weight<=100){
            price=3.18;
        }if(weight>100&&weight<=250){
            price=3.71;
        }if(weight>250&&weight<=500){
            price=4.77;
        }if(weight>500&&weight<=1000){
            price=7.42;
        }

        totalprice=price*quantity;

        return totalprice;
    }
    public static double[] getTotalCharge(){

        return totalcharge4;
    }
    public static void line() {
        int line = 1;
        while (line <= 100) {
            System.out.printf("%c", 45);
            line++;
        }
    }
}
