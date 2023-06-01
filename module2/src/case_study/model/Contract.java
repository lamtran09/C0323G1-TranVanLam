package case_study.model;

public class Contract {
    private String SomeContract;
    private String idBooking;
    private float advanceDepositAmount;
    private float totalPaymentAmount;

    public Contract() {
    }

    /**
     *
     * @param someContract số hợp đồng
     * @param idBooking mã booking
     * @param advanceDepositAmount số tiền cọc trước
     * @param totalPaymentAmount tổng số tiền thanh toán.
     */

    public Contract(String someContract, String idBooking, float advanceDepositAmount, float totalPaymentAmount) {
        SomeContract = someContract;
        this.idBooking = idBooking;
        this.advanceDepositAmount = advanceDepositAmount;
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public String getSomeContract() {
        return SomeContract;
    }

    public void setSomeContract(String someContract) {
        SomeContract = someContract;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public float getAdvanceDepositAmount() {
        return advanceDepositAmount;
    }

    public void setAdvanceDepositAmount(float advanceDepositAmount) {
        this.advanceDepositAmount = advanceDepositAmount;
    }

    public float getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(float totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "SomeContract='" + SomeContract + '\'' +
                ", idBooking='" + idBooking + '\'' +
                ", advanceDepositAmount=" + advanceDepositAmount +
                ", totalPaymentAmount=" + totalPaymentAmount +
                '}';
    }
}
