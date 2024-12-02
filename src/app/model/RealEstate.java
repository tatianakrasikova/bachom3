package app.model;

import java.math.BigDecimal;
import java.util.Objects;

public class RealEstate {
    private long id;
    private String title;
    private BigDecimal price;
    private String number;

    public RealEstate(long id, String title, BigDecimal price) {
        this.id = id;
        this.title = title;
        this.price = price;

    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getNumber() {
        return number;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RealEstate that)) return false;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(price, that.price) && Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, price, number);
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", number='" + number + '\'' +
                '}';


    }
}
