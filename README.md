## 普通版
- vue博客 ui：[len-blog-ui](https://gitee.com/bweird/len-blog-ui)
- 地址：[lenos](https://gitee.com/bweird/lenos) 

## 项目说明
- lenos(p为spring boot版本扩展名)一款快速开发模块化脚手架，采用spring boot 2.0.1+spring+SpringMvc+mybatis+shiro+swagger+ehcache+quartz+freemarker+layui技术开发；实现功能有系统模块：菜单管理、用户管理、角色管理，系统监控：系统日志、接口api、sql监控。
## 未来蓝图
![图片说明](https://images.gitee.com/uploads/images/2019/1017/214007_d4b418ac_907437.jpeg "图片说明")

## 功能说明
- 项目目前拥有
- **系统管理**：_菜单管理、用户管理、角色管理_
- 统一查询 pagehelper分页，查询调用BaseServiceImpl show model set数据，传入T，配合xml编写，即可自定义查询。
- 采用shiro技术，可配置化权限管理，精确到按钮(也可以是某一元素)功能分配
- 登录次数校验，超出定义次数后冻结一段时间账号  
  
- **系统监控**：_系统日志、接口api、系统监控、可配置定时任务_
- 前端可配置化定时任务。
- 采用swagger可视化出实时方法格式以及数据属性，采用阿里druid监控sql。  
  
- **工作流程管理**：完全实现模块化，无侵入。监听用户角色信息到引擎数据表中
- **流程管理**：动态给发布流程分配角色，无需手动写死，灵活可变
- **模块列表**：新建、编辑、发布流程，前端实现完全可配置化建立流程图
- **请假流程**：提供一个请假示例，让您很快熟悉流程
- **待办任务**：个人需要办理的流程任务  
  
- 如果不喜欢工作流，可以直接删除 len-activiti模块  
并在len-web/pom.xml、父 pom.xml 删除依赖以及模块，删除application.java 中对activiti的扫描即可完全删除工作流模块。

## 更新说明
- 18/1/28 **添加工作流模块，前端页面优化，更加有线条**
- 18/4/21 **增加菜单编辑、选择图标功能，前端js封装，修复工作流程现存bug**
- 18/4/23 **修复头像上传**
- 18/5/06 **升级spring boot 到2.0.1**
- 18/6/12 **增加sqlserver支持，脚本在db文件夹下，
只需要在application.yml 切换下active 即可切换数据源**
- 18/6/19 **集成丰富持久化插件tkmapper**
- 18/12/11 **添加博客功能模块，集成redis缓存**
- 19/4/5 **优化shiro配置，增加 oracle支持 群（137738503）里有配置好的源码**
- 19/4/30 **升级admin监控**
**博客采用vue前后分离基于jwt鉴权，博客单独分离出一个项目地址:[len-blog-ui](https://gitee.com/bweird/len-blog-ui)**
## 头像说明

```
修改 application.yml imagePath 路径 把image文件夹图片赋值进路径，即可正常展示头像
```

## 启动说明

```bash
git clone https://gitee.com/bweird/lenosp.git
mvn clean package
mvn package
java -jar len-web.jar
```
- db使用mysql，项目数据库在 根目录db文件夹下，
导入数据库后 设定数据库用户名密码 在文件lenosp\len-web\src\main\resources\application.yml中
项目开始会报实体类 get set错误，这是正常的，因为本项目entity使用的是 lombok 大大简化了代码量
您可以直接运行，项目可以正常启动。
如何消除？
如果您使用的为idea 只需要file -> setting->plugins->Browse Repositeories 输入 lombok 集成插件重启idea即可消除错误
如果您使用 eclipse 需要下载 lombk jar包 手动集成。

## 技术
* jdk：1.8
* 核心框架：spring boot 2.1.9.RELEASE
* 安全框架：Apache Shiro
* 工作流引擎：Activiti
* 数据库连接池：druid
* 视图框架：spring mvc
* 持久层框架：MyBatis
* 模板引擎：freemarker
* 缓存：redis、ehcache
* 定时：quartz 2.3.0
* 前端页面：layui
* 博客前端：vue、iview


## 项目图片
* 登录账号：admin 密码：123456   
  <table>
      <tr>
          <td><img src="https://images.gitee.com/uploads/images/2019/1017/214006_de4b6143_907437.jpeg"/></td>
          <td><img src="https://images.gitee.com/uploads/images/2019/1017/214007_add596c7_907437.jpeg"/></td>
      <tr>
      <tr>
          <td><img src="https://images.gitee.com/uploads/images/2019/1017/214007_593cd33c_907437.png"/></td>
          <td><img src="https://s1.ax1x.com/2018/12/11/FYwnR1.gif"/></td>
      <tr>
      <tr>
          <td><img src="https://s2.ax1x.com/2019/05/12/EhyVht.jpg"/></td>
          <td><img src="https://images.gitee.com/uploads/images/2019/1017/214012_77513b79_907437.png"/></td>
      <tr>
      <tr>
          <td><img src="https://s1.ax2x.com/2018/07/14/qvSGY.png"/></td>
          <td><img src="https://images.gitee.com/uploads/images/2019/1017/214011_595b1936_907437.jpeg"/></td>
      <tr>
      <tr>
          <td><img src="https://images.gitee.com/uploads/images/2019/1017/214012_13919888_907437.jpeg"/></td>
          <td><img src="https://images.gitee.com/uploads/images/2019/1017/214012_9c5675a5_907437.jpeg"/></td>
      <tr>
      <tr>
          <td><img src="https://s2.ax1x.com/2019/05/12/EhyPne.jpg"/></td>
          <td><img src="https://s2.ax1x.com/2019/05/12/Ehym1f.jpg"/></td>
      <tr>
      <tr>
          <td><img src="https://s2.ax1x.com/2019/05/12/Ehync8.jpg"/></td>
          <td><img src="https://s2.ax1x.com/2019/05/12/EhyAAA.jpg"/></td>
      <tr>
      <tr>
          <td><img src="https://s2.ax1x.com/2019/05/12/Ehyp6O.jpg"/></td>
          <td><img src="https://s2.ax1x.com/2019/05/12/Ehszp6.jpg"/></td>
      <tr>
      </table>
   
* 完全模块化工作流引擎，可视化建立编辑，动态分配节点处理人
* 监听器监听系统用户、角色实时同步到工作流引擎表
* 提供请假流程示例   
* 菜单管理分为一级菜单 二级菜单 按钮(也可以是元素)权限  
* 用户可以上传头像 
* 自定义定时类，实现Job，前端配置定时类，即可控制任务类，已实现定时类获取spring上下文，
* 项目启动加载完bean后利用spring boot监听开启一个线程，检测已启动的定时任务，进行开启
* 日志监控 利用aop 自定义拦截日志持久化到数据库并对数据进行监控
* 接口

