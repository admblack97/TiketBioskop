package tiketbioskop;
import java.util.Scanner;
class Studio1 {
    public void Studio1(){
        Scanner input = new Scanner(System.in);
        System.out.println("==========Studio 1==========");
        System.out.println("Movie: Ant-Man And The Wasp");
        System.out.print("Date Show: ");
        String date = input.nextLine();
        System.out.print("Time Show: ");
        String time = input.nextLine();
        System.out.print("Seats: ");
        String to = input.nextLine();
        System.out.print("Total Seats: ");
        int t = input.nextInt();
        int price = 45000;
        int total = price*t;
        System.out.println("Total= "+total);
    }
}