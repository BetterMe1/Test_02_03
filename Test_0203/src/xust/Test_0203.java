package xust;

/*
1. 岛屿的周长
给定一个包含 0 和 1 的二维网格地图，其中 1 表示陆地 0 表示水域。
网格中的格子水平和垂直方向相连（对角线方向不相连）。整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。
岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。计算这个岛屿的周长。

示例 :
输入:
[[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]
输出: 16
解释: 它的周长是下面图片中的 16 个黄色的边：
 */
/*
 * 分析：
 * 岛屿的周长 = 陆地数*4 - 所有陆地的陆陆交界处总和
 */
//public class Test_0203 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		int[][] grid ={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
//		System.out.println(So.islandPerimeter(grid));
//	}
//}
//class Solution {
//    public int islandPerimeter(int[][] grid) {
//    	int Count=0;
//        for(int i=0; i<grid.length; i++){
//        	for(int j=0; j<grid[i].length; j++){
//        		if(grid[i][j] == 1){
//        			Count +=4;//如果是陆地，周长加4
//                    //减去交界的地方
//        			if(j-1>=0 && grid[i][j-1]==1){
//            			Count--;
//            		}
//            		if(i-1>=0 && grid[i-1][j]==1){
//            			Count--;
//            		}
//            		if(j+1<grid[i].length && grid[i][j+1]==1){
//            			Count--;
//            		}
//            		if(i+1<grid.length && grid[i+1][j]==1){
//            			Count--;
//            		}
//        		}
//        	}
//        }
//        return Count;
//    }
//}
/*
2. 岛屿的最大面积
给定一个包含了一些 0 和 1的非空二维数组 grid , 一个 岛屿 是由四个方向 (水平或垂直) 的 1 (代表土地) 构成的组合。你可以假设二维矩阵的四个边缘都被水包围着。
找到给定的二维数组中最大的岛屿面积。(如果没有岛屿，则返回面积为0。)

示例 1:
[[0,0,1,0,0,0,0,1,0,0,0,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,1,1,0,1,0,0,0,0,0,0,0,0],
 [0,1,0,0,1,1,0,0,1,0,1,0,0],
 [0,1,0,0,1,1,0,0,1,1,1,0,0],
 [0,0,0,0,0,0,0,0,0,0,1,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,0,0,0,0,0,0,1,1,0,0,0,0]]
对于上面这个给定矩阵应返回 6。注意答案不应该是11，因为岛屿只能包含水平或垂直的四个方向的‘1’。
示例 2:
[[0,0,0,0,0,0,0,0]]
对于上面这个给定的矩阵, 返回 0。
注意: 给定的矩阵grid 的长度和宽度都不超过 50。
 */
/*
 * 分析：循环遍历数组grid，遇到1，将此点值改为0（防止下面递归时再次遍历到这个点，也防止循环遍历其他点时重复计算），
 * 返回值加1再用递归遍历其上、下、左、右，再遍历访问到的点的上、下、左、右，直到遇到0或访问到边界为止，
 * 计算出此时的岛屿面积，并与max作比较，将大值再次存到max中，循环完毕，返回max。
 * 
 */
//public class Test_0203 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		int[][] grid ={
//		 {0,0,1,0,0,0,0,1,0,0,0,0,0},
//		 {0,0,0,0,0,0,0,1,1,1,0,0,0},
//		 {0,1,1,0,1,0,0,0,0,0,0,0,0},
//		 {0,1,0,0,1,1,0,0,1,0,1,0,0},
//		 {0,1,0,0,1,1,0,0,1,1,1,0,0},
//		 {0,0,0,0,0,0,0,0,0,0,1,0,0},
//		 {0,0,0,0,0,0,0,1,1,1,0,0,0},
//		 {0,0,0,0,0,0,0,1,1,0,0,0,0}};
//		System.out.println(So.maxAreaOfIsland(grid));
//	}
//}
//class Solution {
//    public int maxAreaOfIsland(int[][] grid) {
//        int max=0;
//        for(int i=0; i<grid.length; i++){
//        	for(int j=0; j<grid[i].length; j++){
//        		if(grid[i][j] == 1){
//        			max = Math.max(AreaBaseCurrentPoint(grid,i,j), max);
//        		}
//        	}
//        }
//        return max;
//    }
//    public int AreaBaseCurrentPoint(int[][] grid,int i,int j){
//    	if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] == 0)
//    		return 0;
//    	grid[i][j] = 0;
//    	return 1 + AreaBaseCurrentPoint(grid,i-1,j)+ AreaBaseCurrentPoint(grid,i,j-1)
//    			+ AreaBaseCurrentPoint(grid,i+1,j)+ AreaBaseCurrentPoint(grid,i,j+1);
//    }
//}
/*
3. 岛屿的个数
给定一个由 '1'（陆地）和 '0'（水）组成的的二维网格，计算岛屿的数量。一个岛被水包围，并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。你可以假设网格的四个边均被水包围。

示例 1:
输入:
11110
11010
11000
00000
输出: 1

示例 2:
输入:
11000
11000
00100
00011
输出: 3
 */
/*
 * 分析：
 * 此题与第二题相似，循环遍历数组grid，遇到1，给岛屿数加1，并将此点值改为0，用递归遍历其上、下、左、右，再遍历访问到的点的上、下、左、右，直到遇到0或访问到边界为止，将此岛屿上的'1'都改为'0'，循环完毕返回岛屿数。
 */
public class Test_0203 {
	public static void main(String[] args) {
		Solution So = new Solution();
		char[][] grid ={{'1','1','0','0','0'},
				{'1','1','0','0','0'},
				{'0','0','1','0','0'},
				{'0','0','0','1','1'},
		};
		System.out.println(So.numIslands(grid));
	}
}
class Solution {
	public int numIslands(char[][] grid) {
		int count=0;
		for(int i=0; i<grid.length; i++){
			for(int j=0; j<grid[i].length; j++){
				if(grid[i][j] == '1'){
				   count++;
				   ExtendBaseCurrentPoint(grid,i,j);
				}
			}
		}
		return count;
	}
	private void ExtendBaseCurrentPoint(char[][] grid,int i,int j){
		if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] == '0')
			return;
		grid[i][j] = '0';
		ExtendBaseCurrentPoint(grid,i-1,j);
		ExtendBaseCurrentPoint(grid,i,j-1);
		ExtendBaseCurrentPoint(grid,i+1,j);
		ExtendBaseCurrentPoint(grid,i,j+1);
		
    }
}