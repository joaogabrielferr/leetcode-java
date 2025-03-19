class Solution {
    public int equalPairs(int[][] grid) {
        
        HashMap<String,Integer>h = new HashMap<String,Integer>();

        int n = grid.length;

        for(int i = 0;i<n;i++){
            String s = "";
            for(int j = 0;j<n;j++){
                s += Integer.toString(grid[i][j]) + ".";
            }
            h.put(s,h.getOrDefault(s,0) + 1);
        }

        int answer = 0;

        for(int i = 0;i<n;i++){
            String s = "";
            for(int j = 0;j<n;j++){
                s+= Integer.toString(grid[j][i]) + ".";
            }

            if(h.containsKey(s)){
                answer += h.get(s);
            }
        }

        return answer;



    }
}
