package com.example.architectureroomapp;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

//Dao class should be either an interface or abstract class since we don't write the method body
// We just write the method and annotation and then Room will generate the necessary code for us
// it's good to create a Dao for each Entity
// in Dao create methods for all the operations that we wanna do on the Node table
@Dao
public interface NoteDao {

    @Insert
    void insert(Note node);

    @Update
    void update(Note node);

    @Delete
    void delete(Note node);

    @Query("DELETE FROM note_table")
    void deleteAllNotes();

    @Query("SELECT * FROM note_table ORDER BY priority DESC")
    LiveData<List<Note>> getAllNotes();
    //Here we can Observe our object so when ever there a change u=in the table "Note"
    // So the List will automatically be updated and Our Activity will be notified
    // Room takes care of all the stuff that update this LiveData

   /* @Query("SELECT * FROM note_table ORDER BY priority DESC")
    List<Note> selectAllNotes();*/
   //

}
