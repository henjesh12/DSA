class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int m = n*n;
        List list = new ArrayList<>();
        int sum =0;
        int arr[]=new int[2];
          for(int i=0;i<n;i++){
              for(int j=0;j<n;j++){
                sum = sum+grid[i][j];
                 if(list.contains(grid[i][j])){
                    arr[0]= grid[i][j];
                 } else {
                    list.add(grid[i][j]);
                 }
              }
          }
       int expectedSum = m * (m + 1) / 2;
        arr[1] = expectedSum - sum + arr[0]; // missing

          return arr;
    }
}