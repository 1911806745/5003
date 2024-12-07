package dev.ed.game.game.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "company")
public class Company {
    @TableId(value = "company_id", type = IdType.AUTO)
    private Integer companyId;
    private String name;
    private Long value;
    private String country;
    private String location;
    @TableField("created_at") // 映射到数据库列 created_at
    private String createdAt;

    public Company() {
    }

    public Company(Integer company_id, String name, Long value, String country, String location, String createdAt) {
        this.companyId = company_id;
        this.name = name;
        this.value = value;
        this.country = country;
        this.location = location;
        this.createdAt = createdAt;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "Company{" +
                "company_id=" + companyId +
                ", name='" + name + '\'' +
                ", value=" + value +
                ", country='" + country + '\'' +
                ", location='" + location + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
