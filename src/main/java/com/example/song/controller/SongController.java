package com.example.song.controller;

import com.example.song.service.*;
import com.example.song.model.*;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.*;
import java.util.*;


@RestController
public class SongController{
    @Autowired
    private SongJpaService songService;

    @GetMapping("/songs")
    public ArrayList<Song> getSongs(){
        return songService.getSongs();
    }

    @GetMapping("/songs/{songId}")
    public Song getSongById(@PathVariable("songId") int songId){
        return songService.getSongById(songId);
    }

    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song){
        return songService.addSong(song);
    }

    @PutMapping("/songs/{songId}")
    public Song updatedSong(@PathVariable("songId") int songId, @RequestBody Song song){
        return songService.updatedSong(songId, song);
    }

    @DeleteMapping("/songs/{songId}")
    public void deleteSong(@PathVariable("songId") int songId){
        songService.deleteSong(songId);
    }
}

