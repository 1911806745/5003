package dev.ed.game.game.api;

import dev.ed.game.game.domain.Sales;
import dev.ed.game.game.service.SalesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("api/v1/sales")
public class SalesController {

    @Resource
    private SalesService salesService;

    @GetMapping
    public List<Sales> getSales() {
        return salesService.getSales();
    }

    @PostMapping
    public void saveSales(@RequestBody Sales sales) {
        salesService.saveSales(sales);
    }

    @DeleteMapping(value = "{gameId}")
    public void deleteSalesById(@PathVariable Integer gameId) {
        salesService.deleteSalesById(gameId);
    }

    @PutMapping(value = "{gameid}")
    public void updateSalesById(@PathVariable Integer gameid,
                                @RequestParam Integer price,
                                @RequestParam Integer sales) {
        salesService.updateSalesById(gameid, price, sales);
    }
}
