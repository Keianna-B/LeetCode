class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }
        int [] nDegree = new int [numCourses]; 
        for(int[] prereq : prerequisites){
            int course = prereq[0];
            int prev = prereq[1];
            adj.get(prev).add(course);
            nDegree[course]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < numCourses; i++){
            if (nDegree[i] == 0){
                q.offer(i);
            }
        }
        int [] courseSchedule = new int [numCourses];
        int courseOrder = 0;
        while(!q.isEmpty()){
            int completedCourse = q.poll();
            courseSchedule[courseOrder] = completedCourse;
            courseOrder++;
            for(int nextCourse: adj.get(completedCourse)){
                if(--nDegree[nextCourse] == 0){
                    q.offer(nextCourse);
                }

            }
        }
        if(courseOrder == numCourses){
            return courseSchedule;
        }
        else{
            return new int[0];
        }
    }
}