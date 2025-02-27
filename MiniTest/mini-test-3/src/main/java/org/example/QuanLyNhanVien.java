package org.example;

import java.util.ArrayList;
import java.util.List;

public class QuanLyNhanVien {
    private List<NhanVien> nhanvien = new ArrayList<>();

    public List<NhanVien> getNhanvien() {
        return nhanvien;
    }

    public void setNhanvien(List<NhanVien> nhanvien) {
        this.nhanvien = nhanvien;
    }

    public void addNhanVien(NhanVien nhanvien) {
        this.nhanvien.add(nhanvien);
    }

    public int luongTrungBinh() {
        int tongLuong = 0;
        for (NhanVien nv : nhanvien) {
            tongLuong += nv.luongThucLinh();
        }
        return tongLuong / nhanvien.size();
    }

    public List<NhanVienFulltime> luongFulltimeThap() {
        List<NhanVienFulltime> luongFulltimeThapList = new ArrayList<>();
        int luongTrungBinh = luongTrungBinh();

        for (NhanVien nv : nhanvien) {
            if (nv instanceof NhanVienFulltime) {
                if (nv.luongThucLinh() < luongTrungBinh) {
                    luongFulltimeThapList.add((NhanVienFulltime) nv);
                }
            }
        }
        return luongFulltimeThapList;
    }

    public int tongLuongParttime() {
        int tongLuongPart = 0;
        for (NhanVien nv : nhanvien) {
            if (nv instanceof NhanVienParttime) {
                tongLuongPart += nv.luongThucLinh();
            }
        }
        return tongLuongPart;
    }

    public List<NhanVienFulltime> nhanVienFulltimeList() {
        List<NhanVienFulltime> nhanVienFulltimeList = new ArrayList<>();
        for (NhanVien nv : nhanvien) {
            if (nv instanceof NhanVienFulltime) {
                nhanVienFulltimeList.add((NhanVienFulltime) nv);
            }
        }
        return nhanVienFulltimeList;
    }

    public List<NhanVienFulltime> luongFulltimeTangDan() {
        List<NhanVienFulltime> luongFulltimeTangDanList = nhanVienFulltimeList();

        int size = luongFulltimeTangDanList.size();

        int pos;
        NhanVienFulltime x;
        for (int i = 0; i < size; i++) {
            x = luongFulltimeTangDanList.get(i);
            pos = i;

            while (pos > 0 && x.luongThucLinh() < luongFulltimeTangDanList.get(pos - 1).luongThucLinh()) {
                luongFulltimeTangDanList.set(pos, luongFulltimeTangDanList.get(pos - 1));
                pos--;
            }
            luongFulltimeTangDanList.set(pos, x);
        }
        return luongFulltimeTangDanList;
    }

    public List<NhanVien> timNhanVienTheoTen(String ten) {
        List<NhanVien> timNhanVienTheoTenList = new ArrayList<>();

        ten = ten.toLowerCase();
        for (NhanVien nv : nhanvien) {
            if (nv.getHoTen().toLowerCase().contains(ten)) {
                timNhanVienTheoTenList.add(nv);
            }
        }
        return timNhanVienTheoTenList;
    }
}
