public class Student extends Person {
    String classId;

    public Student(String id, String name, String birthDate, String gender, String phoneNumber, String classId) {
        super(id, name, birthDate, gender, phoneNumber);
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "{Mã sinh viên: " + getId() +
                ", Tên sinh viên: " + getName() +
                ", Ngày sinh: " + getBirthDate() +
                ", Giới tính: " + getGender() +
                ", Số điện thoại: " + getPhoneNumber() +
                ", Lớp học: " + classId + "}";
    }
}