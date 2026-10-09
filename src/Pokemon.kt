abstract class Pokemon (
    protected val nombre:String,
    private val numeroPokedex: Int
    ){

    protected var vida= 100

    abstract fun atacar()

    open fun recibirAtaque(cantidad: Int){
        vida -= cantidad
        println("$nombre recibe $cantidad de daño. Le quedan $vida puntos de vida")
    }

    fun mostrarPokedex(){
        println("Pokedex nº $numeroPokedex")
    }

    override fun toString(): String{
        return nombre
    }

}