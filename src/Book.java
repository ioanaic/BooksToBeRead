import java.util.Date;

/**
 * Created by ioana.crisan on 09-03-2017.
 */
public class Book {

    private String bookName;
    private int numarulDeAutori;
    private String[][] bookAuthors = null;
    // private boolean hasMultipleVolumes;
    private int volumeNumber;
    private String startReadDate;
    private String endReadDate;
    private String bookGenre;
    private boolean isRead;

    public Book(String bookName, int numarulDeAutori, String[][] bookAuthors, boolean hasMultipleVolumes, int volumeNumber, String startReadDate, String endReadDate, String bookGenre, boolean isRead) {
        this.bookName = bookName;
        this.bookAuthors = bookAuthors;
        // this.hasMultipleVolumes = hasMultipleVolumes;
        this.volumeNumber = volumeNumber;
        this.startReadDate = startReadDate;
        this.endReadDate = endReadDate;
        this.numarulDeAutori = numarulDeAutori;
    }

    public String getBookName() {
        return bookName;
    }

    public String[][] getAuthorsList() {
        return bookAuthors;
    }

    public boolean checkHasMultipleVolumes(String bookName) {
        if (volumeNumber > 1) {
            return true;
        } else {
            return false;
        }
    }

    public int getVolumeNumber() {
        return volumeNumber;
    }

    public String getStartReadDate() {
        return startReadDate;
    }

    public String getEndReadDate() {
        return endReadDate;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public boolean checkIsRead() {
        return isRead;
    }

    public void readBooksFromConsole() {
        int n = SkeletonJava.readIntConsole("Introduceti numarul de carti pe care doriti sa le cititi: ");
        Book[] book = new Book[n];
        for (int i = 0; i < n; i++) {
            String bookName = SkeletonJava.readStringConsole("Introduceti numele cartii: ");
            int numarulDeAutori = SkeletonJava.readIntConsole("Introduceti numarul de autori: ");
            String[] bookAuthors = new String[numarulDeAutori];
            for (int j = 0; j < numarulDeAutori; j++) {
                bookAuthors[j] = SkeletonJava.readStringConsole("Introduceti numele autorului: ");
            }
            int volumeNumber = SkeletonJava.readIntConsole("Introduceti numarul de volume: ");
            String startReadDate = SkeletonJava.readStringConsole("Introduceti data in care doriti sa incepeti sa cititi cartea cu numele "+bookName);
            String endReadDate = SkeletonJava.readStringConsole("Introduceti data in care terminati de citit cartea cu numele"+bookName);
            String bookGenre
            Book b = new Book(bookName, numarulDeAutori,  bookAuthors, volumeNumber, startReadDate, endReadDate, bookGenre, boolean isRead)
            book[i] =
        }
    }


}
