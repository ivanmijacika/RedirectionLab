import java.util.*;
public class MakeStars{
  public static void main( String[]args ){
      Scanner n = new Scanner( System.in );
      while (n.hasNextLine()){
        String s = n.nextLine();
        Scanner n1 = new Scanner(s);
        while (n1.hasNext()){
          String s1 = n1.next();
          for (int i=0; i<s1.length(); i++){
            System.out.print("*");
          }
          System.out.print(" ");
        }
        System.out.println();
      }
  }
}
