public class Graph { //无向图
	
	private int v; //顶点的个数
	private LinkedList<Integer> adj[];//邻接表
	
	public Graph(int v) {
		this.v = v;
		adj = new LinkedList[v];
		
		for(int i = 0; i < v; ++i) {
			
			adj[i] = new LinkedList<>();
		}
	}
	
	/**
	
		添加边
		@param s 顶点
		@param t 顶点
	*/
	public void addEdge(int s, int t) {//无向图一条边存两次
		adj[s].add[t];
		adj[t].add[s];
	}
	
	public void bfs(int s, int t) {
		
		if(s == t) return;
		
		//visited是用来记录已经被访问的顶点，用来避免顶点被重复访问。
		boolean[] visited = new boolean[v];
		visited[s] = true;
		//queue是一个队列，用来存储已经被访问，但相连的顶点还没有被访问的顶点。
		Queue<Integer> queue = new LinkedList<>();
		queue.add(s);
		
		//prev用来记录搜索路径，记录的是上一个顶点
		int[] prev = new int[v];
		for(int i = 0; i < v; ++i) {
			prev[i] = -1;
		}
		
		while(queue.size() != 0) {
			int w = queue.poll();
			
			for(int i = 0; i < adj[w].size(); ++i) {
				
				int q = adj[w].get(i);
				//顶点没有被访问，访问顶点，并作判断是否为t
				if(!visited[q]) {
					prev[q] = w;
					if(q == t) {
						print(prev, s, t);
						return;
					}
					
					visited[q] = true;
					queue.add(q);
				}
			}
		}
	}
	
	//递归打印 s->t的路径
	private void print(int[] prev, int s, int t) {
		
		if(prev[t] != -1 && t != s) {
			print(prev, s, prev[t]);
		}
		
		System.out.print(t + " ");
	}
	
	//标识t是否被发现
	boolean found = false;
	
	public void dfs(int s, int t) {
		
		found = false;
		boolean[] visited = new boolean[v];
		int[] prev = new int[v];
		
		for(int i = 0; i < v; ++i) {
			prev[i] = -1;
		}
		
		recurDfs(s, t, visited, prev);
		print(prev, s, t);
	}
	
	private void recurDfs(int w, int t, boolean[] visited, int[] prev) {
		
		if(found == true) return;
		
		visited[w] = true;
		
		if(w == t) {
			found = true;
			return;
		}
		
		for(int i = 0; i < adj[w].size(); ++i) {
			int q = adj[w].get(i);
			if(!visited[q]) {
				prev[q] = w;
				recurDfs(q, t, visited, prev);
			}
		}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}