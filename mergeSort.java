import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] dataset = {2,3,7,91,0,1,123};
        merge(dataset, 0, dataset.length -1);
        System.out.println(Arrays.toString(dataset));
    }
    
    public static int[] merge(int[] dataset, int left, int right){
        int[] result = new int[dataset.length];
        if (right-left > 1){
            int mid = (left + right)/2;
            int[] sx,dx;
            sx = merge(dataset, left, mid);
            dx = merge(dataset, mid+1, right);
            //FIXME - merge di sx e dx
            int k = 0;
            for (int i = 0; i < sx.length; i++) {
                for (int j = 0; j < dx.length; j++) {
                    if(dx[j] < sx[i]){
                        result[k] = dx[j];
                        k++;
                        break;
                    }else{
                        result[k] = sx[i];
                        k++;
                        break;
                    }
                }
            }
            
        }
        else {
            if(dataset[left] > dataset[right]){
                int tmp = dataset[right];
                dataset[right] = dataset[left];
                dataset[left] = tmp;
            }
            else 
                result = dataset;
        }
        return result;
    }
}
