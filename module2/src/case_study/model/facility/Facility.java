package case_study.model.facility;

import java.util.Objects;

public abstract class Facility {
    private String idService;
    private String nameService;
    private float usableArea;
    private long rentalCosts;
    private int maximumPeople;
    private String rentalType;

    public Facility() {
    }

    /**
     * @param idService     Mã dịch vụ
     * @param nameService   Tên dịch vụ
     * @param usableArea    Diện tích sử dụng
     * @param rentalCosts   Chi phí thuê
     * @param maximumPeople Số lượng người tối đa
     * @param rentalType    Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ)
     * @creator: Lâm
     * @date : 28/05/2023
     */
    public Facility(String idService, String nameService, float usableArea, long rentalCosts, int maximumPeople, String rentalType) {
        this.idService = idService;
        this.nameService = nameService;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maximumPeople = maximumPeople;
        this.rentalType = rentalType;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public float getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(float usableArea) {
        this.usableArea = usableArea;
    }

    public long getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(long rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return Float.compare(facility.usableArea, usableArea) == 0 && rentalCosts == facility.rentalCosts && maximumPeople == facility.maximumPeople && Objects.equals(idService, facility.idService) && Objects.equals(nameService, facility.nameService) && Objects.equals(rentalType, facility.rentalType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idService, nameService, usableArea, rentalCosts, maximumPeople, rentalType);
    }

    @Override
    public String toString() {
        return "idService=" + idService +
                ", nameService='" + nameService + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", maximumPeople=" + maximumPeople +
                ", rentalType='" + rentalType +", "
                ;
    }
}
