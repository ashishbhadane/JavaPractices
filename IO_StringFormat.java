import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        String output="";
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            sc.nextLine();
            output += String.format("%-15s", s1) + String.format("%03d" , x) + "\n";

        }
        System.out.println("================================");
        System.out.printf(output);
        System.out.println("================================");

    }
}
