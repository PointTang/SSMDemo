springmvc1st

Based on maven.

For Controller, there are two ways to build. And they can't be configed in one servlet.

If jsp page show "${output}", it means you should config your jsp page attribute with "isELIgnored=false". I don't know why, but sometimes it's useful.

Then you can input address in your browser to see results. For this module, address like :
* http://localhost:8080/springmvc/page1.mm
* http://localhost:8080/springmvc/index

First one to springmvcpage-servlet.xml, page1.jsp and PageOneController.
Second one to springmvc1st.xml and IndexController.
Both has been defined in web.xml.

The "springmvc" in the address was been defined in pom.xml.

To run this module, you can click "Maven Projects -> Plugins -> tomcat7 -> tomcat7:run" to startup.

By the way, if your browser shown 404, it generally means your config files have something wrong.