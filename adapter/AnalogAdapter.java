package adapter;

public class AnalogAdapter implements AnalogAlbum{
   
    private DigitalAlbum album;
    /**
     * AnalogAdapter class
     * @param album digital Album
     */
    AnalogAdapter(DigitalAlbum album)
    {
        this.album = album;
    }
    /**
     * calls play
     * @return play String
     */
    public String play()
    {
        return album.nextSong();
    }
     /**
     * previous song
     * @return String for song
     */
    public String rewind()
    {
        return album.prevSong();
    }
     /**
     * fast forward song
     * @return String for song
     */
    public String ffwd()
    {
        return album.nextSong();
    }
     /**
     * pause song
     * @return String for pause
     */
    public String pause()
    {
        return album.pause();
    }
     /**
     * eject cassettee
     * @return eject String
     */
    public String stopEject()
    {
        return album.stop();
    }
   
    }
