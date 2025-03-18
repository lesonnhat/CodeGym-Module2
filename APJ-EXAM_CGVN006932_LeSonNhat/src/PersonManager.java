import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonManager implements IManager {
    private List<Student> students;

    public PersonManager() {
        students = new ArrayList<>();
        loadFromCSV();
    }

    private void loadFromCSV() {
        try (BufferedReader reader = new BufferedReader(new FileReader("data/students.csv"))) {
            String line;
            reader.readLine(); // Bỏ qua dòng tiêu đề
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 6) {
                    Student student = new Student(data[0], data[1], data[2], data[3], data[4], data[5]);
                    students.add(student);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int getLastStudentId() {
        return students.size() > 0 ? Integer.parseInt(students.get(students.size() - 1).getId()) : 0;
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        int nextId = getLastStudentId() + 1;

        System.out.print("Tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.print("Ngày sinh (dd/MM/yyyy): ");
        String birthDate = scanner.nextLine();
        System.out.print("Giới tính: ");
        String gender = scanner.nextLine();
        System.out.print("Số điện thoại (bắt đầu bằng 090/091): ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Mã lớp học: ");
        String classId = scanner.nextLine();

        if (!validateInput(name, birthDate, phoneNumber, classId)) {
            System.out.println("Dữ liệu không hợp lệ.");
            return;
        }

        Student student = new Student(String.valueOf(nextId), name, birthDate, gender, phoneNumber, classId);
        students.add(student);
        writeToCSV(student);
        System.out.println("✔ Thêm sinh viên thành công.");
    }

    private boolean validateInput(String name, String birthDate, String phoneNumber, String classId) {
        if (name == null || name.trim().isEmpty() || !name.matches("[\\p{L} ]+") || name.length() < 4 || name.length() > 50) {
            System.out.println("Tên phải là chữ, và có độ dài từ 4 đến 50 ký tự.");
            return false;
        }

        if (!birthDate.matches("\\d{2}/\\d{2}/\\d{4}")) {
            System.out.println("Ngày sinh không hợp lệ, vui lòng nhập theo định dạng dd/MM/yyyy.");
            return false;
        }

        for (Student student : students) {
            if (student.getPhoneNumber().equals(phoneNumber)) {
                System.out.println("Số điện thoại đã tồn tại trên hệ thống, vui lòng nhập lại.");
                return false;
            }
        }

        if (phoneNumber == null || !phoneNumber.matches("09[01][0-9]{7}")) {
            System.out.println("Số điện thoại không hợp lệ, vui lòng nhập 090/091...");
            return false;
        }

        if (classId == null || classId.trim().isEmpty()) {
            System.out.println("Mã lớp học không được để trống.");
            return false;
        }

        return true;
    }

    public void writeToCSV(Student student) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data/students.csv", true))) {
            writer.write(student.getId() + "," + student.getName() + "," + student.getBirthDate() + "," +
                    student.getGender() + "," + student.getPhoneNumber() + "," + student.classId);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên cần xóa: ");
        String idToDelete = scanner.nextLine();

        Student studentToDelete = null;

        for (Student student : students) {
            if (student.getId().equals(idToDelete)) {
                studentToDelete = student;
                break;
            }
        }

        if (studentToDelete == null) {
            System.out.println("Sinh viên không tồn tại.");
            return;
        }

        System.out.print("Bạn có chắc chắn muốn xóa sinh viên " + studentToDelete.getName() + "? (Yes/No): ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("Yes")) {
            students.remove(studentToDelete);
            rewriteToCSV();
            System.out.println("✔ Đã xóa sinh viên thành công.");
        } else {
            System.out.println("Đã thoát khỏi chức năng xóa.");
        }
    }

    private void rewriteToCSV() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data/students.csv"))) {
            writer.write("Mã sinh viên,Tên sinh viên,Ngày sinh,Giới tính,Số điện thoại,Mã lớp học");
            writer.newLine();
            for (Student student : students) {
                writer.write(student.getId() + "," + student.getName() + "," + student.getBirthDate() + "," +
                        student.getGender() + "," + student.getPhoneNumber() + "," + student.classId);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println("Danh sách sinh viên:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên để tìm kiếm: ");
        String keyword = scanner.nextLine().toLowerCase();
        System.out.println("Kết quả tìm kiếm:");

        for (Student student : students) {
            if (student.getName().toLowerCase().contains(keyword)) {
                System.out.println(student);
            }
        }
    }
}