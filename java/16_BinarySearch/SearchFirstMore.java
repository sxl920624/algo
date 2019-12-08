public class SearchFirstMore{

	public int bsearch(int[] a, int n, int value) {
		
		int low = 0;
		int high = n-1;
		
		while(low <= high) {
			
			int mid = low + ((high-low) >> 1);
			
			if(a[mid] >= value) {
				
				//如果a[mid]大于等于给定值时，要看下a[mid]是不是要找的第一个值大于等于给定值的元素
				//如果a[mid]前面已经没有元素，或者前面一个元素小于要查找的值value，那a[mid]就是要找的元素
				//如果a[mid-1]也大于等于要查找的值，那要查找的元素在[low, mid-1]之间，所以，将high更新为mid-1
				if(mid == 0 || a[mid-1] < value) {
					return mid;
				}
				
				high = mid - 1;
			} else {
				
				low = mid + 1;
			}
		}
		
		return -1;
	}
}