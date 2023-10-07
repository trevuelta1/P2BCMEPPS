package nominas;

public class Empleado {
	public enum TipoEmpleado{Vendedor, Encargado, Otro}
	public static float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		if(ventasMes < 0 || horasExtra < 0) {
			return -1;
		} else {
			if(tipo == TipoEmpleado.Encargado) {
				float total = 2500 + horasExtra * 30;
				if(ventasMes >= 1000 && ventasMes < 1500) {
					total = total + 100;
				} else if(ventasMes >= 1500) {
					total = total + 200;
				}
				return total;
			} else if (tipo == TipoEmpleado.Vendedor){
				float total = 2000 + horasExtra * 30;
				if(ventasMes >= 1000 && ventasMes < 1500) {
					total = total + 100;
				} else if(ventasMes >= 1500) {
					total = total + 200;
				}
				return total;
			} else {return -1;}
		}
	}
	public static float calculoNominaNeta(float nominaBruta) {
		float retencion;
		if(nominaBruta < 0) {
			return -1;
		} else if(nominaBruta < 2100 && nominaBruta >= 0) {
			retencion = 0;
		} else if(nominaBruta >= 2500) {
			retencion = nominaBruta * 0.18f;
		} else {retencion = nominaBruta * 0.15f;}
		return (nominaBruta - retencion);
	}
}
