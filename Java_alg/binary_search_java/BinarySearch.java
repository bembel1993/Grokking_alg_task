package Java_alg.binary_search_java;

public class BinarySearch 
{
    public static void main (String args[])
    {
        int[] arr = {1, 3, 5, 7, 9};

        BinarySearchFunction binarySearchFunction = new BinarySearchFunction();
        System.out.println(binarySearchFunction.binary_search(arr, 3));
        System.out.println(binarySearchFunction.binary_search(arr, -1));
    }
}

class BinarySearchFunction 
{
    public int binary_search (int[] arr, int item) 
    {
        int low = 0;
        int high = arr.length - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2;
            int guess = arr[mid];

            if (guess == item)
            {
                return mid;
            } else if(guess > item){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    } 
}
