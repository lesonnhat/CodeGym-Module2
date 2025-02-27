package org.example;

public class NhanVienParttime extends NhanVien implements Luong {
    private int soGioLam;

    public NhanVienParttime() {
    }

    public NhanVienParttime(String maNhanVien, String hoTen, int tuoi, String soDienThoai, String email, int soGioLam) {
        super(maNhanVien, hoTen, tuoi, soDienThoai, email);
        this.soGioLam = soGioLam;
    }

    public int getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(int soGioLam) {
        this.soGioLam = soGioLam;
    }

    @Override
    public int luongThucLinh() {
        return soGioLam * 100000;
    }

    @Override
    public String toString() {
        return "Mã nhân viên: " + getMaNhanVien() +
                " | Họ tên: " + getHoTen() +
                " | Tuổi: " + getTuoi() +
                " | Số điện thoại: " + getSoDienThoai() +
                " | Email: " + getEmail() +
                "\n Số giờ làm: " + getSoGioLam() + " giờ" +
                "\n ---------------------------------------\n";
    }
}
