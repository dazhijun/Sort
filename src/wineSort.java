import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class wineSort {
    public static void main(String[] args) {
        String shustring="67,2,3,3,4,5,5,6,7,8,8,8,9,10,11,12,12,12,13,13,32,34,56,65";
        String[] shuzus=shustring.split(",");
        List<String> stringList= Arrays.asList(shuzus);
        List<Integer> shuzul=stringList.stream().map(s->Integer.parseInt(s)).collect(Collectors.toList());
        Integer[] shuzu=new Integer[shuzul.size()];
        shuzul.toArray(shuzu);

        sort(shuzu);
        for (int i:shuzu) System.out.print(i+",");
    }
    public static void sort(Integer[] s){

        int size=0;
        int j=s.length;
        for (int i=0;i<j;i++){
            boolean flag=true;
            for (int k=i;k<j-1;k++){
                if (s[k]>s[k+1]){
                    int temp=s[k];
                    s[k]=s[k+1];
                    s[k+1]=temp;
                    flag=false;
                }
            }
            if (flag)
                break;
            size++;
            System.out.println("");
            for (int n=j-i-1;n>i;n--){
                if (s[n]<s[n-1]){
                    int temp=s[n];
                    s[n]=s[n-1];
                    s[n-1]=temp;
                    flag=false;
                }
            }
            if (flag)
                break;
            size++;
        }
        System.out.println("size="+size);
    }

}
