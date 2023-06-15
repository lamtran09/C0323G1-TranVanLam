package ss7_abstract_class_interface.model;

public class SocialBook extends Book{
    private int numberOfPublications;

    public SocialBook() {
    }

    public SocialBook(String nameBook, String publishingCompany, String publishingYear, int numberOfPublications) {
        super(nameBook, publishingCompany, publishingYear);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }

    @Override
    public String toString() {
        return "SocialBook: " + super.toString()+
                ", Số lượng xuất bản: " + numberOfPublications+" bản";
    }
}
