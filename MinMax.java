public class MinMax {
    int minVal(int[] arr) {
        int min = Integer.MAX_VALUE;
        int rmv=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                continue;
            }
            if (arr[i] < min) {
                min = arr[i];
                rmv=i;

                // System.out.println("djfh:"+min);
               
            }
        }
        arr[rmv] = -1;

        return min;
    }

    int maxVal(int[] arr) {
        int max = Integer.MIN_VALUE;
        int rmv=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                continue;
            }
            if (arr[i] > max) {
                max = arr[i];
                rmv=i;
            }
        }
        arr[rmv] = -1;

        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 8, 2, 4, 2, 3, 1, 1, 3, 1, 2, 1, 3, 3, 1 };

        MinMax obj = new MinMax();
        for (int i = 0; i < (arr.length / 2); i++) {
            System.out.print(obj.minVal(arr));
            System.out.print(+obj.maxVal(arr));
            
        }
    }
    
}

// if(obj.minVal(arr)>0)
// {
// System.out.print("min:"+obj.minVal(arr));
// }
// if(obj.maxVal(arr)<0)
// {
// System.out.print("max:"+obj.maxVal(arr));
// }