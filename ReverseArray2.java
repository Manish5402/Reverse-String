import java.util.Scanner;

public class ReverseArray2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array : ");
        int a = sc.nextInt();
        int [] arr= new int[a] ;
       for(int i=0;i< arr.length;i++){                  //set values in array
          arr[i]=sc.nextInt();
       }
        System.out.println("array :- ");
        for(int i=0;i<arr.length;i++ ){                // print array before reverse
            System.out.print(arr[i]+" ");
        }
        int b= arr.length-1;
       for(int i=0;i< arr.length/2;i++){

           int tmp=arr[i];
           arr[i]=arr[b];                                 // reverse array
            arr[b]=tmp;
            b--;
       }
        System.out.println("\n  reverse array");

        for(int i=0;i<arr.length;i++ ){
           System.out.print(arr[i]+" ");              // print reverse array
       }
    }
}