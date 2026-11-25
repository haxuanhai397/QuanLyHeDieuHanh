package TestThu;

import java.util.ArrayList;
import java.util.List;
import HeDieuHanh.HeDieuHanh;
import HeDieuHanh.HeDieuHanhDesktop;
import HeDieuHanh.HeDieuHanhMobile;

public class TestTH1 {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
        List<HeDieuHanh> danhSachHDH = new ArrayList<>();

        danhSachHDH.add(new HeDieuHanhDesktop(
                "HDH01", "Windows 11 Pro", "24H2", "x86_64",
                "Microsoft", "Fluent Design", "Thương mại"
        ));

        danhSachHDH.add(new HeDieuHanhDesktop(
                "HDH02", "Ubuntu Linux", "24.04 LTS", "x86_64",
                "Canonical", "GNOME", "Mã nguồn mở"
        ));

        danhSachHDH.add(new HeDieuHanhMobile(
                "Google Play Store", true, "HDH03",
                "Android", "15", "ARM64","Google"
        ));

        danhSachHDH.add(new HeDieuHanhMobile(
                "App Store", true, "HDH04",
                "iOS", "18", "ARM64","Apple"
        ));

        System.out.println("=== DANH SÁCH HỆ ĐIỀU HÀNH (TH1) ===");
        for (HeDieuHanh hdh : danhSachHDH) {
            System.out.println(hdh.hienThiThongTin());
        }
    }
}
