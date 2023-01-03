package code.wars;

public class set1 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println("Start");
        int digit = Integer.MAX_VALUE;
//        int digit = 4568;
        int a;
        int sum = 0;
        String digitS = String.valueOf(digit);

        int b = 0;
        boolean isFirst = true;
        while (isFirst) {
            a = digit % 10;
            sum = sum + a;
            digit /= 10;
            b++;
            if (sum >= 10 && b == digitS.length()) {
                digit = sum;
                digitS = String.valueOf(digit);
                sum = 0;
                b = 0;
            }
            else if(sum < 10 && b == digitS.length()) {
                isFirst = false;
            }
        }
        System.out.println(sum);

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Koniec");
        System.out.println(totalTime);

    }
}

