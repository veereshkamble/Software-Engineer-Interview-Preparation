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

    /*
        If the buy is viable then execute it, otherwise do nothing.
        */
    public void buy(Stock stock, int quantity, int price) {
        //throw new UnsupportedOperationException("Implement this method.");
        int positionPresent = 0;
        if(quantity > 1 && price >= 0) {
            if(this.cash >= quantity * price) {
                this.cash = this.cash - (quantity * price);
                for(Position position : positions) {
                    if(position.stock.tickerSymbol.equals(stock.tickerSymbol)) {
                        position.quantity = position.quantity + quantity;
                        positionPresent = 1;
                    }
                }

                if(positionPresent == 0) {
                    positions.add(new Position(stock, quantity));
                }
            }
        }
    }

    /*
   If the sell is viable then execute it, otherwise do nothing.
   */
    public void sell(Stock stock, int quantity, int price) {
        //throw new UnsupportedOperationException("Implement this method.");
        if(quantity > 1 && price >= 0) {
            for(Position position : positions) {
                if(position.stock.tickerSymbol.equals(stock.tickerSymbol)) {
                    if(position.quantity >= quantity) {
                        this.cash = this.cash + (quantity * price);
                        position.quantity = position.quantity + quantity;
                    }
                }
            }
        }
    }
}

class Solution {
    public String solution(String symbol, int quantity, int price) {
        Portfolio portfolio = new Portfolio(1000,
                new Position(new Stock("AAPL"), 20),
                new Position(new Stock("MSFT"), 10));
        portfolio.buy(new Stock(symbol), quantity, price);

        Portfolio portfolio1 = new Portfolio(2000,
                new Position(new Stock("ASD"), 30),
                new Position(new Stock("MSFT"), 22));

        return Stream.concat(
                Stream.of("CASH:" + portfolio.cash),
                portfolio.positions.stream()
                        .sorted((p1, p2) -> p1.stock.tickerSymbol.compareToIgnoreCase(p2.stock.tickerSymbol))
                        .map(p -> p.stock.tickerSymbol + ":" + p.quantity))
                .collect(Collectors.joining(","));
    }
}

