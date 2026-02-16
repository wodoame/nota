package com.amalitech.nota.controller;

import com.amalitech.nota.entity.Note;
import com.amalitech.nota.repository.NoteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    private final NoteRepository noteRepository;

    public NoteController(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @GetMapping
    public List<Note> getAllNotes() {
        return noteRepository.findAllByOrderByCreatedAtDesc();
    }

    @PostMapping
    public ResponseEntity<Note> createNote(@RequestBody Note note) {
        Note savedNote = noteRepository.save(note);
        return new ResponseEntity<>(savedNote, HttpStatus.CREATED);
    }
}
