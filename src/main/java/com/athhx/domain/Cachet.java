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
 * @TableName cachet
 */
@TableName(value ="cachet")
@Data
public class Cachet implements Serializable {
    /**
     * 用章管理
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 申请人
     */
    private Integer userid;

    /**
     * 部门
     */
    private Integer deptid;

    /**
     * 审批人
     */
    private Integer adminid;

    /**
     * 用章类型
     */
    private Integer typeid;

    /**
     * 申请时间
     */
    private Date usetime;

    /**
     * 
     */
    private Date lauchtime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 
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
        Cachet other = (Cachet) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getDeptid() == null ? other.getDeptid() == null : this.getDeptid().equals(other.getDeptid()))
            && (this.getAdminid() == null ? other.getAdminid() == null : this.getAdminid().equals(other.getAdminid()))
            && (this.getTypeid() == null ? other.getTypeid() == null : this.getTypeid().equals(other.getTypeid()))
            && (this.getUsetime() == null ? other.getUsetime() == null : this.getUsetime().equals(other.getUsetime()))
            && (this.getLauchtime() == null ? other.getLauchtime() == null : this.getLauchtime().equals(other.getLauchtime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getDeptid() == null) ? 0 : getDeptid().hashCode());
        result = prime * result + ((getAdminid() == null) ? 0 : getAdminid().hashCode());
        result = prime * result + ((getTypeid() == null) ? 0 : getTypeid().hashCode());
        result = prime * result + ((getUsetime() == null) ? 0 : getUsetime().hashCode());
        result = prime * result + ((getLauchtime() == null) ? 0 : getLauchtime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
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
        sb.append(", userid=").append(userid);
        sb.append(", deptid=").append(deptid);
        sb.append(", adminid=").append(adminid);
        sb.append(", typeid=").append(typeid);
        sb.append(", usetime=").append(usetime);
        sb.append(", lauchtime=").append(lauchtime);
        sb.append(", remark=").append(remark);
        sb.append(", state=").append(state);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}