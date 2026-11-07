package algorithms.leetcode.topInterview150;

public class GameOfLife {
    /*
    The board is made up of an m x n grid of cells, where each cell has an initial state:
    live (represented by a 1) or dead (represented by a 0).
    Each cell interacts with its eight neighbors (horizontal, vertical, diagonal)
    using the following four rules (taken from the above Wikipedia article):

    Any live cell with fewer than two live neighbors dies as if caused by under-population.
    Any live cell with two or three live neighbors lives on to the next generation.
    Any live cell with more than three live neighbors dies, as if by over-population.
    Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
    The next state of the board is determined by applying the above rules simultaneously to every cell in the current state of the m x n grid board.
    In this process, births and deaths occur simultaneously.

    Given the current state of the board, update the board to reflect its next state.

    Note that you do not need to return anything.
     */

    public static void main(String[] args) {
        int[][] board = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}};
        gameOfLife(board);
    }

    public static void gameOfLife(int[][] board) {
        int heightOfTheBoard = board.length, widthOfTheBoard = board[0].length;
        int[][] newBoard = new int[heightOfTheBoard][widthOfTheBoard];

        int liveNeighbors = 0, deadNeighbors = 0;
        for (int i = 0; i < heightOfTheBoard; i++) {
            for (int j = 0; j < widthOfTheBoard; j++) {
                if (i == 0 || i == heightOfTheBoard - 1) {
                    if (j == 0 || j == widthOfTheBoard - 1) {

                    }
                }
            }
        }


//        System.out.println(Arrays.deepToString(newBoard));
    }
}
