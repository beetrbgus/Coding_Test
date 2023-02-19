package Algorithm.Divide_And_Conquer;

/**
 * 이분검색 예제
 */
public class BinarySearch {

    public static int recursion(int[] arr, int findNumber, int low, int high) {
        if(low > high) return -1;
        int mid = low + (high - low) / 2;
        if(arr[mid] == findNumber) return mid;
        else if (arr[mid] < findNumber) {
            return recursion(arr, findNumber, mid + 1, high);
        }else {
            return recursion(arr, findNumber, low, mid - 1);
        }
    }
    public static int binarySearch(int[] arr, int findNumber) {
        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == findNumber) {
                return mid;
            }
            if(arr[mid] < findNumber) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 9, 13, 17, 20, 26};
        int find = 13;
        int result = binarySearch(arr, find);
        int result2 = recursion(arr, find, 0, arr.length - 1);

        System.out.println(find + "은(는) 배열의 " + result2 + "번째에 있습니다.");
    }
}
