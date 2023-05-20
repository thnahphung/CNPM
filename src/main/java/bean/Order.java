package bean;

public class Order {
    private int id;
    private int total;
    private int user_id;
    private int room_id;

    private int time_id;

    public Order() {

    }

    public Order(int id, int total, int user_id, int room_id, int timeId) {
        this.id = id;
        this.total = total;
        this.user_id = user_id;
        this.room_id = room_id;
        time_id = timeId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public int getTime_id() {
        return time_id;
    }

    public void setTime_id(int time_id) {
        this.time_id = time_id;
    }
}

