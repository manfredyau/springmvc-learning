package com.yau.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
public class UploadController {
    @ResponseBody
    @PostMapping("/upload")
    public String upload(HttpServletRequest request) {
        MultipartHttpServletRequest servletRequest = (MultipartHttpServletRequest) request;
        MultipartFile file = servletRequest.getFile("file");
        assert file != null;
        /*原始的文件名(包括擴展名，但不包含所在路徑)*/
        String fileName = file.getOriginalFilename();
        System.out.println("Original File Name: " + fileName);

        /* WAR 包的根目錄下的 happy 文件夾*/
        File dest = new File(request.getServletContext().getRealPath("/happy"));

        /* happy 文件夾不存在則創建它*/
        if (!dest.exists()) {
            dest.mkdir();
        }
        System.out.println("real path:     " + request.getServletContext().getRealPath("/happy"));
        System.out.println("absolute path: " + dest.getAbsolutePath());
        try {
            /*用戶上傳的文件傳輸到服務器*/
            file.transferTo(new File(dest + "/" + fileName));
        } catch (IOException e) {
            e.printStackTrace();
            return "Failed";
        }

        return "SUCCESS";
    }
}
