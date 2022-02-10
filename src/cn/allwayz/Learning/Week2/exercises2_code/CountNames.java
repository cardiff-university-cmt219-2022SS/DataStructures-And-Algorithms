package cn.allwayz.Learning.Week2.exercises2_code;

import java.util.Locale;

/**
 * (a). Modify the application so that it counts the number of actors whose names end in Jones.<br>
 * <p>
 * (b). One of the names has been written in UPPER CASE and might not be counted in your answer to 7a.
 * Modify your application so that it is able to count all instances of Jones regardless of
 * whether they’re written in upper case, lower case or mixed case.<br><br>
 *
 * @author allwayz
 */
public class CountNames {
    public static void main(String[] args) {
        String[] names = {"Tommy Lee Jones", "William Hurt", "Nicole Kidman",
                "Catherine Zeta-Jones", "JAMES EARL JONES", "Tom Hardy",
                "Judi Dench", "Sean Bean", "Carey Mulligan", "Toby Jones"};
        int count = 0;
        String endWith = "jones";
        for (int i = 0; i < names.length; i++) {
            // (b)
            String name = names[i].toLowerCase();
            if (name.substring(name.length() - 5, name.length()).equals(endWith)) {
                System.out.println(name);
                count++;
            }
        }
        System.out.println(count);
        count = 0;
        for (String name : names) {
            if(name.toLowerCase().endsWith("jones")){
                System.out.println(name);
                count++;
            }
        }
        System.out.println(count);
    }
}

