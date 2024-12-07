package dev.ed.game.game.api;

import dev.ed.game.game.domain.resources.UR;
import dev.ed.game.game.service.URService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("api/v1/ur")
public class URController {

    @Resource
    private URService urService;

    @GetMapping
    public List<UR> getUR() {
        return urService.getUR();
    }

    @PostMapping
    public void saveUR(@RequestBody UR ur) {
        urService.saveUR(ur);
    }

    @DeleteMapping(value = "{id}")
    public void deleteURById(@PathVariable Integer id) {
        urService.deleteURById(id);
    }

    @PutMapping(value = "{id}")
    public void updateURById(@PathVariable Integer id,
                             @RequestParam Integer resourceId) {
        urService.updateURById(id, resourceId);
    }
}
