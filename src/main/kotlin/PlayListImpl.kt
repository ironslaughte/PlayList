import dataClasses.Album
import dataClasses.Song

class PlayListImpl(
    private val songs : MutableList<Song>,
    private val albums : MutableList<Album>,
    private val playList : MutableList<Song> = mutableListOf()
) : Playlist {
    override fun addSong(song : Song){
        songs.add(song)
    }

    override fun addAlbum(album : Album) {
        albums.add(album)
    }
    override fun shuffle(){
        // Добавляем все песни(из альбомов тоже) в один плейлист
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
        // После формирования плейлиста перемешиваем песни в нем
        playList.shuffle()
    }
    override fun toString(): String {
        return "Playlist:\n$playList"
    }
}