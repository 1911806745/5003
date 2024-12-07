package dev.ed.game.game.domain.resources;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName(value = "article")
public class Article {

    @TableId(value = "id")
    private Integer id;
    private String content;
    private String description;
    private String tag;
    @TableField("created_At")
    private Date createdAt;

    public Article() {
    }

    public Article(Integer id, String content, String description, String tag, Date createdAt) {
        this.id = id;
        this.content = content;
        this.description = description;
        this.tag = tag;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", description='" + description + '\'' +
                ", tag='" + tag + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
