package ru.aao.s3storage.service;

import ru.aao.s3storage.model.FileDto;

import java.io.InputStream;
import java.util.List;

public interface MinioService {
    List<FileDto> getListObjects();
    FileDto uploadFile(FileDto file);
    InputStream getObject(String fileName);
}
