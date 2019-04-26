/**
 * created by Zheng Jiateng on 2019/4/12.
 */
package sort;

/**
 * 快速排序 ：
 */
public class Quick {

    public static void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void sort(int[] a, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    // 每次排定一个元素
    // 一般先选择a[lo]作为切分元素，即那个将会被排定的元素
    private static int partition(int[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        int v = a[lo];
        while (true) {
            while (a[++i] < v) { // 直到找到一个比v大的
                if (i == hi) {
                    break;
                }
            }
            while (a[--j] > v) { // 直到找到一个比v小的
                if (j == lo) {
                    break;
                }
            }
            if (j <= i) {  // 这句很重要 别忘了
                break;
            }
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
        int tmp = a[lo];
        a[lo] = a[j];
        a[j] = tmp;
        return j;
    }

    public static void main(String[] args) {
        int[] a = {5, 6, 7, 8, 1, 2, 3, 4};
        sort(a);
        for (int num : a) {
            System.out.println(num);
        }
    }
}
