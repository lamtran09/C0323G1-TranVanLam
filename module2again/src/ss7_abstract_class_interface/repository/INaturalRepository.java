package ss7_abstract_class_interface.repository;

import ss7_abstract_class_interface.model.NaturalBook;

import java.util.List;

public interface INaturalRepository {
    List<NaturalBook> display();
    void addNatural(NaturalBook naturalBook);
}
