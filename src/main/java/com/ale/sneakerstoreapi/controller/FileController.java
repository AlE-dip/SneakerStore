package com.ale.sneakerstoreapi.controller;

import com.ale.sneakerstoreapi.entity.User;
import com.ale.sneakerstoreapi.mapper.view.FileUploadResponse;
import com.ale.sneakerstoreapi.service.FileService;
import jakarta.annotation.security.RolesAllowed;
import lombok.AllArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@RestController
@RolesAllowed(value = User.Role.Fields.ADMIN)
@RequestMapping("/file")
@AllArgsConstructor
public class FileController {
    private FileService fileService;

    @PostMapping("/upload")
    public FileUploadResponse uploadFile(@RequestParam("file") MultipartFile multipartFile) throws IOException {
        String fileName = StringUtils.cleanPath(Objects.requireNonNull(multipartFile.getOriginalFilename()));
        long size = multipartFile.getSize();
        String fileCode = fileService.saveFile(fileName, multipartFile);
        FileUploadResponse fileUploadResponse = new FileUploadResponse().builder()
                .fileName(fileName)
                .size(size)
                .downloadUri("/file/download/" + fileCode)
                .build();
        return fileUploadResponse;
    }

    @GetMapping("/download/{fileCode}")
    public ResponseEntity<?> downloadFile(@PathVariable("fileCode") String fileCode) throws IOException {
        Optional<Resource> optional = fileService.getFileResource(fileCode);
        AtomicReference<ResponseEntity<?>> atomicReference = new AtomicReference<>();
        optional.ifPresentOrElse(resource -> {
            String contentType = "application/octet-stream";
            String headerValue = "attachment; filename=\"" + optional.get().getFilename() + "\"";

            ResponseEntity<?> response = ResponseEntity.ok()
                    .contentType(MediaType.parseMediaType(contentType))
                    .header(HttpHeaders.CONTENT_DISPOSITION, headerValue)
                    .body(optional.get());
            atomicReference.set(response);
        }, () -> {
            ResponseEntity<?> response = ResponseEntity.badRequest()
                    .body("file not found");
            atomicReference.set(response);
        });

        return atomicReference.get();
    }

}
