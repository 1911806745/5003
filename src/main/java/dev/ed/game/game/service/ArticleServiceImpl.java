package dev.ed.game.game.service;

import dev.ed.game.game.dal.ArticleMapper;
import dev.ed.game.game.domain.resources.Article;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleMapper articleMapper;

    @Override
    public List<Article> getArtciles() {
        return articleMapper.selectList(null);
    }

    @Override
    public void saveArticles(Article article) {
        Article select = articleMapper.selectById(article.getId());
        if(select != null) {
            throw new IllegalStateException("This article has already existed.");
        }
        articleMapper.insert(article);
    }

    @Override
    public void deleteArticlesById(Integer id) {
        Article select = articleMapper.selectById(id);
        if(select == null) {
            throw new IllegalStateException("This article has not existed.");
        }
        articleMapper.deleteById(id);
    }

    @Override
    @Transactional
    public void updateArticleContentById(Integer id, String content) {
        Article select = articleMapper.selectById(id);
        if(select == null) {
            throw new IllegalStateException("This article has not existed.");
        }
        if(content != null && !content.isEmpty() && !Objects.equals(content, select.getContent())) {
            select.setContent(content);
        }
        articleMapper.updateById(select);
    }
}
