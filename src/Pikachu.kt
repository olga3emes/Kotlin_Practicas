class Pikachu (
    nombre:String,
    numeroPokedex: Int,
    tipo: Tipo,
): Pokemon(nombre, numeroPokedex=25, Tipo.ELECTRICO), Atacante{

    override fun atacar() {
       println("$nombre usa impactrueno")
    }

    override fun ataqueEspecial() {
        println("$nombre usa rayo")
    }

    override fun recibirAtaque(cantidad: Int) {
        super.recibirAtaque(cantidad)
        if(cantidad > 0) {
            println("$nombre sigue con vida")
        }else{
            println("Ohh $nombre ha sido vencido")
        }

    }
}
