package model;

public class Room {
    private int id;
    private int number_room;
    private String type;
    private String description;
    private int price;
    private String image_src;
    private int vendor_id;
    private int status;

    public Room() {

    }

    public Room(int id, int number_room, String type, String description, int price, String image_src, int vendor_id, int status) {
        this.id = id;
        this.number_room = number_room;
        this.type = type;
        this.description = description;
        this.price = price;
        this.image_src = image_src;
        this.vendor_id = vendor_id;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber_room() {
        return number_room;
    }

    public void setNumber_room(int number_room) {
        this.number_room = number_room;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImage_src() {
        return image_src;
    }

    public void setImage_src(String image_src) {
        this.image_src = image_src;
    }

    public int getVendor_id() {
        return vendor_id;
    }

    public void setVendor_id(int vendor_id) {
        this.vendor_id = vendor_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", number_room=" + number_room +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", image_src='" + image_src + '\'' +
                ", vendor_id=" + vendor_id +
                ", status=" + status +
                '}';
    }
}

