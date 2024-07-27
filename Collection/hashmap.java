
package Collection;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

// LinkedHashMap: thu tu theo thu tu add

public class hashmap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        // (key, value) = (String, String) : Entry 
        // put get size isEmpty remove replace 
        map.put("US", "Biden");
        map.put("Russia", "Putin");
        map.put("China", "Xi yinping");
        map.put("North Korea", "Kim Jong-Un");
        map.put("Korea", "Kim Jong-Un");
        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        map.replace("China", "Nguyen Van A");
        
        // tan suat ky tu trong xau
        Map<Character, Integer> mp = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++){
            if(mp.containsKey(s.charAt(i))){
                int tanSuat = mp.get(s.charAt(i));  // lay ra tan suat cua ky tu s[i]
                ++tanSuat;
                mp.put(s.charAt(i), tanSuat);
            }
            else {
                mp.put(s.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
