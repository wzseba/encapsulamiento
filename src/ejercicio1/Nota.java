package ejercicio1;

public class Nota {

	/**
	 * pre : valorInicial est� comprendido entre 0 y 10. post: inicializa la Nota
	 * con el valor indicado.
	 */
	private int valorInicial;

	private boolean esNotaValida(int valor) {
		return (valor >= 0 && valor <= 10);
	}

	public Nota(int valorInicial) {
		if (!esNotaValida(valorInicial)) {
			throw new Error("nota invalida");
		}
		this.valorInicial = valorInicial;
	}

	/**
	 * post: devuelve el valor num�rico de la Nota, comprendido entre 0 y 10.
	 */
	public int obtenerValor() {
		return valorInicial;
	}

	/**
	 * post: indica si la Nota permite o no la aprobaci�n.
	 */
	public boolean aprobado() {
		return obtenerValor() >= 4;
	}

	/**
	 * post: indica si la Nota implica desaprobaci�n.
	 */
	public boolean desaprobado() {
		return !aprobado();
	}

	/**
	 * pre : nuevoValor est� comprendido entre 0 y 10. post: modifica el valor
	 * num�rico de la Nota, cambi�ndolo por nuevoValor, siempre y cuando nuevoValor
	 * sea superior al valor num�rico actual de la Nota.
	 */

	public void recuperar(int nuevoValor) {
		if (!esNotaValida(nuevoValor)) {
			throw new Error("nota invalida");
		}
		if (nuevoValor > obtenerValor()) {
			this.valorInicial = nuevoValor;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nota parcial1 = new Nota(4);

		System.out.println("nota del primer parcial: " + parcial1.obtenerValor());
		System.out.println("aprobado: " + parcial1.aprobado());

		System.out.println("------------------------------------------");

		Nota parcial2 = new Nota(3);

		System.out.println("nota del segundo parcial: " + parcial2.obtenerValor());
		System.out.println("desaprobado: " + parcial2.desaprobado());

		System.out.println("------------------------------------------");
		parcial2.recuperar(8);
		System.out.println("recuperatorio: " + parcial2.obtenerValor());

	}

}
