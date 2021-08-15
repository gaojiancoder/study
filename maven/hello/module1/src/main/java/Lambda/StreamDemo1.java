package Lambda;

public class StreamDemo1 {
    public static void main(String[] args) {
        String s = ((youcan) (i, j) -> i + "---" + j).get(2, 3);
        System.out.println(s);
    }

    @FunctionalInterface
    private interface youcan {
        String get(int i, int j);
    }

}