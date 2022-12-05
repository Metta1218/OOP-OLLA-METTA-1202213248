public class MainApp {
    public static void main(String[] args) throws Exception {
     Transportasi_air transair=new Transportasi_air(50, 20000);
     transair.informasi(50, 20000);
     Kapal titanic=new Kapal();
     titanic.informasi();
     Sampan ekonomis=new Sampan();
     ekonomis.informasi();
    }
}
