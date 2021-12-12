import dataClasses.Album
import dataClasses.Song

class PlayListImpl(
    songs: List<Song>,
    albums: List<Album>,
) : Playlist {
    private val playList: MutableList<Song> = mutableListOf()

    init {
        playList.addAll(songs)
        albums.forEach { playList.addAll(it.songList) }
    }

    override fun addSong(song: Song) {
        playList.add(song)
    }

    override fun addAlbum(album: Album) {
        playList.addAll(album.songList)

    }

    override fun shuffle() {
        playList.shuffle()
    }

    override fun toString(): String {
        return "Playlist:\n$playList"
    }
}