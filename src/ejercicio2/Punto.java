package ejercicio2;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Punto {

	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Punto() {
		this(0, 0);
	}

	public boolean estaSobreElEjeX() {
		return y == 0;
	}

	public boolean estaSobreElEjeY() {
		return x == 0;
	}

	public boolean esElOrigenDeCoordenadas() {
		return estaSobreElEjeX() && estaSobreElEjeY();
	}

	public double distanciaAlOrigen() {
		return distancia(new Punto());
	}

	public static double distancia(Punto p1, Punto p2) {
		return Math.hypot(p1.x - p2.x, p1.y - p2.y);
	}

	public double distancia(Punto p) {
		return sqrt(pow(p.x - this.x, 2) + pow(p.y - this.y, 2));
	}
}
