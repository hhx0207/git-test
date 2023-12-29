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
 * @TableName task
 */
@TableName(value ="task")
@Data
public class Task implements Serializable {
    /**
     * 任务表
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 任务名称
     */
    private String name;

    /**
     * 任务类型
     */
    private Integer typeid;

    /**
     * room,book等表中的主键id
     */
    private Integer taskid;

    /**
     * 任务申请人
     */
    private Integer userid;

    /**
     * 审核人
     */
    private Integer adminid;

    /**
     * 发起时间
     */
    private Date lauchtime;

    /**
     * 审批时间
     */
    private Date subtime;

    /**
     * 审核状态
     */
    private Integer state;

    /**
     * 删除状态
     */
    private Integer isdelete;

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
        Task other = (Task) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTypeid() == null ? other.getTypeid() == null : this.getTypeid().equals(other.getTypeid()))
            && (this.getTaskid() == null ? other.getTaskid() == null : this.getTaskid().equals(other.getTaskid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getAdminid() == null ? other.getAdminid() == null : this.getAdminid().equals(other.getAdminid()))
            && (this.getLauchtime() == null ? other.getLauchtime() == null : this.getLauchtime().equals(other.getLauchtime()))
            && (this.getSubtime() == null ? other.getSubtime() == null : this.getSubtime().equals(other.getSubtime()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTypeid() == null) ? 0 : getTypeid().hashCode());
        result = prime * result + ((getTaskid() == null) ? 0 : getTaskid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getAdminid() == null) ? 0 : getAdminid().hashCode());
        result = prime * result + ((getLauchtime() == null) ? 0 : getLauchtime().hashCode());
        result = prime * result + ((getSubtime() == null) ? 0 : getSubtime().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
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
        sb.append(", typeid=").append(typeid);
        sb.append(", taskid=").append(taskid);
        sb.append(", userid=").append(userid);
        sb.append(", adminid=").append(adminid);
        sb.append(", lauchtime=").append(lauchtime);
        sb.append(", subtime=").append(subtime);
        sb.append(", state=").append(state);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}