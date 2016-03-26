/*
 * 1. In a Runner class, make Spongebob. Use the methods below to make him eat, and laugh.
 * 2. Make Patrick and Squidward and print their name, have them eat, and make them laugh.
 */

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SeaCreature {

	private String name;

	SeaCreature(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name;
	}

	public void eat() {
		System.out.println(name + " is eating krabby patties");
	}
	public static void main (String[]args){
		SeaCreature creature = new SeaCreature("Spongebob");
		System.out.println(creature.getName());
		creature.eat();
		creature.laugh();
		SeaCreature creatures = new SeaCreature("Patrick");
		System.out.println(creatures.getName());
		creatures.eat();
		creatures.laugh();
		SeaCreature creaturess = new SeaCreature("Squidward");
		System.out.println(creaturess.getName());
		creaturess.eat();
		creaturess.laugh();
	}
	public void laugh() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(
					"/Users/League/Google Drive/league-sounds/" + this.name + ".wav").toURI().toURL());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}