package dev.ed.game.game.service;

import dev.ed.game.game.domain.resources.Resources;

import java.util.List;

public interface ResourcesService {

    /**
     *
     * @return
     */
    List<Resources> getResources();

    /**
     *
     * @param resources
     */
    void saveResources(Resources resources);

    /**
     *
     * @param resourcesId
     */
    void deleteResourcesById(Integer resourcesId);

    /**
     *
     * @param resourcesId
     * @param title
     */
    void updateResourcesTitleById(Integer resourcesId, String title);
}
