package dev.ed.game.game.service;

import dev.ed.game.game.domain.resources.UR;

import java.util.List;

public interface URService {

    /**
     *
     * @return
     */
    List<UR> getUR();

    /**
     *
     * @param ur
     */
    void saveUR(UR ur);

    /**
     *
     * @param id
     */
    void deleteURById(Integer id);

    /**
     *
     * @param id
     * @param resourceId
     */
    void updateURById(Integer id, Integer resourceId);
}
