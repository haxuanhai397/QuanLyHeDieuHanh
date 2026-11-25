package HeDieuHanh;

public class HeDieuHanhMobile extends HeDieuHanh {
    private String khoUngDung;
    private boolean hoTroCamUng;

    public HeDieuHanhMobile() {
    }

    public HeDieuHanhMobile(String khoUngDung, boolean hoTroCamUng, String maHDH, String tenHDH, String phienBan, String kienTruc, String nhaPhatTrien) {
        super(maHDH, tenHDH, phienBan, kienTruc, nhaPhatTrien);
        this.khoUngDung = khoUngDung;
        this.hoTroCamUng = hoTroCamUng;
    }

    public String getKhoUngDung() {
        return khoUngDung;
    }

    public boolean isHoTroCamUng() {
        return hoTroCamUng;
    }

    public void setKhoUngDung(String khoUngDung) {
        this.khoUngDung = khoUngDung;
    }

    public void setHoTroCamUng(boolean hoTroCamUng) {
        this.hoTroCamUng = hoTroCamUng;
    }
    
    @Override
    public String getLoaiHeDieuHanh() {
        return "Hệ điều hành di động (Mobile)";
    }

    @Override
    public String hienThiThongTin() {
        String camUngText = hoTroCamUng ? "Có" : "Không";
        return String.format("[%s] %s | Kho ứng dụng: %s | Cảm ứng: %s",
                getLoaiHeDieuHanh(), super.hienThiThongTin(), khoUngDung, camUngText);
    }
}
