package case_study.model.facility;

public class Villa extends Facility {
    private String roomStandard;
    private float swimmingArea;
    private int numberOfFloors;

    public Villa() {
    }
    /**
     * @creator: Lâm
     * @date : 28/05/2023
     * @param idService  Mã dịch vụ
     * @param nameService Tên dịch vụ
     * @param usableArea Diện tích sử dụng
     * @param rentalCosts Chi phí thuê
     * @param maximumPeople Số lượng người tối đa
     * @param rentalType Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ)
     * @param roomStandard Tiêu chuẩn phòng
     * @param swimmingArea Diện tích hồ bơi
     * @param numberOfFloors Số tầng
     */
    public Villa(int idService, String nameService, float usableArea, float rentalCosts, int maximumPeople, String rentalType, String roomStandard, float swimmingArea, int numberOfFloors) {
        super(idService, nameService, usableArea, rentalCosts, maximumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingArea = swimmingArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public float getSwimmingArea() {
        return swimmingArea;
    }

    public void setSwimmingArea(float swimmingArea) {
        this.swimmingArea = swimmingArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", swimmingArea=" + swimmingArea +
                ", floor=" + numberOfFloors +
                '}';
    }
}
