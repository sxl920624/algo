public class SearchLastLess{
	
	public int bsearch(int[] a, int n, int value) {
		
		int low = 0;
		int high = n-1;
		
		while(low <= high) {
			
			int mid = low + ((high - low) >> 1);
			
			if(a[mid] <= value) {
				
				if(mid == n-1 || a[mid+1] > value) {
					
					return mid;
				}
				
				low = mid + 1;
			} else {
				
				high = mid - 1;
			}
		}
	}
}