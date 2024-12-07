package dev.ed.game.game.service;

import dev.ed.game.game.dal.ToolMapper;
import dev.ed.game.game.domain.resources.Tool;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Service
public class ToolServiceImpl implements ToolService {

    @Resource
    private ToolMapper toolMapper;

    @Override
    public List<Tool> getTool() {
        return toolMapper.selectList(null);
    }

    @Override
    public void saveTool(Tool tool) {
        Tool select = toolMapper.selectById(tool.getId());
        if(select != null) {
            throw new IllegalStateException("This select has already existed.");
        }
        toolMapper.insert(tool);
    }

    @Override
    public void deleteToolById(Integer id) {
        Tool select = toolMapper.selectById(id);
        if(select == null) {
            throw new IllegalStateException("This select has not existed.");
        }
        toolMapper.deleteById(id);
    }

    @Override
    @Transactional
    public void updateToolVersion(Integer id, String version) {
        Tool select = toolMapper.selectById(id);
        if(select == null) {
            throw new IllegalStateException("This tool has not existed.");
        }
        if(version != null && !version.isEmpty() && !Objects.equals(select.getVersion(), version)) {
            select.setVersion(version);
        }
        toolMapper.updateById(select);
    }
}
