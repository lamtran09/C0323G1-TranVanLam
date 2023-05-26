package ss16_io_text_file.bai_tap.doc_file_csv;

public class Nation {
    private String id;
    private String code;
    private String name;

    public Nation() {
    }

    public Nation(String id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Nation{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String toNationListCSv() {
        return this.id + "," + this.code + "," + this.name;
    }
}
