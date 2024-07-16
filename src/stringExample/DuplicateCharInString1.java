package stringExample;

import java.util.*;
public class DuplicateCharInString1 {
    public static void main(String args[]) {
      String str = "asfar";
      char[] charArr = str.toCharArray();
      Map<Character,Integer> map = new HashMap<>();
      for(Character c:charArr) {
          if(!map.containsKey(c)) {
              map.put(c,1);
          } else {
              map.put(c,map.get(c)+1);
          }
      }
      System.out.print(map);
    }
}
