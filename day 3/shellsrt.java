public class shellsrt {
    public static void main(String[] args) {
        final int[] arr = { 20, 35, -15, 7, 55, 1, -22 };
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {

            for (int i = 0; i < arr.length; i++) {
                int newelement = arr[i];

                int j = i;
                while (j >= gap && arr[j - gap] > newelement) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = newelement;

            }
        }

        System.out.println("sorted array  is : ");

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }

    }
}