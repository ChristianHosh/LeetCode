public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int temp = x;
        int size = 0;
        while (temp > 0){
            size++;
            temp = temp / 10;
        }
        for (int i = 1, j = size - 1; i <= j; i++,j--) {
            int digitFromLeft = (x % (int)(Math.pow(10.0,i))) / ((int)(Math.pow(10.0,i - 1)));
            int digitFromRight = (x / (int)(Math.pow(10.0,j))) % 10;
            System.out.println(digitFromLeft + " | " + digitFromRight);
            if (digitFromLeft != digitFromRight)
                return false;
        }
        return true;
    }
}
