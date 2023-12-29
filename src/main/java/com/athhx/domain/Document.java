package com.athhx.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName document
 */
@TableName(value ="document")
@Data
public class Document implements Serializable {
    /**
     * 文档管理
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 文件别名称
     */
    private String name;

    /**
     * 文件名字，UUid生成
     */
    private String filerealname;

    /**
     * 
     */
    private String type;

    /**
     * 所有人
     */
    private Integer userid;

    /**
     * 父级文档
     */
    private Integer parentid;

    /**
     * 
     */
    private Integer havechild;

    /**
     * 创建时间
     */
    private Date creattime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 删除状态
     */
    private Integer isdelete;

    /**
     * 
     */
    private Date deletetime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Document other = (Document) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getFilerealname() == null ? other.getFilerealname() == null : this.getFilerealname().equals(other.getFilerealname()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()))
            && (this.getHavechild() == null ? other.getHavechild() == null : this.getHavechild().equals(other.getHavechild()))
            && (this.getCreattime() == null ? other.getCreattime() == null : this.getCreattime().equals(other.getCreattime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()))
            && (this.getDeletetime() == null ? other.getDeletetime() == null : this.getDeletetime().equals(other.getDeletetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getFilerealname() == null) ? 0 : getFilerealname().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
        result = prime * result + ((getHavechild() == null) ? 0 : getHavechild().hashCode());
        result = prime * result + ((getCreattime() == null) ? 0 : getCreattime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        result = prime * result + ((getDeletetime() == null) ? 0 : getDeletetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", filerealname=").append(filerealname);
        sb.append(", type=").append(type);
        sb.append(", userid=").append(userid);
        sb.append(", parentid=").append(parentid);
        sb.append(", havechild=").append(havechild);
        sb.append(", creattime=").append(creattime);
        sb.append(", remark=").append(remark);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", deletetime=").append(deletetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}