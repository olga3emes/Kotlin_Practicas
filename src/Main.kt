fun main(){

    //Polimorfismo
    val equipo: List<Pokemon> = listOf(
        Pikachu("Pikachu", 25),
        Charmander("Charmander", 4)
    )

    for (pokemon in equipo){
        pokemon.atacar()
        pokemon.recibirAtaque(25)
        println()
    }


    // Interfaces

    val pikachita = Pikachu("Pikapi", 25)

    pikachita.ataqueEspecial()
    pikachita.esquivar()

    val entrenador = object {
        val nombre = "Ash"
        val pokemonAsh= equipo;
        fun llamarPokemon(){
            for(pokemon in pokemonAsh){
                println(pokemon.toString()+" tu turno es ahora!")
            }
        }
    }

    entrenador.llamarPokemon()

}