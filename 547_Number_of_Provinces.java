class Solution {

    void dfs(int city,int[][] isConnected,boolean[] visited){

        int n = isConnected.length;
        visited[city] = true;

        for(int i = 0;i<n;i++){
            if(isConnected[city][i] == 1 && !visited[i]){
                dfs(i,isConnected,visited);
            }
        }

    }
    
    public int findCircleNum(int[][] isConnected) {
        
        int n = isConnected.length;
        boolean[] visited = new boolean[n];

        int provinces = 0;

        for(int i = 0;i<n;i++){
                if(!visited[i]){
                    provinces++;
                    dfs(i,isConnected,visited);
                }
        }

        return provinces;


    }
}
