public class Order {

    private static Integer type;
    private static Integer length;
    private static Integer cookie;
    private static Integer menu;
    private static Integer cup;
    private static final Integer[] veggies = new Integer[9];

    void setType(Integer type) {
        Order.type = type;
    }

    void setLength(Integer length) {
        Order.length = length;
    }

    void setCookie(Integer cookie) {
        Order.cookie = cookie;
    }

    void setMenu(Integer menu) {
        Order.menu = menu;
    }

    void setCup(Integer cup) {
        Order.cup = cup;
    }

    void setVeggies(Integer[] veggies) {
        System.arraycopy(veggies, 0, Order.veggies, 0, 9);
    }

    static Integer getType() {
        return type;
    }

    static Integer getLength() {
        return length;
    }

    static Integer getCookie() {
        return cookie;
    }

    static Integer getCup() {
        return cup;
    }

    static Integer[] getVeggies() {
        return veggies;
    }

    static Double getPrice() {
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
        }
        return price;
        }
      return price;
    }
}

