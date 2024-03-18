import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;

interface SoSanhDuoc {
    int soSanh(Object a, Object b);
}

interface SapXepDuoc {
    void sapXepTangDan(Object[] mang);
    void sapXepGiamDan(Object[] mang);
    Object timPhanTuLonNhat(Object[] mang);
    Object timPhanTuNhoNhat(Object[] mang);
}

class PhanSo implements SoSanhDuoc {
    private int tuSo;
    private int mauSo;

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    
    @Override
    public int soSanh(Object a, Object b) {
        PhanSo phanSoA = (PhanSo) a;
        PhanSo phanSoB = (PhanSo) b;
        double giaTriA = phanSoA.giaTri();
        double giaTriB = phanSoB.giaTri();
        if (giaTriA < giaTriB) {
            return -1;
        } else if (giaTriA > giaTriB) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public void nhapPhanSo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        int tuSo = scanner.nextInt();
        System.out.print("Nhap mau so: ");
        int mauSo = scanner.nextInt();
        
    }

   
    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

   

    public double giaTri() {
        return (double) tuSo / mauSo;
    }

    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
}

class MangPhanSo implements SapXepDuoc {
    PhanSo[] mang;

    public MangPhanSo(int size) {
        mang = new PhanSo[size];
    }

    public void nhapMangPhanSo() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < mang.length; i++) {
            System.out.println("Nhap phan so thu " + (i + 1) + ":");
            System.out.print("Nhap tu so: ");
            int tuSo = scanner.nextInt();
            System.out.print("Nhap mau so: ");
            int mauSo = scanner.nextInt();
            mang[i] = new PhanSo(tuSo, mauSo);
        }
    }

    @Override
    public void sapXepTangDan(Object[] mang) {
        Arrays.sort(mang, (a, b) -> Double.compare(((PhanSo) a).giaTri(), ((PhanSo) b).giaTri()));
    }

    @Override
    public void sapXepGiamDan(Object[] mang) {
        Arrays.sort(mang, (a, b) -> Double.compare(((PhanSo) b).giaTri(), ((PhanSo) a).giaTri()));
    }

    @Override
    public Object timPhanTuLonNhat(Object[] mang) {
        return Arrays.stream(mang).max((a, b) -> Double.compare(((PhanSo) a).giaTri(), ((PhanSo) b).giaTri())).orElse(null);
    }

    @Override
    public Object timPhanTuNhoNhat(Object[] mang) {
        return Arrays.stream(mang).min((a, b) -> Double.compare(((PhanSo) a).giaTri(), ((PhanSo) b).giaTri())).orElse(null);
    }
}

class Bai5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int size = scanner.nextInt();
        MangPhanSo mangPhanSo = new MangPhanSo(size);
        mangPhanSo.nhapMangPhanSo(); // Call the method to input the array of fractions
        mangPhanSo.sapXepTangDan(mangPhanSo.mang);
        System.out.println("Mang phan so tang dan: " + Arrays.toString(mangPhanSo.mang));
        mangPhanSo.sapXepGiamDan(mangPhanSo.mang);
        System.out.println("Mang phan so giam dan: " + Arrays.toString(mangPhanSo.mang));
        System.out.println("Phan tu lon nhat: " + mangPhanSo.timPhanTuLonNhat(mangPhanSo.mang));
        System.out.println("Phan tu nho nhat: " + mangPhanSo.timPhanTuNhoNhat(mangPhanSo.mang));
    }
}

