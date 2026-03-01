import java.util.Arrays;
import java.util.Scanner;

class MedianOfArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] newNum = new int[n];
        int index = 0;

        for (int i = 0; i < nums1.length; i++) {
            newNum[index++] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            newNum[index++] = nums2[i];
        }

        Arrays.sort(newNum);

        if (n % 2 != 0) {
            return newNum[n / 2];
        } else {
            return (newNum[n / 2] + newNum[(n / 2) - 1]) / 2.0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First array input
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        // Second array input
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        double median = findMedianSortedArrays(nums1, nums2);

        System.out.println("Median is: " + median);

        sc.close();
    }
}