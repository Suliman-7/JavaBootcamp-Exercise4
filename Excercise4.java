import java.util.ArrayList;
import java.util.Arrays;

public class Excercise4 {
    public static void main(String[] args) {


// Q1


//        int arr[] = {50, -20, 0, 30, 40, 60, 20};
//
//        int first = arr[0];
//
//        int last = arr[arr.length - 1];
//
//
//        if (first == last && arr.length >= 2) {
//            System.out.println(true);
//        } else if (first != last && arr.length >= 1) {
//            System.out.println(false);
//        } else {
//            System.out.println("Array length must be greater then or equal 2");
//        }
//
//
//        Q2
//
//
//        int arr[] = {1, 4, 17, 7, 25, 3, 100};
//
//        ArrayList<Integer> newArr = new ArrayList();
//
//
//        double sum = 0;
//
//        for (int i : arr) {
//            sum += i;
//
//        }
//
//
//        double avg = sum / arr.length;
//
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > avg) {
//                newArr.add(arr[i]);
//            }
//        }
//
//        System.out.println("The averege of said array is : " + avg);
//        System.out.println("The numbers in the said array that are greater than the average are : " + newArr);
//
//
//        Q3
//
//
//        int arr[] = {20, 30, 40};
//
//        int first = arr[0];
//
//        int last = arr[arr.length - 1];
//
//
//        if (first > last) {
//            System.out.println("Larger value between first and last element: " + first);
//        } else {
//            System.out.println("Larger value between first and last element: " + last);
//        }
//
//
//        Q4
//
//
//              int arr[] = { 20 , 30 , 40  } ;
//
//              ArrayList<Integer> newArr = new ArrayList() ;
//
//
//              int first = arr[0] ;
//
//
//              arr[0] = arr[arr.length-1];
//
//              arr[arr.length-1] = first;
//
//              for ( int i:arr ) {
//            	  newArr.add(i) ;
//              }
//
//
//              System.out.println("New array after swapping the first and last elements:" + newArr );
//
//
//        Q5
//
//
//        int arr[] = {2, 3, 40, 1, 5, 9, 4, 10, 7};
//        ArrayList<Integer> newArr = new ArrayList();
//
//
//        for (int i : arr) {
//            if (i % 2 != 0) {
//                newArr.add(i);
//            }
//        }
//
//        for (int i : arr) {
//            if (i % 2 == 0) {
//                newArr.add(i);
//            }
//        }
//
//        System.out.println(newArr);
//
//
//        Q6
//
//
//        int arr1[] = {2, 3, 6, 6, 4};
//        int arr2[] = {2, 3, 6, 6, 4};
//
//        boolean equal = true;
//
//        if (arr1.length == arr2.length) {
//
//
//            for (int i = 0; i < arr1.length; i++) {
//
//                if (arr1[i] != arr2[i]) {
//                    equal = false;
//                }
//            }
//        } else {
//            equal = false;
//        }
//
//        System.out.println(equal);
    }
}