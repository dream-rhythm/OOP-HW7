package fcu.iecs.oop.pokemon;

public class Charmander extends Pokemon{
	@Override
	public void attack(){
		System.out.println("Ember...");
	}
	@Override
	public void shout(){
		System.out.println("小火~小火~");//不是"嘎啦!嘎啦!"嗎?
	}
	public Charmander(String name, PokemonType type, int cp){
		super(name,type,cp);
	}
}
