/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author noorishhassan
 */
public class AudioDriver {
    
    private static AudioDriver audioDriver;
    
    private AudioDriver(){}
    
    public static AudioDriver getAudioDriver(){
        
        if (audioDriver != null){
            System.out.println("getting audio driver...");
            return audioDriver;
        }
        System.out.println("configuring audio driver...");
        audioDriver = new AudioDriver();
        return audioDriver;
    }
}
