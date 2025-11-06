package kr.ac.kumoh.s20220832.w25w08_thymeleaf.repository

import kr.ac.kumoh.s20220832.w25w08_thymeleaf.model.Song
import org.springframework.stereotype.Repository

@Repository
class SongRepository {
    private val songs = listOf(
        Song(1, "outwest", "travis scott")
    )
    fun findAll() = songs.toList()

    fun findId(id: Int) : Song?{
        return songs.find { it.id == id}
    }

    fun count() = songs.size


}