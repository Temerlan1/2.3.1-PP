package web.config;

//vmesto web.xml
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.*;
import java.util.EnumSet;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {  //class vmesto appConfig.xml
        return new Class<?>[]{
                SpringConfig.class
        };
    }

   @Override
   protected String[] getServletMappings() {
      return new String[]{"/"};
   }

   // protected Filter[] getServletFilters() {
   //     CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
   //     characterEncodingFilter.setEncoding("UTF-8");
   //     characterEncodingFilter.setForceEncoding(true);
   //     return new Filter[] {characterEncodingFilter};
   // }

  // @Override
  // public void onStartup(ServletContext aServletContext) throws ServletException {
  //     AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
  //     context.register(SpringConfig.class);
  //     context.setServletContext(aServletContext);
  //
  //     ServletRegistration.Dynamic dispatcher = aServletContext.addServlet("dispatcher", new DispatcherServlet(context));
  //     dispatcher.setLoadOnStartup(1);
  //     dispatcher.addMapping("/");
  //
  //     CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
  //     characterEncodingFilter.setEncoding("UTF-8");
  //     characterEncodingFilter.setForceEncoding(true);
  //
  //     FilterRegistration.Dynamic filterRegistration = aServletContext
  //             .addFilter("characterEncodingFilter", characterEncodingFilter);
  //     filterRegistration.addMappingForUrlPatterns(null, false, "/*");
  // }
  //
  // private void registerHiddenFieldFilter(ServletContext aContext) {
  //     aContext.addFilter("hiddenHttpMethodFilter",
  //             new HiddenHttpMethodFilter()).addMappingForUrlPatterns(null, true, "/*");
  // }
  //
  // private void registerCharacterEncodingFilter(ServletContext aContext) {
  //     EnumSet<DispatcherType> dispatcherTypes = EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD);
  //
  //     CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
  //     characterEncodingFilter.setEncoding("UTF-8");
  //     characterEncodingFilter.setForceEncoding(true);
  //
  //     FilterRegistration.Dynamic characterEncoding = aContext.addFilter("characterEncoding", characterEncodingFilter);
  //     characterEncoding.addMappingForUrlPatterns(dispatcherTypes, true, "/*");
  // }
}
