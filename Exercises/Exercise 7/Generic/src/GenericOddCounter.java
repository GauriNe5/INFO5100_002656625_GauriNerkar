import java.util.Collection;

public final class GenericOddCounter {

        public static <T> int countIf(Collection<T> c, ForIntegers<T> p) {

            int count = 0;
            for (T elem : c)
                if (p.test(elem))
                    ++count;
            return count;
        }

}
