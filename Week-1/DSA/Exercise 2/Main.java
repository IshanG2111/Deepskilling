public class Main {
    public static void main(String[] args) {
        System.out.println("Searching Algorithms:");
        Product[] p={
            new Product(0, "brushes", "stationary"),
            new Product(1, "toothpaste", "hygiene"),
            new Product(2, "cakes", "food")
        };
        int result1 = linearSearch.search(p, "brushes");
        System.out.println("Linear Search result: " + result1);
        int result2 = binarySeach.binarySearch(p, "toothpaste");
        System.out.println("Binary Search result: " + result2);
    }
}
