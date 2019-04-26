/**
 * created by Zheng Jiateng on 2019/4/12.
 */
package sort;

/**
 * 归并排序
 */
public class Merge {

    private static int[] aux;

    public static void sort(int[] a) {
        int n = a.length;
        aux = new int[n];
        sort(a, 0, n - 1);
    }

    private static void sort(int[] a, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int mid = (lo + hi) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    private static void merge(int[] a, int lo, int mid, int hi) {

    }
}
