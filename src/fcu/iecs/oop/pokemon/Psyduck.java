package fcu.iecs.oop.pokemon;

public class Psyduck extends Pokemon{
	@Override
	public void attack(){
		System.out.println("Aqua Tail...");
	}
	@Override
	public void shout(){
		System.out.println("©K~©K~");
	}
	public Psyduck(String name, PokemonType type, int cp){
		super(name,type,cp);
	}
}
