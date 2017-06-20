mybatis1st

I had write a mybatis' hello world. A few steps had been done.

0. Before test, you should have create a mysql database with one table named 'users'. In my demo, database named 'testspringmybatis', and table 'users' has only 3 coulmns of id(primary key, int), nam(varchar), age(int).
1. Create a maven project so that I can use some lib convenient.
2. Create a ```SqlMapConfig.xml``` below ```/src/main/resources``` which should be loading on Java code. In this demo, I make it loaded in ```TestUser.java```.
3. Create a ```jdbc.properties``` to save the params of database, including driver, url, username, password of your database.
4. Config mybatis in ```SqlMapConfig.xml```.
    1. ```DOCTYPE``` attr can be copied.
    2. Config ```environments``` tag. If ```jdbc.properties``` has been import in a ```properties``` tag, ```${jdbc.driver}``` can be used.
5. Create a ```UserModel``` with the same field as your database table. You can make your java fields the same name as your column names. It will makes your coding simple. 
6. Then config ```UserModel``` in the ```SqlMapConfig.xml``` with ```typeAliases``` tag. For my master's demo, he configed typeAliases with batch scanning.
7. Create a ```User``` as interface and ```User.xml``` as mapper xml. In this step, make sure every method in a interface has been configed in its mapper.xml.
    1. ```DOCTYPE``` be copied.
    2. ```namespace``` of ```mapper``` tag means its interface file generally.
    3. ```select``` tag should be one-to-one of method in it's interface file.
    4. ```resultType``` should be it's model. And ```parameterType``` can be int, java.lang.String and so on.
    5. ```<![CDATA[ sql ]]>``` will return a list of resultType.
    6. mapper.xml can be generate created by a plugin named ```Mybatis-Generato```. And I haven't test it.
8. Then config your mapper to ```SqlMapConfig.xml``` with ```mapper``` tag.
9. Now you can test your mybatis with ```TestUser.java```.
10. ```log4j.properties``` copied from internet. Haven't study it.


Issues & Resolved:
1. Can't find ```SqlMapConfig.xml``` in java code.
    * Add ```resource``` of```build``` tag in ```pom.xml``` to make sure your ```/src/main/resources/``` be compiled.
    * Maybe you need to execute ```maven clean install``` before test.
2. Sometimes your test get null from database.
    * Make sure name of java field the same as name of table's column.