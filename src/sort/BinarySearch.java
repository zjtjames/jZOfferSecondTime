/**
 * created by Zheng Jiateng on 2019/4/12.
 */
package sort;

/**
 * 二分查找
 */
public class BinarySearch {
    public static int search(int[] a, int key) {
        return search(a, key, 0, a.length - 1);
    }

    private static int search(int[] a, int key, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }
        int mid = (lo + hi) / 2;
        if (key < a[mid]) {
            return search(a, key, lo, mid - 1);
        } else if (key > a[mid]) {
            return search(a, key, mid + 1, hi);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(search(a,5));
    }
}
