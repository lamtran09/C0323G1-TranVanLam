package case_study.model.facility;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;

    public House() {
    }

    /**
     * @param idService      Mã dịch vụ
     * @param nameService    Tên dịch vụ
     * @param usableArea     Diện tích sử dụng
     * @param rentalCosts    Chi phí thuê
     * @param maximumPeople  Số lượng người tối đa
     * @param rentalType     Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ)
     * @param roomStandard   Tiêu chuẩn phòng
     * @param numberOfFloors Số tầng
     * @creator: Lâm
     * @date : 28/05/2023
     */
    public House(String idService, String nameService, float usableArea, long rentalCosts, int maximumPeople, String rentalType, String roomStandard, int numberOfFloors) {
        super(idService, nameService, usableArea, rentalCosts, maximumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
