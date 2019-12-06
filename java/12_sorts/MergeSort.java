public class MergeSort {

	public static void mergeSort(int[] a) {
		//归并排序
		
		mergeSortInternally(a, 0, a.size -1);
	}
	
	//递归调用
	public static void mergeSortInternally(int[] a,int p,int r) {
		
		//递归结束条件
		if(p > r) {
			return;
		}
		
		//取中间点
		int q = p + (r-p)/2;
		
		mergeSortInternally(a, p, q);
		mergeSortInternally(a, q+1, r);
		
		//合并
		merge(a, p, q, r);
	}
	
	public static void merge(int[] a,int p,int q,int r) {
		
		int i=p;
		int j=q+1;
		int k=0;
		
		//临时数组，存储合并数据
		int[] tmp = new int[r-p+1];
		
		while(i<=q && j<=r) {
			if(a[i]<=a[j]) {
				tmp[k++] = a[i++];
			}else{
				tmp[k++] = a[j++];
			}
		}
		
		//判断哪个区间还有数据，然后全部添加到临时数组中
		int start = i;
		int end = q;
		
		if(j <= r) {
			start = j;
			end = r;
		}
		
		while(start <= end) {
			
			tmp[k++] = a[start++];
		}
		
		//将数据拷贝回a[p...r]
		for(i = 0;i <= r-p;i++) {
			
			a[p+i] = tmp[i];
		}
		
		
		
		
		
		
		
		
	}
}