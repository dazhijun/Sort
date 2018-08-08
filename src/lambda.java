import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class lambda {
    public static void main(String[] args) {
        String shuzustr="8 7 6 1 1 2 3 13 15";
        String[] shuzus=shuzustr.split(" ");
        List<String> ss=Arrays.asList(shuzus);


        Function<String,Integer> lk=(String x) -> Integer.parseInt(x);
        List<Integer> llll=ss.stream().map(s -> lk.apply(s)).distinct().sorted().collect(Collectors.toList());
        System.out.println(llll);

        FileFilter java = (File f) -> f.getName().endsWith("*.java");
        File k=new File("sm*.java");

        boolean a=java.accept(k);
        System.out.println(a);


        int xx=lk.apply("12");
        System.out.println(xx);

        Random random = new Random();
        List<Integer> ka=random.ints(5,1,20).boxed().map(s->s+10).limit(3).collect(Collectors.toList());
        System.out.println(ka);
    }
}
