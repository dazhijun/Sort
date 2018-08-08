import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class insertSort {
    public static void main(String[] args) {
        String shustring="8 7 9 4 3 6 10 13 5 8 3 2 11 13 5 8 12 56 32 67 12 65 34 12";
        String[] shuzus=shustring.split(" ");
        List<String> stringList= Arrays.asList(shuzus);
        List<Integer> shuzul=stringList.stream().map(s->Integer.parseInt(s)).collect(Collectors.toList());
        List<Integer> shuzul2=stringList.stream().map(s->Integer.parseInt(s)).collect(Collectors.toList());
        Integer[] shuzu=new Integer[shuzul.size()];
        shuzul.toArray(shuzu);
        Integer[] shuzu1=new Integer[shuzul.size()];
        shuzul.toArray(shuzu1);
        for (int i:shuzu) System.out.print(i+",");
        System.out.println();
        long start=System.nanoTime();
        insertionSort(shuzu);
        long end=System.nanoTime();
        System.out.println("用时"+(end-start));
        for (int i:shuzu) System.out.print(i+",");
        System.out.println();
        for (int i:shuzu1) System.out.print(i+",");
        start=System.nanoTime();
        sort(shuzu1);
        end=System.nanoTime();
        System.out.println();
        System.out.println("用时"+(end-start));
        for (int i:shuzu1) System.out.print(i+",");
        System.out.println();

    }
    public static void sort(Integer[] s){
        for (int j=1;j<s.length;j++){
            for (int i=0;i<j;i++){
                if (s[i]>s[j]){
                    swap(s,i,j);
                }
            }
        }
    }
    public static void insertionSort(Integer[] s) {
        int len = s.length;
        int preIndex, current;
        for (int i = 1; i < len; i++) {
            preIndex = i - 1;
            current = s[i];
            while (preIndex >= 0 && s[preIndex] > current) {
                s[preIndex + 1] = s[preIndex];
                preIndex--;
            }
            s[preIndex + 1] = current;
        }
    }
    public static void swap(Integer[] a,int b,int c){
        int temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }
}
