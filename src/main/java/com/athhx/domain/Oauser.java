package com.athhx.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName oauser
 */
@TableName(value ="oauser")
@Data
public class Oauser implements Serializable {
    /**
     * 用户表
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 登录名
     */
    private String loginname;

    /**
     * 密码
     */
    private String password;

    /**
     * 真实姓名
     */
    private String truename;

    /**
     * 身份证号
     */
    private String idcard;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 工作
     */
    private String job;

    /**
     * 头像照片
     */
    private String photo;

    /**
     * 角色
     */
    private Integer roleid;

    /**
     * 所属机构
     */
    private Integer orgid;

    /**
     * 所属部门
     */
    private Integer deptid;

    /**
     * 启用状态
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
        Oauser other = (Oauser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLoginname() == null ? other.getLoginname() == null : this.getLoginname().equals(other.getLoginname()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getTruename() == null ? other.getTruename() == null : this.getTruename().equals(other.getTruename()))
            && (this.getIdcard() == null ? other.getIdcard() == null : this.getIdcard().equals(other.getIdcard()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getJob() == null ? other.getJob() == null : this.getJob().equals(other.getJob()))
            && (this.getPhoto() == null ? other.getPhoto() == null : this.getPhoto().equals(other.getPhoto()))
            && (this.getRoleid() == null ? other.getRoleid() == null : this.getRoleid().equals(other.getRoleid()))
            && (this.getOrgid() == null ? other.getOrgid() == null : this.getOrgid().equals(other.getOrgid()))
            && (this.getDeptid() == null ? other.getDeptid() == null : this.getDeptid().equals(other.getDeptid()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLoginname() == null) ? 0 : getLoginname().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getTruename() == null) ? 0 : getTruename().hashCode());
        result = prime * result + ((getIdcard() == null) ? 0 : getIdcard().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getJob() == null) ? 0 : getJob().hashCode());
        result = prime * result + ((getPhoto() == null) ? 0 : getPhoto().hashCode());
        result = prime * result + ((getRoleid() == null) ? 0 : getRoleid().hashCode());
        result = prime * result + ((getOrgid() == null) ? 0 : getOrgid().hashCode());
        result = prime * result + ((getDeptid() == null) ? 0 : getDeptid().hashCode());
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
        sb.append(", loginname=").append(loginname);
        sb.append(", password=").append(password);
        sb.append(", truename=").append(truename);
        sb.append(", idcard=").append(idcard);
        sb.append(", age=").append(age);
        sb.append(", phone=").append(phone);
        sb.append(", sex=").append(sex);
        sb.append(", job=").append(job);
        sb.append(", photo=").append(photo);
        sb.append(", roleid=").append(roleid);
        sb.append(", orgid=").append(orgid);
        sb.append(", deptid=").append(deptid);
        sb.append(", state=").append(state);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}