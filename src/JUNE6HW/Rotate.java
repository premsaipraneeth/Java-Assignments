package src.JUNE6HW;

public class Rotate {

    static void Rotation(int[] arr, int x, int len)
    {

        int[] duplicate = new int[len];

        int k = 0;

        for (int i = x; i < len; i++) {
            duplicate[k] = arr[i];
            k++;
        }

        for (int i = 0; i < x; i++) {
            duplicate[k] = arr[i];
            k++;
        }

        System.arraycopy(duplicate, 0, arr, 0, len);
    }

    static void Display(int[] arr, int len)
    {
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main (String[] args) {
        int[] arr = { 600,500,700,300,200,900 };
        int len = arr.length;
        int x = 3;

        Rotation(arr, x, len);
        Display(arr, len);
    }
}
