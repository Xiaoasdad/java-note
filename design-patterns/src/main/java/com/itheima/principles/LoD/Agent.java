package com.itheima.principles.LoD;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/10/26/10:27
 * @ClassName Agent
 * @Description
 */
public class Agent {
    private Star star;
    private Fans fans;
    private Company company;

    public void setStar(Star star) {
        this.star = star;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    // 和粉丝见面的方法
    public void meeting() {
        System.out.println(star.getName() + "和粉丝" + fans.getName() + "见面");
    }

    // 和媒体公司洽谈的方法
    public void business() {
        System.out.println(star.getName() + "和" + company.getName() + "洽谈");
    }
}
