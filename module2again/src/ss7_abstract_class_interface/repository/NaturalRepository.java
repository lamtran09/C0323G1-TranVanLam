package ss7_abstract_class_interface.repository;

import ss7_abstract_class_interface.common.ReadWriteToFile;
import ss7_abstract_class_interface.model.NaturalBook;

import java.util.ArrayList;
import java.util.List;

public class NaturalRepository implements INaturalRepository {
    private static final String PATH_NATURAL = "src/ss7_abstract_class_interface/ultils/natural.csv";
    private static final List<NaturalBook> naturalBooks = new ArrayList<>();

    @Override
    public List<NaturalBook> display() {
        List<String> stringList = ReadWriteToFile.readToFileBook(PATH_NATURAL);
        naturalBooks.clear();
        String[] info;
        for (String str:stringList) {
            info = str.split(",");
            naturalBooks.add(new NaturalBook(info[0],info[1],info[2],info[3]));
        }
        return naturalBooks;
    }

    @Override
    public void addNatural(NaturalBook naturalBook) {
        List<String> stringList = new ArrayList<>();
        stringList.add(naturalBook.getNameBook()+","+naturalBook.getPublishingCompany()+","+naturalBook.getPublishingYear()+","+naturalBook.getAuthor());
        ReadWriteToFile.writeToFile(PATH_NATURAL,stringList,true);
    }
}
