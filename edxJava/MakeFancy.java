public class MakeFancy {

    public static String makeFancy(String s) {
    if (s.length() == 0) {
        return "*";
    }
    return "*" + s.substring(0,1) + makeFancy(s.substring(0, s.length()-1));
}

    public static void main(String[] args){
        System.out.println(makeFancy("JAVA"));
    }
}