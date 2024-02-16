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
            switch(move):
            {
                case 'U':
                    uCount++;
                    break;
                case 'U':
                    uCount++;
                    break;
            }
           if(move == 'U')
           {
               uCount++;
           }
           else if (move == 'D')
           {
               dCount++;
           }
           else if (move == 'R')
           {
               rCount++;
           }           
           else if (move == 'L')
           {
               lCount++;
           }    
        }
        if(rCount == lCount && uCount == dCount)
        {
            atOrigin = true;
        }
        return atOrigin;
    }
}