public class BinarySearch{
	
	public static int binarySearch(int[] datas, int key) {
		
		int low = 0;
		int high = datas.size - 1;
		
		while(low <= high) {
			
			//取中间点
			int mid = low + (high - low)/2;
			
			//判断key在哪个区间，或者是否等于中间点
			if(key == datas[mid]) {
				
				return mid;
			}
			
			if(key < datas[mid]) {
				
				high = mid - 1;
			} else {
				
				low = mid + 1;
			}
		}
		return -1;
	}
	
	public static int reBinarySearch(int[] datas, int key) {
		
		int n = datas.size;
		return bsearchInternally(datas, 0, n-1, key);
	}
	
	public static int bsearchInternally(int[] datas, int low, int high, int key) {
		
		if(low > high) {
			return -1;
		}
		
			
		//取中间点
		int mid = low + (high - low)/2;
		
		//判断key在哪个区间，或者是否等于中间点
		if(key == datas[mid]) {
			
			return mid;
		}
		
		if(key < datas[mid]) {
			
			high = mid - 1;
			bsearchInternally(datas, low, high, key);
		} else {
			
			low = mid + 1;
			bsearchInternally(datas, low, high, key);
		}
		
		
	}
}