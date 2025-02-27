package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        QuanLyNhanVien quanLy = new QuanLyNhanVien();

        // Thêm nhân viên
        quanLy.addNhanVien(new NhanVienFulltime(
                "NV001", "Lê Sơn Nhất", 26, "0984883383", "sonnhatbest@gmail.com", 34000000, 3000000, 500000));
        quanLy.addNhanVien(new NhanVienFulltime(
                "NV002", "Trịnh Thu Liên", 26, "0912345678", "thulien@gmail.com", 66000000, 7000000, 1000000));
        quanLy.addNhanVien(new NhanVienFulltime(
                "NV003", "Phạm Văn Trường", 33, "0323383321", "truongpeo@gmail.com", 16000000, 1000000, 500000));
        quanLy.addNhanVien(new NhanVienFulltime(
                "NV004", "Nguyễn Thị Trang", 24, "0922456789", "tranghen@gmail.com", 11000000, 1200000, 0));

        quanLy.addNhanVien(new NhanVienParttime(
                "NV005", "Phạm Đình Linh", 42, "0969123456", "phamlinh@gmail.com", 250));
        quanLy.addNhanVien(new NhanVienParttime(
                "NV006", "Đỗ Đức Toàn", 38, "0372890213", "ductoan@gmail.com", 340));
        quanLy.addNhanVien(new NhanVienParttime(
                "NV007", "Hoàng Thu Trang", 25, "0922888999", "hoangthutrang@gmail.com", 420));
        quanLy.addNhanVien(new NhanVienParttime(
                "NV008", "Phạm Tiến Quang", 33, "09881114444", "phamquang@gmail.com", 290));

        // Triển khai phương thức
        System.out.println("1. LƯƠNG TB CỦA NHÂN VIÊN CẢ CÔNG TY: " + quanLy.luongTrungBinh() + " VNĐ \n");
        System.out.println("2. DANH SÁCH NV FULLTIME CÓ LƯƠNG THẤP HƠN TRUNG BÌNH: \n\n" + quanLy.luongFulltimeThap() + "\n");
        System.out.println("3. TỔNG LƯƠNG CỦA NHÂN VIÊN PARTTIME: " + quanLy.tongLuongParttime() + " VNĐ \n");
        System.out.println("4. DANH SÁCH NV FULLTIME THEO LƯƠNG TĂNG DẦN: \n\n" + quanLy.luongFulltimeTangDan() + "\n");
        System.out.println("5. DANH SÁCH NHÂN VIÊN CÓ TÊN 'Nhất': \n\n" + quanLy.timNhanVienTheoTen("Nhất"));
    }
}
