package practice;

class TypeCasting {

    public void vararg(int... something) {
        System.out.print(something.length);
    }

    public static void main(String[] args) {
        int a;
        int b = 10, c = 15;
        a = b > c ? 5 : 6;
        System.out.print(a);

    }
}
