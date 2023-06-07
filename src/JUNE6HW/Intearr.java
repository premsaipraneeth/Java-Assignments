package src.JUNE6HW;

public class Intearr {

    public static void main(String[] args) {
        int[] A = new int[]{20, 10, 40, 30, 50};

        int smallest = A[0];

        for (int i = 0; i < A.length; i++) {
            if (A[i] < smallest) {
                smallest = A[i];
            }

        }
        System.out.println("Smallest no. is " + smallest);

        int largest = A[0];

        for (int i = 0; i < A.length; i++) {
            if (A[i] > largest) {
                largest = A[i];
            }

        }
        System.out.println("Largest no. is " + largest);

    }

}
