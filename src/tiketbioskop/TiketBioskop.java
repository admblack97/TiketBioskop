package tiketbioskop;
import java.util.Scanner;
public class TiketBioskop {
    public static void main(String[] args) {
        String ulg = "y";
        while (ulg.equals("y")){
            System.out.println("");
            Scanner input = new Scanner(System.in);
            String ul="", lagi;
            System.out.println("+=====Welcome To Cinema XXI=====+");
            System.out.println("+==========Now Playing==========+");
            System.out.println("|Studio 1. Ant-Man And The Wasp |");
            System.out.println("|Studio 2. The Incridibles 2    |");
            System.out.println("|Studio 4. Jurassic World 2 : Fallen Kingdom|");
            System.out.println("|Studio 5. Ocean 8|");
            System.out.println("|Studio 6. Ant-Man And The Wasp|");
            System.out.println("|Studio 7. Ant-Man And The Wasp|");
            System.out.println("|Studio 8. Ant-Man And The Wasp|");
            System.out.println("|9. Exit");
            System.out.println("|==============================|");
            System.out.print("Pilihan [1/2/3/4/5/6/7/8/9] = ");
            int pilih =input.nextInt();
        }
    }
    
}
