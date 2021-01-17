
package projetobatalhapokemon;
public class Pokemon {
    //Atributos genéricos de um pokémon
    //Encapsulamento
    private String nome;
    private String tipo;
    private int level;
    private int hp = 200;
    private int ataque;
    private int defesa;
    
    //Construtor da Classe
    public Pokemon(String nome, String tipo, int level){
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
                
        calculaAtributos();
        calculaBonus();
    }
    
    //Get
    public int getHP(){
        return this.hp;
    }
    
    public int getAtaque(){
        return this.ataque;
    }
    
    public int getDefesa(){
        return this.defesa;
    }
    
    //Set
    public void setNome(String nome){
        this.nome = nome;
    }
    
    //Métodos que podem ser usados por um objeto do tipo pokemon    
    private void calculaAtributos(){
        switch(tipo){
            case "Fogo":
                hp = hp - 20;
                ataque = 50;
                defesa = 20;
            break;
            
            case "Agua":
                hp = hp - 5;
                ataque = 20;
                defesa = 35;
            break;
            
            case "Terra":
                hp = hp + 20;
                ataque = 15;
                defesa = 40;
            break;
            
            case "Ar":
                hp = hp + 25;
                ataque = 40;
                defesa = 20;
            break;
        }
    }
    
    private void calculaBonus(){
        
        hp = hp + (level / 2);
        ataque = ataque + (level / 3);
        defesa = defesa + (level / 4);
        
    }   
       
    public void imprimiPokemon(){
        
        System.out.println(
                "Nome: " + nome + " | " + 
                    "Tipo: " + tipo + " | " + 
                        "Level: " + level + " | " + 
                            "Vida: " + hp + " | " +
                                "Ataque: " + ataque + " | " +
                                    "Defesa: " + defesa + "\n");
        
    }   
}
