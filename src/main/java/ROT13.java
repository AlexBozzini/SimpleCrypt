import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    ROT13(Character cs, Character cf) {
    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++){
            if (isUpperCase(chars[i])){
                chars[i] += 32;
                if (chars[i] >= 97 && chars[i] <= 109){
                    chars[i] += 13;
                } else if (chars[i] >=110 && chars[i] <= 122){
                    chars[i] -= 13;
                }
                chars[i] -= 32;
            } else if (isLowerCase(chars[i])){
                if (chars[i] >= 97 && chars[i] <= 109){
                    chars[i] += 13;
                } else if (chars[i] >=110 && chars[i] <= 122){
                    chars[i] -= 13;
                }
            }
        }
        System.out.println(new String(chars));
        return new String(chars);
    }

    public String encrypt(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++){
            if (isUpperCase(chars[i])){
                chars[i] += 32;
                if (chars[i] >= 97 && chars[i] <= 109){
                    chars[i] += 13;
                } else if (chars[i] >=110 && chars[i] <= 122){
                    chars[i] -= 13;
                }
                chars[i] -= 32;
            } else if (isLowerCase(chars[i])){
                if (chars[i] >= 97 && chars[i] <= 109){
                    chars[i] += 13;
                } else if (chars[i] >=110 && chars[i] <= 122){
                    chars[i] -= 13;
                }
            }
        }
        return new String(chars);
    }

    public String decrypt(String text) {
        return text;
    }

    public static String rotate(String s, Character c) {
        int index = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c){
                index = i;
                break;
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = index; i < s.length(); i++){
            builder.append(s.charAt(i));
        }
        for (int i = 0; i < index; i++){
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }

}
