//Written By Zach Zhong
package P3A;
public class SongDriver
{
    
    public static void main (String[] args) {
    
        Song wakeUpSong = new Song ("Wake up","Zach Zhong",666,320);
        System.out.println(wakeUpSong.getLengthInSec());
        wakeUpSong.setLengthInSec(423);
        System.out.println(wakeUpSong.getLengthInSec());
        System.out.println(wakeUpSong.toString());
        System.out.println(wakeUpSong.getMinutes());
        System.out.println(wakeUpSong.getSeconds());
    
    }
    
    
}
