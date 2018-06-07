public class Puzzle {
    public static int puzzle(int i, int j) {
    if (i == j) {
        return 0;
    } else {
        return 1 + puzzle(i-2,j-1);
    }
    }

      public static int someCode(int a, int b, int c){
    if((a<b) && (b<c)) {
        return a;
    }
    if((a>=b) && (b>=c)) {
        return b;
    }
    if((a==b) || (a==c) || (b==c)) {
        return c;
    }
}    

    public static void main(String[] args){
        System.out.println(puzzle(22,11));        
    }
}