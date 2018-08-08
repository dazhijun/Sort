public class Main {
    public static void main(String args[]){
        Main test = new Main();
        System.out.print(test.action(e->e*2));
    }
    public double action(T t){
        return t.m(5.5);
    }
}
interface T{
    public double m(double d);
}