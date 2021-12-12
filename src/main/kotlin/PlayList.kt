import dataClasses.Album
import dataClasses.Song

interface Playlist {
    fun addSong(song: Song)
    fun addAlbum(album: Album)
    fun shuffle()
}