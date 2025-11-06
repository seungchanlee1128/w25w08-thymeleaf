package kr.ac.kumoh.s20220832.w25w08_thymeleaf.service

import kr.ac.kumoh.s20220832.w25w08_thymeleaf.repository.SongRepository
import org.springframework.stereotype.Service

@Service
class songservice (
    private val repository : SongRepository
) {
    fun getAllSongs() = repository.findAll()
    fun getSongById(id: Int) = repository.findId(id)
    fun getRandomSong() = repository.findAll().randomOrNull()
}