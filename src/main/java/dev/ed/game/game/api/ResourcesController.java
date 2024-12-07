package dev.ed.game.game.api;

import dev.ed.game.game.domain.resources.Resources;
import dev.ed.game.game.service.ResourcesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("api/v1/resources")
public class ResourcesController {

    @Resource
    private ResourcesService resourcesService;

    @GetMapping
    public List<Resources> getResources() {
        return resourcesService.getResources();
    }

    @PostMapping
    public void saveResources(@RequestBody Resources resources) {
        resourcesService.saveResources(resources);
    }

    @DeleteMapping(value = "{resourcesId}")
    public void deleteResourcesById(@PathVariable Integer resourcesId) {
        resourcesService.deleteResourcesById(resourcesId);
    }

    @PutMapping(value = "{resourcesId}")
    public void updateResourcesTitleById(@PathVariable Integer resourcesId,
                                         @RequestParam String title) {
        resourcesService.updateResourcesTitleById(resourcesId, title);
    }
}
