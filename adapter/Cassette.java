package adapter;

import java.util.ArrayList;

public class Cassette implements AnalogAlbum{
    private ArrayList<String> songs;
    private int currentIndex = 0;
/**
 * cassette class
 * @param songs arraylist of songs for cassette
 */
public Cassette(ArrayList<String> songs)
{
    this.songs = songs;
}
/**
 * plays the cassette
 * @return String for the song playing
 */
public String play()
{
    currentIndex++;
    return "Playing song "+currentIndex+": "+songs.get(currentIndex-1);
}
/**
 * plays previous song
 * @return new song playing
 */
public String rewind()
{
    if(currentIndex-1>=0)
    {
        currentIndex = currentIndex-1;
        return "Rewinding to song "+(currentIndex+1);
    }
    else if(currentIndex-1==0)
    {
        currentIndex = currentIndex-1;
        return "Fully Re-wound";
    }
    else
    return "Can't rewind anymore";   
}
/**
 * plays next song
 * @return fast forward
 */
public String ffwd()
{
    if(currentIndex==songs.size())
    {
        return "At the end of the cassette you need to rewind";
    }
    else if(currentIndex<songs.size())
    currentIndex++;
    int temp = currentIndex+1;
    if(currentIndex==songs.size())
        return "Forward to the end of the cassette";
    else
        return "Forward to song "+temp;
}
public String pause()
{
    return "Pausing";
}
/**
 * arraylist is null
 * @return String says cassette eject
 */
public String stopEject()
{
    songs = null;
    return "Stopping cassette and ejecting";
}
}
