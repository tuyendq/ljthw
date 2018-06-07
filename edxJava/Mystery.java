public class Mystery {

      public static int mystery(int x) {
    if (x == 5){
        return x;
    } else {
        return mystery(x--) * 5;
    }
}

    public static void main(String[] args){
        System.out.println(mystery(1));
    }
}