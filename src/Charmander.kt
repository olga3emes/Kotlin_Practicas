class Charmander (
    nombre:String,
    numeroPokedex: Int
): Pokemon(nombre, numeroPokedex=4), Atacante {

    override fun atacar() {
        println("$nombre usa ascuas")
    }

    override fun ataqueEspecial() {
        println("$nombre usa lanzallamas")
    }

    override fun recibirAtaque(cantidad: Int) {
        super.recibirAtaque(cantidad)
        if (cantidad > 0) {
            println(" $nombre sigue con vida")
        } else {
            println("Ohh $nombre  ha sido vencido")
        }

    }
}
