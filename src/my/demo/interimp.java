package my.demo;

public class interimp implements interface1, interface2{
    @Override
    public void show() {
        System.out.println(num);
    }

    @Override
    public void print() {
        System.out.println("print");
        inner in = new inner();
        System.out.println(in.num3);
    }

    public class inner{
        public int num3 = 100;
    }
}
