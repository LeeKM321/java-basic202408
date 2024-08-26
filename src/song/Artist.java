package song;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Artist implements Serializable {

    private String artistName; // 가수명
    private Set<String> songList; // 노래목록

    /*
    public Artist(String artistName) {
        this.artistName = artistName;
        this.songList = new HashSet<>();
    }
    */

    public Artist(String artistName, Set<String> songList) {
        this.artistName = artistName;
        this.songList = songList;
    }

    public boolean addSong(String songName) {
//        songName.equalsIgnoreCase() -> 대/소문자 구분 없이 문자 스펠링이 동일한지를 체크하는 메서드.
        // Set의 add는 객체 추가 성공 여부를 리턴.
        return this.songList.add(songName);
    }

    public String getArtistName() {
        return artistName;
    }

    public Set<String> getSongList() {
        return songList;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistName='" + artistName + '\'' +
                ", songList=" + songList +
                '}';
    }
}















