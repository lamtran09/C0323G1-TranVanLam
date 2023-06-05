package case_study.model.person;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return typeCustomer.equals(customer.typeCustomer) && address.equals(customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeCustomer, address);
    }

    @Override
    public String toString() {
        return "--Mã khách hàng: "+getIdPerSon()+","+" Tên khách hàng: "+getNamePerson()+","+" Ngày sinh : "+getDateOfBirth()+","+" Giới tính : "+getGender()+","+" CMND: "+getIdentityCard()+","+" Số điện thoại: "+getPhoneNumber()+","+" Email: "+getEmail()+","+" Kiểu khách hàng: "+getTypeCustomer()+","+" Địa chỉ: "+getAddress();
    }
}
