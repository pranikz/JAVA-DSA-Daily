/**
 * selectionsrt
 */
public class selectionsrt {
    public static void main(final String[] args) {
        final int[] arr={20,35,-15,7,55,1,-22};
        for(int lastUnsortedIndex= arr.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){

            int largest=0;

            for (int i = 1; i <=lastUnsortedIndex; i++) {

                if(arr[i] > arr[largest]) {

                    largest = i;

                    
                }
                swap(arr, largest, lastUnsortedIndex);
                
            }
        }
        System.out.println("sorted array  is : ");

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
            
        }
         
    }

    public static void swap(final int[] array, final int i, final int j) {

        if (i == j){
            
            return;
        }
        final int temp = array[i];
        array[i]= array[j];
        array[j] = temp;
    }

    
}