package dev.ed.game.game.service;

import dev.ed.game.game.domain.resources.Article;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ArticleService {

    /**
     *
     * @return
     */
    List<Article> getArtciles();

    /**
     *
     * @param article
     */
    void saveArticles(Article article);

    /**
     *
     * @param id
     */
    void deleteArticlesById(Integer id);

    /**
     *
     * @param id
     * @param content
     */
    void updateArticleContentById(Integer id, String content);
}
