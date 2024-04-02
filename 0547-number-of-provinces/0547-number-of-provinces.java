class Solution {
    public int findCircleNum(int[][] isConnected) {
        int provinces = 0;
        boolean [] visited = new boolean [isConnected.length];
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < isConnected.length; i++){
            if(!visited[i]){
                provinces++;
                visited[i] = true;
                queue.offer(i);
                while (!queue.isEmpty()) {
                    int city = queue.poll();
                    for(int j = 0; j < isConnected.length; j++){
                        if(!visited[j] && isConnected[city][j] == 1)
                        {
                            visited[j] = true;
                            queue.offer(j);
                        }
                    }
                }
            }
        }
        return provinces;
    }

}