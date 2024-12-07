package dev.ed.game.game.api;

import dev.ed.game.game.domain.resources.Article;
import dev.ed.game.game.service.ArticleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("api/v1/article")
public class ArticleController {

    @Resource
    private ArticleService articleService;

    @GetMapping
    public List<Article> getArticles() {
        return articleService.getArtciles();
    }

    @PostMapping
    public void saveArticles(@RequestBody Article article) {
        articleService.saveArticles(article);
    }

    @DeleteMapping(value = "{id}")
    public void deleteArticlesById(@PathVariable Integer id) {
        articleService.deleteArticlesById(id);
    }

    @PostMapping(value = "{id}")
    public void updateArticleContentById(@PathVariable Integer id,
                                         @RequestParam String content) {
        articleService.updateArticleContentById(id, content);
    }
}
