import java.util.Scanner;

public class GroupAssignment5 {
    private static GroupAssignment1 groupassignment1 = new GroupAssignment1();
    private static GroupAssignment2 groupassignment2 = new GroupAssignment2();
    private static GroupAssignment3 groupassignment3 = new GroupAssignment3();
    private static GroupAssignment4 groupassignment4 = new GroupAssignment4();
    public static double totalcharge1[]= groupassignment1.getTotalCharge();
    public static double totalcharge2[]= groupassignment2.getTotalCharge();
    public static double totalcharge3[]= groupassignment3.getTotalCharge();
    public static double totalcharge4[]= groupassignment4.getTotalCharge();


    public static void receipt() {

        Scanner input=new Scanner(System.in);
        int customer,line,choice=0;
        double grandtotal=0;

        /*Display Menu*/
        System.out.printf("1. Display Receipt\n");
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

        if(choice==1) {

            for (customer = 0; customer < totalcharge1.length; customer++) {

                /*Display Customer*/
                System.out.printf("\nCustomer %d:\n", customer + 1);
                System.out.printf("------------------\n");

                //Calculate Grand Total
                grandtotal=totalcharge1[customer]+totalcharge2[customer]+totalcharge3[customer]+totalcharge4[customer];

                //Display Receipt
                System.out.printf("Total Charge:\n");
                System.out.printf("Next-Day Delivery\t\t\tRM%10.2f\n",totalcharge1[customer]);
                System.out.printf("Same-Day Delivery\t\t\tRM%10.2f\n",totalcharge2[customer]);
                System.out.printf("Prepaid Box & Envelope\t\tRM%10.2f\n",totalcharge3[customer]);
                System.out.printf("Pos Ekspres\t\t\t\t\tRM%10.2f\n",totalcharge4[customer]);
                line=1;
                while(line<=60){
                    System.out.printf("%c",45);
                    line++;
                }
                System.out.printf("\nTotal \t\t\t\t\t\tRM%10.2f\n\n",grandtotal);

            }
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
}
