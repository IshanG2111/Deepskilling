public class partition {
    public static int partitionOrders(Order[] arr, int low, int high) {
        double pivot = arr[high].totalPrice;

        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].totalPrice < pivot) {
                i++;

                Order temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Order temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}