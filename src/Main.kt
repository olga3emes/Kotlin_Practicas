//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    val nombre: String = "Dart"

    val cadenita: String = 23.toString()

    val numerito: Int? = "23sadf".toIntOrNull();

    var abdc = "gjhsdjf"

    abdc = abdc + "23"

    print(abdc)

    val lista = mutableListOf(1, 2, 3, 4)
    lista[0] = 45
    lista.add(56)

    // No podemos alteramos la posición de memoria lista = lista.sort()


    var cambiante = mutableListOf(1, 45, 9, 67)
    cambiante.add(56)
    cambiante.sort()

    fun esPar(parametro: Int): Boolean {
        return parametro % 2 == 0;
    }

    fun esPar2(parametro: Int): Boolean = parametro % 2 == 0;

    fun vacia(palabritas: String) = print(palabritas);

    vacia("Esta es la función vacía");

    fun unirVacias(function: (String) -> Unit, mundo: String): String {
        vacia("Hello world");
        return mundo;
    }

    //TODO: aclarar esto con los alumnos

    fun sumar(a: Int, b: Int): Int {
        return a + b;
    }

    fun utilizarSumar(a: Int, b: Int, funcion: (Int, Int) -> Int): Int {
        return funcion(a, b);
    }

    val resultado = utilizarSumar(2, 3, ::sumar);


    fun calcularPrecio(precio: Double, iva: Double = 0.21, descuento: Double = 0.0): Double {
        return precio * (1 + iva) - descuento;
    }

    print(calcularPrecio(100.0));
    print(calcularPrecio(100.0, 0.10));
    print(calcularPrecio(100.0, 0.10, 0.50));



    fun saludar(nombre: String = "Mundo") {
        println("Hola, $nombre !")//$ con los string en las llamadas!
    }

    saludar()

}

