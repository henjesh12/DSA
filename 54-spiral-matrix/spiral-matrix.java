class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n=matrix[0].length;

        int srow=0,scol=0,erow=m-1,ecol=n-1;
        List<Integer> ans = new ArrayList<>();
        while(srow <=erow && scol<=ecol){
            for(int i=scol;i<=ecol;i++){
                ans.add(matrix[srow][i]);
            }

            for(int i=srow+1;i<=erow;i++){
                ans.add(matrix[i][ecol]);
            }

            for(int i=ecol-1;i>=scol;i--){
                if(srow==erow){
                    break;
                }
                ans.add(matrix[erow][i]);
            }
            for(int i=erow-1;i>=srow+1;i--){
                if(scol==ecol){
                    break;
                }
                ans.add(matrix[i][scol]);
            }
            srow++;scol++;erow--;ecol--;
        }
        return ans;
    }
}