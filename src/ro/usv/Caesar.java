package ro.usv;

/**
 * The Caesar class encrypt/decrypt the received text and returned it
 * @author  Gherasim Daniel Adrian
 * @version 1.0
 * @since   17.11.2021
 */

public class Caesar {
    public static int lngAlfabet='Z'-'A'+1;

    public static String Encrypt(String text, int shift){
        StringBuilder rez= new StringBuilder();
        char[] ctext= text.toCharArray();
        char cmin;
        for(char c: ctext){
            if(Character.isLetter(c)){
                if(Character.isUpperCase(c))
                    cmin='A';
                else
                    cmin='a';
                c = (char)((c-cmin+shift)%lngAlfabet + cmin);
            }
            rez.append(c);
        }
        return rez.toString();
    }

    public static String Decrypt(String text, int shift) {
        return Encrypt(text, 26-shift);
    }
}