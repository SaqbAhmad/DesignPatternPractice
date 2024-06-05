package builderDesignPattern2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Mobile vivo = new Mobile.MobileBuilder("Vivo", "white").setProcessor("Snapdraggen").setRam("5GB").build();
        
        System.out.println(vivo);
        
        Mobile iPhone = new Mobile.MobileBuilder("Iphone", "Black").setProcessor("snapdraggen").setRam("8GB").build();
        System.out.println(iPhone);
        
        Mobile nokia = new Mobile.MobileBuilder("Nokia", "Red").build();
        
        System.out.println(nokia);
        		
        
	}

}
