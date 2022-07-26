package com.example.a13cscassignment4.entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

// Serializing
@Entity(tableName = "notes")
public class Note implements Serializable {

    // Primary Key
    @PrimaryKey(autoGenerate = true)
    private int id;

    // Title
    @ColumnInfo(name = "title")
    private String title;

    // Date
    @ColumnInfo(name = "date_time")
    private String dateTime;

    // Subtitle
    @ColumnInfo(name = "subtitle")
    private String subtitle;

    // Note Text
    @ColumnInfo(name = "note_text")
    private String note_text;

    // Image Input
    @ColumnInfo(name = "image_path")
    private String imagePath;

    // Colour
    @ColumnInfo(name = "color")
    private String color;

    // Input for links
    @ColumnInfo(name = "web_link")
    private String weblink;

    // The following lines of code reflect the previous
    // Now they are getting serialized
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getNote_text() {
        return note_text;
    }

    public void setNote_text(String note_text) {
        this.note_text = note_text;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeblink() {
        return weblink;
    }

    public void setWeblink(String weblink) {
        this.weblink = weblink;
    }

    @NonNull
    @Override
    public String toString() {
        return title + " : " + dateTime;
    }
}
