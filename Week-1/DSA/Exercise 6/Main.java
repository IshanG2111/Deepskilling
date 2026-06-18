public class Main {
    public static void main(String[] args) {
        System.out.println("Search algorithms:");
        System.out.println("- Linear Search: check each element one by one.");
        System.out.println("- Binary Search: repeatedly divide sorted data into halves.\n");

        Book[] books = {
            new Book(1, "Clean Code", "Robert C. Martin"),
            new Book(2, "The Pragmatic Programmer", "Andrew Hunt"),
            new Book(3, "Refactoring", "Martin Fowler"),
            new Book(4, "Design Patterns", "Erich Gamma")
        };

        System.out.println("Linear search for 'Refactoring':");
        Book linearResult = LibrarySearch.linearSearchByTitle(books, "Refactoring");
        System.out.println(linearResult != null ? linearResult : "Not found");

        LibrarySearch.sortByTitle(books);

        System.out.println("\nBinary search for 'Refactoring' (on sorted list):");
        Book binaryResult = LibrarySearch.binarySearchByTitle(books, "Refactoring");
        System.out.println(binaryResult != null ? binaryResult : "Not found");

        System.out.println("\nTime complexity comparison:");
        System.out.println("Linear Search: O(n)");
        System.out.println("Binary Search: O(log n)");

        System.out.println("\nWhen to use:");
        System.out.println("- Linear search: small or unsorted data sets.");
        System.out.println("- Binary search: large sorted data sets.");
    }
}
