

import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author Admin
 */

public class compareSpeed {
public static final int SELECTION =1, INSERTION=2, BUBBLE=3;
    public static void swap (int a[], int i, int j) {
        int t = a[j];
        a[i] = a[j];
        a[j] = t;
    }
    
    public static int getMinIndex (int a[], int first, int last) {
        int min = first;
        for (int i = first+1; i<=last; i++)
            if (a[min]>a[i]) min=i;
        return min;
    }
    
    public static void selectionSort (int a[], int n) {
        int min;
        for (int i=0; i<n-1; i++) {
            min = getMinIndex(a,i,n-1);
            swap(a, min, i);
        }
    }
    
    public static void insertionSort( int a[], int n) {
        int i,j, tmp;
        for (i=1; i<n; i++) {
            tmp = a[i];
            j = i-1;
            while (j>=0 && a[j]>tmp) {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]= tmp;
        }
    }
    
    public static void bubbleSort (int a[], int n) {
        int i,j;
        for (i=0; i<n-1; i++)
            for (j=n-1; j>i; j--)
                if (a[j]<a[j-1]) swap(a,j,j-1);
    }
    
    public static void genArray (int a[], int n) {
        Random ran = new Random(System.currentTimeMillis());
        for (int i=0; i<n; i++) a[i] = ran.nextInt(1000);
    }
    
    public static void print (int a[], int n) {
        for (int i=0; i<n; i++) {
            System.out.format("%3d",a[i]);
            if ((i>0 && (i+1)%30==0)) System.out.println();
        }
        System.out.println();
    }
    
    public static long measure (int a[], int n, int method) {
        long t1 = System.currentTimeMillis();
        long t2;
        switch (method) {
            case SELECTION: compareSpeed.selectionSort(a, n);
            case INSERTION: compareSpeed.insertionSort(a, n);
            case BUBBLE: compareSpeed.bubbleSort(a, n);
        }
        t2 = System.currentTimeMillis();
        return t2-t1;
    }
    
    public static void main (String[] args) {
    int n = 0;
        int ar[] = new int [n];
        genArray(ar,n);
        long t;
        int a[] = Arrays.copyOf(ar, n);
        t = measure(a,n,SELECTION);
        System.out.println("Time of selection sort: "+t);
        a = Arrays.copyOf(ar, n);
        t = measure(a,n,INSERTION);
        System.out.println("Time of insertion sort: "+t);
        a = Arrays.copyOf(ar, n);
        t = measure(a,n,BUBBLE);
        System.out.println("Time of bubble sort: "+t);
        System.out.println("Array after sorting: ");
        print(a,n);
    }
}
