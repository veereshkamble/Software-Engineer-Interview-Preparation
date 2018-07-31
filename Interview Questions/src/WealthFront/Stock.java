package WealthFront;

import java.util.*;
import java.util.stream.*;

class Stock {

    public String tickerSymbol;

    public Stock(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }
}

class Position {

    public Stock stock;
    public int quantity;

    public Position(Stock stock, int quantity) {
        this.stock = stock;
        this.quantity = quantity;
    }

}

class Portfolio {

    public int cash;
    public List<Position> positions;

    public Portfolio(int cash, Position... positions) {
        this.cash = cash;
        this.positions = new ArrayList<>(Arrays.asList(positions));
    }

}

