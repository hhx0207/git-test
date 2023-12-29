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
 * @TableName car_reserve
 */
@TableName(value ="car_reserve")
@Data
public class CarReserve implements Serializable {
    /**
     * 车辆预定表
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 车牌
     */
    private Integer carid;

    /**
     * 用车人
     */
    private Integer userid;

    /**
     * 开始时间
     */
    private Date starttime;

    /**
     * 结束时间
     */
    private Date endtime;

    /**
     * 请求时间
     */
    private Date lauchtime;

    /**
     * 目的地
     */
    private String address;

    /**
     * 申请里程
     */
    private Integer miles;

    /**
     * 用车事由
     */
    private String remark;

    /**
     * 审批人
     */
    private Integer adminid;

    /**
     * 
     */
    private Date subtime;

    /**
     * 
     */
    private Integer state;

    /**
     * 
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
        CarReserve other = (CarReserve) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCarid() == null ? other.getCarid() == null : this.getCarid().equals(other.getCarid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getLauchtime() == null ? other.getLauchtime() == null : this.getLauchtime().equals(other.getLauchtime()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getMiles() == null ? other.getMiles() == null : this.getMiles().equals(other.getMiles()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getAdminid() == null ? other.getAdminid() == null : this.getAdminid().equals(other.getAdminid()))
            && (this.getSubtime() == null ? other.getSubtime() == null : this.getSubtime().equals(other.getSubtime()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCarid() == null) ? 0 : getCarid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getLauchtime() == null) ? 0 : getLauchtime().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getMiles() == null) ? 0 : getMiles().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getAdminid() == null) ? 0 : getAdminid().hashCode());
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
        sb.append(", carid=").append(carid);
        sb.append(", userid=").append(userid);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", lauchtime=").append(lauchtime);
        sb.append(", address=").append(address);
        sb.append(", miles=").append(miles);
        sb.append(", remark=").append(remark);
        sb.append(", adminid=").append(adminid);
        sb.append(", subtime=").append(subtime);
        sb.append(", state=").append(state);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}