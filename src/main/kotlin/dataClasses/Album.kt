package dataClasses

data class Album(
    val name : String = "None",
    val songList : MutableList<Song> = mutableListOf()
)
