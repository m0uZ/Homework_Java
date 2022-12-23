// Учитывая строку path, которая является абсолютным путем (начинающимся с косой '/'черты) к файлу или каталогу в файловой системе в стиле Unix, 
// преобразуйте ее в упрощенный канонический путь.
// В файловой системе в стиле Unix точка '.' относится к текущему каталогу, двойная точка '..' относится к каталогу на уровень выше, 
// и любые несколько последовательных косых черт (т.е. '//') обрабатываются как одна косая '/'черта. 
// Для решения этой проблемы любой другой формат периодов, например, '...'обрабатывается как имена файлов / каталогов.
// Канонический путь должен иметь следующий формат:
// Путь начинается с одной косой '/' черты .
// Любые два каталога разделяются одной косой '/' чертой .
// Путь не заканчивается конечной '/' точкой .
// Путь содержит только каталоги на пути от корневого каталога до целевого файла или каталога (т. Е. без точки '.'или двойного периода'..').
// Верните упрощенный канонический путь.
// Input: path = "/home//foo/"
// Output: "/home/foo"
// Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.

package Seminar4;

import java.util.Deque;
import java.util.LinkedList;

public class simplifyPath {
    
    public String simplifyPath(String path) {
        
        Deque<String> deq = new LinkedList<>();
        String[] tokens = path.split("/");
        for (var token : tokens) {
            if ("..".equals(token)) {
                if (!deq.isEmpty()) {
                    deq.pollLast();
                }
            } else if (!"".equals(token) && !".".equals(token)) {
                deq.addLast(token);
            }
        }
        if (deq.isEmpty()) {
            return "/";
        }
        StringBuilder ans = new StringBuilder();
        while (!deq.isEmpty()) {
            ans.append("/").append(deq.pollFirst());
        }
        return ans.toString();

    }
}
