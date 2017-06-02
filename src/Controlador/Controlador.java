package Controlador;
import java.util.ArrayList;
import java.util.Scanner;

import Persona.Persona;

public class Controlador {
	Scanner s = new Scanner(System.in);
	ArrayList<Persona> pe = new ArrayList<Persona>();

	public Controlador() {
		pe.add(new Persona("jose", "piccoli", "123123", true));
		pe.add(new Persona("analia", "salazar", "123321", false));
	}
	public void Alta(Persona p) {	
		pe.add(p);
	}
	public void Baja(String dni) {
		for (Persona per : pe) {
			if (per.getDNI().equals(dni)) {
				pe.remove(per);
				break;
			}		}	}
	public void Modifica(Persona p) {
		for (Persona per : pe) {
			if (per.getDNI().equals(p.getDNI())) {
				pe.remove(per);
				break;
			}
		}

		
		this.pe.add(p);
	}

	public void consulta() {
		for (Persona p : pe) {
			System.out.println("Nombre: " + p.getNombre() + "\n" + "Apellido: " + p.getApellido() + "\n" + "DNI: "
					+ p.getDNI() + "\n" + "Habilitado :" + p.isHabilitado());

		}

	}

	public Persona PorDni(Persona p) {

			
			for (Persona per : pe) {
				if (per.getDNI().equals(p.getDNI())) {
					System.out.println("Nombre: " + per.getNombre() + "\nApellido: " + per.getApellido() + "\nDni: "
							+ per.getDNI() + "\nEsta Habilitado? " + per.isHabilitado());
					return per;					
				} 
			}
			return null;

		}

	

	public void porNombre(String Nombre, String Apellido) {
		for (Persona per : pe) {
			if (per.getNombre().equals(Nombre)) {
				if (per.getApellido().equals(Apellido)) {

					System.out.println("Nombre: " + per.getNombre() + "\nApellido: " + per.getApellido() + "\nDni: "
							+ per.getDNI() + "\nEsta Habilitado? " + per.isHabilitado());
					break;
				}
			}

		}
	}

}