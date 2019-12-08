public class SearchLast{
	
	public int bsearch(int[] a, int n, int value) {
		
		int low = 0;
		int high = n-1;
		
		while(low <= high) {
			
			int mid = low + ((high - low) >> 1);
			
			if(a[mid] > value) {
				
				high = mid - 1;
			} else if(a[mid] < value) {
				low = mid + 1;
			} else {
				
				//如果a[mid]这个元素已经是数组中的最后一个元素了，那肯定是要找的
				//如果a[mid]的后一个元素a[mid+1]不等于value，那也说明是要找的元素
				//如果发现a[mid]后面的一个元素a[mid+1]等于value，那a[mid]并不是最后一个值等于给定值的元素
				//那就更新low=mid+1,因为要找的元素肯定在[mid+1,high]之间。
				if(mid == n-1 || a[mid+1] != value) {
					
					return mid;
				} else {
					low = mid + 1;
				}
			}
		}
		return -1;
	}
}