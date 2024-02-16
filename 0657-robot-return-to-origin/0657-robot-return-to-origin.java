class Solution {
    public boolean judgeCircle(String moves) {
        boolean atOrigin = false;
        int x = 0;
        int y = 0;

        for(int i = 0; i < moves.length(); i++){
            switch(moves.charAt(i)){
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    y--;
                    break;
                case 'R':
                    x++;
                    break;
                default:
                    break;
            }
        }

        if(x == 0 && y == 0)
        {
            atOrigin = true;
        }
        return atOrigin;
    }
}