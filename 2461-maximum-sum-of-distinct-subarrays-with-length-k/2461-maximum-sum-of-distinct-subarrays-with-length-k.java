class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
		int i = 0, j = 0;
		long sum = 0;
		long maxSum = 0;
		
		while (j < arr.length) {
			if (!set.contains(arr[j])) {               // no duplicate element in window
                set.add(arr[j]);                       // add it to set
                sum += arr[j];                         // add to local sum
                if (j-i+1 == k) {                      // if window length == K
					maxSum = Math.max(maxSum, sum);                // take the max sum
					sum -= arr[i];                                 // remove calculation of arr[i]
					set.remove(arr[i]);                            // remove arr[i] from set
					i++;                                           // shift the window to the right 
				}
			}
			else {                                                 // duplicate element encountered in window, reset everything
				i = j;                                             // start window from j
				sum = arr[i];                                      // add first element to window
				set = new HashSet<>();                             // create a new set or clear the previous one
				set.add(arr[j]);                                   // add current element to set
			}
			j++;                                                   // expand the window
		}
		
		return maxSum;
    }
}