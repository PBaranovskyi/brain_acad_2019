package tereshchenko_roman.java8NewFeatures.testLambda;

@FunctionalInterface
public interface MyConverter {

    String convertStr (String str);

    static boolean isNull(String str) {
        if (str == null)
            return true;
        return false;
    }
}
