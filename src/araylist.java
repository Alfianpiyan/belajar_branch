import java.util.ArrayList;
public class araylist {
    public static void main(String[] args) throws Exception{
        ArrayList sekolahTb = new ArrayList<>();

        //mengisi araylist
        sekolahTb.add(0,"SMK TARUNA BHAKTI");
        sekolahTb.add(1,"Jl.Pekapuran");
        sekolahTb.add(2, 1234);
        sekolahTb.add(true);

        //menghapus arraylist
        sekolahTb.remove(2);

        //mngambil nilai
        System.out.println(sekolahTb.get(0));

        //cek array kosong
        System.out.println(sekolahTb.isEmpty());

        //cari index
        System.out.println(sekolahTb.indexOf("Jl.Pekapuran"));

        //update nilai
        sekolahTb.set(1, "Jl.Pekapuran curug cimanggis depok");

        //cari nilai
        System.out.println(sekolahTb.contains("Jl.Pekapuran"));

        System.out.println(sekolahTb);
        System.out.println("kantong ajaib berisi"+ sekolahTb.size()+"item");
    }
}
