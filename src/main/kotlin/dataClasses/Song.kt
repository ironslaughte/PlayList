package dataClasses

import  SongGenre

data class Song(
    val genre: SongGenre,
    val performer: Artist,
    val title: String = "None",
)
