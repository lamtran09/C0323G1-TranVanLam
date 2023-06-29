package case_study.model.person;

public class Customer extends Person{
    private String typeCustomer;
    private  String address;

    public Customer(String idPerSon, String namePerson, String dateOfBirth, String gender, String identityCard, String phoneNumber, String email, String typeCustomer, String address) {
        super(idPerSon, namePerson, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String infoCustomerToCSV() {
        return this.getIdPerSon()+","+this.getNamePerson()+","+this.getDateOfBirth()+","+this.getGender()+this.getIdentityCard()+","+this.getPhoneNumber()+this.getEmail()+","+this.getTypeCustomer()+","+this.getAddress();
    }
    @Override
    public String toString() {
        return "+Mã khách hàng: "+getIdPerSon()+","+" Tên khách hàng: "+getNamePerson()+","+" Ngày sinh : "+getDateOfBirth()+","+" Giới tính : "+getGender()+","+" CMND: "+getIdentityCard()+","+" Số điện thoại: "+getPhoneNumber()+","+" Email: "+getEmail()+","+" Kiểu khách hàng: "+getTypeCustomer()+","+" Địa chỉ: "+getAddress();
    }
}
