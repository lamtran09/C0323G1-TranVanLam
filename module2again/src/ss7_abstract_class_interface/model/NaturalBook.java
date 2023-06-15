package ss7_abstract_class_interface.model;

public class NaturalBook extends Book{
private String author;

    public NaturalBook() {
    }

    public NaturalBook(String nameBook, String publishingCompany, String publishingYear, String author) {
        super(nameBook, publishingCompany, publishingYear);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "NaturalBook: " + super.toString()+
                ", Tác giả: '" + author + '\'';
    }
}
