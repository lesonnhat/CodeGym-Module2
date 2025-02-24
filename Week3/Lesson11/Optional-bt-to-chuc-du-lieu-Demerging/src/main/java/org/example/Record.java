package org.example;

public class Record {
    String name;
    String gender; // "NU" cho nữ, "NAM" cho nam
    String birthDate; // Ngày tháng năm sinh

    public Record(String name, String gender, String birthDate) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return name + ", " + gender + ", " + birthDate;
    }
}
