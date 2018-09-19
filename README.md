1. 关于 idea工具上 **On Upate Action** 与 **On Frame Deactivation** 两个属性的含义
  参考文章:https://www.cnblogs.com/zhangguangju/p/7027904.html

2. 使用 **dozer.xml** 进行对象的转换的时候，记得要给 **xxxVO** 对象书写 get/set方法

3. 项目中需要在 **/src/main/resoucre/META-INF/persistence.xml** 文件中配置数据库的密码等信息，

   又因为项目代码是托管在Github，因此考虑到安全性，

   这个文件是被 **.gitignore** 忽略的文件，**因此不会上传到服务器**，需要clone项目代码的人手动在项目中创建该文件进行连接数据库：


   **/nbaDataServer/src/main/resources/META-INF/persistence.xml**
   ```
   <?xml version="1.0" encoding="UTF-8"?>
   <persistence xmlns="http://java.sun.com/xml/ns/persistence" version="2.0">
   
       <persistence-unit name="defaultPersistenceUnit" transaction-type="RESOURCE_LOCAL">
           <provider>org.hibernate.ejb.HibernatePersistence</provider>
           <properties>
   
               <!-- 使用MySQL方言 -->
               <property name="hibernate.dialect" value="org.hibernate.dialect.MySQL5Dialect"/>
                <!--数据库连接的URL地址 -->
               <property name="hibernate.connection.url" value="xxxx"/>
               <!--数据库连接的驱动 -->
               <property name="hibernate.connection.driver_class" value="com.mysql.jdbc.Driver"/>
               <!-- 数据库连接的用户名 -->
               <property name="hibernate.connection.username" value="xxxx"/>
               <!-- 数据库连接的密码 -->
               <property name="hibernate.connection.password" value="xxxx"/>
   
               <property name="hibernate.archive.autodetection" value="class"/>
               <!-- 在显示SQL语句时格式化语句 -->
               <property name="hibernate.show_sql" value="false"/>
               <property name="hibernate.format_sql" value="true"/>
               <!-- 自动输出schema创建DDL语句 -->
               <property name="hbm2ddl.auto" value="update"/>
   
               <property name="hibernate.connection.useUnicode" value="true"/>
               <property name="hibernate.connection.characterEncoding" value="UTF-8"/>
   
               <!-- 数据库连接超时后自动重连 -->
               <property name="hibernate.connection.autoReconnect" value="true"/>
               <property name="connection.autoReconnectForPools" value="true"/>
               <property name="connection.is-connection-validation-required" value="true"/>
           </properties>
       </persistence-unit>
   </persistence>
   
   ```
   ![](https://ws4.sinaimg.cn/large/006tNbRwgy1fvfb5wjzimj30fk0simzv.jpg)