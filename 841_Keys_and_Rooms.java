class Solution {
    
    void dfs(int curr,List<List<Integer>>rooms,ArrayList<Boolean>visited){
        visited.set(curr,true);
        
        for(int i : rooms.get(curr)){
            if(!visited.get(i)){
                dfs(i,rooms,visited);
            }
        }
        
        // for(int i = 0;i<rooms.get(curr).size();i++){
        //     if(!visited.get(rooms.get(curr).get(i))){
        //         dfs(rooms.get(curr).get(i),rooms,visited);
        //     }
        // }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        ArrayList<Boolean> visited = new ArrayList<>();
        for(int i = 0;i<rooms.size();i++){
            visited.add(false);
        }

        dfs(0,rooms,visited);
        for(Boolean b : visited){
            if(!b)return false;
        }

        return true;
        


    }
}
