public class SearchFirst {

	public int bsearch(int[] a, int value, int n) {
		
		int low = 0;
		int high = n-1;
		
		while(low <= high) {
			
			int mid = low + ((high - low) >> 1);
			
			if(a[mid] < value) {
				
				low = mid + 1;
			} else if(a[mid] > value) {
					
					high = mid -1;
			} else {
				
				/*
				因为要找的是第一个值等于给定值的元素，当a[mid]等于要查找的值时，
				就需要确认下这个a[mid]是不是第一个值等于给定值的元素。
				如果mid等于0，那这个元素已经是数组的第一个元素，那它肯定是我们要找的；
				如果mid不等于0，但a[mid]的前一个元素a[mid-1]不等于value，那也说明a[mid]就是我们要找的第一个
				值等于给定值的元素。
				如果发现a[mid]前面的一个元素a[mid-1]也等于value，那说明此时的a[mid]
				肯定不是我们要查找的第一个值等于给定值的元素。那就更新high=mid-1，
				因为要找的元素肯定在[low,mid-1]之间。
				**/
				if(mid == 0 || a[mid-1] != value) {
					
					return mid;
				}else{
					high = mid - 1;
				}
			}
		}
		
		return -1;
	}
}