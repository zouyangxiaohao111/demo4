package cn.zcw.demo;

/**
 * @ClassName Test
 * @Description maopao paixu
 * @Author zcw
 * @Date 2020/4/13 上午9:37
 **/
public class Test {

    public static void main(String[] args) {
        Test test =new Test();
        int [] demo = new int[]{5,10,6,79,1,16,16,12};
//        int[] solr = test.solr(demo);
//        for (int i : solr) {
//            System.out.println(i);
//        }
        int[] ints = test.InsertSort(demo);
        for (int anInt : ints) {
            System.out.println(anInt);
        }


    }
    public  int[] InsertSort(int[] arr)
    {
        int i, j;
        int n = arr.length;
        int target;

        //假定第一个元素被放到了正确的位置上
        //这样，仅需遍历1 - n-1
        for (i = 1; i < n; i++)
        {
            j = i;
            target = arr[i];

            while (j > 0 && target < arr[j -1])
            {
                arr[j] = arr[j - 1];
                j--;
            }

            arr[j] = target;
        }
        return arr;
    }

    public int[] solr(int[] arr){
//        tang shu
        for (int i =0;i<arr.length-1;i++){
            for (int j = 0 ;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int t =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        return arr;
    }
}
