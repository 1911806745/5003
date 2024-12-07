package dev.ed.game.game.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName(value = "sales")
public class Sales {
    @TableId(value = "gameid")
    private Integer gameid;
    private Integer price;
    private Integer sales;
    @TableField(value = "publisher_id")
    private Integer publisherId;
    private String platforms;
    @TableField(value = "release_date")
    private Date releaseDate;
    @TableField(value = "created_at")
    private Date createdAt;

    public Sales() {
    }

    public Sales(Integer gameid, Integer price, Integer sales, Integer publisherId,
                 String platforms, Date releaseDate, Date createdAt) {
        this.gameid = gameid;
        this.price = price;
        this.sales = sales;
        this.publisherId = publisherId;
        this.platforms = platforms;
        this.releaseDate = releaseDate;
        this.createdAt = createdAt;
    }

    public Integer getGameid() {
        return gameid;
    }

    public void setGameid(Integer gameid) {
        this.gameid = gameid;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public Integer getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
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
        return "Sales{" +
                "gameid=" + gameid +
                ", price=" + price +
                ", sales=" + sales +
                ", publisherId=" + publisherId +
                ", platforms='" + platforms + '\'' +
                ", releaseDate=" + releaseDate +
                ", createdAt=" + createdAt +
                '}';
    }
}
