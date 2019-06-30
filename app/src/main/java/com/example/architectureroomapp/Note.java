package com.example.architectureroomapp;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

// Room annotation in compile time it will create all the nessery code to create an SQL table for this model
// without Room we would do that in SqlOpenHelper class
// Room will automatically generate columns for these fields
@Entity(tableName = "note_table")
public class Note {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;
    private String description;
    private int priority;

    // We didn't include the id as it is the primary key and it will be generated automatically
    public Note(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    // Room cant re create the id cuz it is not in the constructor that's why we've used setter for id
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}
