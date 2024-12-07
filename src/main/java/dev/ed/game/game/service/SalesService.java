package dev.ed.game.game.service;

import dev.ed.game.game.domain.Sales;

import java.util.List;

public interface SalesService {

    /**
     * return all sales information
     * @return
     */
    List<Sales> getSales();

    /**
     * save sales
     * @param sales
     */
    void saveSales(Sales sales);

    /**
     * delete sales
     * @param gameId
     */
    void deleteSalesById(Integer gameId);

    /**
     *
     * @param gameid
     * @param price
     * @param sales
     */
    void updateSalesById(Integer gameid, Integer price, Integer sales);
}
