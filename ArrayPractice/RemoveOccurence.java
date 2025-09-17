package Arrays_Extra_Practice_Problems;

public class RemoveOccurence {
    
    public static int[] removeEle(int[] arr, int ele) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != ele) {
                count++;
            }
        }

        int[] new_arr = new int[count];
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != ele) {
                new_arr[index++] = arr[i];
            }
        }

        return new_arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 6, 5, 6};
        int[] new_arr = removeEle(arr, 5);
        
        System.out.println("Length of Array: " + new_arr.length);

        for(int i = 0; i < new_arr.length; i++) {
            System.out.println(new_arr[i]);
        }
    }
}
