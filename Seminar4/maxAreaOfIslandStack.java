// Вам будет предоставлена m x n двоичная матрица grid. Остров - это группа 1 "s" (представляющих сушу), 
// соединенных в 4 направлениях (горизонтальном или вертикальном).) Можно предположить, что все четыре края сетки окружены водой.
// Площадь острова - это количество ячеек со значением 1на острове.
// Возвращает максимальную площадь острова вgrid . Если острова нет, вернитесь 0.
// Пример 1:
// Ввод: сетка = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],
// [0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],
// [0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
// Выход: 6
// Объяснение: Ответ не 11, потому что остров должен быть соединен в 4 направлениях.

package Seminar4;

import java.util.*;

public class maxAreaOfIslandStack {
    int[][] STEPS = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, dfs(i, j, grid));
                }
            }
        }
        return max;
    }

    public int dfs(int i, int j, int[][] grid) {

        int count = 0;
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[] { i, j });
        grid[i][j] = 0;
        while (!stack.isEmpty()) {
            int[] cur = stack.pop();
            int curI = cur[0];
            int curJ = cur[1];

            count++;

            for (int[] step : STEPS) {
                int newI = curI + step[0];
                int newJ = curJ + step[1];
                if (newI >= 0 && newI < grid.length && newJ >= 0 && newJ < grid[0].length && grid[newI][newJ] == 1) {
                    grid[newI][newJ] = 0;
                    stack.push(new int[] { newI, newJ });
                }
            }

        }
        return count;
    }
}
