public class insertionsrt {
    private static int i;

    public static void main(final String[] args) {

        final int[] arr={20,35,-15,7,55,1,-22};

        for(int firstUnsortedIndex=1; firstUnsortedIndex< arr.length; firstUnsortedIndex++){

            final int newElement= arr[firstUnsortedIndex];

            for (i = firstUnsortedIndex; i >0 && arr[i-1] > newElement ; i--) {

                arr[i]= arr[i-1];
            }
            
            arr[i]= newElement;
        
         }

            System.out.println("sorted array  is : ");

      for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
            
        }

    }
}
