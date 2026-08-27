class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] ind = new int[numCourses];
        for(int i = 0 ; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] i : prerequisites){
            int a = i[0];
            int b = i[1];
            adj.get(b).add(a);
            ind[a]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i <numCourses; i++ ){
            if(ind[i] == 0){
                q.offer(i);
            }
        }
        int[] res = new int[numCourses];
        int c = 0;
        while(!q.isEmpty()){
            int u = q.poll();
            res[c++] = u;
            for(int v : adj.get(u)){
                ind[v]--;
                if(ind[v] == 0){
                    
                    q.offer(v);
                }

            }
        }
        if(c == numCourses){
            return res;
        }
        return new int[0];
        
    }
    
}
