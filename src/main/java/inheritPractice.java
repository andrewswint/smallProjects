class Arithmetic {
     public int add(int input1, int input2) {
        return input1 + input2;
    }
}



class Adder extends Arithmetic{
    @Override
    public int add(int input1, int input2) {
        return super.add(input1, input2);
    }
}
public class inheritPractice {
    public static void main(String[] args) {

        Adder a = new Adder();
        System.out.println(a.getClass().getSuperclass().getName());
        System.out.println(a.add(10,5));
    }
}
