package co.kklo.test.matematica.operaciones.basicas;

public class Suma {
	private int resultado = 0;

	public Suma(int... sumandos) {
		for (int sumando : sumandos) {
			adicionarSumando(sumando);
		}
	}

	public void adicionarSumando(int sumando) {
		resultado = resultado + sumando;
	}
	
	public int resultado() {
		return resultado;
	}
}
