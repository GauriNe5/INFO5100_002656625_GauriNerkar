import java.sql.SQLOutput;

class SingletonPattern {
    private static SingletonPattern single_obj = null;

    public String str1,str2;

    private SingletonPattern()
    {
        str1 = "AED course Assignment Number Five";
        str2 = "My name is Gauri Nerkar";
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


       obj1.str1 = (obj1.str1).toUpperCase();

        // Print and display commands
        System.out.println("String from obj1: " + obj1.str1);
        System.out.println("String from obj2: " + obj2.str2);

        System.out.println("\n");
        System.out.println("*********************************************");
        obj2.str2 = (obj2.str2).toLowerCase();

        System.out.println("String from obj1: " + obj1.str1);
        System.out.println("String from obj2: " + obj2.str2);
    }
}