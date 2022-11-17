class P8 {
    static String getEncryptedNumber(int[] arr) {
        String result = new String();
        int n = arr.length;

        if (n == 1)
            return "0" + Integer.toString(arr[0]);
        if (n == 2)
        {
            return "0" + Integer.toString((arr[0] + arr[1]) % 10);
        }
        
        while(n != 2) {
            for (int i = 0; i < n - 1; i++) {
                int sum = arr[i] + arr[i + 1];
                sum = sum % 10;
                arr[i] = sum;
            }
            n--;
        }
        result = Integer.toString(arr[0]);
        result = result + Integer.toString(arr[1]);
        return result;
    }
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7 };
        System.out.println(getEncryptedNumber(arr));
    }
}