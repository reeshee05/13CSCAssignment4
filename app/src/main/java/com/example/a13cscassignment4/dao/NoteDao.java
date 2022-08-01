package com.example.a13cscassignment4.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.a13cscassignment4.entities.Note;

import java.util.List;

// Main class for database interaction
@Dao
public interface NoteDao {

    // Bind an item to an id
    @Query("SELECT * FROM notes ORDER BY id DESC")
    List<Note> getAllNotes();

    // Checks if there is a duplicate item
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertNote(Note note);

    // Deletes note
    @Delete
    void deleteNote(Note note);

}
