package org.ks.algorithm;

/**
 * Created by Kevin on 2017/2/13.
 */
public class TwoSumInputArrayIsSorted {
    public static int[] twoSum(int[] numbers, int target) {
        if (numbers.length <= 1)
            return new int[0];

        int index1 = 0;
        int index2 = 1;
        if (numbers[index1] + numbers[index2] > target)
            return new int[0];

        boolean breakloop = false;

        for (index1 = 0; index1 < numbers.length; index1++) {
            for (index2 = index1 + 1; index2 < numbers.length; index2++) {
                if (numbers[index1] + numbers[index2] < target)
                    continue;
                else if (numbers[index1] + numbers[index2] == target) {
                    breakloop = true;
                    break;
                } else
                    break;
            }
            if (breakloop == true)
                break;
        }

        return new int[]{index1 + 1, index2 + 1};
    }

    public static int[] __twoSum(int[] numbers, int target) {
        if (numbers.length <= 1)
            return new int[0];

        int index1 = 0;
        int index2 = numbers.length - 1;
        while (index1 < index2) {
            if (numbers[index1] + numbers[index2] > target)
                index2--;
            else if (numbers[index1] + numbers[index2] == target)
                return new int[]{index1 + 1, index2 + 1};
            else
                index1++;
        }
        return new int[]{};
    }

    public static int[] _twoSum(int[] numbers, int target) {
        if (numbers.length <= 1)
            return new int[0];

        int index1 = 0;
        int index2 = 1;
        if (numbers[index1] + numbers[index2] > target)
            return new int[0];

        for (int i = 0; i < numbers.length; i++) {
            int index = binarySearch(numbers, 0, numbers.length - 1, target - numbers[i]);
            if (i != index && index != -1) {
                if ( i < index)
                    return new int[]{i + 1, index + 1};
                else
                    return new int[]{index + 1, i + 1};
            }
        }

        return new int[]{index1 + 1, index2 + 1};
    }

    public static int binarySearch(int[] nums, int low, int high, int target){
        while (low < high) {
            int mid = low + high / 2;
            if (target < nums[mid])
                high = mid - 1;
            else if (nums[mid] == target)
                return mid;
            else
                low = mid + 1;
        }
        if (low == high && target == nums[low])
            return low;
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 4};
        int[] res = _twoSum(nums, 6);
        System.out.println(res);
        return;
    }
}
