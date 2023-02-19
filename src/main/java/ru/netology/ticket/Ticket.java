package ru.netology.ticket;

public class Ticket implements Comparable<Ticket> {
    private int id;
    private int price;
    private String from; //аэропорт вылета
    private String to; //аэропорт прилета
    private int time; //время в пути в минутах

    public Ticket(int id, int price, String from, String to, int time) {
        this.id = id;
        this.price = price;
        this.from = from;
        this.to = to;
        this.time = time;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public int compareTo(Ticket o) {
        if (price < o.getPrice()) {
            return -1;
        } else if (price > o.getPrice()) {
            return 1;
        } else {
            return 0;
        }
    }
}
