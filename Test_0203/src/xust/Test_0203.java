package xust;

/*
1. ������ܳ�
����һ������ 0 �� 1 �Ķ�ά�����ͼ������ 1 ��ʾ½�� 0 ��ʾˮ��
�����еĸ���ˮƽ�ʹ�ֱ�����������Խ��߷�������������������ˮ��ȫ��Χ��������ǡ����һ�����죨����˵��һ��������ʾ½�صĸ���������ɵĵ��죩��
������û�С������������� ָˮ���ڵ����ڲ��Ҳ��͵�����Χ��ˮ�������������Ǳ߳�Ϊ 1 �������Ρ�����Ϊ�����Σ��ҿ�Ⱥ͸߶Ⱦ������� 100 ���������������ܳ���

ʾ�� :
����:
[[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]
���: 16
����: �����ܳ�������ͼƬ�е� 16 ����ɫ�ıߣ�
 */
/*
 * ������
 * ������ܳ� = ½����*4 - ����½�ص�½½���紦�ܺ�
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
//        			Count +=4;//�����½�أ��ܳ���4
//                    //��ȥ����ĵط�
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
2. �����������
����һ��������һЩ 0 �� 1�ķǿն�ά���� grid , һ�� ���� �����ĸ����� (ˮƽ��ֱ) �� 1 (��������) ���ɵ���ϡ�����Լ����ά������ĸ���Ե����ˮ��Χ�š�
�ҵ������Ķ�ά���������ĵ��������(���û�е��죬�򷵻����Ϊ0��)

ʾ�� 1:
[[0,0,1,0,0,0,0,1,0,0,0,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,1,1,0,1,0,0,0,0,0,0,0,0],
 [0,1,0,0,1,1,0,0,1,0,1,0,0],
 [0,1,0,0,1,1,0,0,1,1,1,0,0],
 [0,0,0,0,0,0,0,0,0,0,1,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,0,0,0,0,0,0,1,1,0,0,0,0]]
�������������������Ӧ���� 6��ע��𰸲�Ӧ����11����Ϊ����ֻ�ܰ���ˮƽ��ֱ���ĸ�����ġ�1����
ʾ�� 2:
[[0,0,0,0,0,0,0,0]]
����������������ľ���, ���� 0��
ע��: �����ľ���grid �ĳ��ȺͿ�ȶ������� 50��
 */
/*
 * ������ѭ����������grid������1�����˵�ֵ��Ϊ0����ֹ����ݹ�ʱ�ٴα���������㣬Ҳ��ֹѭ������������ʱ�ظ����㣩��
 * ����ֵ��1���õݹ�������ϡ��¡����ң��ٱ������ʵ��ĵ���ϡ��¡����ң�ֱ������0����ʵ��߽�Ϊֹ��
 * �������ʱ�ĵ������������max���Ƚϣ�����ֵ�ٴδ浽max�У�ѭ����ϣ�����max��
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
3. ����ĸ���
����һ���� '1'��½�أ��� '0'��ˮ����ɵĵĶ�ά���񣬼��㵺���������һ������ˮ��Χ����������ͨ��ˮƽ�����ֱ���������ڵ�½�����Ӷ��ɵġ�����Լ���������ĸ��߾���ˮ��Χ��

ʾ�� 1:
����:
11110
11010
11000
00000
���: 1

ʾ�� 2:
����:
11000
11000
00100
00011
���: 3
 */
/*
 * ������
 * ������ڶ������ƣ�ѭ����������grid������1������������1�������˵�ֵ��Ϊ0���õݹ�������ϡ��¡����ң��ٱ������ʵ��ĵ���ϡ��¡����ң�ֱ������0����ʵ��߽�Ϊֹ�����˵����ϵ�'1'����Ϊ'0'��ѭ����Ϸ��ص�������
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