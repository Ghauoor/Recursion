package Backtracking;

import java.util.ArrayList;

class MatrixPath {
    public static void main(String[] args) {
        System.out.println(count(3, 6));
        path("", 3, 3);
        System.out.println(pathReturn("", 3, 3));
        System.out.println(pathReturnDiagonal("", 3, 3));

    }

    static int count(int r, int c) {

        if (r == 1 || c == 1)
            return 1;

        int left = count(r - 1, c);
        int right = count(r, c - 1);

        return left + right;
    }

    // Matrix Path

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            path(p + 'D', r - 1, c);
        }

        if (c > 1) {
            path(p + 'R', r, c - 1);
        }
    }

    // Path return
    static ArrayList<String> pathReturn(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (r > 1) {
            ans.addAll(pathReturn(p + 'D', r - 1, c));
        }
        if (c > 1) {
            ans.addAll(pathReturn(p + 'R', r, c - 1));
        }
        return ans;
    }

    // Path Return Diagonal

    static ArrayList<String> pathReturnDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        // V --> Vertical, H --> Horizontal, D --> Diagonal

        if (r > 1 && c > 1) {
            ans.addAll(pathReturnDiagonal(p + 'D', r - 1, c - 1));
        }

        if (r > 1) {
            ans.addAll(pathReturnDiagonal(p + 'V', r - 1, c));
        }
        if (c > 1) {
            ans.addAll(pathReturnDiagonal(p + 'H', r, c - 1));
        }
        return ans;
    }


}
