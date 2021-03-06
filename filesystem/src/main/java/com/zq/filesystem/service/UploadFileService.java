package com.zq.filesystem.service;

import com.zq.filesystem.bean.FileForm;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

/**
 * @author zhouqi
 * @desc
 * @data 2020/9/23
 */
public interface UploadFileService {

    /**
     * 通过md5值查找文件对象
     * @param md5
     * @return
     */
    Map<String, Object> findByFileMd5(String md5);

    /**
     * 上传文件
     * @param form 文件表单信息
     * @param multipartFile 文件
     * @return
     */
    Map<String, Object> realUpload(FileForm form, MultipartFile multipartFile) throws IOException, Exception;
}
