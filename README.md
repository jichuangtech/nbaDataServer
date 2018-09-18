1. 关于 idea工具上 **On Upate Action** 与 **On Frame Deactivation** 两个属性的含义
  参考文章:https://www.cnblogs.com/zhangguangju/p/7027904.html

2. 使用 **dozer.xml** 进行对象的转换的时候，记得要给 **xxxVO** 对象书写 get/set方法

3. 项目中需要在 **/src/main/resoucre/META-INF/persistence.xml** 文件中配置数据库的密码等信息，

   又因为项目代码是托管在Github，因此考虑到安全性，需要使用本地项目文件 **/src/main/resource/jdbc.properties**文件来配置。这个文件是被 **.gitignore** 忽略的文件，因为不会上传到服务器，需要clone项目代码的人手动在项目中创建该文件进行连接数据库：

   ```properties
   #/src/main/resource/jdbc.properties
   url=
   username=
   password=
   ```



   ![](https://ws1.sinaimg.cn/large/006tNbRwgy1fuz4axwk6tj30ru0e6jtp.jpg)