import java.util.*;
import java.util.stream.Collectors;

public class quickSort {
    public static void main(String[] args) {
        String shustring="8 7 9 4 3 6 10 13 5 8 3 2 11 13 5 8";
        String[] shuzus=shustring.split(" ");
        List<String> stringList= Arrays.asList(shuzus);
        List<Integer> shuzul=stringList.stream().map(s->Integer.parseInt(s)).collect(Collectors.toList());
        Integer[] shuzu=new Integer[shuzul.size()];
        shuzul.toArray(shuzu);
       //
        // sort(0,shuzu);
        for (int i:shuzu) System.out.print(i+",");
        System.out.println();
        sort(0,shuzu.length-1,shuzu);
        //quick_sort(shuzu,0,shuzu.length-1);
        for (int i:shuzu) System.out.print(i+",");
    }
    public static void sort(int left,int right,Integer[] shuzu) {
        if (left < right) {
            Integer X = shuzu[left];//37489 left=3 right=3
            int l = left;
            int r = right;
            while (left < right) {
                while (left < right && shuzu[right] >= X)
                    right--;
                if (left < right) {
                    shuzu[left++] = shuzu[right];
                }

                while (left < right && shuzu[left] <=X)
                    left++;
                    if (left < right) {
                        shuzu[right--] = shuzu[left];//left=2 right=4
                    }

            }
            shuzu[left] = X;
            sort(l, left - 1, shuzu);
            sort(left + 1, r, shuzu);
        }
    }

    public static void speedSort(Integer[] a, int left, int right){
        if(left<right){
            int temp = a[left];
            int i = left;
            int j = right;
            while (i<j){
                while (i<j && a[i]<=temp)
                    i++;
                while(i<j && a[j]>=temp)
                    j--;
                if(i<j) swap(a,i,j);
            }
            if(a[i]>temp) i--;
            swap(a,i,left);
            speedSort(a,left,i-1);
            speedSort(a,i+1,right);
        }
    }
    public static void swap(Integer[] a,int b,int c){
        int temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }
    //快速排序
    public static void quick_sort(Integer s[], int l, int r)
    {
        if (l < r)
        {
            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
            int i = l, j = r, x = s[l];
            while (i < j)
            {
                while(i < j && s[j] >= x) // 从右向左找第一个小于x的数
                    j--;
                if(i < j)
                    s[i++] = s[j];

                while(i < j && s[i] < x) // 从左向右找第一个大于等于x的数
                    i++;
                if(i < j)
                    s[j--] = s[i];
            }
            s[i] = x;
            quick_sort(s, l, i - 1); // 递归调用
            quick_sort(s, i + 1, r);
        }
    }
}
