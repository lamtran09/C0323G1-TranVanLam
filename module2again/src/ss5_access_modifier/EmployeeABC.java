package ss5_access_modifier;

public class EmployeeABC {
    // Ngăn chặn việc truy cập trực tiếp đến thuộc tính của đối tượng nên để private, phạm vi ở trong class
    private String name;
    private int phoneNumber;
    private String workingParts;
    private String nameCompany;

    public EmployeeABC() {
    }

    // contructor dùng để khởi tạo đối tượng vì vậy dùng public , phạm vi trong toàn bộ project
    public EmployeeABC(String name, int phoneNumber, String workingParts, String nameCompany) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.workingParts = workingParts;
        this.nameCompany = nameCompany;
    }

    //  phạm vi trong toàn bộ project
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //truy xuất đến số điện thoại của đối tượng nên dùng public, phạm vi trong toàn bộ project
    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWorkingParts() {
        return workingParts;
    }

    public void setWorkingParts(String workingParts) {
        this.workingParts = workingParts;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    @Override
    public String toString() {
        return "EmployeeABC{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", workingParts='" + workingParts + '\'' +
                ", nameCompany='" + nameCompany + '\'' +
                '}';
    }
}
