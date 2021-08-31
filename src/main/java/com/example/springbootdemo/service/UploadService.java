package com.example.springbootdemo.service;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public interface UploadService {
    void uploadFile(MultipartFile file);
}
