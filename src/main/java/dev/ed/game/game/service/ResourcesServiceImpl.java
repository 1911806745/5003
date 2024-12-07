package dev.ed.game.game.service;

import dev.ed.game.game.dal.ResourcesMapper;
import dev.ed.game.game.domain.resources.Resources;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

@Service
public class ResourcesServiceImpl implements ResourcesService {

    @Resource
    private ResourcesMapper resourcesMapper;

    @Override
    public List<Resources> getResources() {
        return resourcesMapper.selectList(null);
    }

    @Override
    public void saveResources(Resources resources) {
        Resources select = resourcesMapper.selectById(resources.getResourcesId());
        if(select != null) {
            throw new IllegalStateException("This resource has already existed.");
        }
        resourcesMapper.insert(resources);
    }

    @Override
    public void deleteResourcesById(Integer resourcesId) {
        Resources select = resourcesMapper.selectById(resourcesId);
        if(select == null) {
            throw new IllegalStateException("This resource has not existed.");
        }
        resourcesMapper.deleteById(resourcesId);
    }

    @Override
    @Transactional
    public void updateResourcesTitleById(Integer resourcesId, String title) {
        Resources select = resourcesMapper.selectById(resourcesId);
        if(select == null) {
            throw new IllegalStateException("This resource has not existed.");
        }
        if(title != null && !title.isEmpty() && !Objects.equals(title, select.getTitle())) {
            select.setTitle(title);
        }
        resourcesMapper.updateById(select);
    }
}
