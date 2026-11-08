class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        Arrays.sort(numbers);
        int left=0;
        int right=numbers.length-1;

        while (left < right) {
            int currentSum = numbers[left] + numbers[right];
            
            if (currentSum == target) {
                // Return the two values as an array
                return new int[] { left + 1, right + 1 };
            } else if (currentSum < target) {
                left++;  // Sum is too small, move left pointer right to increase sum
            } else {
                right--; // Sum is too large, move right pointer left to decrease sum
            }
        }
        
        // Return an empty array if no solution is found
        return new int[] {};
    }
}
