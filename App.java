package id.ac.unand.fti.si.pbo;



public class App {
    
    public static void main(String[] args) {
        
    MemberGold a = new MemberDiamond (24,12,2304,"Ilham"); //polimorfisme terjadi disini karena saya membuat objek MemberDiamond tetapi  menyimpan objek tersebut dalam variable dengan tipe referensi MemberGold.Meskipun variabel a memiliki tipe referensi MemberGpld, tetapi karena objek yang sesungguhnya adalah objek MemberDiamond, metode cek yang dipanggil adalah metode cek dari kelas MemberDiamond. 
        System.out.println(a.getPoin());
        System.out.println();
        a.cek();
}
}