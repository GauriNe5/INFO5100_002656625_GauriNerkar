import java.util.*;

    class OddCount implements ForIntegers<Integer> {
        public boolean test(Integer i) {
            return i % 2 != 0; }
    }


    public class Helper {
        public static void main(String[] args) {
            //For Odd count
            Collection<Integer> bi = Arrays.asList(10, 12, 33, 41, 5);
            int count = GenericOddCounter.countIf(bi, new OddCount());
            System.out.println("Number of odd integers = " + count);


            // Test generic swap
            Integer [] numlist = {10,20,45,60};
            GenericSwap<Integer> classToTest = new GenericSwap<>();
            classToTest.swap(numlist, 0, 3);

            System.out.println("Integer array After swap is : ");
            for (Integer num : numlist)
                System.out.println(num);

            // Test generic max

            GenericMax<Integer> classToTest2 = new GenericMax<>();
            ArrayList<Integer> input = new ArrayList<>();
            input.add(25);
            input.add(5);
            input.add(45);
            input.add(67);
            input.add(2);


            Integer output = classToTest2.max(input, 0, 4);
            System.out.println("Max element in the list is: " + output);

        }


    }



