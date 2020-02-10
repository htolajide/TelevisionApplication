/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisionapplication;

/**
 *
 * @author Hammed
 */
public class TelevisionApplication {

    private int channelId;
    private int volume;
    private boolean isTvSwitchedOn;
    private String channelName;
    private String[] channelArray = {"NTA", "AIT", "OSRC", "Channels", "TVC", "Orisun", "Nigbati"};
    /**
     * @param args the command line arguments
     */
   public boolean isTvSwitchedOn(){
       return isTvSwitchedOn;
   }
    
   public void turnTvOn(){
       isTvSwitchedOn = true;
   }
   public void turnTvOff(){
       isTvSwitchedOn = false;
   }
   
   public int getChannelId(){
       return channelId;
   }
   
   public int getVolume(){
       return volume;
   }
   public void changeChannel(int newChannel){
       if(isTvSwitchedOn){
           channelId = newChannel;
       }
   }
   
   public String getChannel(int newChannel){
       if(isTvSwitchedOn){
          channelName = channelArray[newChannel];
       }
       return channelName;
    }
   
   public void channelUp(){
       if(channelId >= 0 && channelId <= channelArray.length-2)
           channelId++; 
   }
   
   public void channelDown(){
       if(channelId > 0)
       channelId--;
   }
   public void volumeUp(){
       volume++;
   }
   
   public void volumeDown(){
       volume--;
   }
   
   public boolean getTvState(){
       if(isTvSwitchedOn)
            return true;
       else
           return false;
   }
}
