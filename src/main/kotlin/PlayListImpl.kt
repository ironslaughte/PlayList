import dataClasses.Album
import dataClasses.Song

class PlayListImpl(
    private val songs : MutableList<Song>,
    private val albums : MutableList<Album>,
) : Playlist {
    private val playList : MutableList<Song> = mutableListOf()
    init{
        if(playList.isEmpty()){
            // Создаем плейлист
            albums.listIterator().let {
                while(it.hasNext()){
                    playList.addAll(it.next().songList)
                }
            }
            songs.listIterator().let {
                while(it.hasNext()){
                    playList.add(it.next())
                }
            }
        }
    }
    override fun addSong(song : Song){
        songs.add(song)
        // Обновляем плейлист
        playList.add(song)
    }

    override fun addAlbum(album : Album) {
        albums.add(album)
        // Обновляем плейлист
        playList.addAll(album.songList)

    }
    override fun shuffle(){
        playList.shuffle()
    }
    override fun toString(): String {
        return "Playlist:\n$playList"
    }
}