package files;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@WebServlet(name = "FileDownload",value = "/download")
public class FileDownload extends HttpServlet {
    private final static Path patName = Path.of("D:\\\\G 25 GROUP\\\\uploads");
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/files/download.jsp");
        requestDispatcher.forward(req,resp);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fileName = req.getParameter("file");
        byte[] bytes = Files.readAllBytes(patName.resolve(fileName));
        resp.addHeader("Content-Type","application/octet-stream");
        resp.getOutputStream().write(bytes);

    }
}
