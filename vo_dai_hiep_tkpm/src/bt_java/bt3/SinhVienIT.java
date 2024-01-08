package bt_java.bt3;

public class SinhVienIT extends SinhVienPoly{
    double java, html, css;
    public SinhVienIT(String hoTen, String nganh, double java, double html, double css) {
        super(hoTen, nganh);
        this.java = java;
        this.html = html;
        this.css = css;
    }
    @Override
    public double getDiem() {
        return (2 * java + html + css) / 4;
    }
}
