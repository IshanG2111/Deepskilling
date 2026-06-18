public class quickSort {
    public static void sort(Order[] arr, int low, int high) {
        if (low < high) {
            int pi = partition.partitionOrders(arr, low, high);

            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
}