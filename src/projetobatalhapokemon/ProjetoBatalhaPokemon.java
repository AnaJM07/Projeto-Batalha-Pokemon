
package projetobatalhapokemon;

public class ProjetoBatalhaPokemon {


    public static void main(String[] args) {
       Pokemon meuPokemon = new Pokemon("Charmander", "Fogo", 50);
        Pokemon outroPokemon = new Pokemon("Squirtle", "Agua", 0);
        Batalha batalha1 = new Batalha();
        
        meuPokemon.calculaAtributos();
        outroPokemon.calculaAtributos();
        
        batalha1.meuPokemon(meuPokemonNome.nome,meuPokemonHP.getHP());
        batalha1.outroPokemon(outroPokemonNome.nome, outroPokemonHP.getHP());
        
        batalha1.start();
    }
    
}
