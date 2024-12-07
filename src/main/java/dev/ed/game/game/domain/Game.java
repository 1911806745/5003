package dev.ed.game.game.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName(value = "games")
public class Game {
    @TableId(value = "id", type = IdType.AUTO) // 主键，自增
    private Integer id;

    private String title;
    private String description;
    private Integer developer_id;

    private String tags; // 注意：同样是 JSON 类型

    @TableField("cover_image") // 映射到数据库列 cover_image
    private String coverImage;

    @TableField("created_at") // 映射到数据库列 created_at
    private String createdAt;

    public Game() {
    }

    public Game(Integer id, String title, String description, Integer developer_id,
                String platforms, String tags, String coverImage, String createdAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.developer_id = developer_id;
        this.tags = tags;
        this.coverImage = coverImage;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDeveloper() {
        return developer_id;
    }

    public void setDeveloper_Id(Integer developer_id) {
        this.developer_id = developer_id;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "game{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", developer='" + developer_id + '\'' +
                ", tags=" + tags +
                ", coverImage='" + coverImage + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
