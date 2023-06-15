package ss10_list.repository;

import ss10_list.common.ReadToFile;
import ss10_list.common.WriteToFile;
import ss10_list.model.Fruits;

import java.util.ArrayList;
import java.util.List;

public class FruitsRepository implements IFruitsRepository{
    private static final String PATH_FRUITS = "src/ss10_list/ultils/fruits.csv";
    private static final List<Fruits> fruitsList = new ArrayList<>();

    @Override
    public List<Fruits> display() {
        List<String> stringList = ReadToFile.readToFile(PATH_FRUITS);
        fruitsList.clear();
        String[] info;
        for (String str: stringList) {
            info = str.split(",");
            fruitsList.add(new Fruits(info[0],info[1],info[2],info[3],info[4],Long.parseLong(info[5])));
        }
        return fruitsList;
    }

    @Override
    public void add(Fruits fruits) {
        List<String> stringList = new ArrayList<>();
        stringList.add(fruits.getNameFruits()+","+fruits.getKindOfFruits()+","+fruits.getDateOfManufacture()+","+fruits.getExpiry()+","+fruits.getOrigin()+","+fruits.getPrice());
        WriteToFile.writeToFile(PATH_FRUITS,stringList,true);
    }
}
