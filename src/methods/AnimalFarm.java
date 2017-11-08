package methods;

//Copyright (c) The League of Amazing Programmers 2013-2017
//Level 0


import java.io.File;
import java.nio.channels.ShutdownChannelGroupException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

AnimalFarm() {
	/*
	 * 1. Ask the user which animal they want, then play the sound of that
	 * animal.
	 */
	String light = JOptionPane.showInputDialog("what animal you want to play a noice UGH");
	/* 2. Make it so that the user can keep entering new animals. */
if (light.equals("wolf")){
	playWoof();
}
	
else if (light.equals("cow")){
	playMoo();
}
else if (light.equals("DUCK")){
	playQuack();
}

else if (light.equals("LLama")){
	playLLama();
}else if (light.equals("Kitty")){
	 playKittyCat();
}


 
else {
	JOptionPane.showMessageDialog(null, "BACK AWAY FROM THE COMPUTER NOW, or you are going to die right now or you just run away.No you are going to get the code right now or you are my servent FOREVER IN YOUR LIFE.DIE NOW or sufer the conseces");}
}


void playMoo() {
	playNoise(mooFile);
}

void playQuack() {
	playNoise(quackFile);
}

void playWoof() {
	playNoise(woofFile);
}

void playLLama() {
	playNoise(llamaFile);
}

void playKittyCat() {
	playNoise(meowFile);
}
String quackFile = "quack.wav";
String mooFile = "moo.wav";
String woofFile = "woof.wav";
String meowFile = "meow.wav";
String llamaFile = "llama.wav";


/* Ignore this stuff */

public void playNoise(String soundFile) {
	try {
		 Clip clip = AudioSystem.getClip();
		 clip.open(AudioSystem.getAudioInputStream(getClass().getResource(soundFile)));
		 clip.start();
		 Thread.sleep(3400);
	} catch (Exception ex) {
  	ex.printStackTrace();
	}
}

public static void main(String[] args) {
	new AnimalFarm();
}

}

