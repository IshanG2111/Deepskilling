public class Main {
    public static void main(String[] args) {
        System.out.println("Sorting algorithms:");
        System.out.println("- Bubble Sort: repeatedly swaps adjacent out-of-order elements.");
        System.out.println("- Insertion Sort: builds sorted part by inserting each element in place.");
        System.out.println("- Quick Sort: partitions around a pivot and sorts subarrays recursively.");
        System.out.println("- Merge Sort: divides array, sorts parts, and merges them.\n");

        Order[] ordersForBubble = {
            new Order(101, "Aman", 2500),
            new Order(102, "Riya", 1200),
            new Order(103, "Karan", 4200),
            new Order(104, "Neha", 1800)
        };

        Order[] ordersForQuick = {
            new Order(101, "Aman", 2500),
            new Order(102, "Riya", 1200),
            new Order(103, "Karan", 4200),
            new Order(104, "Neha", 1800)
        };

        bubbleSort.sort(ordersForBubble);
        quickSort.sort(ordersForQuick, 0, ordersForQuick.length - 1);

        System.out.println("Bubble Sort result (by totalPrice):");
        printOrders(ordersForBubble);

        System.out.println("\nQuick Sort result (by totalPrice):");
        printOrders(ordersForQuick);

        System.out.println("\nPerformance comparison:");
        System.out.println("Bubble Sort: O(n^2) average and worst case");
        System.out.println("Quick Sort: O(n log n) average, O(n^2) worst case");

        System.out.println("\nWhy Quick Sort is generally preferred:");
        System.out.println("- Faster on average for large data sets");
        System.out.println("- Better practical performance due to partitioning and cache usage");
        System.out.println("- Bubble Sort is mainly useful for learning or very small input sizes");
    }

    private static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
