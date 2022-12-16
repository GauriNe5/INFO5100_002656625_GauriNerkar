import java.sql.SQLOutput;

class SingletonPattern {
    private static SingletonPattern single_obj = null;

    public String str1,str2;

    //private constructor for restriction
    private SingletonPattern()
    {
        str1 = "AED course Assignment Number Five";
    }

    // Static method to create instance of Singleton class
    public static SingletonPattern Singleton()
    {
        // To check if only one instance is created
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
        SingletonPattern p = SingletonPattern.Singleton();

        SingletonPattern q = SingletonPattern.Singleton();

        System.out.println("Input string 1: " + p.str1);
        System.out.println();
        p.str1 = (p.str1).toUpperCase();


        System.out.println("Upper Case: " + p.str1);
        System.out.println("Upper Case: " + q.str1);

        System.out.println("**************************************************");
        q.str1 = (q.str1).toLowerCase();

        System.out.println("Lower case: " + p.str1);
        System.out.println("Lower case: " + q.str1);


    }
}