import java.util.HashMap;

public class PrincipalHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer, String> alineacion=new HashMap<Integer, String>();
		
		
		
		
		alineacion.put(4,"Iñigo Martinez");
		alineacion.put(1,"Unai Simon");
		alineacion.put(2,"Christian Ganea");
		alineacion.put(11,"Iñigo Cordova");
		alineacion.put(3,"Unai Nuñez");
		
		//System.out.println(alineacion.get(1));
		
		for (String nombre : alineacion.values()) {
			System.out.println(nombre);
		}
		System.out.println("//////////////////");
		
		for (Integer numero : alineacion.keySet()) {
			
			String mensaje="";
			mensaje="Con el "+numero+": "+alineacion.get(numero);
			System.out.println(mensaje);
		}
		
		
		
		
		
	}

}
