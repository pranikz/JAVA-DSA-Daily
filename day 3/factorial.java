package sort;

public class factorial {
    public static void main(final String[] args) {

        System.out.println("Iterative factorial: "+fact(3));

        System.out.println("recursive factorial: "+recursivefact(3));

    }

    public static int fact(final int num) {

        if(num==0)
        return 1;
        int factorial =1;
        for (int i = 1; i <= num; i++) {

            factorial*=i;
            
        }
        return factorial; 
        
    }

    public static int recursivefact(final int num) {

        if(num==0)
        return 1;
        // N!= N*(N-1)!
        return num*recursivefact(num-1); 
        
    }

}
