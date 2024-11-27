package com.itheima.principles.LoD;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/10/26/10:26
 * @ClassName Client
 * @Description 迪米特法则
 */
public class Client {
    public static void main(String[] args) {
        // 创建经纪人对象
        Agent agent = new Agent();
        // 创建明星对象
        Star star = new Star("林青霞");
        agent.setStar(star);
        // 创建粉丝对象
        Fans fans = new Fans("路人甲");
        agent.setFans(fans);
        // 创建传媒公司对象
        Company company = new Company("黑马传媒");
        agent.setCompany(company);

        agent.meeting();
        agent.business();


    }
}
