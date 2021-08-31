package com.example.springbootdemo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class UploadImpl implements UploadService{
    @Override
    public void uploadFile(MultipartFile file) {
        try {
            file.transferTo(new File("D:/"+file.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
