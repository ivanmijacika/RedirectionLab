import java.util.*;
public class PigLatin{

  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
    if (s.charAt(0)=='a' || s.charAt(0)=='e' || s.charAt(0)=='i' || s.charAt(0)=='o' || s.charAt(0)=='u') return (s+"hay");
    else if (s.length() > 1) return (s.substring(1) + s.charAt(0) + "ay");
    else return (s.charAt(0) + "ay");
  }




}
