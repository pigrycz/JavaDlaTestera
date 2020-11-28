package utils;

public class StringUtils {
    public static String getFormattedText(String text){
        if(text.length() <= 10){
            return text;
        } else {
            return text.substring(0, 7) + "...";
        }
    }
}
