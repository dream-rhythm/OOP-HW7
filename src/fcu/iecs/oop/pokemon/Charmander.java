package fcu.iecs.oop.pokemon;

public class Charmander extends Pokemon{
	@Override
	public void attack(){
		System.out.println("Ember...");
	}
	@Override
	public void shout(){
		System.out.println("�p��~�p��~");//���O"�ǰ�!�ǰ�!"��?
	}
	public Charmander(String name, PokemonType type, int cp){
		super(name,type,cp);
	}
}
