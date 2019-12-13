/**
冒泡排序，插入排序，选择排序
*/
public class Sorts {
	
	/**
		冒泡排序
	*/
	public static void bubblesort(int[] a,int n) {
		
		
		for(int i = 0;i < n;i++) {
			
			//提前退出标志位
			boolean flag = false;
			for(int j=0;j < n-i-1;j++) {
				
				if(a[j] > a[j+1]) {
					
					int tmp = a[j+1];
					a[j+1] = a[j];
					a[j] = tmp;
					
					//表示此次有交换
					flag = true;
				}
			}
			
			if(!flag) {
				
				//没有数据交换，提前退出
				break;
			}
		}
	}
	
	/**
		插入排序：1,5,2
		
		默认数组中第一个值为已经排好序的。
		第一层循环：从未排序的数据中取值，也就是从数组中第二个值开始取值。
		第二层循环：循环已排好序的数据，与从未排序中取的数据value做比较。从排好序的数据末尾开始比较，当value小于排好序的数组中的
		数据时，排好序的数组进行移动：也就是前一个数据给后一个数据：a[j+1]=a[j]；那么结束条件则是，value大于等于排好序的数组中的数据，
		然后这时的下标j+1，则是value要插入的位置
	*/
	public static void insertSort(int[] a, int n) {
		
		for(int i=1; i < n;i++) {
			
			int value = a[i];
			int j = i-1;
			
			for(;j>=0;j--) {
				
				if(a[j] > value) {
					
					a[j+1] = a[j];
				}else{
					break;
				}
			}
			
			a[j+1] = value;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}