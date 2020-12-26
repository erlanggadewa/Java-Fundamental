public class Rekursif1 {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
//        System.out.println("final = " + sum(8800, 8800));
        System.out.println("final2 = " + sum2(8800));
        final long endTime = System.currentTimeMillis();
        System.out.println("Total time = " + (startTime - endTime));


    }

    private static long sum(int parameter, int sumValue) {
        if (parameter == 0) {
            return sumValue;
        }
        return sum(parameter - 1, (sumValue + (parameter - 1)));
    }

    private static long sum2(int parameter) {
        if (parameter == 0) {
            return parameter;
        } else {
            return parameter + sum2(parameter - 1);
        }
    }
}
//4 3 2 1 0 = 10