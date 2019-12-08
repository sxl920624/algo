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
				
				//���a[mid]���Ԫ���Ѿ��������е����һ��Ԫ���ˣ��ǿ϶���Ҫ�ҵ�
				//���a[mid]�ĺ�һ��Ԫ��a[mid+1]������value����Ҳ˵����Ҫ�ҵ�Ԫ��
				//�������a[mid]�����һ��Ԫ��a[mid+1]����value����a[mid]���������һ��ֵ���ڸ���ֵ��Ԫ��
				//�Ǿ͸���low=mid+1,��ΪҪ�ҵ�Ԫ�ؿ϶���[mid+1,high]֮�䡣
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