#### 实现步骤：

1. 将登录的静态页面搞过来。
2. 设计和创建用户表，创建对应的用户实体类。
3. 配置数据源。
4. 编写controller、service、dao层代码。


#### 遇到问题：

1. SpringBoot自动注入数据源问题，参考博客：[点我跳转](https://blog.csdn.net/jinrucsdn/article/details/106539916)
2. 查询用户列表，返回的结果集中，userName为空，是没有映射上？（数据表中是有值的）。   