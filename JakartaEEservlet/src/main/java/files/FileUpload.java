package files;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.util.UUID;

@WebServlet(name = "FileUpload ",value = "/upload")
@MultipartConfig(location = "D:\\G 25 GROUP\\uploads")
public class FileUpload extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/files/upload.jsp");
        requestDispatcher.forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Part file = req.getPart("file");
        String submittedFileName = file.getSubmittedFileName();
        file.write(UUID.randomUUID().toString()+submittedFileName.substring(submittedFileName.lastIndexOf(".")));
    }
}