package case_study.model.facility;

public abstract class Facility {
    private int idService;
    private String nameService;
    private float usableArea;
    private float rentalCosts;
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
    public Facility(int idService, String nameService, float usableArea, float rentalCosts, int maximumPeople, String rentalType) {
        this.idService = idService;
        this.nameService = nameService;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maximumPeople = maximumPeople;
        this.rentalType = rentalType;
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
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

    public float getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(float rentalCosts) {
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
    public String toString() {
        return "ResortFurama{" +
                "idService=" + idService +
                ", nameService='" + nameService + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", maximumPeople=" + maximumPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
