package com.example.demoapirest.dao;

import com.example.demoapirest.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<Note, Integer> {
    List<Note> findByUserUsername(String username);

    Note findByIdAndUserUsername(int id, String username);
}
