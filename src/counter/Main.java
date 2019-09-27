package counter;

//import java.io.FileInputStream;
//import sun.audio.*;

public class Main
{
    /*
    public static void music()
    {
        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM ;
        AudioData MD;
        ContinuousAudioDataStream loop = null;
        try
        {
            BGM = new AudioStream(new FileInputStream("drum_roll_rimshot.wav"));
            MD = BGM.getData();
            loop = new ContinuousAudioDataStream(MD);
        }
        catch(Exception ex)
        {
            
        }
        MGP.start();
    }
*/
    public static void main(String[] args)
    {
        //music();
        Menu object = new Menu();
        object.setVisible(true);
    }
}