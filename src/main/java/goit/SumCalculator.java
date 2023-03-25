package goit;

public class SumCalculator {

        public static int sum (int n){
            return switch (n) {
                case 0 -> throw new IllegalArgumentException();
                default -> (n * (n + 1)) / 2;
            };
        }
}


