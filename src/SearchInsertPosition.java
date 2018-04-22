/**
 * Created by Kevin on 2017/2/24.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0)
            return 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target)
                continue;
            else
                return i;
        }
        return nums.length;
    }
}
