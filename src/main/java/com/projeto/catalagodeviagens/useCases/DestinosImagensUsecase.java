package com.projeto.catalagodeviagens.useCases;

import com.projeto.catalagodeviagens.services.S3Service;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.net.URI;

@Service
@AllArgsConstructor
public class DestinosImagensUsecase {

    @Autowired
    private S3Service s3Service;

    public URI uploadPicture(MultipartFile multipartFile) {
        return s3Service.uploadFile(multipartFile);
    }
}
