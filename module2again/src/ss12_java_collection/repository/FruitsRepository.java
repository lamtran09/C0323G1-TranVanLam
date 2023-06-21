package ss12_java_collection.repository;

import ss12_java_collection.common.ReadWriteToFile;
import ss12_java_collection.model.Fruits;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FruitsRepository implements IFruitsRepository{
    private static final String PATH_FRUITS = "src/ss12_java_collection/ultils/fruits.csv";
    private static  Set<Fruits> fruitsSet = new TreeSet<>();
    @Override
    public Set<Fruits> display() {
        List<String> stringList = ReadWriteToFile.readToFile(PATH_FRUITS);
        fruitsSet.clear();
        String[] info;
        for (String str: stringList) {
            info = str.split(",");
            fruitsSet.add(new Fruits(info[0],info[1],info[2],info[3],info[4],Long.parseLong(info[5])));
        }
        if(fruitsSet.isEmpty()){
            System.out.println("Hệ thống chưa có thông tin");
        }
        return fruitsSet;
    }

    @Override
    public void add(Fruits fruits) {
        List<String> stringList = new ArrayList<>();
        stringList.add(fruits.getNameFruits()+","+fruits.getKindOfFruits()+","+fruits.getDateOfManufacture()+","+fruits.getNameFruits()+","+fruits.getExpiry()+","+fruits.getOrigin()+","+fruits.getPrice());
        ReadWriteToFile.writeToFile(PATH_FRUITS,stringList,true);
    }

    @Override
    public void remove(Fruits fruits) {
    fruitsSet = display();
    fruitsSet.remove(fruits);
    List<String> stringList = new ArrayList<>();
        for (Fruits fruits1: fruitsSet) {
            stringList.add(fruits1.getNameFruits()+","+fruits1.getKindOfFruits()+","+fruits1.getDateOfManufacture()+","+fruits1.getNameFruits()+","+fruits1.getExpiry()+","+fruits1.getOrigin()+","+fruits1.getPrice());
        }
        ReadWriteToFile.writeToFile(PATH_FRUITS,stringList,false);
    }

    @Override
    public Fruits getByNameFruits(String name) {
        fruitsSet = display();
        for (Fruits fruits:fruitsSet) {
            if(fruits.getNameFruits().equals(name)){
                return fruits;
            }
        }
        return null;
    }
}
