package case_study.model;

public class Booking {
    private String idBooking;
    private String dateBooking;
    private String dateStartTenant;
    private String dateEndTenant;
    private String idCustomer;
    private String idService;

    public Booking() {
    }

    /**
     *
     * @param idBooking mã booking
     * @param dateBooking  ngày booking
     * @param dateStartTenant ngày bắt đầu thuê
     * @param dateEndTenant ngày kết thúc thuê
     * @param idCustomer mã khách hàng
     * @param idService  mã dịch vụ
     */
    public Booking(String idBooking, String dateBooking, String dateStartTenant, String dateEndTenant, String idCustomer, String idService) {
        this.idBooking = idBooking;
        this.dateBooking = dateBooking;
        this.dateStartTenant = dateStartTenant;
        this.dateEndTenant = dateEndTenant;
        this.idCustomer = idCustomer;
        this.idService = idService;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(String dateBooking) {
        this.dateBooking = dateBooking;
    }

    public String getDateStartTenant() {
        return dateStartTenant;
    }

    public void setDateStartTenant(String dateStartTenant) {
        this.dateStartTenant = dateStartTenant;
    }

    public String getDateEndTenant() {
        return dateEndTenant;
    }

    public void setDateEndTenant(String dateEndTenant) {
        this.dateEndTenant = dateEndTenant;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", dateBooking='" + dateBooking + '\'' +
                ", dateStartTenant='" + dateStartTenant + '\'' +
                ", dateEndTenant='" + dateEndTenant + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", idService='" + idService + '\'' +
                '}';
    }
}
