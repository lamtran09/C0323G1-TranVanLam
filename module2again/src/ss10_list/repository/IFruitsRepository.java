package ss10_list.repository;

import ss10_list.model.Fruits;

import java.util.List;

public interface IFruitsRepository {
    List<Fruits> display();
    void add(Fruits fruits);

}
