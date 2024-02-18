package com.example.transcribenurse.api

import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile
import java.nio.file.Paths

@RestController
@RequestMapping("/api/transcription")
class TranscriptionController(private val testService: TestService) {

    @GetMapping("/number")
    fun getNumber() = testService.getNumber()

    @PostMapping("/upload")
    fun uploadAudio(@RequestPart("audio") audio: MultipartFile, @RequestPart("name") name: String){
        audio.transferTo(Paths.get("src/main/resources/static/audios/${name}.ogg"))
    }

}