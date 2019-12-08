public class SearchFirstMore{

	public int bsearch(int[] a, int n, int value) {
		
		int low = 0;
		int high = n-1;
		
		while(low <= high) {
			
			int mid = low + ((high-low) >> 1);
			
			if(a[mid] >= value) {
				
				//���a[mid]���ڵ��ڸ���ֵʱ��Ҫ����a[mid]�ǲ���Ҫ�ҵĵ�һ��ֵ���ڵ��ڸ���ֵ��Ԫ��
				//���a[mid]ǰ���Ѿ�û��Ԫ�أ�����ǰ��һ��Ԫ��С��Ҫ���ҵ�ֵvalue����a[mid]����Ҫ�ҵ�Ԫ��
				//���a[mid-1]Ҳ���ڵ���Ҫ���ҵ�ֵ����Ҫ���ҵ�Ԫ����[low, mid-1]֮�䣬���ԣ���high����Ϊmid-1
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