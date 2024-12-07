package dev.ed.game.game.service;

import dev.ed.game.game.dal.URMapper;
import dev.ed.game.game.domain.User;
import dev.ed.game.game.domain.resources.UR;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Service
public class URServiceImpl implements URService {

    @Resource
    private URMapper urMapper;

    @Override
    public List<UR> getUR() {
        return urMapper.selectList(null);
    }

    @Override
    public void saveUR(UR ur) {
        UR select = urMapper.selectById(ur.getUserId());
        if(select  != null && (select.getResourceId() != ur.getResourceId())) {
            throw new IllegalStateException("This ur has already existed");
        }
        urMapper.insert(ur);
    }

    @Override
    public void deleteURById(Integer id) {
        UR select = urMapper.selectById(id);
        if(select == null) {
            throw new IllegalStateException("This user has not existed.");
        }
        urMapper.deleteById(id);
    }

    @Override
    public void updateURById(Integer id, Integer resourceId) {
        UR select = urMapper.selectById(id);
        if(select == null) {
            throw new IllegalStateException("This user has not existed.");
        }
        if(resourceId != select.getResourceId()) {
            select.setResourceId(resourceId);
        }
        urMapper.updateById(select);
    }
}
