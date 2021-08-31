package com.example.springbootdemo.controller;

import com.example.springbootdemo.service.UploadImpl;
import com.example.springbootdemo.util.JsonData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;

@RestController
public class UploadController {

        @Resource
        private UploadImpl upload;

        @PostMapping("/fileUpload")
        public String fileUpload(MultipartFile file) throws IOException {
            if (file.isEmpty()){
                return JsonData.BuildJsonData(500,"Fail","");
            }
            else {
                upload.uploadFile(file);
                return JsonData.BuildJsonData(200,"Ok","");
            }
        }
}
