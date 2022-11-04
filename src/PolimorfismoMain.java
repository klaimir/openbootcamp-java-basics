public class PolimorfismoMain {

	public static void main(String[] args) {
		
		Coche coche1 = new CocheElectrico();

		CocheElectrico coche2 = new CocheElectrico();
		
		CocheHibrido coche3 = new CocheHibrido();
		
		// polimorfismo
		
		Coche coche4 = new CocheElectrico();
		
		Coche coche5 = new CocheHibrido();
		
		if(coche4 instanceof CocheElectrico) {
			System.out.println(coche4);
		}
		
		if(coche5 instanceof CocheElectrico) {
			System.out.println(coche5);
		}
	}

}
