package cn.zcw.demo;

/**
 * @ClassName AlgorithmRanking
 * @Description TODO
 * @Author zcw
 * @Date 2020/4/13 上午10:18
 **/
public class AlgorithmRankingUtil {
    /**
     *Bubble Sort
     * @param arr
     * @return
     */
    public int[] bubbleSort(int[] arr){
//        排序次数
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

    /**
     * insertSort
     * @param arr
     * @return
     */
    public  int[] insertSort(int[] arr)
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

}
