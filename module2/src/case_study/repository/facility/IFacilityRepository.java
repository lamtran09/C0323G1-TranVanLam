package case_study.repository.facility;

import case_study.model.facility.Facility;

import java.util.List;
import java.util.Map;

public interface IFacilityRepository {
    Map<Facility,Integer> displayFacility();
    List<Facility> displayFacilityMaintain();
    public void addNewFacility(Facility facility);
    public void removeFacility(Facility facility);
    Facility getById(String idService);

}
