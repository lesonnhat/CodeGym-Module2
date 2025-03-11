package org.example;

public class NhanVienFulltime extends NhanVien implements Luong {
    private int luongCung;
    private int tienThuong;
    private int tienPhat;

    public NhanVienFulltime() {
    }

    public NhanVienFulltime(String maNhanVien, String hoTen, int tuoi, String soDienThoai, String email, int luongCung, int tienThuong, int tienPhat) {
        super(maNhanVien, hoTen, tuoi, soDienThoai, email);
        this.luongCung = luongCung;
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
    }

    public int getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(int luongCung) {
        this.luongCung = luongCung;
    }

    public int getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(int tienThuong) {
        this.tienThuong = tienThuong;
    }

    public int getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(int tienPhat) {
        this.tienPhat = tienPhat;
    }

    @Override
    public int luongThucLinh() {
        return luongCung + tienThuong - tienPhat;
    }

    @Override
    public String toString() {
        return "Mã nhân viên: " + getMaNhanVien() +
                " | Họ tên: " + getHoTen() +
                " | Tuổi: " + getTuoi() +
                " | Số điện thoại: " + getSoDienThoai() +
                " | Email: " + getEmail() +
                "\n Lương cứng: " + getLuongCung() + " VNĐ" +
                " | Tiền thưởng: " + getTienThuong() + " VNĐ" +
                " | Tiền phạt: " + getTienPhat() + " VNĐ" +
                " | Lương thực lĩnh: " + luongThucLinh() + " VNĐ" +
        "\n ---------------------------------------\n";
    }
}