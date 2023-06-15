package ss12_java_collection.repository;

import ss12_java_collection.model.Fruits;

import java.util.Map;

public interface IFruitsRepository {
    Map<String,Fruits> display();
    void add(Fruits fruits);
    void remove(Fruits fruits);
    Fruits getByIdFruits(String idFruits);
}
