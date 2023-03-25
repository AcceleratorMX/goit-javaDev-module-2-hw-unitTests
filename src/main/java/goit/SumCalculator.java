package goit;

public class SumCalculator {

        public static int sum ( int n){
            return switch (n) {
                case 0 -> throw new IllegalArgumentException();
                default -> (n * (n + 1)) / 2;
            };
        }
//
//    public static void main(String[] args) {
//        int n = 10;
//        int res = sum(n);
//        System.out.println(res);
//    }
}


