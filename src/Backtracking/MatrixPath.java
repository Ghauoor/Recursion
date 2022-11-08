package Backtracking;

 class MatrixPath {
     public static void main(String[] args) {
         System.out.println(count(3,6));
         path("", 3,3);
     }
   static int count (int r, int c){

        if (r == 1 || c == 1)
            return 1;

        int left = count(r-1, c);
        int right = count(r,c-1);

        return left + right;
    }

    // Matrix Path

     static void path(String p, int r, int c){
         if (r == 1 && c == 1){
             System.out.println(p);
             return;
         }

         if (r > 1){
             path(p + 'D', r-1, c);
         }

         if (c > 1){
             path(p + 'R', r, c - 1);
         }
     }
}
