import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.stream.Collectors;

public class selectSort {
    public static void main(String[] args) {
        String shustring="8 7 9 4 3 6 10 13 5 8 3 2 11 13 5 8 12 56 32 67 12 65 34 12";
        String[] shuzus=shustring.split(" ");
        List<String> stringList= Arrays.asList(shuzus);
        List<Integer> shuzul=stringList.stream().map(s->Integer.parseInt(s)).collect(Collectors.toList());
        Integer[] shuzu=new Integer[shuzul.size()];
        shuzul.toArray(shuzu);

        sort(shuzu);
        for (int i:shuzu) System.out.print(i+",");

    }
    public static void sort(Integer[] s){
        for (int i=0;i<s.length;i++){
            int flag=i;
            for (int j=i+1;j<s.length;j++){
                if (s[j]<s[flag]){
                    flag=j;
                }
            }
            swap(s,i,flag);
        }
    }
    public static void swap(Integer[] s,int a,int b){
        int temp=s[a];
        s[a]=s[b];
        s[b]=temp;
    }
}
