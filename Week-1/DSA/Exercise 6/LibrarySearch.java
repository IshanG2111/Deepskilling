import java.util.Arrays;
import java.util.Comparator;

public class LibrarySearch {
    public static Book linearSearchByTitle(Book[] books, String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public static Book binarySearchByTitle(Book[] booksSortedByTitle, String title) {
        int left = 0;
        int right = booksSortedByTitle.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compare = booksSortedByTitle[mid].title.compareToIgnoreCase(title);

            if (compare == 0) {
                return booksSortedByTitle[mid];
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void sortByTitle(Book[] books) {
        Arrays.sort(books, Comparator.comparing(book -> book.title.toLowerCase()));
    }
}
