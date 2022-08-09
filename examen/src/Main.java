public class Main {
    public static void main(String[] args) {
       int num[]= {10,-2,8,2,1,30};
       int i;
       int temp;
       for (int j=0; j< num.length-1; j++){
           for ( i=0; i< num.length-1; i++){
               if ( num[i]< num[i+1]){

                   temp = num[i];
                   num[i] = num[i+1];
                   num[i+1]= temp;
               }
           }
       }
        System.out.println();
    }
}