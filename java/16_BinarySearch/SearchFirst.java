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
				��ΪҪ�ҵ��ǵ�һ��ֵ���ڸ���ֵ��Ԫ�أ���a[mid]����Ҫ���ҵ�ֵʱ��
				����Ҫȷ�������a[mid]�ǲ��ǵ�һ��ֵ���ڸ���ֵ��Ԫ�ء�
				���mid����0�������Ԫ���Ѿ�������ĵ�һ��Ԫ�أ������϶�������Ҫ�ҵģ�
				���mid������0����a[mid]��ǰһ��Ԫ��a[mid-1]������value����Ҳ˵��a[mid]��������Ҫ�ҵĵ�һ��
				ֵ���ڸ���ֵ��Ԫ�ء�
				�������a[mid]ǰ���һ��Ԫ��a[mid-1]Ҳ����value����˵����ʱ��a[mid]
				�϶���������Ҫ���ҵĵ�һ��ֵ���ڸ���ֵ��Ԫ�ء��Ǿ͸���high=mid-1��
				��ΪҪ�ҵ�Ԫ�ؿ϶���[low,mid-1]֮�䡣
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