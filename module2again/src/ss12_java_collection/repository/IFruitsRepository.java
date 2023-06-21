package ss12_java_collection.repository;

import ss12_java_collection.model.Fruits;

import java.util.Map;
import java.util.Set;

public interface IFruitsRepository {
    Set<Fruits> display();
    void add(Fruits fruits);
    void remove(Fruits fruits);
    Fruits getByNameFruits(String name);
}
