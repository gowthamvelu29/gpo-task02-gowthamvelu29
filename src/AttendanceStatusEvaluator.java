import java.util.Scanner;
public class Attendance{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    Scanner.close();
    int attendance=scanner.nextInt();
    if(attendance>80){
      System.out.println("Excellent");
    }
    else if(attendance>=60){
      System.out.println("Satisfactory");
      }
    else{
      System.out.println("Poor");
    }
  }
}
