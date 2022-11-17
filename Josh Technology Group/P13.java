// Find the Rotation Count in Rotated Sorted array

class P13 {

    static int linearSearch(int[] arr, int n)
    {
        int min = arr[0];
        int min_index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                min_index = i;
            }
        }
        return min_index;
    }
    public static void main(String[] args)
    {
        int arr[] = { 15, 18, 2, 1, 6, 12 };
        int n = arr.length;
        // Using Linear Search
        System.out.println(linearSearch(arr, n));
    }
}