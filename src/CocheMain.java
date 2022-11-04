public class CocheMain {

	public static void main(String[] args) {
		
		Coche cocheObj1 = new CocheElectrico("rojo", "toyota", 200.0, 50, null);
		Coche cocheObj2 = new CocheHibrido("negro", "peugeot", 400.0, 70, null);
		
		System.out.println(cocheObj1);
		
		cocheObj2.acelerar(10);
		
		System.out.println(cocheObj2);	
		
		Coche cocheObj3 = new CocheElectrico("negro2", "peugeot2", 400.0, 170, "Electrico");
		
		cocheObj3.acelerar(10);
		
		cocheObj3.color = "Azul";
		
		System.out.println(cocheObj3);	

	}

}
