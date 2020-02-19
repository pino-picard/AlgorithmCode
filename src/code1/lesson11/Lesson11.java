package code1.lesson11;

public class Lesson11 {
    public int minArray(int[] numbers) {
        // 因为原数组有序，旋转后找到第一个不符合增序的数，则为原数组的第一个数，时间复杂度O(N)
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] < numbers[i - 1]) {
                return numbers[i];
            }
        }
        return numbers[0];
    }

    public int minArray_b(int[] numbers) {
        //采用二分思想，时间复杂度O(log(N))
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int mid = (int)Math.floor((i + j) / 2);

            if (numbers[mid] > numbers[j]) {    // mid不处于旋转子列中
                i = mid + 1;
            } else if (numbers[mid] < numbers[j]) {     // mid处于旋转子列中
                j = mid;
            } else {    // mid 和最右数字相等，无法判断mid是否处于旋转子列中，此时去掉最右数字，不影响结果
                j = j - 1;
            }
        }
        return numbers[i];
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        Lesson11 l = new Lesson11();
        System.out.println(l.minArray_b(numbers));
    }
}
