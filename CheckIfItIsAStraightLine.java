class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length<=2){
            return true;
        }
        int a=coordinates[0][0];
        int b=coordinates[0][1];
        int c=coordinates[1][0];
        int d=coordinates[1][1];

        for(int i=2;i<coordinates.length;i++){
            int e=coordinates[i][0];
            int f=coordinates[i][1];
            if((d-b)*(e-a)!=(f-b)*(c-a)){
                return false;
            }
        }
        return true;
    }
}
