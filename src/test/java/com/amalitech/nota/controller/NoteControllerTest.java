package com.amalitech.nota.controller;

import com.amalitech.nota.entity.Note;
import com.amalitech.nota.repository.NoteRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(NoteController.class)
class NoteControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private NoteRepository noteRepository;

    @Test
    void shouldReturnAllNotes() throws Exception {
        Note note = new Note();
        note.setId(1L);
        note.setTitle("Test Note");
        note.setContent("Content");

        Mockito.when(noteRepository.findAllByOrderByCreatedAtDesc()).thenReturn(List.of(note));

        mockMvc.perform(get("/api/notes"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].title").value("Test Note"));
    }

    @Test
    void shouldCreateNote() throws Exception {
        Note note = new Note();
        note.setId(1L);
        note.setTitle("New Note");
        note.setContent("New Content");

        Mockito.when(noteRepository.save(any(Note.class))).thenReturn(note);

        mockMvc.perform(post("/api/notes")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"title\":\"New Note\", \"content\":\"New Content\"}"))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.title").value("New Note"));
    }
}
