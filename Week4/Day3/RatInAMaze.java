package Week4.Day3;

public class RatInAMaze {
    static int sol[][] = new int[100][100];
    static int shortestPath[][] = new int[100][100];
    static int minPathLength = Integer.MAX_VALUE;
    static int currentPathLength = 0;

    static void display(int[][] matrix, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void copySolutionToShortestPath(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                shortestPath[i][j] = sol[i][j];
            }
        }
    }

    static boolean RIAM(char[][] maze, int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) { // reached
            sol[i][j] = 1;
            currentPathLength++;
            
            if (currentPathLength < minPathLength) {
                minPathLength = currentPathLength;
                copySolutionToShortestPath(n, m);
            }
            
            currentPathLength--;
            sol[i][j] = 0; // backtracking
            return false;
        }

        // Check if the current cell is valid
        if (i >= 0 && i < n && j >= 0 && j < m && maze[i][j] != 'X' && sol[i][j] == 0) {
            sol[i][j] = 1; // mark as part of the path
            currentPathLength++;

            // Explore all four directions
            RIAM(maze, i, j + 1, n, m); // right
            RIAM(maze, i + 1, j, n, m); // down
            RIAM(maze, i, j - 1, n, m); // left
            RIAM(maze, i - 1, j, n, m); // up

            // backtracking
            sol[i][j] = 0;
            currentPathLength--;
        }

        return false;
    }

    public static void main(String[] args) {
        char[][] maze = {
            {'0', '0', '0', '0', '0'},
            {'0', 'X', 'X', 'X', '0'},
            {'0', 'X', '0', '0', '0'},
            {'0', 'X', '0', 'X', 'X'},
            {'0', 'X', '0', '0', '0'}
        };

        // Start from (0, 0) instead of (1, 1) to match the maze layout.
        RIAM(maze, 0, 0, 5, 5);
        display(shortestPath, 5, 5);
    }
}
