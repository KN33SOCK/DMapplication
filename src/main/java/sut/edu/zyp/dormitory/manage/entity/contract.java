package sut.edu.zyp.dormitory.manage.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "contract")
public class contract extends AbstractBaseEntity implements Serializable  {
    @Column(unique = true, length = 32, nullable = false)
    private String name;
    @Column(length = 8, nullable = false)
    private String begintime;
    @Column( length = 8, nullable = false)
    private String endname;
    @Column(unique = true,length = 32, nullable = false)
    private String num;
    @Column(length = 1024, nullable = false)
    private String content;
    @Column( length = 32, nullable = false)
    private String customer;

    public contract(String name, String begintime, String endname, String num, String content, String customer) {
        this.name = name;
        this.begintime = begintime;
        this.endname = endname;
        this.num = num;
        this.content = content;
        this.customer = customer;
    }

    public contract() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    public String getEndname() {
        return endname;
    }

    public void setEndname(String endname) {
        this.endname = endname;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
