class Solution {
    public int maxArea(int[] heights) {
        Scanner sc= new Scanner(System.in);
        int n=heights.length;
        int left=0;
        int right=n-1;
        int maxwater=0;
        while (left<right){
            int width= right-left;
            int height= Math.min(heights[left],heights[right]);
            int water= width*height;
            maxwater=Math.max(maxwater, water);
             if(heights[left]<heights[right]){
            left++;
        }
        else{
            right--;
        }
        }
       
        return maxwater;

        }
        


    }

