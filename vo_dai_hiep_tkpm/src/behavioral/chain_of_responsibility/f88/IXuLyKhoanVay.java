package behavioral.chain_of_responsibility.f88;

public interface IXuLyKhoanVay {
    IXuLyKhoanVay capCaoHon(IXuLyKhoanVay xuLyKhoanVay); //phuong thuc SetSuccessor
    String xuLyVay(int tienVay);
}
