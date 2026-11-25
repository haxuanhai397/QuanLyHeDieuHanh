package HeDieuHanh;

public class HeDieuHanhDesktop extends HeDieuHanh {
    private String giaoDienDoHoa;
    private String loaiBanQuyen;

    public HeDieuHanhDesktop() {
    }

    public HeDieuHanhDesktop(String giaoDienDoHoa, String loaiBanQuyen, String maHDH, String tenHDH, String phienBan, String kienTruc, String nhaPhatTrien) {
        super(maHDH, tenHDH, phienBan, kienTruc, nhaPhatTrien);
        this.giaoDienDoHoa = giaoDienDoHoa;
        this.loaiBanQuyen = loaiBanQuyen;
    }

    public String getGiaoDienDoHoa() {
        return giaoDienDoHoa;
    }

    public String getLoaiBanQuyen() {
        return loaiBanQuyen;
    }

    public void setGiaoDienDoHoa(String giaoDienDoHoa) {
        this.giaoDienDoHoa = giaoDienDoHoa;
    }

    public void setLoaiBanQuyen(String loaiBanQuyen) {
        this.loaiBanQuyen = loaiBanQuyen;
    }
    
    @Override
    public String getLoaiHeDieuHanh() {
        return "Hệ điều hành máy tính (Desktop)";
    }
    
    @Override
    public String hienThiThongTin() {
        return String.format("[%s] %s | Giao diện: %s | Bản quyền: %s",
                getLoaiHeDieuHanh(), super.hienThiThongTin(), giaoDienDoHoa, loaiBanQuyen);
    }
}
