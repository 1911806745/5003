package dev.ed.game.game.domain.resources;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName(value = "resources")
public class Resources {
    @TableId(value = "resources_id", type = IdType.AUTO)
    private Integer resourcesId;
    @TableField("resources_type")
    private RescourcesType type;
    private String title;
    @TableField("release_date")
    private Date releaseDate;
    @TableField("created_at")
    private Date createdAt;

    public Resources() {
    }

    public Resources(Integer resourecsId, RescourcesType type, String title, Date releaseDate,
                     Date createdAt) {
        this.resourcesId = resourecsId;
        this.type = type;
        this.title = title;
        this.releaseDate = releaseDate;
        this.createdAt = createdAt;
    }

    public Integer getResourcesId() {
        return resourcesId;
    }

    public void setResourcesId(Integer resourcesId) {
        this.resourcesId = resourcesId;
    }

    public RescourcesType getType() {
        return type;
    }

    public void setType(RescourcesType type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Resources{" +
                "resourecsId=" + resourcesId +
                ", type=" + type +
                ", title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", createdAt=" + createdAt +
                '}';
    }
}
