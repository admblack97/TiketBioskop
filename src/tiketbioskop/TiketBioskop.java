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
            System.out.print("Choose one [1/2/3/4/5/6/7/8/9] = ");
            int pilih =input.nextInt();
            
            switch (pilih){
                case 1:{
                    Studio1 s1=new Studio1();
                    s1.Studio1();
                    break;
                }
                case 2:{
                    Studio2 s2=new Studio2();
                    s2.Studio2();
                    break;
                }
                case 3:{
                   Studio3 s3=new Studio3();
                   s3.Studio3();
                   break;
                }
                case 4:{
                   Studio4 s4=new Studio4();
                   s4.Studio4();
                   break;
                }
                case 5:{
                   Studio5 s5=new Studio5();
                   s5.Studio5();
                   break;
                }
                case 6:{
                   Studio6 s6=new Studio6();
                   s6.Studio6();
                   break;
                }
                case 7:{
                   Studio7 s7=new Studio7();
                   s7.Studio7();
                   break;
                }
                case 8:{
                   Studio8 s8=new Studio8();
                   s8.Studio8();
                   break;
                }
                case 9:{
                   System.exit(9);
                }
                break;
            }
            System.out.println("|==============================|");
            System.out.print("Do you want to order again [y/n]? ");
            ulg=input.next();
        }
    }
    
}
