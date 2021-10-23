import org.junit.Test;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/28   20:43
 * Description:
 */
public class test {
    public int sumOddLengthSubarrays(int[] arr) {
        int len = arr.length;
        int sum = 0;
        for (int size = 1; size <= len; size += 2) {
            for (int j = 0; j <= len -size ; j++) {
                for (int index = 0; index < size; index++) {
                    sum += arr[index + j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {

    }
}
