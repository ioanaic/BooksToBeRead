import java.util.Date;

/**
 * Created by ioana.crisan on 09-03-2017.
 */
public class Book {

    private String bookName;
    private String bookTitle;
    private String[][] bookAuthors = null;
    private boolean hasMultipleVolumes;
    private int volumeNumber;
    private Date startReadDate;
    private Date endReadDate;
    private String bookGenre;
    private boolean isRead;

    public Book(String bookName, String bookTitle, String[][] bookAuthors, boolean hasMultipleVolumes, int volumeNumber, Date startReadDate, Date endReadDate, String bookGenre, boolean isRead) {
        this.bookName = bookName;
        this.bookTitle = bookTitle;
        this.bookAuthors = bookAuthors;
        this.hasMultipleVolumes = hasMultipleVolumes;
        this.volumeNumber = volumeNumber;
        this.startReadDate = startReadDate;
        this.endReadDate = endReadDate;
    }

    public String getBookName() {
        return bookName;
    }

    public String getbookTitle() {
        return bookTitle;
    }

    public String[][] getAuthorsList() {
        return bookAuthors;
    }

    public boolean checkHasMultipleVolumes() {
        return hasMultipleVolumes;
    }
    public int getVolumeNumber(){
        return volumeNumber;
    }
    public Date getStartReadDate(){
        return startReadDate;
    }
    public Date getEndReadDate(){
        return endReadDate;
    }

    public String getBookGenre(){
        return bookGenre;
    }

    public boolean checkIsRead(){
        return isRead;
    }


}
