package case_study.repository.facility;
import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;

import java.util.*;

public class FacilityRepository implements IFacilityRepository{
    private static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    static {
        Villa villa = new Villa("SVVL-1903","Cafe",31.F,32,10,"Tháng","Vip",30,7);
        House house = new House("SVHO-1904","Ăn bánh",30,1000000,15,"Ngày","President",8);
        Room room = new Room("SVRO-1905","Uống trà",30.5F,1000000,5,"Ngày","Ngủ");
        facilityIntegerMap.put(villa,1);
        facilityIntegerMap.put(house,2);
        facilityIntegerMap.put(room,5);
    }
    @Override
    public Map<Facility,Integer> displayFacility() {
        return facilityIntegerMap;
    }

    @Override
    public List<Facility> displayFacilityMaintain() {
        List<Facility> facilityList = new ArrayList<>();
        for (Facility facility: facilityIntegerMap.keySet()) {
            Integer integer = facilityIntegerMap.get(facility);
            if(integer>= 5){
                facilityList.add(facility);
            }
        }return facilityList;
    }

    @Override
    public void addNewFacility(Facility facility) {
        facilityIntegerMap.put(facility,0);
    }

    @Override
    public void removeFacility(Facility facility) {
        facilityIntegerMap.remove(facility);
    }

    @Override
    public Facility getById(String idService) {
        Set<Facility> facilities = facilityIntegerMap.keySet();
        for (Facility facility: facilities) {
            if(facility.getIdService().equals(idService)){
                return facility;
            }
        }
        return null;
    }


}
