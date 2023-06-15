package ss7_abstract_class_interface.repository;

import ss7_abstract_class_interface.common.ReadWriteToFile;
import ss7_abstract_class_interface.model.SocialBook;

import java.util.ArrayList;
import java.util.List;

public class SocialRepository implements ISocialRepository {
        private static final String PATH_SOCIAL = "src/ss7_abstract_class_interface/ultils/social.csv";
        private static final List<SocialBook> socialBookList = new ArrayList<>();
    @Override
    public List<SocialBook> display() {
        List<String> stringList = ReadWriteToFile.readToFileBook(PATH_SOCIAL);
        socialBookList.clear();
        String[] info;
        for (String str:stringList) {
            info = str.split(",");
            socialBookList.add(new SocialBook(info[0],info[1],info[2],Integer.parseInt(info[3])));
        }
        return socialBookList;
    }

    @Override
    public void add(SocialBook socialBook) {
    List<String> stringList  = new ArrayList<>();
    stringList.add(socialBook.getNameBook()+","+socialBook.getPublishingCompany()+","+socialBook.getPublishingYear()+","+socialBook.getNumberOfPublications());
    ReadWriteToFile.writeToFile(PATH_SOCIAL,stringList,false);
    }
}
