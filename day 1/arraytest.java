/**
 * arraytest
 */
public class arraytest {

    public static void main(String[] args) {
        
        int[] arr = new int[7];
        arr[0]=20;
        arr[1]=35;
        arr[2]=7;
        arr[3]=45;
        arr[4]=665;
        arr[5]=95;
        arr[6]=15;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int ind=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==7){
                ind=i;
                break;
            }
            
        }
        System.out.println("Index is : "+ind);

    }
}