import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuanLySinhVien extends Frame implements ActionListener {
    // ===== Cac thanh phan nhap thong tin =====
    private Label lblTieuDe;
    private Label lblNhapThongTin, lblHienThi;
    private Label lblHoTen, lblMaSV, lblNgaySinh, lblGioiTinh, lblDanToc, lblNgoaiNgu;
    private TextField txtHoTen, txtMaSV, txtNgaySinh, txtDanToc;
    private CheckboxGroup cbgGioiTinh; // nhom radio: chi chon 1 trong 2
    private Checkbox rdNam, rdNu;
    private Checkbox chkAnh, chkPhap, chkNga, chkTrung; // checkbox: chon nhieu
    private TextArea txtHienThi;
    private Button btnNhap, btnThem, btnDong;
    // Bien dem so luong sinh vien da nhap (dung khi hien thi danh sach)
    private int soLuongDaNhap = 0;
    private JPanel panel1;

    public QuanLySinhVien() {
        // ===== Thiet lap cua so Frame =====
        setTitle("CHUONG TRINH QUAN LY SINH VIEN - 2020");
        setSize(650, 430);
        setLayout(null); // Trinh quan ly sap xep tu do
        setResizable(false);
        // ===== Tieu de chuong trinh =====
        lblTieuDe = new Label("CHUONG TRINH NHAP HO SO SINH VIEN - 2020", Label.CENTER);
        lblTieuDe.setFont(new Font("Arial", Font.BOLD, 14));
        lblTieuDe.setBounds(120, 10, 400, 25);
        add(lblTieuDe);
        // ===== Nhan khu vuc =====
        lblNhapThongTin = new Label("NHAP THONG TIN:");
        lblNhapThongTin.setFont(new Font("Arial", Font.BOLD, 12));
        lblNhapThongTin.setBounds(20, 45, 200, 20);
        add(lblNhapThongTin);
        lblHienThi = new Label("HIEN THI THONG TIN:");
        lblHienThi.setFont(new Font("Arial", Font.BOLD, 12));
        lblHienThi.setBounds(350, 45, 200, 20);
        add(lblHienThi);
        // ===== Ho va Ten =====
        lblHoTen = new Label("Ho va Ten:");
        lblHoTen.setBounds(30, 80, 100, 20);
        add(lblHoTen);
        txtHoTen = new TextField();
        txtHoTen.setBounds(140, 80, 170, 22);
        add(txtHoTen);
        // ===== Ma SV =====
        lblMaSV = new Label("Ma SV:");
        lblMaSV.setBounds(30, 115, 100, 20);
        add(lblMaSV);
        txtMaSV = new TextField();
        txtMaSV.setBounds(140, 115, 170, 22);

        add(txtMaSV);
        // ===== Ngay sinh =====
        lblNgaySinh = new Label("Ngay sinh:");
        lblNgaySinh.setBounds(30, 150, 100, 20);
        add(lblNgaySinh);
        txtNgaySinh = new TextField();
        txtNgaySinh.setBounds(140, 150, 170, 22);
        add(txtNgaySinh);
        // ===== Gioi tinh (RadioButton) =====
        lblGioiTinh = new Label("Gioi tinh:");
        lblGioiTinh.setBounds(30, 185, 100, 20);
        add(lblGioiTinh);
        cbgGioiTinh = new CheckboxGroup();
        rdNam = new Checkbox("Nam", cbgGioiTinh, true); // mac dinh chon Nam
        rdNam.setBounds(140, 185, 70, 20);
        add(rdNam);
        rdNu = new Checkbox("Nu", cbgGioiTinh, false);
        rdNu.setBounds(215, 185, 70, 20);
        add(rdNu);
        // ===== Dan toc =====
        lblDanToc = new Label("Dan toc:");
        lblDanToc.setBounds(30, 220, 100, 20);
        add(lblDanToc);
        txtDanToc = new TextField();
        txtDanToc.setBounds(140, 220, 170, 22);
        add(txtDanToc);
        // ===== Ngoai ngu (Checkbox) =====
        lblNgoaiNgu = new Label("Ngoai ngu:");
        lblNgoaiNgu.setBounds(30, 255, 100, 20);
        add(lblNgoaiNgu);
        chkAnh = new Checkbox("Anh", true); // mac dinh tich Anh (giong mau)
        chkAnh.setBounds(140, 255, 60, 20);
        add(chkAnh);
        chkPhap = new Checkbox("Phap", false);
        chkPhap.setBounds(200, 255, 65, 20);
        add(chkPhap);
        chkNga = new Checkbox("Nga", false);
        chkNga.setBounds(265, 255, 60, 20);
        add(chkNga);
        chkTrung = new Checkbox("Trung", false);
        chkTrung.setBounds(140, 300, 70, 20);
        add(chkTrung);
        // ===== TextArea hien thi thong tin =====
        txtHienThi = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
        txtHienThi.setBounds(350, 70, 260, 260);
        txtHienThi.setEditable(false); // chi hien thi, khong cho sua truc tiep
        add(txtHienThi);
        // ===== Cac nut bam =====
        btnNhap = new Button("Nhap");
        btnNhap.setBounds(60, 340, 90, 30);
        add(btnNhap);

        btnThem = new Button("Them");

        btnThem.setBounds(200, 340, 90, 30);
        add(btnThem);
        btnDong = new Button("Dong");
        btnDong.setBounds(340, 340, 90, 30);
        add(btnDong);
        // ===== Dang ky su kien cho cac nut =====
        btnNhap.addActionListener(this);
        btnThem.addActionListener(this);
        btnDong.addActionListener(this);
        // ===== Su kien dong cua so khi bam nut X =====
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        // Dat con tro vao truong Ho va Ten khi khoi dong
        txtHoTen.requestFocus();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object nguon = e.getSource();
        if (nguon == btnNhap) {
            xuLyNhap();
        } else if (nguon == btnThem) {
            xuLyThem();
        } else if (nguon == btnDong) {
            xuLyDong();
        }
    }

    /**
     * Xu ly khi bam nut "Nhap":
     * Doc du lieu tu cac truong nhap, kiem tra hop le va hien thi
     * sang vung "HIEN THI THONG TIN" (TextArea).
     */
    private void xuLyNhap() {
        String hoTen = txtHoTen.getText().trim();
        String maSV = txtMaSV.getText().trim();
        String ngaySinh = txtNgaySinh.getText().trim();
        String danToc = txtDanToc.getText().trim();
        String gioiTinh = cbgGioiTinh.getSelectedCheckbox().getLabel();
        // Kiem tra du lieu bat buoc
        if (hoTen.isEmpty() || maSV.isEmpty()) {
            txtHienThi.append("[Loi] Vui long nhap Ho ten va Ma SV!\n");
            return;
        }
        // Lay danh sach ngoai ngu da chon
        StringBuilder ngoaiNgu = new StringBuilder();
        if (chkAnh.getState()) ngoaiNgu.append("Anh ");
        if (chkPhap.getState()) ngoaiNgu.append("Phap ");
        if (chkNga.getState()) ngoaiNgu.append("Nga ");
        if (chkTrung.getState()) ngoaiNgu.append("Trung ");
        if (ngoaiNgu.length() == 0) ngoaiNgu.append("Khong chon");
        soLuongDaNhap++;
        // Ghep chuoi thong tin va hien thi ra TextArea

        String thongTin = "----- Sinh vien " + soLuongDaNhap + " -----\n"
                + "Ho va Ten : " + hoTen + "\n"
                + "Ma SV : " + maSV + "\n"
                + "Ngay sinh : " + ngaySinh + "\n"
                + "Gioi tinh : " + gioiTinh + "\n"
                + "Dan toc : " + danToc + "\n"
                + "Ngoai ngu : " + ngoaiNgu.toString().trim() + "\n\n";
        txtHienThi.append(thongTin);
    }

    /**
     * Xu ly khi bam nut "Them":
     * Xoa toan bo cac truong nhap va dat lai gia tri mac dinh,
     * dua con tro ve truong Ho va Ten de cho nhap tiep.
     */
    private void xuLyThem() {
        txtHoTen.setText("");
        txtMaSV.setText("");
        txtNgaySinh.setText("");
        txtDanToc.setText("");
        // Dat lai gia tri mac dinh
        cbgGioiTinh.setSelectedCheckbox(rdNam); // mac dinh Nam
        chkAnh.setState(true);
        chkPhap.setState(false);
        chkNga.setState(false);
        chkTrung.setState(false);
        // Dua con tro text ve truong Ho ten
        txtHoTen.requestFocus();
    }

    /**
     * Xu ly khi bam nut "Dong":
     * Dong cua so va ket thuc chuong trinh.
     */
    private void xuLyDong() {
        setVisible(false);
        dispose();
        System.exit(0);
    }

    public static void main(String[] args) {
        new QuanLySinhVien();
    }
}
