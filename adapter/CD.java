package adapter;


import java.util.ArrayList;

public class CD implements DigitalAlbum{
    private ArrayList<String> songs;
    private int currentIndex = 0;
/**
 * CD
 * @param songs arraylist of songs for cd
 */
public CD(ArrayList<String> songs)
{
    this.songs = songs;
}
/**
 * plays first song
 * @return String for song playing
 */
public String playFromBeginning()
{
    currentIndex = 0;
        return "Playing song "+currentIndex+" "+songs.get(currentIndex);
}
/**
 * plays song
 * @return String for song playing
 */
public String playSong(int num)
{
    if(songs.get(num)!=null&&num>0&&songs.size()<num)
        return "Playing "+songs.get(num-1);
    else
        return "Not a valid song number";
    

}
/**
 * plays prev song
 * @return new song
 */
public String prevSong()
{
    currentIndex = currentIndex-1;
        return "Skipping back and playing: " +songs.get(currentIndex-1);
}
/**
 * plays next song
 * @return new song
 */
public String nextSong()
{
    currentIndex++;
        return "Playing "+currentIndex+": "+songs.get(currentIndex-1);
}
/**
 * arraylist is null
 * @return String saying CD stopped
 */
public String stop()
{
    songs = null;
        return "Stopping";
}
public String pause()
{
    return "Pausing";
}

}
