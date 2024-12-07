package dev.ed.game.game.service;

import dev.ed.game.game.domain.resources.Tool;

import java.util.List;

public interface ToolService {

    /**
     *
     * @return
     */
    List<Tool> getTool();

    /**
     *
     * @param tool
     */
    void saveTool(Tool tool);

    /**
     *
     * @param id
     */
    void deleteToolById(Integer id);

    /**
     *
     * @param id
     * @param version
     */
    void updateToolVersion(Integer id, String version);
}
