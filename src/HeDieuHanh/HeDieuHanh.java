package HeDieuHanh;

public class HeDieuHanh {
    protected String maHDH;
    protected String tenHDH;
    protected String phienBan;
    protected String kienTruc;
    protected String nhaPhatTrien;

    public HeDieuHanh() {
    }
    
    public HeDieuHanh(String maHDH, String tenHDH, String phienBan, String kienTruc, String nhaPhatTrien) {
        this.maHDH = maHDH;
        this.tenHDH = tenHDH;
        this.phienBan = phienBan;
        this.kienTruc = kienTruc;
        this.nhaPhatTrien = nhaPhatTrien;
    }

    public String getMaHDH() {
        return maHDH;
    }

    public String getTenHDH() {
        return tenHDH;
    }

    public String getPhienBan() {
        return phienBan;
    }

    public String getKienTruc() {
        return kienTruc;
    }

    public String getNhaPhatTrien() {
        return nhaPhatTrien;
    }

    public void setMaHDH(String maHDH) {
        this.maHDH = maHDH;
    }

    public void setTenHDH(String tenHDH) {
        this.tenHDH = tenHDH;
    }

    public void setPhienBan(String phienBan) {
        this.phienBan = phienBan;
    }

    public void setKienTruc(String kienTruc) {
        this.kienTruc = kienTruc;
    }

    public void setNhaPhatTrien(String nhaPhatTrien) {
        this.nhaPhatTrien = nhaPhatTrien;
    }
    
    public String getLoaiHeDieuHanh() {
        return "Hệ điều hành chung";
    }

    public String hienThiThongTin() {
        return String.format("Mã: %s | Tên: %s (%s) | Kiến trúc: %s | Hãng: %s",
                maHDH, tenHDH, phienBan, kienTruc, nhaPhatTrien);
    }

    @Override
    public String toString() {
        return hienThiThongTin();
    }
}
