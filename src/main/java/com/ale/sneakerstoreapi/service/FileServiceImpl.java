package com.ale.sneakerstoreapi.service;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class FileServiceImpl implements FileService {
    private static final String FILE_DIRECTORY = "FilesUpload";
    @Override
    public String saveFile(String fileName, MultipartFile multipartFile) throws IOException {
        Path uploadPath = Paths.get(FILE_DIRECTORY);
        if(!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }

        String fileCode = RandomStringUtils.randomAlphabetic(18);

        try(InputStream inputStream = multipartFile.getInputStream()) {
            Path filePath = uploadPath.resolve(fileCode + "-" + fileName);
            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            throw new IOException("Could not save file: " + fileName, e);
        }

        return fileCode;
    }

    @Override
    public Optional<Resource> getFileResource(String fileCode) throws IOException {
        Path dirPath = Paths.get(FILE_DIRECTORY);

        AtomicReference<Path> atomicReference = new AtomicReference<>();
        Files.list(dirPath).forEach(file -> {
            if (file.getFileName().toString().startsWith(fileCode)) {
                atomicReference.set(file);
            }
        });
        Optional<Resource> optional = Optional.empty();
        if(atomicReference.get() != null) {
            optional = Optional.of(new UrlResource(atomicReference.get().toUri()));
        }

        return optional;
    }
}
