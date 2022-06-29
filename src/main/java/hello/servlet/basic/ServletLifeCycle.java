package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "servletLifeCycle", urlPatterns = "/servlet-life-cycle")
public class ServletLifeCycle extends HttpServlet {

    private int initCount;
    private int serviceCount;
    private int destroyCount;

    @Override
    public void init() throws ServletException {
        System.out.println("initCount = " + ++initCount);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("serviceCount = " + ++serviceCount);
    }

    @Override
    public void destroy() {
        System.out.println("destroyCount = " + ++destroyCount);
    }

}
