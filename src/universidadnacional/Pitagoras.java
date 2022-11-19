package universidadnacional;

public class Pitagoras {
public static double calcular_hipotenusa(double catetoa,double catetob){
	double hipotenusa;
	hipotenusa=Math.sqrt(Math.pow(catetoa, 2)+ Math.pow(catetob, 2));
	return hipotenusa;
}
}
