package kablewie;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sounds {

	
	

	

	static void Lose(){
		
		File lose = new File("C:\\Users\\Ceri\\workspace\\235 test\\src\\audio.wav");
		try{
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(lose));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength()/1000);
			}catch(Exception e){
		}
	}

	 static void Win() {
		
		File win = new File("C:\\Users\\Ceri\\workspace\\235 test\\src\\win.wav");
		
		try{
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(win));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength()/1000);
			}catch(Exception e){
		}
		// 
		
	}
}
