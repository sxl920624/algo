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
}