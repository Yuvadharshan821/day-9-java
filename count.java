
import java.util.*;

class Main {
    public static void main(String[] args) {
        String a = "punithrajkumar";
        int c[] = new int[26];  
        
        for (int i = 0; i < a.length(); i++) {
            if (Character.isAlphabetic(a.charAt(i))) {
                c[a.charAt(i) - 'a']++;  
            }
        }
        System.out.println("Character counts for string 'punithrajkumar':");
        System.out.println(Arrays.toString(c));  

        String a1 = "rajkumar"; 
        int c1[] = new int[26];  
        
        for (int i = 0; i < a1.length(); i++) {
            if (Character.isAlphabetic(a1.charAt(i))) {
                c1[a1.charAt(i) - 'a']++;  
            }
        }
        System.out.println("Character counts for string 'rajkumar':");
        System.out.println(Arrays.toString(c1));  

        String a2 = "shiva rajkumar"; 
        int c2[] = new int[26];  
        
        for (int i = 0; i < a2.length(); i++) {
            if (Character.isAlphabetic(a2.charAt(i))) {
                c2[a2.charAt(i) - 'a']++;  
            }
        }
        System.out.println("Character counts for string 'shiva rajkumar':");
        System.out.println(Arrays.toString(c2));  
    }
}

