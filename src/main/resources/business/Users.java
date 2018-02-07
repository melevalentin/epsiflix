package business;

public class Users {
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String address;
    private String phone;
    private String password;
    private boolean is_admin;
    private int id_subscription;

    // Constructor
    public Users(int id, String first_name, String last_name, String email, String address, String phone, String password, boolean is_admin, int id_subscription) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.password = password;
        this.is_admin = is_admin;
        this.id_subscription = id_subscription;
    }

    // ToString method
    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", is_admin=" + is_admin +
                ", id_subscription=" + id_subscription +
                '}';
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public boolean isIs_admin() {
        return is_admin;
    }

    public int getId_subscription() {
        return id_subscription;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIs_admin(boolean is_admin) {
        this.is_admin = is_admin;
    }

    public void setId_subscription(int id_subscription) {
        this.id_subscription = id_subscription;
    }
}
