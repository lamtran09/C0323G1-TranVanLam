package case_study.model.house;

import case_study.model.ResortFurama;

public class Villa extends ResortFurama {
    private String roomStandard;
    private float swimmingArea;
    private int floor;

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
     * @param floor Số tầng
     */
    public Villa(int idService, String nameService, float usableArea, float rentalCosts, int maximumPeople, String rentalType, String roomStandard, float swimmingArea, int floor) {
        super(idService, nameService, usableArea, rentalCosts, maximumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingArea = swimmingArea;
        this.floor = floor;
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

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", swimmingArea=" + swimmingArea +
                ", floor=" + floor +
                '}';
    }
}
