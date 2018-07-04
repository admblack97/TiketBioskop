package tiketbioskop;
import java.util.Scanner;
class Studio5 {
    public void Studio5(){
        Scanner input = new Scanner(System.in);
        System.out.println("==========Studio 5==========");
        System.out.println("Movie: Ocean 8");
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
        System.out.println("=================================");
        System.out.println("Total= "+total);
    }
}