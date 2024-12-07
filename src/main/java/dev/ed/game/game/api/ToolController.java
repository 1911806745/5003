package dev.ed.game.game.api;

import dev.ed.game.game.domain.resources.Tool;
import dev.ed.game.game.service.ToolService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("api/v1/tool")
public class ToolController {

    @Resource
    private ToolService toolService;

    @GetMapping
    public List<Tool> getTool() {
        return toolService.getTool();
    }

    @PostMapping
    public void saveTool(@RequestBody Tool tool) {
        toolService.saveTool(tool);
    }

    @DeleteMapping(value = "{id}")
    public void deleteToolById(@PathVariable Integer id) {
        toolService.deleteToolById(id);
    }

    @PutMapping(value = "{id}")
    public void updateToolVersion(@PathVariable Integer id,
                                  @RequestParam String version) {
        toolService.updateToolVersion(id, version);
    }
}
