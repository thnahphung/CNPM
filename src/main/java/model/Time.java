package model;

import java.time.LocalDateTime;

public class Time {
    private int id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int room_id;


    public Time(int id, LocalDateTime startTime, LocalDateTime endTime, int room_id) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.room_id = room_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }
}
