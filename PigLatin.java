import java.util.*;
public class PigLatin{

  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
    if (s.charAt(0)=='a' || s.charAt(0)=='e' || s.charAt(0)=='i' || s.charAt(0)=='o' || s.charAt(0)=='u') return (s+"hay");
    else if (s.length() > 1) return (s.substring(1) + s.charAt(0) + "ay");
    else return (s.charAt(0) + "ay");
  }

  public static String pigLatin(String s){
    //list of all digraphs
    ArrayList<String> digraphs = new ArrayList<String>(Arrays.asList("bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"));
    s = s.toLowerCase();
    if (s.length() > 1 && digraphs.contains(s.substring(0,2))){
      if (s.length() == 2) return (s + "ay");
      else return (s.substring(2) + s.substring(0, 2) + "ay");
    }
    else return(pigLatinSimple(s));
  }

  public static String pigLatinBest(String s){
    s = s.toLowerCase();
    if (!Character.isLetter(s.charAt(0))) return s;
    if (Character.isLetter(s.charAt(s.length()-1)) || Character.isDigit(s.charAt(s.length()-1))) return pigLatin(s);
    else return (pigLatin(s.substring(0,s.length()-1)) + s.charAt(s.length()-1));
  }

  public static void main( String[]args ){
    Scanner n = new Scanner( System.in );
    while (n.hasNextLine()){
      String s = n.nextLine();
      Scanner n1 = new Scanner(s);
      while (n1.hasNext()){
        String s1 = n1.next();
        System.out.print(pigLatinBest(s1));
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
