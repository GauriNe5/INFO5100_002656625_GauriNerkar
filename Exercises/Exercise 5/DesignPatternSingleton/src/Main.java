import java.sql.SQLOutput;

class SingletonPattern {
    private static SingletonPattern single_obj = null;

    public String str1,str2;

    private SingletonPattern()
    {
        str1 = "AED course Assignment Number Five";
    }

    // Method
    public static SingletonPattern Singleton()
    {
        // To ensure only one instance is created
        if (single_obj == null) {
            single_obj = new SingletonPattern();
        }
        return single_obj;
    }
}

class Main {
    // Main  method
    public static void main(String args[])
    {
        SingletonPattern obj1 = SingletonPattern.Singleton();

        SingletonPattern obj2 = SingletonPattern.Singleton();

        System.out.println("Input string 1: " + obj1.str1);

       obj1.str1 = (obj1.str1).toUpperCase();

        // Print and display commands
        System.out.println("UpperCase: " + obj1.str1);
        System.out.println("UpperCase: " + obj2.str1);

        System.out.println("**************************************************");
        obj2.str1 = (obj2.str1).toLowerCase();

        System.out.println("Lower case: " + obj1.str1);
        System.out.println("Lower case: " + obj2.str1);


    }
}