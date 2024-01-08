package template_method.entityDB;

public class SinhVienDB extends EntityDB63<SinhVien>{

    @Override
    protected int getID(SinhVien sinhVien) {
        return sinhVien.id;
    }
}
