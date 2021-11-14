/**
* The purpose of this class is to model a television
* @author Iuliia Stanina
* @since 10-28-2020
*/

public class Television
{
   private String MANUFACTURER;     // brand of the TV
   private int SCREEN_SIZE;         // screen size in inches
   private boolean powerOn;         // determines if tv is on or off
   private int channel;             // represents channel number
   private int volume;              // set volume
   
   // Television constructor initilizes default parameters for the powerOn, channel, volume
   // and getsmanufacturer and screen size from input arguments.
   /**
   * This method is constructor method which initilizes new Television object
   * @param method takes 2 parameters integer parameter for screen and brand parameter for manufacturer
   * @author Iuliia Stanina
   * @since 10-28-2020
   */
   public Television(String brand, int screen){
      MANUFACTURER = brand;
      SCREEN_SIZE = screen;
      powerOn = false;
      channel = 2;
      volume = 20;
   }
   
   /**
   * This method is used to set the channel number for TV. 
   * @param method takes integer parameter, representing the number of the channel
   * @author Iuliia Stanina
   * @since 10-28-2020
   */
   public void setChannel(int station){
      channel = station;
   }
   
   /**
   * This method is used to switch TV ON/OFF 
   * @param method doesn't take any parameters, it sets up powerOn to true/false
   * @author Iuliia Stanina
   * @since 10-28-2020
   */
   public void power(){ 
      powerOn = !powerOn;
   }
   
   /**
   * This method is used to increase the volube of TV by 1 
   * @param method doesn't take any parameters, increments volume by 1 each method call
   * @author Iuliia Stanina
   * @since 10-28-2020
   */
   public void increaseVolume(){
      volume++;
   }
   
   /**
   * This method is used to decrease the volube of TV by 1 
   * @param method doesn't take any parameters, decrements volume by 1 each method call
   * @author Iuliia Stanina
   * @since 10-28-2020
   */
   public void decreaseVolume(){
      volume--;
   }
   
   /**
   * This method returns the channel number
   * @param method doesn't take any parameters
   * @return integer This returns integer number of the channel
   * @author Iuliia Stanina
   * @since 10-28-2020
   */
   public int getChannel(){
      return channel;
   }
   
   /**
   * This method returns the volume number
   * @param method doesn't take any parameters
   * @return integer This returns integer number of the volume
   * @author Iuliia Stanina
   * @since 10-28-2020
   */
   public int getVolume(){
      return volume;
   }
   
   /**
   * This method returns the brand of TV
   * @param method doesn't take any parameters
   * @return String This returns string the name of the TV brand
   * @author Iuliia Stanina
   * @since 10-28-2020
   */
   public String getManufacturer(){
      return MANUFACTURER;
   }
   
   /**
   * This method returns the screen size
   * @param method doesn't take any parameters
   * @return integer This returns integer the screen size
   * @author Iuliia Stanina
   * @since 10-28-2020
   */
   public int getScreenSize(){
      return SCREEN_SIZE;
   }
   
}