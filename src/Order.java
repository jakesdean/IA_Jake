public class Order {

    private Integer type;
    private Integer length;
    private Integer cookie;
    private Integer menu;
    private Integer cup;
    private final Integer[] veggies = new Integer[9];

    void setType(Integer type) {
        this.type = type;
    }

    void setLength(Integer length) {
        this.length = length;
    }

    void setCookie(Integer cookie) {
        this.cookie = cookie;
    }

    void setMenu(Integer menu) {
        this.menu = menu;
    }

    void setCup(Integer cup) {
        this.cup = cup;
    }

    void setVeggies(Integer[] veggies) {
        System.arraycopy(veggies, 0, this.veggies, 0, 9);
    }

    Integer getType() {
        return type;
    }

    Integer getLength() {
        return length;
    }

    Integer getCookie() {
        return cookie;
    }

    Integer getCup() {
        return cup;
    }

    Integer[] getVeggies() {
        return veggies;
    }

    Double getPrice() {
        double price;
        double tPrice;
        if (menu == 0) {
            price = 16;
        } else if (menu == 1 && length == 1) {
            price = 12;
        } else if (menu == 1 && length == 0) {
            price = 10;
        } else {
        if (type == 3) {
            tPrice = 5.90;
        } else if (type == 2 || type == 4|| type == 5) {
            tPrice = 6.50;
        } else {
            tPrice = 6.90;
        }

        if (length == 1) {
            price = tPrice + 6;
        } else {
            price = tPrice;
        }

        if (cookie != 5) {
            price = price + 1.50;
        }

        if (cup == 0) {
            price = price + 3.00;
        } else if (cup == 1) {
            price = price + 3.50;
        } else if (cup == 2) {
            price = price + 4.00;
        }}
        return price;
    }
}

