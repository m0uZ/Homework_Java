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

package Seminar2;

public class maxAreaOfIsland {
    public static void main(String[] args) {
        int max = 0;
        int[][] grid = { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                { 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
                { 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, dfs(i, j, grid));
                }
            }
        }
        System.out.println(max);
    }

    public static int dfs(int i, int j, int[][] grid) {

        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != 1) {
            return 0;
        }
        int res = 1;
        grid[i][j] = 0;
        res += dfs(i - 1, j, grid);
        res += dfs(i + 1, j, grid);
        res += dfs(i, j - 1, grid);
        res += dfs(i, j + 1, grid);
        return res;
    }

}
