//just a program on binary search by sam-tripathi 
class BinarySearch {
    public static void binarySearch(int arr[], int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found!");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 89, 90, 78, 49, 30 };
        int key = 30;
        int last = arr.length - 1;
        binarySearch(arr, 0, last, key);
    }
}
Footer
