import dataClasses.*

fun main() {
    val song1 = Song(SongGenre.ROCK, Artist("Andrey", "Pyrokinesis"), "CURSED")
    val song2 = Song(SongGenre.RAP, Artist("Fedor", "STED.D"), "SUPREMACY")
    val album1 = Album(
        "53:55",
        mutableListOf(
            Song(SongGenre.POP, Artist("Egor", "EGOR NATS"), "Словонепробиваемая"),
            Song(SongGenre.POP, Artist("Egor", "EGOR NATS"), "Ты всегда одна"),
            Song(SongGenre.BLUES, Artist("Egor", "EGOR NATS"), "Уходи")
        )
    )
    val album2 = Album(
        "Депрессии не сущетсвует",
        mutableListOf(
            Song(SongGenre.RAP, Artist("Fedor", "STED.D"), "Записки на теле"),
            Song(SongGenre.CLASSIC, Artist("Fedor", "STED.D"), "Однажды мне сказали"),
            Song(SongGenre.ELECTRONIC, Artist("Fedor", "STED.D"), "Жатва")
        )
    )

    val playList = PlayListImpl(mutableListOf(song1, song2), mutableListOf(album1, album2))

    playList.shuffle()
    println(playList)
    playList.shuffle()
    println(playList)
}
