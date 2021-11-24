
package kelimeortadanyazdirma;

import java.util.Scanner;


public class Kelimeortadanyazdirma {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kelime = scanner.next();
        String kelime1 = "";
        kelime1 = kelime1+kelime.charAt(0);
        System.out.println(kelime.charAt(0));
                for (int i = 1; i < kelime.length(); i++) {
            kelime1 = kelime.charAt(i) + kelime1 + kelime.charAt(i);
                    System.out.println(kelime1);
        }
    }
    
}
