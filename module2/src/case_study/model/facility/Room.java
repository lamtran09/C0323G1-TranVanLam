package case_study.model.facility;

public class Room extends Facility {
    private String freeServiceIncluded;

    public Room() {
    }
    /**
     * @param idService     Mã dịch vụ
     * @param nameService   Tên dịch vụ
     * @param usableArea    Diện tích sử dụng
     * @param rentalCosts   Chi phí thuê
     * @param maximumPeople Số lượng người tối đa
     * @param rentalType    Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ)
     * @param freeServiceIncluded Dịch vụ miễn phí đi kèm
     * @creator: Lâm
     * @date : 01/06/2023
     */
    public Room(int idService, String nameService, float usableArea, float rentalCosts, int maximumPeople, String rentalType, String freeServiceIncluded) {
        super(idService, nameService, usableArea, rentalCosts, maximumPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}';
    }
}
