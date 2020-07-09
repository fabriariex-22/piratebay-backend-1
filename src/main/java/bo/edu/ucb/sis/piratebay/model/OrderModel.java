package bo.edu.ucb.sis.piratebay.model;

public class OrderModel {


    private Integer order_id;
    private String date;
    private String first_name;
    private String first_surname;
    private String  direction;
    private Integer quantity;

    public OrderModel(int anInt, String string, String resultSetString, String setString, int resultSetInt) {
    }

    public OrderModel(Integer order_id, String date, String first_name, String first_surname, String direction, Integer quantity) {
        this.order_id = order_id;
        this.date = date;
        this.first_name = first_name;
        this.direction = direction;
        this.quantity = quantity;
    }



    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getFirst_surname() {
        return first_surname;
    }

    public void setFirst_surname(String first_surname) {
        this.first_surname = first_surname;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}