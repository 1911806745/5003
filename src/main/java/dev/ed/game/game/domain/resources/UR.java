package dev.ed.game.game.domain.resources;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "user_resources")
public class UR {
    @TableId(value = "userId")
    private Integer userId;
    @TableField(value = "resource_id")
    private Integer resourceId;

    public UR() {
    }

    public UR(Integer userId, Integer resourceId) {
        this.userId = userId;
        this.resourceId = resourceId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public String toString() {
        return "UR{" +
                "userId=" + userId +
                ", resourceId=" + resourceId +
                '}';
    }
}
