import java.util.Date;

/**
 * Created by ioana.crisan on 09-03-2017.
 */
public class Book {

    private String bookName;
    private String bookTitle;
    private String[] bookAuthors = null;
    private boolean hasMultipleVolumes;
    private int volumeNumber;
    private Date startReadDate;
    private Date endReadDate;
    private String bookGenre;
    private boolean isRead;

    public Book(String bookName, String bookTitle, String[] bookAuthors, boolean hasMultipleVolumes, int volumeNumber, Date startReadDate, Date endReadDate, String bookGenre, boolean isRead) {
        this.bookName = bookName;
        this.bookTitle = bookTitle;
        this.bookAuthors = bookAuthors;
        this.hasMultipleVolumes = hasMultipleVolumes;
        this.volumeNumber = volumeNumber;
        this.startReadDate = startReadDate;
        this.endReadDate = endReadDate;
    }


}
