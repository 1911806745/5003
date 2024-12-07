package dev.ed.game.game.service;

import dev.ed.game.game.dal.SalesMapper;
import dev.ed.game.game.domain.Sales;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SalesServiceImpl implements SalesService{

    @Resource
    private SalesMapper salesMapper;

    @Override
    public List<Sales> getSales() {
        //return ListUtil.of(null);
        return salesMapper.selectList(null);
    }

    @Override
    public void saveSales(Sales sales) {
        Sales select = salesMapper.selectById(sales.getGameid());
        if(select != null) {
            throw new IllegalStateException("This sales has already existed");
        }
        salesMapper.insert(sales);
    }

    @Override
    public void deleteSalesById(Integer gameId) {
        Sales select = salesMapper.selectById(gameId);
        if(select == null) {
            throw new IllegalStateException("This sales has not existed.");
        }
        salesMapper.deleteById(gameId);
    }

    @Override
    @Transactional
    public void updateSalesById(Integer gameid, Integer price, Integer sales) {
        Sales select = salesMapper.selectById(gameid);
        if(select == null) {
            throw new IllegalStateException("This sales has not existed.");
        }
        if(price != 0 && price != select.getPrice()) {
            select.setPrice(price);
        }
        if(sales != 0 && price != select.getSales()) {
            select.setSales(sales);
        }
        salesMapper.updateById(select);
    }
}
