package kh.edu.ctasd.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// MODEL : Store application data
// POJO CLASS : Plain old java object
// setter/getter/constructure
public class Customer {
    private String uuid;
    private String fullName;
    private String email;
    private String phone;
    private String gender;
    private Boolean isDeleted;

    public Customer(){};

    public Customer(String uuid, String fullName, String email, String phone, String gender, Boolean isDeleted) {
        this.uuid = uuid;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.isDeleted = isDeleted;
    }

    public String getUuid() {
        return uuid;
    }

    public void setId(String uuid) {
        this.uuid = uuid;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "uuid=" + uuid +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
