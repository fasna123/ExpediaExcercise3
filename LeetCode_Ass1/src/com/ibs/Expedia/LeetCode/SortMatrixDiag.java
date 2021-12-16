package com.ibs.Expedia.LeetCode;

import java.util.Arrays;

public class SortMatrixDiag {
    public void diagonalSort(int[][] M) {
        int y = M.length, x = M[0].length - 1;
        int[] diag = new int[y];
        for (int i = 2 - y; i < x; i++) {
            int k = 0;
            for (int j = 0; j < y; j++)
                if (i+j >= 0 && i+j <= x)
                    diag[k++] = M[j][i+j];
            Arrays.sort(diag, 0, k);
            k = 0;
            for (int j = 0; j < y; j++)
                if (i+j >= 0 && i+j <= x)
                    M[j][i+j] = diag[k++];
        }
        
        
        for (int i = 0; i < M.length; i++) {
        	System.out.println();
        	 
            // Loop through all elements of current row
            for (int j = 0; j < M[i].length; j++)
                System.out.print(M[i][j] + " ");
        
    }
    }
    
    	
    	public static void main(String[] args) {
    		SortMatrixDiag sol = new SortMatrixDiag();
			int[][] arr = {{3,3,1,1},{2,2,1,2},{1,1,1,2}};
			sol.diagonalSort(arr);
		}

}
