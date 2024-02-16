class Solution {
    public boolean judgeCircle(String moves) {
        boolean atOrigin = false;
        int rCount = 0;
        int lCount = 0;
        int uCount = 0;
        int dCount = 0;
        char move;

        for(int i = 0; i < moves.length(); i++){
            move = moves.charAt(i);
            switch(move){
                case 'U':
                    uCount++;
                    break;
                case 'D':
                    dCount++;
                    break;
                case 'L':
                    lCount++;
                    break;
                case 'R':
                    rCount++;
                    break;
                default:
                    break;
            }
        }

        if(rCount == lCount && uCount == dCount)
        {
            atOrigin = true;
        }
        return atOrigin;
    }
}