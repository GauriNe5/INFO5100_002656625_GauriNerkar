import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        //for 10 digit numbers
        Pattern pattern1 = Pattern.compile("^\\d{10}$");
        Matcher matcher1 = pattern1.matcher("2055550125");
        System.out.println("For 10 digits:"+ matcher1.matches());

        //false value for 10 digit num
        Pattern pattern2 = Pattern.compile("^\\d{10}$");
        Matcher matcher2 = pattern2.matcher("2025");
        System.out.println("False value for digits:"+ matcher2.matches());

        //for Zip code
        Pattern pattern3 = Pattern.compile("\\b[0-9]{5}(-[0-9]{4})?\\b");
        Matcher matcher3 = pattern3.matcher("95051");
        System.out.println("For Zip code:"+ matcher3.matches());

        //false value for zip code
        Pattern pattern4 = Pattern.compile("\\b[0-9]{5}(-[0-9]{4})?\\b");
        Matcher matcher4 = pattern4.matcher("abc12");
        System.out.println("False value for Zip code:"+ matcher4.matches());

        Pattern pattern5= Pattern.compile("\\b(0?[1-9]|1[012])[- /.](0?[1-9]|[12][0-9]|3[01])[-/.](19|20)?[0-9]{2}\\b");
        Matcher matcher5 = pattern5.matcher("9/2/2022");
        System.out.println("For date:"+ matcher5.matches());

        Pattern pattern6= Pattern.compile("\\b(0?[1-9]|1[012])[- /.](0?[1-9]|[12][0-9]|3[01])[-/.](19|20)?[0-9]{2}\\b");
        Matcher matcher6 = pattern6.matcher("0.2");
        System.out.println("False value for date:"+ matcher6.matches());

        //for digits starting with 809
        System.out.println(Pattern.matches("[809]{1}[0-9]{9}", "9953038949"));

        System.out.println(Pattern.matches("[809]{1}\\d{9}", "385303ab"));

        //for email id

        System.out.println(Pattern.matches("gaurinerkar11@gmail*.com", "gaurinerkar11@gmail.com"));

        System.out.println(Pattern.matches("ga*uriner*@gmail", "gaue.co"));



    }
}