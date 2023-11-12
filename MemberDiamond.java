package id.ac.unand.fti.si.pbo;

public class MemberDiamond extends MemberGold implements CanDeposit {

    private Integer id;
    private String nama;

  public MemberDiamond (int jarakTempuh, int cicilanBulan,Integer id, String nama) {
    super  (jarakTempuh,cicilanBulan);
    this.id = id;
    this.nama = nama;
  }

    public String getName() {
        return nama;
    }

    public Integer getid() {
        return id;
    }
   public void deposit(Integer amount){
        System.out.println("Melakukan deposit sebesar " + amount);
    }
    public void tarikTunai(Integer amount){
     System.out.println("Melakukan penarikan tunai sebesar " + amount);
  }
 
   public void cek () {
    System.out.println("id member : " + this.id + " dengan nama " + this.nama);
  }
    
}
