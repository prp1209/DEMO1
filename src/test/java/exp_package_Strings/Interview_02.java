package exp_package_Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Interview_02
{
    public static void main(String[] args)
    {
        String s="Java";
        char[] a=s.toCharArray();

        HashMap<Character, Integer> map= new HashMap<>();
        for(Character ch : a)
        {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
      for(Map.Entry<Character, Integer> e: map.entrySet())
      {
          System.out.println(e.getKey() + "=" + e.getValue());
      }
    }
}
