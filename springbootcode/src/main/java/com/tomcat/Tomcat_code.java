package com.tomcat;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import javax.servlet.ServletException;
import java.io.File;

public class Tomcat_code {

  private static final int PORT = 8080;
  private static final String Context_PATH = "/tsw";
  private static final String ServletName = "testServlet";

  public static void main(String[] args) throws LifecycleException {
    /**
     * tomcat加载servlet文件
     */
//    Tomcat tomcat = new Tomcat();
//    tomcat.setPort(PORT);
//    tomcat.getHost().setAutoDeploy(false);
//    StandardContext context = new StandardContext();
//    context.setPath(Context_PATH);
//    context.addLifecycleListener(new Tomcat.FixContextListener());
//    tomcat.getHost().addChild(context);
//    tomcat.addServlet(Context_PATH,ServletName,new TestServlet());
//    context.addServletMappingDecoded("/index",ServletName);
//    tomcat.start();
//    System.out.println("tomcat 正常运行起来了");
//    //tomcat在未完全启动的时候异步等待
//    tomcat.getServer().await();

      start();
  }

  public static void start(){
    try {
      Tomcat tomcat = new Tomcat();
      tomcat.setPort(9090);
      StandardContext context =(StandardContext)tomcat.addWebapp("/", new File("src/main").getAbsolutePath());
      context.setReloadable(false);
      File file = new File("target/classes");
      WebResourceRoot root = new StandardRoot(context);
      root.addPreResources(new DirResourceSet(root,"/WEB-INF/classes",file.getAbsolutePath(),"/"));
      tomcat.start();
      tomcat.getServer().await();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
