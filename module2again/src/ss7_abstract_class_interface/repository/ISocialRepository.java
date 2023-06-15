package ss7_abstract_class_interface.repository;

import ss7_abstract_class_interface.model.SocialBook;

import java.util.List;

public interface ISocialRepository {
    List<SocialBook> display();
    void add(SocialBook socialBook);
}
