package com.zq.filesystem.repository;

import com.zq.filesystem.bean.UploadFile;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhouqi
 * @desc
 * @data 2020/9/23
 */
public interface UploadFileRepository extends JpaRepository<UploadFile,String> {

    UploadFile findByFileMd5(String fileMd5);

    void deleteByFileMd5(String fileMd5);
}
