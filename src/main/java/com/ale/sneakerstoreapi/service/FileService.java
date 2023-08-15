package com.ale.sneakerstoreapi.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

public interface FileService {
    String saveFile(String fileName, MultipartFile multipartFile) throws IOException;
    Optional<Resource> getFileResource(String fileCode) throws IOException;
}
